package com.Lemon.Spring2.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");

        Student s1 = ac.getBean("s1", Student.class);
        System.out.println(s1);
        Student s2 = ac.getBean("s1", Student.class);
        System.out.println(s2);

        System.out.println("*****************************");

        Student s3 = ac.getBean("s2", Student.class);
        System.out.println(s3);
        Student s4 = ac.getBean("s2", Student.class);
        System.out.println(s4);

    }

}
