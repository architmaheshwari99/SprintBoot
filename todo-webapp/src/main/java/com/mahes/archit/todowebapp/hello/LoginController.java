package com.mahes.archit.todowebapp.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("login")
    public String login() {
        logger.debug("Logging");
//        model.put("name", name);
        return "login";
    }
}
