package com.example.tp1.Repository;

import com.example.tp1.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findUserById(Long id);

}
