package com.livre.entity.service;

import org.springframework.data.repository.CrudRepository;

import com.livre.entity.domain.LivroDomain;

public interface ILivro extends CrudRepository<LivroDomain, Long>{
	public LivroDomain findByNome(String request);
}
