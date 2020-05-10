package com.treinamentojavaweb.projetowebservicespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sun.xml.bind.v2.model.core.ID;
import com.treinamentojavaweb.projetowebservicespringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
	
	
}
