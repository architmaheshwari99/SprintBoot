package com.mahes.archit.restwebapp.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(path = "hello", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }
}
