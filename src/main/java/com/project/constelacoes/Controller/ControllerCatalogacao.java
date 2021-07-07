package com.project.constelacoes.Controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.constelacoes.Controller.Service.ServiceCatalogacao;
import com.project.constelacoes.Model.Catalogacao;

@RestController
@RequestMapping("/v1/api/catalogacaos")
public class ControllerCatalogacao {
    
	ServiceCatalogacao serviceCatalogacao;
	
	public ControllerCatalogacao(ServiceCatalogacao serviceCatalogacao) {
		this.serviceCatalogacao = serviceCatalogacao;
	}
	
	@PostMapping("/")
	public Catalogacao save(@RequestBody @Valid Catalogacao catalogacao){
	   Catalogacao salvarDados = serviceCatalogacao.salvar(catalogacao);
	   return salvarDados;
	}
	
	@GetMapping("/{id}")
	public Catalogacao listId(@PathVariable @Valid Long id) {
		return serviceCatalogacao.listDataById(id);
	}
	
	@PutMapping("/{id}")
	public void updateData(@RequestBody Catalogacao catalogacao, @PathVariable Long id) {
		  serviceCatalogacao.updateData(catalogacao, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteData(@PathVariable Long id) {
		serviceCatalogacao.deleteData(id);
	}	
}
