package com.livre;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.livre.entity.domain.LivroDomain;
import com.livre.entity.service.ILivro;

import br.com.livre.livraria.GetDadosAutorRequest;
import br.com.livre.livraria.GetDadosAutorResponse;
import br.com.livre.livraria.GetDadosLivroRequest;
import br.com.livre.livraria.GetDadosLivroResponse;
import br.com.livre.livraria.Livro;

@Endpoint
public class LivrariaEndpoint {
	@Autowired 
	private ILivro livroRepository;
	private static final String NAME_SPACE_URI = "http://www.livre.com.br/ws/";
	
	@PayloadRoot(namespace=NAME_SPACE_URI,localPart="getDadosLivroRequest")
	@ResponsePayload
	public GetDadosLivroResponse getLivroResponse(GetDadosLivroRequest request) {
		LivroDomain livro = new LivroDomain();
		livro.setGenero("Romance");
		livro.setNome("A dança da morte");
		livro.setQtdPaginas(new BigDecimal("1.500"));
		livroRepository.save(livro);
		LivroDomain livroCadastrado = livroRepository.findByNome(request);
		GetDadosLivroResponse response = new GetDadosLivroResponse();
		if(livroCadastrado != null) {
			Livro livroXML = new Livro();
			livroXML.setGenero(livroCadastrado.getGenero());
			livroXML.setNome(livroCadastrado.getNome());
			livroXML.setQtdPaginas(livroCadastrado.getQtdPaginas());
			response.setLivro(livroXML);
		}
			
		return response;
	}
	
	@PayloadRoot(namespace=NAME_SPACE_URI, localPart="getDadosAutorRequest")
	@ResponsePayload
	public GetDadosAutorResponse getAutorResponse(GetDadosAutorRequest request) {
		return null;
	}
}
