package com.example.demo.fb;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;




public class Fb implements FactoryBean {
    private Class mapper;

    public Fb(Class mapper) {
        this.mapper = mapper;
    }

    @Override
    public Object getObject() {
        Object o = Proxy.newProxyInstance(Fb.class.getClassLoader(), new Class[]{mapper}, (proxy, method, args) -> {
            System.out.println(method.getName());
            return null;
        });
        return o;
    }

    @Override
    public Class<?> getObjectType() {
        return mapper;
    }
}

