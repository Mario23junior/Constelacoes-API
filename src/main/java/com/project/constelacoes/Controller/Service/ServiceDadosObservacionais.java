package com.project.constelacoes.Controller.Service;

import org.springframework.stereotype.Service;

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
}
