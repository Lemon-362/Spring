package com.Lemon.Spring1.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("factory-bean.xml");

        Car car = ac.getBean("factory", Car.class);

        System.out.println(car);

    }

}
