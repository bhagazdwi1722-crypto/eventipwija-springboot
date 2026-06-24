package com.example.eventipwija.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.eventipwija.entity.Event;
import com.example.eventipwija.entity.Registration;
import com.example.eventipwija.service.EventService;
import com.example.eventipwija.service.RegistrationService;

@Controller
public class MyEventController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private EventService eventService;

    @GetMapping("/my-events")
    public String myEvents(Model model) {

        List<Registration> regs =
                registrationService.getMyEvents();

        List<Event> events = new ArrayList<>();

        for (Registration reg : regs) {

            Event event =
                    eventService.getEventById(
                            reg.getEventId());

            if (event != null) {
                events.add(event);
            }
        }

        model.addAttribute("events", events);

        return "my-events";
    }
}
