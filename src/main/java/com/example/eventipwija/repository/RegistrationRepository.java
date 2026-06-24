package com.example.eventipwija.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventipwija.entity.Registration;

public interface RegistrationRepository
        extends JpaRepository<Registration, Long> {

    List<Registration> findByUserId(Long userId);
}