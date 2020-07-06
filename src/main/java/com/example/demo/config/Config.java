package com.example.demo.config;


import com.example.demo.fb.ImportBd;
import com.example.demo.annotation.LizhengScan;
import com.example.demo.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;


@Configuration
@ComponentScan("com")
//@Import(ImportBd.class)
//@LizhengScan("com")
@MapperScan(basePackages = "com.example.demo.mapper")
public class Config {

    private static final String url = "jdbc:mysql://10.179.48.161:3306/alarm_test?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
    private static final String username ="root";
    private static final String password ="";
    private static final String driverClassName  ="com.mysql.jdbc.Driver";


    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        return factoryBean.getObject();
    }

    @Bean
    @Primary
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    @Primary
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

}
