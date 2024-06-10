package com.example.chatprojectforself.Repositories;

import com.example.chatprojectforself.Models.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MessageRepo extends CrudRepository<Message, UUID> {
}
