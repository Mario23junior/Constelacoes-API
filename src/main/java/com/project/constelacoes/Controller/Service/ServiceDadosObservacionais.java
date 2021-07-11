package com.project.constelacoes.Controller.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.constelacoes.Exceptions.NotValueDataCatalogacao;
import com.project.constelacoes.Model.DadosObservacionais;
import com.project.constelacoes.Repository.DadosObservacionaisRepository;

@Service
public class ServiceDadosObservacionais {
   
	private DadosObservacionaisRepository dadosObservacionaisRepository;
	
	public ServiceDadosObservacionais(DadosObservacionaisRepository dadosObservacionaisRepository) {
		 this.dadosObservacionaisRepository = dadosObservacionaisRepository;
	}
	
	public DadosObservacionais saveDadosObs(DadosObservacionais dadosObservacionais) {
		return dadosObservacionaisRepository.save(dadosObservacionais);
 	}
	
	public Optional<DadosObservacionais> listIdData(Long id){
		Optional<DadosObservacionais> dadosObser = dadosObservacionaisRepository.findById(id);
		dadosObser.orElseThrow(() -> new NotValueDataCatalogacao("Valos de observação não encontrado"));
		return dadosObser;
	}
	
	public void deleteId(Long id) {
	 dadosObservacionaisRepository
	                         .findById(id)
	                         .map(delete -> {
	                        	dadosObservacionaisRepository.deleteById(id);
	                        	return delete;
	                         }).orElseThrow(() -> new NotValueDataCatalogacao("Nenhum valor encontrado para ser deletado"));
	}
	
	public void updateId(Long id , DadosObservacionais dadosObservacionais) {
		dadosObservacionaisRepository
		                            .findById(id)
		                            .map(atualizar -> {
		                            	dadosObservacionais.setId(atualizar.getId());
		                            	dadosObservacionaisRepository.save(dadosObservacionais);
		                            	return atualizar;
		                            }).orElseThrow(() -> new NotValueDataCatalogacao("Nenhum valor encontrado para atulizar"));
	}
}
