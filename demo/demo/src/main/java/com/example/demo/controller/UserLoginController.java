package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserLoginController {


    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

    @GetMapping("/home_page")
    public String home()
    {
        return "home_page";
    }
}
