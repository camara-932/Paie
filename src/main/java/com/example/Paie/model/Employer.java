package com.example.Paie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employer {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String role;

    Employer(){}

    Employer(String nom, String role){
        this.nom = nom;
        this.role = role;
    }

    public Long getId(){
        return this.id;
    }

    public String getNom(){
        return this.nom;
    }

    public String getRole(){
        return this.role;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setRole(String role){
        this.role = role;
    }
}
