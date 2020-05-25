package com.treinamentojavaweb.projetowebservicespringboot.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		// TODO Auto-generated constructor stub
		super("Resource not found. Id: " + id);
	}
	

}
