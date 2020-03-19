package com.java.service.impl;

import com.java.dao.UserMapper;
import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Map<String, Object>> findAll(Integer page,Integer size) {
        return userMapper.findAll(page,size);
    }

    @Override
    public List<Map<String, Object>> findById(String id) {
        return userMapper.findById(id);
    }

    @Override
    public void save(Map<String, Object> map) {
        userMapper.save(map);
    }

    @Override
    public void update(Map<String, Object> map) {
        userMapper.update(map);
    }

    @Override
    public void deleteById(String id) {
        userMapper.deleteById(id);
    }
}
