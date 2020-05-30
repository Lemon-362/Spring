package com.Lemon.Spring2.userMod.UserController;

import com.Lemon.Spring2.userMod.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void addUser(){
        userService.addUser();
    }

    public UserController() {
        System.out.println("UserController无参构造器");
    }
}
