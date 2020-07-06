package com.example.demo.config;


import com.example.demo.fb.ImportBd;
import com.example.demo.annotation.LizhengScan;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;


@Configuration
@ComponentScan("com")
@Import(ImportBd.class)
@LizhengScan("com")
@MapperScan
public class Config {


    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        return factoryBean.getObject();
    }

    @Bean
    @Primary
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://10.179.48.161:3306/alarm_test");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }

}
