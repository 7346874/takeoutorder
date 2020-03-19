package com.java.controller;

import com.java.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/menu")
public class MenuClientController {

    @Autowired
    private MenuFeign menuFeign;

    @CrossOrigin
    @RequestMapping("/findAllList")
    @ResponseBody
    public List<Map<String,Object>> findAllList(@RequestParam("page") Integer page, @RequestParam("size") Integer size){
        System.out.println(page+"---"+size);
        return menuFeign.findAllList(page, size);
    }

    @CrossOrigin
    @RequestMapping("/deleteById")
    @ResponseBody
    public void deleteById(@RequestParam("id") String id){
        menuFeign.deleteById(id);
    }

    @CrossOrigin
    @RequestMapping("/save")
    @ResponseBody
    public void save(@RequestParam Map<String,Object> map){
        System.out.println("-----"+map.get("tid"));
        Map<String,Object> m = new HashMap<>();
        m.put("name",map.get("name"));
        m.put("price",map.get("price"));
        m.put("flavor",map.get("flavor"));
        m.put("tid",map.get("tid"));
        menuFeign.save(m);
    }


    @CrossOrigin
    @RequestMapping("/update")
    @ResponseBody
    public void update(@RequestParam Map<String,Object> map){
        Map<String,Object> m = new HashMap<>();
        m.put("id",map.get("id"));
        m.put("name",map.get("name"));
        m.put("price",map.get("price"));
        m.put("flavor",map.get("flavor"));
        m.put("tid",map.get("type"));
        menuFeign.update(m);
    }

}
