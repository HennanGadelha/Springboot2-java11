package com.treinamentojavaweb.projetowebservicespringboot.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.treinamentojavaweb.projetowebservicespringboot.entities.User;
import com.treinamentojavaweb.projetowebservicespringboot.repositories.UserRepository;
import com.treinamentojavaweb.projetowebservicespringboot.services.exceptions.DatabaseException;
import com.treinamentojavaweb.projetowebservicespringboot.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> findAll(){
		
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		
		Optional<User> user = userRepository.findById(id);
		
		return user.orElseThrow(() -> new ResourceNotFoundException(id)); 
	}
	
	public User insert(User user) {
		
		userRepository.save(user);
		
		return user;
	}
	
	
	public void delete(Long id) {
		
		try {
			userRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			// TODO Auto-generated catch block
			throw new ResourceNotFoundException(id);
		} catch(DataIntegrityViolationException e) {
			
			throw new DatabaseException(e.getMessage());
		}
		
	}
	
	public User update(Long id, User user) {
		
		try {
			User userEntity = userRepository.getOne(id);
			
			updateData(userEntity, user);
			
			return userRepository.save(userEntity);
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User userEntity, User user) {
		
		userEntity.setName(user.getName());
		userEntity.setEmail(user.getEmail());
		userEntity.setPhone(user.getPhone());
		
		
	}
	
	
	
	
	
}
