package com.mahes.archit.todowebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authSvc;

    public LoginController(AuthenticationService authSvc) {
        this.authSvc = authSvc;
    }

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value="login", method= RequestMethod.GET)
    public String login() {
        logger.debug("Logging");
//        model.put("name", name);
        return "login";
    }

    @RequestMapping(value="login", method= RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap map) {
        map.put("name", name);
        map.put("password", password);

//       Authentication Logic
        if (authSvc.authenticate(name, password)){
            return "welcome";
        }
        map.put("error", "Invalid creds");

        return "login";
    }
}
