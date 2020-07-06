package com.example.demo;

import com.example.demo.config.Config;
import com.example.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = applicationContext.getBean(UserService.class);
        System.out.println(userService.getUser(632790932103898508L));
//        System.out.println(applicationContext.getBean(User.class));
    }

}
