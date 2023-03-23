package com.example.springmockito.service;

import com.example.springmockito.model.User;
import com.example.springmockito.service.impl.UserDaoImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserDaoTest {

    private static final String USER_NAME = "Khabib";
    private static final String INCORRECT_USER_NAME = "Katy";

    private static final List<User> USER_LIST = new ArrayList<>(Arrays.asList(
            new User("Khabib"),
            new User("Zarifa"),
            new User("Milana")));
    private static final List<User> INCORRECT_USER_LIST = new ArrayList<>(Arrays.asList(
            new User("Mary"),
            new User("Petya"),
            new User("Sasha")));

    UserDaoImpl userDao;

    @BeforeEach
    private void createNewUser() {
        userDao = new UserDaoImpl();
    }

    @Test
    void shouldReturnGetUserByName() {
        Assertions.assertEquals(USER_NAME, userDao.getUserByName(USER_NAME));
    }

    @Test
    void shouldReturnNullGetUserByName() {
        Assertions.assertNull(null, userDao.getUserByName(INCORRECT_USER_NAME));
    }

    @Test
    void shouldReturnCollectionsUsers() {
        Assertions.assertEquals(userDao.users, userDao.findAllUsers());
    }

    @Test
    void shouldEqualsListUsersFind() {
        Assertions.assertEquals(USER_LIST, userDao.findAllUsers());
    }

    @Test
    void shouldNotEqualsListUsersFind() {
        Assertions.assertNotEquals(INCORRECT_USER_LIST, userDao.findAllUsers());
    }

}