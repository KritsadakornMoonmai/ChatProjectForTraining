package com.example.chatprojectforself.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String roomName;

    @ManyToMany
    @JoinTable
    private List<Account> accounts;

    public ChatRoom(String roomName) {
        this.roomName = roomName;
    }
}
