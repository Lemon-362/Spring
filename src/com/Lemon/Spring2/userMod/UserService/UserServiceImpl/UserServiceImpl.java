package com.Lemon.Spring2.userMod.UserService.UserServiceImpl;

import com.Lemon.Spring2.userMod.UserDao.UserDao;
import com.Lemon.Spring2.userMod.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("dao")
    private UserDao userDao;

    @Override
    public void addUser() {
        userDao.addUser();
    }

    public UserServiceImpl() {
        System.out.println("UserServiceImpl无参构造器");
    }
}
