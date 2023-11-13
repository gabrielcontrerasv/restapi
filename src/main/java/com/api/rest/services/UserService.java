package com.api.rest.services;

import com.api.rest.models.UserModel;
import com.api.rest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    private ArrayList<UserModel> getUsers(){
       return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel createUser(UserModel user){
        return userRepository.save(user);
    }

    public ArrayList<UserModel> getData(){
        return this.getUsers();
    }
 }
