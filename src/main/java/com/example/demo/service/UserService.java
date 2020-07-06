package com.example.demo.service;


import com.example.demo.mapper.UserMapper;
import com.example.demo.po.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;


@Service
public class UserService {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Autowired(required = false)
    private UserMapper userMapper;

    public User getUser(Long id){
        return sqlSessionFactory.openSession().getMapper(UserMapper.class).selectUserById(id);
    }
    public User selectUser(Long id){
        return userMapper.selectUserById(id);
    }



   /* @PostConstruct
    public void init(){
        UserMapper mapper = new UserMapper() {
            @Override
            public User selectUserById(Long id) {
                return new User();
            }
        };
        userMapper = mapper;
    }*/
}
