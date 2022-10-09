package com.edu.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> 
{

}
