package com.project.constelacoes.Controller.Service;

import org.springframework.stereotype.Service;

import com.project.constelacoes.Repository.FatosCostelacaoRepository;

@Service
public class ServiceFatosCostelacao {
   
	private FatosCostelacaoRepository fatosCostelacaoRepository;
	
	public ServiceFatosCostelacao(FatosCostelacaoRepository fatosCostelacaoRepository) {
		this.fatosCostelacaoRepository = fatosCostelacaoRepository;
 	}
	
	
}
