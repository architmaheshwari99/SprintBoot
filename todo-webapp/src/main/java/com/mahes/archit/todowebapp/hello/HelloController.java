package com.mahes.archit.todowebapp.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(getClass());

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
        logger.debug("Logging");
        model.put("name", name);
        return "sayHello";
    }
}
