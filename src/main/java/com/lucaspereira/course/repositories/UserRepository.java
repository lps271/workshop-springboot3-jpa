package com.lucaspereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucaspereira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
