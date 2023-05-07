package com.akata.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${app.welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/welcome-msg")
    public ResponseEntity<String> getWelcomeMessage(){
        return ResponseEntity.ok(welcomeMsg);
    }
}
