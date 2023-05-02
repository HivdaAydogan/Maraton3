package com.yarisma.controller;

import com.yarisma.app.BAUtils;
import com.yarisma.entity.User;
import com.yarisma.service.UserService;

import java.util.Optional;

public class UserController {

    private UserService userService;

    public UserController(){
        this.userService = new UserService();
    }

    public void saveUser(User user){
        userService.save(user);
    }




}
