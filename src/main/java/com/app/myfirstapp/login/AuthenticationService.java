package com.app.myfirstapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public Boolean authenticate(String username, String pass){

        return username.equalsIgnoreCase("saurabh") && pass.equalsIgnoreCase("dummy");
    }
}
