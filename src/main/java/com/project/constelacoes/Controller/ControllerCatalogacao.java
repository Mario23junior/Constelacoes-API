package com.project.constelacoes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public Catalogacao save(@RequestBody Catalogacao catalogacao){
	   Catalogacao salvarDados = serviceCatalogacao.salvar(catalogacao);
	   return salvarDados;
	}
	
	@GetMapping("/{id}")
	public Catalogacao listId(@PathVariable Long id) {
		return serviceCatalogacao.listDataById(id);
	}
}
