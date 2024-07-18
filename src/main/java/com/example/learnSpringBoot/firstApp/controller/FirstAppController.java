package com.example.learnSpringBoot.firstApp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAppController {

    @Value("${team.coach}")
    String coach;

    @Value("${team.name}")
    String name;
    @Value("${server.port}")
    String port;

    @GetMapping
    public String sayHello() {
        return coach + " " + name + " " + port + "Hi there";
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return "run a hard 5K";
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is your lucky day";
    }
}
