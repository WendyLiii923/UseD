package com.wendy.used.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendy.used.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
