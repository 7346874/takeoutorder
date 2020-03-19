package com.java.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(value = "menu")
public interface MenuFeign {

    @RequestMapping("/menu/findAllList/{index}/{size}")
    public List<Map<String,Object>> findAllList(@PathVariable("index") Integer index,@PathVariable("size") Integer size);

    @RequestMapping("/menu/deleteById")
    public void deleteById(@PathVariable("id") String id);

    @RequestMapping("/menu/save")
    public void save(@RequestParam Map<String,Object> map);

    @RequestMapping("/menu/update")
    public void update(@PathVariable() Map<String,Object> map);

}
