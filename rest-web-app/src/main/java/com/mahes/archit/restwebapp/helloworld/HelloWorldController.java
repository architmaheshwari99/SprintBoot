package com.mahes.archit.restwebapp.helloworld;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("hello")
    public String helloWorld() {
        return "Hello World";
    }


    @GetMapping("hello-bean")
    public HelloBean helloBean() {
        return new HelloBean("Archit");
    }

    @GetMapping("hello-bean/{name}")
    public HelloBean helloBean(@PathVariable String name) {
        return new HelloBean("Archit " + name);
    }
}
