package com.example.eventipwija.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.eventipwija.service.EventService;

@Controller
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    public String events(Model model) {

        model.addAttribute(
                "events",
                eventService.getAllEvents());

        return "events";
    }
}