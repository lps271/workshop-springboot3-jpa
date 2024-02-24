package com.lucaspereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucaspereira.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
