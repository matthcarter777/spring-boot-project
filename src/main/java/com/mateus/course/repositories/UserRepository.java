package com.mateus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
