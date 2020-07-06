package com.example.demo.reject;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class Post implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
//        GenericBeanDefinition bd = (GenericBeanDefinition)configurableListableBeanFactory.getBeanDefinition("user");
//        bd.setBeanClass(A.class);
//        Object user = configurableListableBeanFactory.getBean("user");
//        User u = configurableListableBeanFactory.getBean(User.class);
//        configurableListableBeanFactory.registerSingleton("userMapper",UserMapper.class);
//        UserMapper bean = configurableListableBeanFactory.getBean(UserMapper.class);
//        System.out.println(bean.selectUserById(632790932103898508L));
//        System.out.println(u);
//        System.out.println(bd.getBeanClass());
//        System.out.println(bean);
//        System.out.println("初始化"+bean.getId());
    }
}
