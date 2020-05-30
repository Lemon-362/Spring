package com.Lemon.Spring4.book;

import com.Lemon.Spring4.book.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("book.xml");

        BookController controller = ac.getBean("bookController", BookController.class);

        controller.buyBook();

    }

}
