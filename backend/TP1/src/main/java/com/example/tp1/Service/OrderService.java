package com.example.tp1.Service;

import com.example.tp1.Model.Orderr;
import com.example.tp1.Repository.OrderrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderrRepository orderrRepository;
    public Orderr createOrder(Orderr orderr){
        return orderrRepository.save(orderr);
    }
    public List<Orderr> getAllOrderr()
    {
        return orderrRepository.findAll();
    }
    public Orderr getOrderrById(Long id)
    {
        return orderrRepository.findById(id).get();
    }
    public Orderr updateOrderr(Orderr orderr)
    {
        return orderrRepository.saveAndFlush(orderr);
    }
    public void deleteOrderr(Long id)
    {
        orderrRepository.deleteById(id);
    }
 public    List<Orderr> getOrderrByRefAndPrice(String ref,Float price){
        return orderrRepository.findOrderrByRefAndPrice(ref,price);
 }
}
