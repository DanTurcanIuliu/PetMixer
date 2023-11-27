package dk.via.sep3.services;

import com.google.common.base.Strings;
import com.google.protobuf.Timestamp;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import dk.via.sep3.DAOInterfaces.AnnouncementDAOInterface;
import dk.via.sep3.DAOInterfaces.UserDAOInterface;
import dk.via.sep3.mappers.AnnouncementMapper;
import dk.via.sep3.shared.AnnouncementEntity;
import dk.via.sep3.shared.PetEntity;
import dk.via.sep3.shared.utils.TimestampConverter;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import origin.protobuf.*;
import origin.protobuf.Void;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeoutException;

@GRpcService
public class AnnouncementService extends AnnouncementServiceGrpc.AnnouncementServiceImplBase {

    private final UserDAOInterface userDAO;

    private final AnnouncementDAOInterface announcementDAO;


    @Autowired
    public AnnouncementService(AnnouncementDAOInterface announcementDAO, UserDAOInterface userDAO)
    {
        this.announcementDAO = announcementDAO;
        this.userDAO = userDAO;
    }

    public void createAnnouncement(AnnouncementProto request, StreamObserver<AnnouncementProto> responseObserver)
    {
        AnnouncementEntity announcement = new AnnouncementEntity(
                userDAO.findUser(request.getPetOwnerEmail()),
                request.getDescription(),
                TimestampConverter.toLocalDateTime(request.getTimeStart()),
                TimestampConverter.toLocalDateTime(request.getTimeFinish()),
                new PetEntity(
                        request.getPet().getPetName(),
                        request.getPet().getPetType(),
                        request.getPet().getWeight(),
                        request.getPet().getIsVaccinated(),
                        request.getPet().getDescription(),
                        userDAO.findUser(request.getPetOwnerEmail())
                ),
                request.getPostalCode()
        );
        announcement.setDateOfCreation(TimestampConverter.toLocalDateTime(request.getDateOfCreation()));
        AnnouncementEntity announcementRespond = announcementDAO.createAnnouncement(announcement);

        if(announcementRespond == null)
            responseObserver.onError(GrpcError.constructException("Announcement with such id already exists"));

        responseObserver.onNext(AnnouncementMapper.mapToProto(announcementRespond));
        responseObserver.onCompleted();
    }

    public void findAnnouncements(SearchAnnouncementProto request, StreamObserver<AnnouncementsProto> responseObserver)
    {
        Collection<AnnouncementEntity> announcements = request == null? announcementDAO.getAllAnnouncements() : announcementDAO.getAnnouncements(request);

        if (announcements.isEmpty())
        {
            responseObserver.onError(GrpcError.constructException("No such announcements"));
            return;
        }

        Collection<AnnouncementProto> announcementCollection = announcements
                .stream().map(AnnouncementMapper::mapToProto).toList();

        AnnouncementsProto announcementsProtoItems = AnnouncementsProto.newBuilder().addAllAnnouncements(announcementCollection).build();
        responseObserver.onNext(announcementsProtoItems);
        responseObserver.onCompleted();
    }
    @Transactional
    public void getAnnouncement(FindAnnouncementProto request, StreamObserver<AnnouncementProto> responseObserver)
    {
        responseObserver.onNext(AnnouncementMapper.mapToProto(announcementDAO.getAnnouncement(request.getId())));
        responseObserver.onCompleted();
    }

    @Transactional
    public void updateAnnouncement(AnnouncementProto request, StreamObserver<AnnouncementProto> responseObserver)
    {
        AnnouncementEntity announcement = announcementDAO.getAnnouncement(request.getId());

        if(announcement == null)
        {
            responseObserver.onError(GrpcError.constructException("Announcement with id " + request.getId() + " is not found"));
            return;
        }

        if(!Strings.isNullOrEmpty(request.getDescription()))
            announcement.setDescription(request.getDescription());

        if(!request.getTimeStart().isInitialized())
            announcement.setStartDate(TimestampConverter.toLocalDateTime(request.getTimeStart()));

        if(!Strings.isNullOrEmpty(request.getPostalCode()))
            announcement.setPostalCode(request.getPostalCode());

        if(!request.getTimeFinish().isInitialized())
            announcement.setFinishDate(TimestampConverter.toLocalDateTime(request.getTimeFinish()));

        if(request.getPet().getId() != 0)
        {
            PetEntity pet = announcement.getPet();

            if(!Strings.isNullOrEmpty(request.getPet().getDescription()))
                pet.setDescription(request.getPet().getDescription());

            if(!Strings.isNullOrEmpty(request.getPet().getPetType()))
                pet.setPetType(request.getPet().getPetType());

            if(!Strings.isNullOrEmpty(request.getPet().getPetName()))
                pet.setPetName(request.getPet().getPetName());

            if(request.getPet().getIsVaccinated() != pet.isVaccinated())
                pet.setVaccinated(request.getPet().getIsVaccinated());


            announcement.setPet(pet);
        }

        var updatedAnnouncement = announcementDAO.updateAnnouncement(announcement);
        if(updatedAnnouncement == null)
        {
            responseObserver.onError(GrpcError.constructException("Announcement was not updated"));
            return;
        }
        responseObserver.onNext(AnnouncementMapper.mapToProto(updatedAnnouncement));
        responseObserver.onCompleted();
    }


    public void deleteAnnouncement(FindAnnouncementProto request, StreamObserver<ResponseStatus> responseObserver)
    {
        String response = announcementDAO.deleteAnnouncement(announcementDAO.getAnnouncement(request.getId()))? "User is deleted" : "User not found";
        responseObserver.onNext(ResponseStatus.newBuilder().setResponseStatus(response).build());
        responseObserver.onCompleted();
    }

    @Override
    public void startService(AnnouncementProto request, StreamObserver<Void> responseObserver)
    {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost"); // Replace with RabbitMQ server address if needed

        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.queueDeclare("start service", false, false, false, null);
        } catch (IOException | TimeoutException e)
        {
            throw new RuntimeException(e);
        }
    }
}
