package com.Lemon.Spring1.id;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-id.xml");

        Student s1 = ac.getBean("s1", Student.class);
        System.out.println(s1);

        Student s2 = ac.getBean("s2", Student.class);
        System.out.println(s2);

        Student s3 = ac.getBean("s3", Student.class);
        System.out.println(s3);

        Student s4 = ac.getBean("s4", Student.class);
        System.out.println(s4);

        Teacher t1 = ac.getBean("t1", Teacher.class);
        System.out.println(t1);

        Teacher t2 = ac.getBean("t2", Teacher.class);
        System.out.println(t2);
    }

}
