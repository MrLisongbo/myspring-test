package com.spring.lisongbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.lisongbo.pojo.User;

@Controller
@RequestMapping(name = "firstcontroller/login")
public class FirstController {
    
    
    private String str;
    private int num;
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    private double num2;
    @RequestMapping(name = "op_user_login.jsp")
    public String login(@Validated @RequestBody User user) {
        return "home";
    }
}
