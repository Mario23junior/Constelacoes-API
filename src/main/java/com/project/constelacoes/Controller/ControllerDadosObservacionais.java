package com.project.constelacoes.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/{id}")
	public Optional<DadosObservacionais> list(@PathVariable Long id){
		return serviceDadosObservacionais.listIdData(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		serviceDadosObservacionais.deleteId(id);
	}
	
	@PutMapping("/{id}")
	public void atulizar(@PathVariable Long id, @RequestBody DadosObservacionais dadosObservacionais) {
		  serviceDadosObservacionais.updateId(id, dadosObservacionais);
	}
}