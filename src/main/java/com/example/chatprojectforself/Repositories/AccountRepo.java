package com.example.chatprojectforself.Repositories;

import com.example.chatprojectforself.Models.Account;
import com.example.chatprojectforself.Models.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Long> {
    public Account getAccountByUsername(String username);
    public Account getAccountByEmail(Email email);
}
