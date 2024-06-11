package com.example.chatprojectforself.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatRoomDto {

    public UUID id;
    public String roomName;
    public List<BriefedAccountDto> accountDtoList;
}
