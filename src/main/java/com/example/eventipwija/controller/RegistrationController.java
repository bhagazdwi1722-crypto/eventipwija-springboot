package com.example.eventipwija.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.view.RedirectView;

import com.example.eventipwija.service.RegistrationService;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/register-event/{id}")
    public RedirectView daftarEvent(
            @PathVariable Long id) {

        registrationService.daftarEvent(id);

        return new RedirectView("/my-events");
    }
}
