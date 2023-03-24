package com.example.springmockito.service;

import com.example.springmockito.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    boolean checkUserExist(User user);

}