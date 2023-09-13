package com.mateus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
