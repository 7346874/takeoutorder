package com.java.controller;

import com.java.entity.Menu;
import com.java.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;


    @CrossOrigin
    @RequestMapping("/findAll")
    public List<Menu> findAll(){
        List<Menu> list = menuService.findAll();
        return list;
    }

    @CrossOrigin
    @RequestMapping("/findAllList/{page}/{size}")
    public List<Map<String,Object>> findAllList(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        int index = (page-1)*size;
        List<Map<String,Object>> list = menuService.findAllList(index, size);
        return list;
    }

    @CrossOrigin
    @RequestMapping("/count")
    public Integer count(){
        return menuService.count();
    }

    @CrossOrigin
    @RequestMapping("/deleteById")
    @ResponseBody
    public void deleteById(@RequestBody Map map){
        menuService.deleteById(map.get("id").toString());
    }


    @CrossOrigin
    @RequestMapping("/save")
    @ResponseBody
    public void save(@RequestParam Map<String,Object> map){
        System.out.println("-----"+map.get("tid"));
        System.out.println("-----"+map.get("type"));
        System.out.println("-----"+map.get("name"));
        Map<String,Object> m = new HashMap<>();
        m.put("name",map.get("name"));
        m.put("price",map.get("price"));
        m.put("flavor",map.get("flavor"));
        m.put("tid",map.get("type"));
        menuService.save(m);
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
        menuService.update(m);
    }



}
