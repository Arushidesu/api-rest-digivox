package com.biblioteca.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.api.rest.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Cliente findById(long id);
	
}
