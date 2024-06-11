package com.example.chatprojectforself.Repositories;

import com.example.chatprojectforself.Models.ChatRoom;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface ChatRoomRepo extends CrudRepository<ChatRoom, UUID> {

}
