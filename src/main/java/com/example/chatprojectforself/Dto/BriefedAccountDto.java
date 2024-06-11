package com.example.chatprojectforself.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BriefedAccountDto {
    public long id;
    private String username;
    private EmailDto emailDto;
}
