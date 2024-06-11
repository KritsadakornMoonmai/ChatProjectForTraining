package com.example.chatprojectforself.Services;

import com.example.chatprojectforself.Dto.ChatRoomDto;
import com.example.chatprojectforself.Models.Account;
import com.example.chatprojectforself.Models.ChatRoom;

import java.util.List;

public interface ChatRoomServiceInt {
    public ChatRoomDto ModelToDto(ChatRoom chatRoom);
    public ChatRoom DtoToModel(ChatRoomDto chatRoomDto);
    public List<ChatRoomDto> getAllChatRoomFromAccount(Account account);
}
