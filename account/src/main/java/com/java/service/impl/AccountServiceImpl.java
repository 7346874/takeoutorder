package com.java.service.impl;

import com.java.dao.AccountMapper;
import com.java.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public String login(String username, String password) {
        return accountMapper.login(username,password);
    }
}
