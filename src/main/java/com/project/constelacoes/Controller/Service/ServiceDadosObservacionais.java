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
}
