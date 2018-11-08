package com.example.springmybatisdemo.Dao;

import com.example.springmybatisdemo.Beans.UserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public List getUser();
}
