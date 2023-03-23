package com.example.springmockito.service;

import com.example.springmockito.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserDao {

    String getUserByName(String name);

    List<User> findAllUsers();
}