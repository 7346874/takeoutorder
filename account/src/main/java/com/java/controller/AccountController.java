package com.java.controller;

import com.java.service.AccountService;
import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/account")
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private UserService userService;


    @CrossOrigin
    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("type") String type) {
        String stuts = null;
        switch (type){
            case "user":
                stuts = userService.login(username, password);
                break;
            case "admin":
                stuts = accountService.login(username, password);
                break;
        }
        if(stuts!=null){
            return "ok";
        }else{
            return "error";
        }
    }

}
