package com.Lemon.Spring3.aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        /**
         * 通过注解AspectJ配置AOP：
         *      省略了ProxyUtil，不需要自己添加动态代理才能实现
         *      只需要在切面类中加上通知的注解
         */

        ApplicationContext ac = new ClassPathXmlApplicationContext("aop-xml.xml");

        Math math = ac.getBean("mathImpl", Math.class);

        int result = math.div(4, 0);

        System.out.println(result);

    }

}
