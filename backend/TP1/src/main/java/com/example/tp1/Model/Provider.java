package com.example.tp1.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Provider extends User{


    public String matricule;
    public String service;
    public String company;
    @OneToMany(mappedBy = "provider", cascade = CascadeType.REMOVE)
    private List<Product> products;
}
