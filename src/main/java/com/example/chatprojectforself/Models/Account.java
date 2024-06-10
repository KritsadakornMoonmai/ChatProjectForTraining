package com.example.chatprojectforself.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    @Id
    @GeneratedValue
    private long id;

    private String username;
    private String password;
    private LocalDateTime created;

    @OneToOne
    @JoinColumn
    private Email email;

    @ManyToOne
    @JoinColumn
    private Person person;

    @OneToMany(mappedBy = "account")
    private List<Message> messageList;

    @ManyToMany
    @JoinColumn
    private List<ChatRoom> chatRooms;
}
