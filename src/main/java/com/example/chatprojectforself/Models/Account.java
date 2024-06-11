package com.example.chatprojectforself.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Email email;

    @ManyToOne
    @JoinColumn
    private Person person;

    @OneToMany(mappedBy = "account")
    private List<Message> messageList;

    @ManyToMany
    @JoinTable
    private List<ChatRoom> chatRooms;

    public Account(String username, String password, LocalDateTime created, Email email, Person person) {
        this.username = username;
        this.password = password;
        this.created = created;
        this.email = email;
        this.person = person;
    }
}
