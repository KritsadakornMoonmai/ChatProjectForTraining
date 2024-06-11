package com.example.chatprojectforself.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageDto {
    public UUID id;
    public String content;
    public LocalDateTime sentTime;
    public ChatRoomDto chatRoomDto;
    public BriefedAccountDto accountDto;
}
