package com.example.api.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.example.api.models.UserModel;
import com.example.api.services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id){
        // buscar por id http://localhost:8080/api/users/2
        return this.userServices.getById(id);
    }

    @GetMapping("/query")
    public ArrayList<UserModel> getUserByPrioridad(@RequestParam("prioridad") Integer prioridad){
        // para filtrar por parámetros
        //ejemplo del endpoint http://localhost:8080/api/users/query?prioridad=3
        return this.userServices.getByPrioridad(prioridad);

    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.userServices.deleteUser(id);
        if(ok){
            return "User deleted with id: " + id;
        }else{
            return "could not delete user with id: " + id;
        }
    }


}
