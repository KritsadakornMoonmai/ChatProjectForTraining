package com.example.chatprojectforself.Repositories;

import com.example.chatprojectforself.Models.Email;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepo extends JpaRepository<Email, Long> {
}
