package com.user.userAOP.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void saveUser()
    {
        System.out.println("Saving user....");
    }

}
