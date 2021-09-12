package com.example.api.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import com.example.api.models.UserModel;
import com.example.api.repositories.UserRepository;

@Service
public class UserServices {
    @Autowired // para no volverla a instanciar
    UserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        //Se castea para enviaro como json mas adelante
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }
}
