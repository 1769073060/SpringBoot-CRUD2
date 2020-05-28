package com.rzk.service;


import com.rzk.pojo.User;


public interface UserService {
    User selectPasswordByName(String userName, String password);
}
