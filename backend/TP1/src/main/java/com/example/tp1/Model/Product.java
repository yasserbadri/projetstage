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
public class Product {
    @Id
    @GeneratedValue
    public Long id ;
    public String name;
    public float price;
    public String description;
    @OneToMany(mappedBy = "product" , cascade = CascadeType.REMOVE)
    private List<Subcategory> subcategorys;
    @ManyToOne
    @JoinColumn(name= "id_provider")
    private Provider provider;
    @ManyToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private List<Orderr> orderrs;


}
