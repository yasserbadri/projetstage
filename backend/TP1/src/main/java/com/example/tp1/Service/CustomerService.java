package com.example.tp1.Service;

import com.example.tp1.Model.Customer;
import com.example.tp1.Model.Orderr;
import com.example.tp1.Repository.CustomerRepository;
import com.example.tp1.Repository.OrderrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public List<Customer> getAllCustomer()
    {
        return customerRepository.findAll();
    }
    public Customer getCustomerById(Long id)
    {
        return customerRepository.findById(id).get();
    }
    public Customer updateCustomer(Customer customer)
    {
        return customerRepository.saveAndFlush(customer);
    }
    public void deleteCustomer(Long id)
    {
        customerRepository.deleteById(id);
    }
}
