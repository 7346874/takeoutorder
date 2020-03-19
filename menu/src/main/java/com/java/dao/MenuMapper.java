package com.java.dao;

import com.java.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuMapper {

    public List<Menu> findAll();
    public List<Map<String,Object>> findAllList(Integer page,Integer size);
    public int count();
    public Menu findById(String id);
    public void save(Map<String,Object> map);
    public void update(Map<String,Object> map);
    public void deleteById(String id);

}
