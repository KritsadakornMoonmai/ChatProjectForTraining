package com.example.chatprojectforself.Repositories;

import com.example.chatprojectforself.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Long, Person> {
}
