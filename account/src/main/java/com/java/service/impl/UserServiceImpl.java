package com.java.service.impl;

import com.java.dao.UserMapper;
import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(String username, String password) {
        return userMapper.login(username,password);
    }
}
