package com.biblioteca.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.api.rest.models.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

	Livro findById(long id);
	
}
