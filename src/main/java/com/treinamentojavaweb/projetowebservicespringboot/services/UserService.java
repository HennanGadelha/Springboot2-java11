package com.treinamentojavaweb.projetowebservicespringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamentojavaweb.projetowebservicespringboot.entities.User;
import com.treinamentojavaweb.projetowebservicespringboot.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> findAll(){
		
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		
		Optional<User> user = userRepository.findById(id);
		
		return user.get();
	}
	
	public User insert(User user) {
		
		userRepository.save(user);
		
		return user;
	}
	
	
	public void delete(Long id) {
		
		userRepository.deleteById(id);
		
	}
	
	
	
	
	
}
