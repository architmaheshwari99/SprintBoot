package com.mahes.archit.todowebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

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
    public String sayHelloHTMLJSP(@RequestParam String name, ModelMap model) {
        System.out.println(name);
        model.put("name", name);
        return "sayHello";
    }
}
