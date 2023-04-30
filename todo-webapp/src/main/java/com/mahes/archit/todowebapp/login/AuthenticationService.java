package com.mahes.archit.todowebapp.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){
        return username.equalsIgnoreCase("archit") && password.equalsIgnoreCase("archit");
    }

}
