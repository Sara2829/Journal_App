package net.engineeringdigest.journalApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//maps an overall endpoint to the entire class yes
public class HealthCheck {

    @GetMapping("/health-check")
    public String healthcheck(){
        return "OK";
    }
}
