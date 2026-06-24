package com.example.eventipwija.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile";
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