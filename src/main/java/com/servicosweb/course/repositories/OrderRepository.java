package com.servicosweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicosweb.course.entities.Order;
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
