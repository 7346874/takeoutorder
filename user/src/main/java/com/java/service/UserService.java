package com.java.service;

import java.util.List;
import java.util.Map;

public interface UserService {

    public List<Map<String,Object>> findAll(Integer page,Integer size);

    public List<Map<String,Object>> findById(String id);

    public void save(Map<String,Object> map);

    public void update(Map<String,Object> map);

    public void deleteById(String id);

}
