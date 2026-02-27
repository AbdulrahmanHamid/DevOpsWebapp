package com.example.Lab2Webapp;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        String name = "Abdulrahman Hamid";

        if (hour < 12) {
            return "Good morning, " + name + ". Welcome to COMP367";
        } else {
            return "Good afternoon, " + name + ". Welcome to COMP367";
        }
        
    }
}