package com.java.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(value = "user")
public interface UserFeign {

    @RequestMapping("/user/findAll")
    public List<Map<String,Object>> findAll(@RequestParam("page") Integer page,@RequestParam("size") Integer size);

    @RequestMapping("/user/findById")
    public List<Map<String,Object>> findById(@RequestParam("id") String id);

    @RequestMapping("/user/save")
    public void save(@RequestParam Map map);

    @RequestMapping("/user/update")
    public void update(@RequestParam Map map);

    @RequestMapping("/user/deleteById")
    public void deleteById(@RequestParam("id") String id);

}
