package com.yarisma.service;

import com.yarisma.entity.User;
import com.yarisma.repository.UserRepository;
import com.yarisma.util.MyFactoryService;

import java.util.Optional;

public class UserService extends MyFactoryService<UserRepository, User, Long> {

    public UserService() {
        super(new UserRepository());
    }

    public Optional<User> findByEmail(String email) {
        return getRepository().findByEmail(email);
    }



}
