package com.archit99.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String name;

    @Value("${team.name}")
    private String team;

    @GetMapping("/teamInfo")
    public String teamInfo(){
        return "Hello "+ name +" from " + team;
    }

    @GetMapping("/")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/home")
    public String home(){
        return "Home";
    }
}
