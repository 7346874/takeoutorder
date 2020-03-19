package com.java.service.impl;

import com.java.dao.MenuMapper;
import com.java.entity.Menu;
import com.java.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> findAll() {
        return menuMapper.findAll();
    }

    @Override
    public List<Map<String, Object>> findAllList(Integer page, Integer size) {
        return menuMapper.findAllList(page,size);
    }


    @Override
    public int count() {
        return menuMapper.count();
    }

    @Override
    public Menu findById(String id) {
        return menuMapper.findById(id);
    }

    @Override
    public void save(Map<String,Object> map) {
        menuMapper.save(map);
    }

    @Override
    public void update(Map<String,Object> map) {
        menuMapper.update(map);
    }

    @Override
    public void deleteById(String id) {
        menuMapper.deleteById(id);
    }
}
