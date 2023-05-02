package com.mahes.archit.restwebapp.helloworld;


import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("hellov2")
    public String helloWorldV2() {

//        Get the language from Accept-Language header
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default",
                locale);
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
