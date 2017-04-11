package com.livre;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.livre.livraria.GetDadosAutorRequest;
import br.com.livre.livraria.GetDadosAutorResponse;
import br.com.livre.livraria.GetDadosLivroRequest;
import br.com.livre.livraria.GetDadosLivroResponse;

@Endpoint
public class LivrariaEndpoint {
	
	private static final String NAME_SPACE_URI = "http://www.livre.com.br/livraria/";
	
	@PayloadRoot(namespace=NAME_SPACE_URI,localPart="getDadosLivroRequest")
	@ResponsePayload
	public GetDadosLivroResponse getLivroResponse(GetDadosLivroRequest request) {
		return null;
	}
	
	@PayloadRoot(namespace=NAME_SPACE_URI, localPart="getDadosAutorRequest")
	@ResponsePayload
	public GetDadosAutorResponse getAutorResponse(GetDadosAutorRequest request) {
		return null;
	}
}
