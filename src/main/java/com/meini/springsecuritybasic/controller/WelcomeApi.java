package com.meini.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeApi {
    @GetMapping("/api/welcome")
    public String sayWelcome() {
        return "Hello welcome to my Security App";
    }
}
