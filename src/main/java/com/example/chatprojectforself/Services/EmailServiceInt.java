package com.example.chatprojectforself.Services;

import com.example.chatprojectforself.Dto.EmailDto;
import com.example.chatprojectforself.Models.Account;
import com.example.chatprojectforself.Models.Email;

import java.util.List;

public interface EmailServiceInt {
    public EmailDto ModelToDto(Email email);
    public Email DtoToModel(EmailDto emailDto, Account account);
    public List<EmailDto> getAllEmail();
    public Email getEmailByEmailText(String text);
}
