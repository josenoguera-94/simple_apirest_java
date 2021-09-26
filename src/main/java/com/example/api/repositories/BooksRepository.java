package com.example.api.repositories;

import com.example.api.models.BooksModel;
import org.springframework.stereotype.Repository;   
import org.springframework.data.repository.CrudRepository;

@Repository
public interface BooksRepository extends CrudRepository<BooksModel, Long> {
    
}
