package com.example.chatprojectforself.Repositories;

import com.example.chatprojectforself.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Long, Account> {
}
