package com.servicosweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicosweb.course.entities.Order;
import com.servicosweb.course.repositories.OrderRepository;


@Service
public class OrderService {
	//operação para buscar todos os usuarios
	//operacao para buscar usuario por id
	@Autowired
	private OrderRepository repository;
	public List<Order> findAll(){//repassa a chamada para o findAll
		return repository.findAll();
		
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
