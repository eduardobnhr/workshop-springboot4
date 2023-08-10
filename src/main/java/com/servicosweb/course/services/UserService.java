package com.servicosweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicosweb.course.entities.User;
import com.servicosweb.course.repositories.UserRepository;


@Service
public class UserService {
	//operação para buscar todos os usuarios
	//operacao para buscar usuario por id
	@Autowired
	private UserRepository repository;
	public List<User> findAll(){//repassa a chamada para o findAll
		return repository.findAll();
		
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
