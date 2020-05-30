package com.Lemon.Spring2.userMod;

import com.Lemon.Spring2.userMod.UserController.UserController;
import com.Lemon.Spring2.userMod.UserDao.UserDaoImpl.UserDaoImpl;
import com.Lemon.Spring2.userMod.UserService.UserServiceImpl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("user.xml");

        UserController userController = ac.getBean("userController", UserController.class);
        System.out.println(userController);

        UserDaoImpl userDao = ac.getBean("dao", UserDaoImpl.class);
        System.out.println(userDao);

        UserServiceImpl userServiceImpl = ac.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(userServiceImpl);

        userController.addUser();
    }

}
