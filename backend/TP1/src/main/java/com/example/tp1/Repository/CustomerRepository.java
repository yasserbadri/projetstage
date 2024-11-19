package com.example.tp1.Repository;

import com.example.tp1.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findByAddress (String address);
    List<Customer> findCustomerByAddressAndCity(String address,String city);

}
