using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IAnnouncementService
{
    Task<Announcement> CreateAsync(AnnouncementCreationDto dto);
    
}