package com.example.demo.service;


import com.example.demo.mapper.UserMapper;
import com.example.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(Long id){
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
