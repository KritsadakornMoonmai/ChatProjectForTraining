package com.example.chatprojectforself.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {

    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String lastName;
    private int age;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Account> accounts;
}
