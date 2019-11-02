package com.biblioteca.api.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.api.rest.models.Info;

public interface InfoRepository extends JpaRepository<Info, Long> {

	List<Info> findByAlugado(boolean alugado);
	List<Info> findByReservado(boolean reservado);
	List<Info> findByCancelado(boolean cancelado);
	List<Info> findByDevolvido(boolean devolvido);
}
