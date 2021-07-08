package com.project.constelacoes.Controller.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.constelacoes.Exceptions.NotValueDataCatalogacao;
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
	
	public Catalogacao listDataById(Long id) {
		Optional<Catalogacao> list = catalogacaoRepository.findById(id);
		return list.orElseThrow(() -> new NotValueDataCatalogacao("informação não encontrada"));
	}
	
	public void updateData(Catalogacao catalogacao, Long id){
		 catalogacaoRepository
		                 .findById(id)
		                 .map(updateData -> {
		                	 catalogacao.setId(catalogacao.getId());
		                	 catalogacaoRepository.save(catalogacao);
		                	 return updateData;
 		                 }).orElseThrow(() -> new NotValueDataCatalogacao("erro ao atualizar informações"));
	}
	
	public void deleteData(Long id) {
	    	 catalogacaoRepository
		                     .findById(id)
		                     .map(deleteId -> {
		                    	  catalogacaoRepository.deleteById(id);
		                    	  return deleteId;
		                     }).orElseThrow(() -> new NotValueDataCatalogacao("Erro a deletar informações"));
	}	
}
