package com.example.chatprojectforself.Services;

import com.example.chatprojectforself.Dto.PersonDto;
import com.example.chatprojectforself.Models.Person;

import java.util.List;

public interface PersonServiceInt {
    public PersonDto ModelToDto(Person person);
    public Person DtoToModel(PersonDto personDto);
    public List<PersonDto> getAllPeople();
    PersonDto getPersonByName(String firstName, String lastName);
}
