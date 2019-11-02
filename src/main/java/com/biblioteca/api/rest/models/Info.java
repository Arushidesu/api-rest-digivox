package com.biblioteca.api.rest.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name="info")
public class Info {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="id_livro")
	Livro livro;
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	Cliente cliente;
	
	boolean alugado = false;
	
	boolean reservado = false;
	
	boolean devolvido = false;
	
	boolean cancelado = false;
	
	@Column(nullable=false)
	@NotNull
	@DateTimeFormat(pattern="dd/MM/yyyy")
	LocalDate data_reserva;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isCancelado() {
		return cancelado;
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}

	@DateTimeFormat(pattern="dd/MM/yyyy")
	LocalDate data_devolucao;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	LocalDate data_cancelamento;

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public boolean isDevolvido() {
		return devolvido;
	}

	public void setDevolvido(boolean devolvido) {
		this.devolvido = devolvido;
	}

	public LocalDate getData_reserva() {
		return data_reserva;
	}

	public void setData_reserva(LocalDate data_reserva) {
		this.data_reserva = data_reserva;
	}

	public LocalDate getData_devolucao() {
		return data_devolucao;
	}

	public void setData_devolucao(LocalDate data_devolucao) {
		this.data_devolucao = data_devolucao;
	}

	public LocalDate getData_cancelamento() {
		return data_cancelamento;
	}

	public void setData_cancelamento(LocalDate data_cancelamento) {
		this.data_cancelamento = data_cancelamento;
	}
}
