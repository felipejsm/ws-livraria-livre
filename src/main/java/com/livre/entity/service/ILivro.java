package com.livre.entity.service;

import org.springframework.data.repository.CrudRepository;

import com.livre.entity.domain.LivroDomain;

import br.com.livre.livraria.GetDadosLivroRequest;

public interface ILivro extends CrudRepository<LivroDomain, Long>{
	public LivroDomain findByNome(GetDadosLivroRequest request);
}
