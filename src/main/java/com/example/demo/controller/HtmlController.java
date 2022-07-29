package com.example.demo.controller;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HtmlController {
    @RequestMapping (value = "/home",method = RequestMethod.GET)
    public String index() {
        return "home.html";
    }

    @RequestMapping (value = "success",method = RequestMethod.GET)
    public String success() {
        return "success.html";
    }

    @RequestMapping (value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public User login(@RequestBody User user) {
        System.out.println(user.getUserName());
        return user;
    }
}
