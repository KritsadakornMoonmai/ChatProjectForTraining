package com.example.chatprojectforself.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Email {

    @Id
    @GeneratedValue
    private long id;

    private String email;

    @OneToOne
    @JoinColumn
    private Account account;

    public Email(String email, Account account) {
        this.email = email;
        this.account = account;
    }
}
