package com.spring.lisongbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.lisongbo.pojo.User;

@Controller
@RequestMapping(name = "firstcontroller/login")
public class FirstController {
    

    private double num2;
    @RequestMapping(name = "op_user_login.jsp")
    public String login(@Validated @RequestBody User user) {
        return "home";
    }
}
