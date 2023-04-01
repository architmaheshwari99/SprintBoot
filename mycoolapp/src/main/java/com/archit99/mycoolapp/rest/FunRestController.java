package com.archit99.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/home")
    public String home(){
        return "Home";
    }
}
