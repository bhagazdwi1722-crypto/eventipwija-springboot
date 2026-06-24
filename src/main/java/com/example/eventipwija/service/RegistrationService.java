package com.example.eventipwija.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventipwija.entity.Registration;
import com.example.eventipwija.repository.RegistrationRepository;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public void daftarEvent(Long eventId) {

        Registration reg = new Registration();

        reg.setUserId(1L);
        reg.setEventId(eventId);
        reg.setStatus("TERDAFTAR");

        registrationRepository.save(reg);
    }

    public List<Registration> getMyEvents() {
        return registrationRepository.findByUserId(1L);
    }
}