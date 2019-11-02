package com.biblioteca.api.rest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.api.rest.models.Info;
import com.biblioteca.api.rest.repository.InfoRepository;

@RestController
@RequestMapping("/api/info")
public class InfoResource {

	@Autowired
	InfoRepository infoRepository;
	
	@GetMapping("")
	public List<Info> info() {
		return infoRepository.findAll();
	}
	
	@GetMapping("/alugados")
	public List<Info> buscaAlugados() {
		return infoRepository.findByAlugado(true);
	}
	
	@GetMapping("/reservados")
	public List<Info> buscaReservados() {
		return infoRepository.findByReservado(true);
	}
	
	@GetMapping("/cancelados")
	public List<Info> buscaCancelado() {
		return infoRepository.findByCancelado(true);
	}
	
	@GetMapping("/devolvidos")
	public List<Info> buscaDevolvidos() {
		return infoRepository.findByDevolvido(true);
	}
	
	@PostMapping("")
	public Info salvaInfo(@RequestBody Info info) {
		return infoRepository.save(info);
	}
	
	@PutMapping("")
	public Info atualizarInfo(@RequestBody Info info) {
		return infoRepository.save(info);
	}
}
