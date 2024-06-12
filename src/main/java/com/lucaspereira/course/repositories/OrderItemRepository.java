package com.lucaspereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucaspereira.course.entities.OrderItem;
import com.lucaspereira.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
}
