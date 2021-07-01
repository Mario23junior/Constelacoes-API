package com.project.constelacoes.Controller.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.constelacoes.Model.Catalogacao;
import com.project.constelacoes.Repository.CatalogacaoRepository;

@Service
public class ServiceCatalogacao {
    
	private CatalogacaoRepository catalogacaoRepository;
    
	public ServiceCatalogacao(CatalogacaoRepository catalogacaoRepository) {
		this.catalogacaoRepository = catalogacaoRepository;
 	}
	
	public Catalogacao salvar(Catalogacao catalogacao){
		return catalogacaoRepository.save(catalogacao);
	}
	
	public Optional<Catalogacao> listDataById(Long id) {
		Optional<Catalogacao> list = catalogacaoRepository.findById(id);
		return list;
	}
	
}
