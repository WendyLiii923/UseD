package com.wendy.used.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendy.used.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
