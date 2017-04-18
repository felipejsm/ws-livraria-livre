package com.livre.entity.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LivroDomain {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private BigDecimal qtdPaginas;
	private String genero;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(BigDecimal qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
