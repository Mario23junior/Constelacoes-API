package com.project.constelacoes.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.constelacoes.Controller.Service.ServiceDadosObservacionais;
import com.project.constelacoes.Model.DadosObservacionais;

@RestController
@RequestMapping("/v1/api/dadosObservacionais")
public class ControllerDadosObservacionais {
   
	private ServiceDadosObservacionais serviceDadosObservacionais;
	
	public ControllerDadosObservacionais(ServiceDadosObservacionais serviceDadosObservacionais) {
		  this.serviceDadosObservacionais = serviceDadosObservacionais;
	}
	
	@PostMapping
 	public DadosObservacionais save(@RequestBody DadosObservacionais dadosObservacionais) {
		DadosObservacionais dados = serviceDadosObservacionais.saveDadosObs(dadosObservacionais);
		return dados;
		
	}
}
