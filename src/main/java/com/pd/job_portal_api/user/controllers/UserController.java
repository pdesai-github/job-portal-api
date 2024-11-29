package com.pd.job_portal_api.user.controllers;

import com.pd.job_portal_api.user.entities.User;
import com.pd.job_portal_api.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    public List<User> get(){
        List<User> users = userService.getAllUsers();
        return users;
    }
}

