package com.example.chatprojectforself.Services;

import com.example.chatprojectforself.Dto.ChatRoomDto;
import com.example.chatprojectforself.Models.Account;
import com.example.chatprojectforself.Models.ChatRoom;
import com.example.chatprojectforself.Repositories.AccountRepo;
import com.example.chatprojectforself.Repositories.ChatRoomRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ChatRoomService implements ChatRoomServiceInt{
    AccountService accountService;
    AccountRepo accountRepo;
    ChatRoomRepo chatRoomRepo;
    @Override
    public ChatRoomDto ModelToDto(ChatRoom chatRoom) {
        return ChatRoomDto.builder()
                .id(chatRoom.getId())
                .roomName(chatRoom.getRoomName())
                .accountDtoList(chatRoom.getAccounts()
                        .stream()
                        .map(account -> accountService.ModelToBriefedDto(account))
                        .toList())
                .build();
    }

    @Override
    public ChatRoom DtoToModel(ChatRoomDto chatRoomDto) {
        return ChatRoom.builder()
                .id(chatRoomDto.getId())
                .roomName(chatRoomDto.getRoomName())
                .accounts(chatRoomDto.getAccountDtoList()
                        .stream()
                        .map(briefedAccountDto -> accountRepo.getReferenceById(briefedAccountDto.getId()))
                        .toList())
                .build();
    }

    @Override
    public List<ChatRoomDto> getAllChatRoomFromAccount(Account account) {
        return StreamSupport
                .stream(chatRoomRepo.findAll().spliterator(), false)
                .map(this::ModelToDto)
                .toList();
    }
}
