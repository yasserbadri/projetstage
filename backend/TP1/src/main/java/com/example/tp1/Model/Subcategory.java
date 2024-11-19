package com.example.tp1.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id ;
    public String title;
    public String description;
    @ManyToOne
    @JoinColumn(name= "id_category")
    private Category category;
    @ManyToOne
    @JoinColumn(name= "id_product")
    private Product product;

}
