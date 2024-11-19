package com.example.tp1.Service;

import com.example.tp1.Model.Product;
import com.example.tp1.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product createProduct(Product product){
        return productRepository.save(product);

    }
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    public Product getProductById(Long id){
        return productRepository.findById(id).get();
    }
    public Product updateProduct(Product product){
        return productRepository.saveAndFlush(product);
    }
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

}
