package com.example.api.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity // sirve para trabajar conuna tabla ya creada
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private long id;

    
    private String nombre;
    private String email;
    private Integer prioridad;

    // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @OneToMany(cascade = CascadeType.ALL)
    // @JoinColumn
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
    private List<BooksModel> books;

    public void setPrioridad(Integer prioridad){
        this.prioridad = prioridad;
    }

    public Integer getPrioridad(){
        return prioridad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BooksModel> getBooks() {
        return books;
    }

    public void setBooks(List<BooksModel> books) {
        this.books = books;
    }
}