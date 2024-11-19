package com.example.tp1.Repository;

import com.example.tp1.Model.Orderr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderrRepository extends JpaRepository<Orderr,Long> {
    List<Orderr> findByRef(String ref);
    List<Orderr> findOrderrByRefAndPrice(String ref,Float price);

}
