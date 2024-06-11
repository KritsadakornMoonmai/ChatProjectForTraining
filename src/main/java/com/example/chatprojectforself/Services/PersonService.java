package com.example.chatprojectforself.Services;

import com.example.chatprojectforself.Dto.PersonDto;
import com.example.chatprojectforself.Models.Person;
import com.example.chatprojectforself.Repositories.AccountRepo;
import com.example.chatprojectforself.Repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements PersonServiceInt{

    @Autowired
    AccountService accountService;

    @Autowired
    AccountRepo accountRepo;

    @Autowired
    PersonRepo personRepo;
    @Override
    public PersonDto ModelToDto(Person person) {
        return PersonDto.builder()
                .id(person.getId())
                .firstName(person.getFirstName())
                .lastName(person.getLastName())
                .age(person.getAge())
                .accountDtoList(person.getAccounts().stream().map(account -> accountService.ModelToBriefedDto(account)).toList())
                .build();
    }

    @Override
    public Person DtoToModel(PersonDto personDto) {
        return Person.builder()
                .id(personDto.getId())
                .firstName(personDto.getFirstName())
                .lastName(personDto.getLastName())
                .age(personDto.getAge())
                .build();
    }

    @Override
    public List<PersonDto> getAllPeople() {
        return personRepo.findAll().stream().map(this::ModelToDto).toList();
    }
    @Override
    public PersonDto getPersonByName(String firstName, String lastName) {
        return ModelToDto(personRepo.getPersonByFirstNameAndLastName(firstName, lastName));
    }
}
