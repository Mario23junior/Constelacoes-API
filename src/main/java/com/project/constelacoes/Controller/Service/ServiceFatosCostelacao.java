package com.project.constelacoes.Controller.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.constelacoes.Exceptions.NotValueDataCatalogacao;
import com.project.constelacoes.Model.FatosCostelacao;
import com.project.constelacoes.Repository.FatosCostelacaoRepository;

@Service
public class ServiceFatosCostelacao {
   
	private FatosCostelacaoRepository fatosCostelacaoRepository;
	
	public ServiceFatosCostelacao(FatosCostelacaoRepository fatosCostelacaoRepository) {
		this.fatosCostelacaoRepository = fatosCostelacaoRepository;
 	}
	
	public FatosCostelacao save(FatosCostelacao fatosCostelacao) {
		return fatosCostelacaoRepository.save(fatosCostelacao);
	}
	
	public Optional<FatosCostelacao> list(Long id){
	  Optional<FatosCostelacao> informaDados = fatosCostelacaoRepository.findById(id);
      informaDados.orElseThrow(() -> new NotValueDataCatalogacao("informação não encontrada"));
		return informaDados;
 	}
	
	public void update(Long id, FatosCostelacao fatosCostelacao) {
		        fatosCostelacaoRepository
				                       .findById(id)
				                       .map(update -> {
				                             fatosCostelacao.setId(update.getId());
				                             fatosCostelacaoRepository.save(fatosCostelacao);
				                             return update;
				                        }).orElseThrow(() -> new NotValueDataCatalogacao("Nenhuma informação encontrada para ser atualizada"));
  	}
	
	public void delete(Long id) {
		fatosCostelacaoRepository
		                        .findById(id)
		                        .map(deleteData -> {
		                        	fatosCostelacaoRepository.deleteById(id);
		                        	return deleteData;
		                        }).orElseThrow(() -> new NotValueDataCatalogacao("Nenhum valor encontrado para dowloads"));
	}                  
} 