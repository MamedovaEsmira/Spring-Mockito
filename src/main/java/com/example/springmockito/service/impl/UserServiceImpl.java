package com.example.springmockito.service.impl;

import com.example.springmockito.model.User;
import com.example.springmockito.service.UserDao;
import com.example.springmockito.service.UserService;

public class UserServiceImpl implements UserService {

    UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public boolean checkUserExist(User user) {
        userDao = new UserDaoImpl();
        if (userDao.findAllUsers().contains(user)) {
            return true;
        } else {
            return false;
        }
    }
}