package com.app.myfirstapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    //"say hello => "hello what are you learning today"
    //https://localhost:8080/say-hello
    @RequestMapping("say-hello")
    @ResponseBody
    public String SayHello(){
        return "Hello! what are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String SayHelloHtml(){
        return "Hello! what are you learning today?";
    }

    @RequestMapping("say-hello-jsp")
    public String SayHelloJsp(){
        return "sayHello";
    }

    //JSP java server pages
    //sayhello.jsp
}
