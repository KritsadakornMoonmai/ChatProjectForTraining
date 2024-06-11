package com.example.chatprojectforself.Services;

import com.example.chatprojectforself.Dto.BriefedAccountDto;
import com.example.chatprojectforself.Dto.EmailDto;
import com.example.chatprojectforself.Models.Account;
import com.example.chatprojectforself.Models.Email;
import com.example.chatprojectforself.Repositories.AccountRepo;
import com.example.chatprojectforself.Repositories.EmailRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmailService implements EmailServiceInt {

    AccountService accountService;
    EmailRepo emailRepo;
    @Override
    public EmailDto ModelToDto(Email email) {
        return EmailDto.builder()
                .id(email.getId())
                .email(email.getEmail())
                .accountDto(accountService.ModelToBriefedDto(email.getAccount()))
                .build();
    }

    @Override
    public Email DtoToModel(EmailDto emailDto, Account account) {
        return Email.builder()
                .id(emailDto.getId())
                .email(emailDto.getEmail())
                .account(account)
                .build();
    }

    @Override
    public List<EmailDto> getAllEmail() {
        return emailRepo.findAll().stream().map(this::ModelToDto).toList();
    }

    @Override
    public Email getEmailByEmailText(String text) {
        return null;
    }
}
