package com.java.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "account")
public interface AccountFeign {

    @RequestMapping("/account/login")
    @CrossOrigin
    @ResponseBody
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("type") String type);

}
