package com.lucaspereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucaspereira.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
