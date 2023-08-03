package com.servicosweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicosweb.course.entities.Category;
import com.servicosweb.course.repositories.CategoryRepository;


@Service
public class CategoryService {
	//operação para buscar todos os usuarios
	//operacao para buscar usuario por id
	@Autowired
	private CategoryRepository repository;
	public List<Category> findAll(){//repassa a chamada para o findAll
		return repository.findAll();
		
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
