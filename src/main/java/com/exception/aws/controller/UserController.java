package com.exception.aws.controller;

import com.exception.aws.entity.User;
import com.exception.aws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/allUser")
    public List<User> getAllUserDetails(){
        return userService.findUserDetals();
    }


}
