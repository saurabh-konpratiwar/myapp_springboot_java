package com.app.myfirstapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    AuthenticationService authenticationService;


    private Logger logger = LoggerFactory.getLogger(getClass());


    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String Login() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String GotoWelcome(@RequestParam String name, @RequestParam String password, ModelMap modelMap) {
        modelMap.put("name", name);
        modelMap.put("password", password);

        //Authentication
        //name - suarbh
        //pass - dummy
        if (authenticationService.authenticate(name,password)) {
            return "welcome";
        }
        //something
        modelMap.put("errorMessage", "Invalid Credentials! Please try again.");
        return "login";
    }

    @RequestMapping(value = "homePage", method = RequestMethod.GET)
    public String homePage(){
        return "homePage";
    }





//    //model
//    @RequestMapping("login")
//    public String Login(@RequestParam String name, ModelMap model){
//        model.put("name",name);
//        logger.debug("Request param is cool {}",name);
//        System.out.println("Request param is "+ name); //Not Recommended for prod code
//        return "login";
//    }
}
