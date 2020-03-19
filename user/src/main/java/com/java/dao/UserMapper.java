package com.java.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    public List<Map<String,Object>> findAll(Integer page,Integer size);

    public List<Map<String,Object>> findById(String id);

    public void save(Map<String,Object> map);

    public void update(Map<String,Object> map);

    public void deleteById(String id);

}
