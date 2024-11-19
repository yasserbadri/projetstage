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


public class Customer extends User {

    public String address;
    public String city;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.REMOVE)
    private List<Orderr> orderrs;

}
