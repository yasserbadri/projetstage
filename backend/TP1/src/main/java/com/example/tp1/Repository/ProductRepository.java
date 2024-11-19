package com.example.tp1.Repository;

import com.example.tp1.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findByName(String name);
    List<Product> findByNameAndPrice(String name,float price);

}
