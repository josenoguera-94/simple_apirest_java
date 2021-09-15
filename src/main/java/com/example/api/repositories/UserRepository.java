package com.example.api.repositories;

import java.util.ArrayList;

import com.example.api.models.UserModel;
import org.springframework.stereotype.Repository;   
import org.springframework.data.repository.CrudRepository;

@Repository                             //JpaRepository averiguar
public interface UserRepository extends CrudRepository<UserModel, Long> {
                                                        //tipo de dato, identificador
    
    //findByNombre
    //findByEmail
    public abstract ArrayList<UserModel> findByPrioridad(Integer prioridad);


}
