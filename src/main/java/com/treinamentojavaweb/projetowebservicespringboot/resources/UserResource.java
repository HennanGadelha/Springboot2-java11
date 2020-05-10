package com.treinamentojavaweb.projetowebservicespringboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamentojavaweb.projetowebservicespringboot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findall(){
		
		User u = new User(1L, "Hennan", "hennan@gmail.com", "87499813", "12345");
		
		return ResponseEntity.ok().body(u);
		
	}
	
	
	
}
