package com.SpringSecurityExample.demo.controller;

import com.SpringSecurityExample.demo.model.Users;
import com.SpringSecurityExample.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/users")
    public List<Users> getUsers (){
        return userRepo.findAll();
    }
}
