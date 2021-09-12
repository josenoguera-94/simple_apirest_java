package com.example.api.controller;

import java.util.ArrayList;

import com.example.api.models.UserModel;
import com.example.api.services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired //para que s einstancie automaticamente por spring
    UserServices userServices;

    @GetMapping()
    public ArrayList<UserModel> getUsers(){
        return userServices.getUsers();
    }

    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel user){
        // @RequestBody permite enviar parametros dentro de la solicitud
        //Guarda el usuario y lo retorna con su id
        // este metodo sirve para actualizar solo hayq ue pasarle el id y actualizar los otros campos
        return this.userServices.saveUser(user);
    }


}
