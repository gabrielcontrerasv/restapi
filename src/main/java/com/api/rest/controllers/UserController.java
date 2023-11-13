package com.api.rest.controllers;

import com.api.rest.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.api.rest.services.UserService;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService UserService;

    @GetMapping()
    public ArrayList<UserModel> getUsers(){
        return UserService.getData();
    }

    @PostMapping()
    public UserModel createUsers(@RequestBody UserModel user){
        return UserService.createUser(user);
    }

}
