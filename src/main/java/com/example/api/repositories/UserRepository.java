package com.example.api.repositories;

import com.example.api.models.UserModel;
import org.springframework.stereotype.Repository;   
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
                                                        //tipo de dato, identificador

}
