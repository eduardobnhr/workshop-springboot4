package com.servicosweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicosweb.course.entities.Product;
import com.servicosweb.course.repositories.ProductRepository;


@Service
public class ProductService {
	//operação para buscar todos os usuarios
	//operacao para buscar usuario por id
	@Autowired
	private ProductRepository repository;
	public List<Product> findAll(){//repassa a chamada para o findAll
		return repository.findAll();
		
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
