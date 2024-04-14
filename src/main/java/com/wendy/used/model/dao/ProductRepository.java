package com.wendy.used.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendy.used.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
