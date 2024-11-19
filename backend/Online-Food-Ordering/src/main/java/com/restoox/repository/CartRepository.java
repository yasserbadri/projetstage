package com.restoox.repository;

import com.restoox.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository  extends JpaRepository<Cart,Long> {

    public Cart findByCustomerId(Long userId);
}
