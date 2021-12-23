package com.devsuperior.projetofinal.projetofinal.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String str) {
		super(str);
	}

}
