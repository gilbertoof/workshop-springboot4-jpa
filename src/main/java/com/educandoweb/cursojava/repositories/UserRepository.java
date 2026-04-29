package com.educandoweb.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursojava.entities.User;

public interface UserRepository  extends JpaRepository<User, Long> {
	
	

}
