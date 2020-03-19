package com.java.service;

import com.java.entity.Menu;

import java.util.List;
import java.util.Map;

public interface MenuService {

    public List<Menu> findAll();
    public List<Map<String,Object>> findAllList(Integer page,Integer size);
    public int count();
    public Menu findById(String id);
    public void save(Map<String,Object> map);
    public void update(Map<String,Object> map);
    public void deleteById(String id);

}
