package com.lucaspereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucaspereira.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
