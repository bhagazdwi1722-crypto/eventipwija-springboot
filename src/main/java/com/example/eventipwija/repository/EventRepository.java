package com.example.eventipwija.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventipwija.entity.Event;

public interface EventRepository
        extends JpaRepository<Event, Long> {

}