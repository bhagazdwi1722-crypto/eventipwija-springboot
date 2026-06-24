package com.example.eventipwija.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventipwija.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}