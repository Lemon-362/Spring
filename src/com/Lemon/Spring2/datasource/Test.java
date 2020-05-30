package com.Lemon.Spring2.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws SQLException {

        ApplicationContext ac = new ClassPathXmlApplicationContext("datasource.xml");

//        DruidDataSource d1 = ac.getBean("d1", DruidDataSource.class);
//        System.out.println(d1.getConnection());

        DruidDataSource d2 = ac.getBean("d2", DruidDataSource.class);
        System.out.println(d2.getConnection());
    }

}
