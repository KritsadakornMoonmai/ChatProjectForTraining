package com.example.chatprojectforself.Services;

import com.example.chatprojectforself.Dto.MessageDto;
import com.example.chatprojectforself.Models.Account;
import com.example.chatprojectforself.Models.ChatRoom;
import com.example.chatprojectforself.Models.Message;
import com.example.chatprojectforself.Repositories.AccountRepo;
import com.example.chatprojectforself.Repositories.ChatRoomRepo;
import com.example.chatprojectforself.Repositories.MessageRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class MessageService implements MessageServiceInt{
    AccountService accountService;
    ChatRoomService chatRoomService;
    MessageRepo messageRepo;
    @Override
    public MessageDto ModelToDto(Message message) {
        return MessageDto.builder()
                .id(message.getId())
                .content(message.getContent())
                .sentTime(message.getSentTime())
                .accountDto(accountService.ModelToBriefedDto(message.getAccount()))
                .chatRoomDto(chatRoomService.ModelToDto(message.getChatRoom()))
                .build();
    }

    @Override
    public Message DtoToModel(MessageDto messageDto, ChatRoom chatRoom, Account account) {
        return Message.builder()
                .id(messageDto.getId())
                .content(messageDto.getContent())
                .sentTime(messageDto.getSentTime())
                .chatRoom(chatRoom)
                .account(account)
                .build();
    }

    @Override
    public List<MessageDto> getAllMessages() {
        return StreamSupport
                .stream(messageRepo.findAll().spliterator(), false)
                .map(this::ModelToDto)
                .toList();
    }

    @Override
    public List<Message> getAllMessageFromAccount(Account account) {
        return messageRepo.getMessageByAccount(account);
    }
}
