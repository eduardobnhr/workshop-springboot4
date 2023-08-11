package com.servicosweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicosweb.course.entities.User;
import com.servicosweb.course.repositories.UserRepository;
import com.servicosweb.course.services.exceptions.ResourceNotFoundException;


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
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	//atualizar dados de usuario
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
	
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		entity.setPassword(obj.getPassword());
		
	}
}
