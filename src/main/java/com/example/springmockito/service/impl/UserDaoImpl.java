package com.example.springmockito.service.impl;

import com.example.springmockito.exception.UserNotFoundException;
import com.example.springmockito.model.User;
import com.example.springmockito.service.UserDao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {

    public List<User> users;


    public UserDaoImpl() {
        this.users = new ArrayList<>(Arrays.asList(
                new User("Khabib"),
                new User("Zarifa"),
                new User("Milana")));
    }

    @Override
    public String getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user.getName();
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        if (users.isEmpty()) {
            throw new UserNotFoundException("Пользователи не найдены");
        } else {
            return users;
        }
    }
}