package com.example.api.models;

import javax.persistence.Entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BooksModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private long id;

    private String nombre;
    private Double price;

    @ManyToOne
    private UserModel user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // public UserModel getUser() {
    //     return user;
    // }

    
    
    public void setUser(UserModel user) {
        
        this.user = user;
    }


}
