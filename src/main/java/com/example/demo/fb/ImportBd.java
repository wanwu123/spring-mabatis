package com.example.demo.fb;

import com.example.demo.annotation.LizhengScan;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.List;


public class ImportBd implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        //获取路径
//        MultiValueMap<String, Object> allAnnotationAttributes = importingClassMetadata.getAllAnnotationAttributes(LizhengScan.class.getName());
//        List<Object> value = allAnnotationAttributes.get("value");
//        Object o = value.get(0);
//        System.out.println(o);
        //扫描
        List<Class> mappers = new ArrayList();
        mappers.add(UserMapper.class);
        for (Class mapperClass : mappers) {
            BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition();
            AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
            beanDefinition.setBeanClass(Fb.class);
            beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(mapperClass);
            String name = mapperClass.getName();
            String substring = name.substring(name.lastIndexOf(".") + 1);
            char[] chars = substring.toCharArray();
            chars[0] += 32;
            String sName = String.valueOf(chars);
            registry.registerBeanDefinition(sName,beanDefinition);
        }
    }
}
