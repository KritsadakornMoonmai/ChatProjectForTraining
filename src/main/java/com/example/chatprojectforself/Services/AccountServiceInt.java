package com.example.chatprojectforself.Services;

import com.example.chatprojectforself.Dto.AccountDto;
import com.example.chatprojectforself.Dto.BriefedAccountDto;
import com.example.chatprojectforself.Models.Account;
import com.example.chatprojectforself.Models.Email;
import com.example.chatprojectforself.Models.Person;

import java.util.List;

public interface AccountServiceInt {

    public AccountDto ModelToDto(Account account);
    public Account DtoToModel(AccountDto accountDto, Email email, Person person);
    public BriefedAccountDto ModelToBriefedDto(Account account);

    void SaveAccount(Account account);

    public List<AccountDto> getAllAccount();
    public Account getAccountByUserName(String userName);
    public Account getAccountByEmail(Email email);
}
