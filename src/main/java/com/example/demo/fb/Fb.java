package com.example.demo.fb;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Proxy;


public class Fb implements FactoryBean {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;


    private Class mapper;

    public Fb(Class mapper) {
        this.mapper = mapper;
    }

    @Override
    public Object getObject() {
//        Object o = Proxy.newProxyInstance(Fb.class.getClassLoader(),new Class[]{mapper}, (proxy, method, args) -> {
//            System.out.println(method.getName());
//            return null;
//        });
        Object o = sqlSessionFactory.openSession().getMapper(this.mapper);
        return o;
    }

    @Override
    public Class<?> getObjectType() {
        return mapper;
    }
}

