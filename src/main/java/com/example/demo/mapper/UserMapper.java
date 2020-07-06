package com.example.demo.mapper;


import com.example.demo.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;


@Mapper
public interface UserMapper/* extends ApplicationContextAware*/ {
   /* @Override
    default void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        autowireCapableBeanFactory.createBean(UserMapper.class);
    }*/

    @Select("select * from user where id = #{id}")
    User selectUserById(Long id);
}
