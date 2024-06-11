package com.example.chatprojectforself.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailDto {
    public long id;
    public String email;
    public BriefedAccountDto accountDto;
}
