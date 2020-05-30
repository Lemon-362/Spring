package com.Lemon.Spring2.userMod.UserDao.UserDaoImpl;

import com.Lemon.Spring2.userMod.UserDao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser() {
        System.out.println("UserDaoUImpl：添加成功");
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl无参构造器");
    }
}
