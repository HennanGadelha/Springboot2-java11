package com.treinamentojavaweb.projetowebservicespringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamentojavaweb.projetowebservicespringboot.entities.Product;
import com.treinamentojavaweb.projetowebservicespringboot.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	
	public List<Product> findAll(){
		
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		
		Optional<Product> category = repository.findById(id);
		
		return category.get();
	}
	
	
	
	
	
}
