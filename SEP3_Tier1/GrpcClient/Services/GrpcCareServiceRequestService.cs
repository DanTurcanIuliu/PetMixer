﻿using Application.DaoInterface;
using Domain.DTOs;
using Domain.Models;
using Grpc.Core;
using GrpcClient.Mappers;

namespace GrpcClient.Services;

public class GrpcCareServiceRequestService : ICareServiceRequestDao
{
    private readonly CareServiceRequest.CareServiceRequestClient careRequestClient;

    public async Task OfferAsync(string initiatorEmail, int announcementId, string recipientEmail)
    {
        try
        {
            ResponseStatus status = await careRequestClient
                .OfferCareAsync(new StartCareServiceRequest
                {
                    AnnouncementId = announcementId,
                    InitiatorEmail = initiatorEmail,
                    RecipientEmail = recipientEmail
                });
            
            if (int.Parse(status.ResponseStatus_) == 404)
            {
                throw new Exception($"Your services has not been offered -- response status {status} from Java");
            }
            Console.WriteLine($"Java returned {status}");
        }
        catch (RpcException e)
        {
            throw new Exception(e.Message);
        }
    }
}