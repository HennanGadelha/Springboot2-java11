package com.treinamentojavaweb.projetowebservicespringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamentojavaweb.projetowebservicespringboot.entities.Category;
import com.treinamentojavaweb.projetowebservicespringboot.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	
	public List<Category> findAll(){
		
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		
		Optional<Category> category = repository.findById(id);
		
		return category.get();
	}
	
	
	
	
	
}
