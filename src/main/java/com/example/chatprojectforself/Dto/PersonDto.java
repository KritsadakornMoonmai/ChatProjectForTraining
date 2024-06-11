package com.example.chatprojectforself.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDto {
    public long id;
    public String firstName;
    public String lastName;
    public int age;
    public List<BriefedAccountDto> accountDtoList;
}
