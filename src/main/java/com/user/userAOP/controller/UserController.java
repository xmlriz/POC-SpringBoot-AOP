package com.user.userAOP.controller;

import com.user.userAOP.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUser")
    public String saveUser()
    {
        userService.saveUser();
        return "<h1> Done </h1>";
    }
    @GetMapping("/proxy")
    public String proxy() {

        System.out.println(userService.getClass());

        return "OK";
    }
}
