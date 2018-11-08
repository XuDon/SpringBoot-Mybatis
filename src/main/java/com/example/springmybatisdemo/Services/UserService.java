package com.example.springmybatisdemo.Services;

import com.example.springmybatisdemo.Beans.UserBean;
import com.example.springmybatisdemo.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

//    @Autowired
//    private JdbcTemplate jdbc;
//
//    public List getName(){
//        //String sql = "update TEST_USER set name='Sandy' where name ='Tom'";
//        String sql ="select name,age from TEST_USER where NAME ='Sandy'";
//        List<UserBean> listUser = new ArrayList<>();
//        return (List)jdbc.query(sql,new RowMapper(){
//            UserBean user = new UserBean();
//            @Override
//            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
//                user.setName(resultSet.getString("name"));
//                user.setAge(resultSet.getInt("age"));
//                return user;
//            }
//        });
//    };
    @Autowired
    private UserDao userDao;

    public List getUser(){
        return userDao.getUser();
    };
}
