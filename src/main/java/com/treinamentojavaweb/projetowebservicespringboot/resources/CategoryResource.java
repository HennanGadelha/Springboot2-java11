package com.treinamentojavaweb.projetowebservicespringboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamentojavaweb.projetowebservicespringboot.entities.Category;
import com.treinamentojavaweb.projetowebservicespringboot.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findall(){
		
		List<Category> categories = service.findAll();
		
		return ResponseEntity.ok().body(categories);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		
		Category order = service.findById(id);
		return ResponseEntity.ok().body(order);
		
	}
	
	
	
}
