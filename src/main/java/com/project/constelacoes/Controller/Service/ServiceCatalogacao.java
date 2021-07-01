package com.project.constelacoes.Controller.Service;

import org.springframework.stereotype.Service;

import com.project.constelacoes.Model.Catalogacao;
import com.project.constelacoes.Repository.CatalogacaoRepository;

@Service
public class ServiceCatalogacao {
    
	private CatalogacaoRepository catoloCatalogacaoRepository;
    
	public ServiceCatalogacao(CatalogacaoRepository catoloCatalogacaoRepository) {
		this.catoloCatalogacaoRepository = catoloCatalogacaoRepository;
 	}
	
	public Catalogacao salvar(Catalogacao catalogacao){
		return catoloCatalogacaoRepository.save(catalogacao);
	}
	
}
