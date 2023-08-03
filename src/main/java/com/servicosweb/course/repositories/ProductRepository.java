package com.servicosweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicosweb.course.entities.Product;
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
