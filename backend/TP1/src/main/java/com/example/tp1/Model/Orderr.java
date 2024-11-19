package com.example.tp1.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Orderr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id ;
    public String ref;
    public float price ;
    public Date date;
    @ManyToMany
    @JoinTable(name= "orderr_product", joinColumns = @JoinColumn(name = "id_orderr"),inverseJoinColumns = @JoinColumn(name="id_product"))
    private List<Product> product =new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;
}
