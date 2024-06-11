package com.example.chatprojectforself.Services;

import com.example.chatprojectforself.Dto.MessageDto;
import com.example.chatprojectforself.Models.Account;
import com.example.chatprojectforself.Models.ChatRoom;
import com.example.chatprojectforself.Models.Message;

import java.util.List;

public interface MessageServiceInt {
    public MessageDto ModelToDto(Message message);
    public Message DtoToModel(MessageDto messageDto, ChatRoom chatRoom, Account account);
    public List<MessageDto> getAllMessages();
    public List<Message> getAllMessageFromAccount(Account account);
}
