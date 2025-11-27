package com.example.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        // Vulnerable to SQL Injection
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        // Simulate SQL query with the username and password
        return "Login successful for " + username;
    }
}

class LoginRequest {
    private String username;
    private String password;

    // Getters and Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}

