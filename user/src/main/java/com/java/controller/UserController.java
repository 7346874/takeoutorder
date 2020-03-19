package com.java.controller;

import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    @CrossOrigin
    public List<Map<String,Object>> findAll(@RequestParam("page") Integer page,@RequestParam("size") Integer size){
        int index = (page-1)*size;
        return userService.findAll(index,size);
    }

    @RequestMapping("/findById")
    @ResponseBody
    @CrossOrigin
    public List<Map<String,Object>> findById(@RequestParam("id") String id){
        System.out.println("-----"+id);
        return userService.findById(id);
    }

    @RequestMapping("/save")
    @ResponseBody
    @CrossOrigin
    public void save(@RequestParam Map map){
        System.out.println(map.get("username"));
        Map<String,Object> m = new HashMap<>();
        m.put("username",map.get("username"));
        m.put("password",map.get("password"));
        m.put("nickname",map.get("nickname"));
        m.put("gender",map.get("gender"));
        m.put("telephone",map.get("telephone"));
        m.put("address",map.get("address"));
        userService.save(m);
    }

    @RequestMapping("/update")
    @ResponseBody
    @CrossOrigin
    public void update(@RequestParam Map map){
        Map<String,Object> m = new HashMap<>();
        m.put("username",map.get("username"));
        m.put("password",map.get("password"));
        m.put("nickname",map.get("nickname"));
        m.put("gender",map.get("gender"));
        m.put("telephone",map.get("telephone"));
        m.put("address",map.get("address"));
        m.put("id",map.get("id"));
        userService.update(m);
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    @CrossOrigin
    public void deleteById(@RequestParam("id") String id){
        userService.deleteById(id);
    }


}
