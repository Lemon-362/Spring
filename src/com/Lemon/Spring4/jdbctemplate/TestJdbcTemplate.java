package com.Lemon.Spring4.jdbctemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class TestJdbcTemplate {

    ApplicationContext ac = new ClassPathXmlApplicationContext("jdbc.xml");

    @Test
    public void testUpdate(){

    }

}