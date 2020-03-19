package com.java.controller;

import com.java.feign.AccountFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountFeign accountFeign;

    @CrossOrigin
    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("type") String type) {

        return accountFeign.login(username,password,type);

    }

}
