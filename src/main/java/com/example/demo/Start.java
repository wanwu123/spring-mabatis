package com.example.demo;

import com.example.demo.config.Config;
import com.example.demo.mapper.UserMapper;
import com.example.demo.po.User;
import com.example.demo.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(Config.class);
        SqlSessionFactory bean = applicationContext.getBean(SqlSessionFactory.class);
        User user = bean.openSession().getMapper(UserMapper.class).selectUserById(632790932103898508L);
        System.out.println(user);
        UserService userService = applicationContext.getBean(UserService.class);
        System.out.println(userService.selectUser(632790932103898508L));
//        System.out.println(applicationContext.getBean(User.class));
    }

}
