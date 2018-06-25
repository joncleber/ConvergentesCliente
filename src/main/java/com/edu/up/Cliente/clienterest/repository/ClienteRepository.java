package com.edu.up.Cliente.clienterest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.up.Cliente.clienterest.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente , String> {
	
	

}
