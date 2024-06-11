package com.example.chatprojectforself.Services;

import com.example.chatprojectforself.Dto.AccountDto;
import com.example.chatprojectforself.Dto.BriefedAccountDto;
import com.example.chatprojectforself.Models.Account;
import com.example.chatprojectforself.Models.Email;
import com.example.chatprojectforself.Models.Person;
import com.example.chatprojectforself.Repositories.AccountRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService implements AccountServiceInt{
    AccountRepo accountRepo;
    EmailService emailService;
    PersonService personService;
    MessageService messageService;
    ChatRoomService chatRoomService;

    @Override
    public AccountDto ModelToDto(Account account) {
        return AccountDto.builder()
                .id(account.getId())
                .username(account.getUsername())
                .password(account.getPassword())
                .created(account.getCreated())
                .emailDto(emailService.ModelToDto(account.getEmail()))
                .personDto(personService.ModelToDto(account.getPerson()))
                .messageDtoList(account.getMessageList()
                        .stream()
                        .map(message -> messageService.ModelToDto(message))
                        .toList())
                .chatRoomDtoList(account.getChatRooms()
                        .stream()
                        .map(chatRoom -> chatRoomService.ModelToDto(chatRoom))
                        .toList())
                .build();
    }

    @Override
    public Account DtoToModel(AccountDto accountDto, Email email, Person person) {
        return Account.builder()
                .id(accountDto.getId())
                .username(accountDto.getUsername())
                .password(accountDto.getPassword())
                .created(accountDto.getCreated())
                .email(email)
                .person(person)
                .build();
    }

    @Override
    public BriefedAccountDto ModelToBriefedDto(Account account) {
        return BriefedAccountDto.builder()
                .id(account.getId())
                .username(account.getUsername())
                .emailDto(emailService.ModelToDto(account.getEmail()))
                .build();
    }

    @Override
    public void SaveAccount(Account account) {
        accountRepo.save(account);
    }

    @Override
    public List<AccountDto> getAllAccount() {
        return accountRepo.findAll().stream().map(this::ModelToDto).toList();
    }

    @Override
    public Account getAccountByUserName(String userName) {
        return accountRepo.getAccountByUsername(userName);
    }

    @Override
    public Account getAccountByEmail(Email email) {
        return accountRepo.getAccountByEmail(email);
    }
}
