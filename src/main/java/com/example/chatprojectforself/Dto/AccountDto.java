package com.example.chatprojectforself.Dto;

import com.example.chatprojectforself.Models.Email;
import com.example.chatprojectforself.Models.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDto {
    public long id;
    public String username;
    public String password;
    public LocalDateTime created;
    public EmailDto emailDto;
    public PersonDto personDto;
    public List<MessageDto> messageDtoList;
    public List<ChatRoomDto> chatRoomDtoList;
}
