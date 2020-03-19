package com.java.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public String login(String username,String password);

}
