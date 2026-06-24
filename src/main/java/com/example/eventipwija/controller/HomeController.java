package com.example.eventipwija.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/event-detail")
    public String detailEvent() {
        return "detail-event";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }

    @GetMapping("/my-events")
    public String myEvents() {
        return "my-events";
    }

    @GetMapping("/attendance")
    public String attendance() {
        return "attendance";
    }

    @GetMapping("/certificates")
    public String certificates() {
        return "certificates";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
}