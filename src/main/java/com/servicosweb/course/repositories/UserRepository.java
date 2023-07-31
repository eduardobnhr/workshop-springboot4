package com.servicosweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.servicosweb.course.entities.User;
public interface UserRepository extends JpaRepository<User, Long>{
	
}
