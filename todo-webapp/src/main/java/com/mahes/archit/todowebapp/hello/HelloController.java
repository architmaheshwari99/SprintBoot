package com.mahes.archit.todowebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String sayHello() {
        return "Hello!!";
    }


    @RequestMapping("hello-html")
    public String sayHelloHTML() {
        return "hello-html";
    }


    @RequestMapping("hello-jsp")
    public String sayHelloHTMLJSP() {
        return "sayHello";
    }
}
