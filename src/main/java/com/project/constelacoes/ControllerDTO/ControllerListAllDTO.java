package com.project.constelacoes.ControllerDTO;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.constelacoes.DTOModel.CatalogacaoDTO;
import com.project.constelacoes.Service.Implements;

@RestController
@RequestMapping("/v1/api/listAll")
public class ControllerListAllDTO {
   
	private Implements service;
	
	public ControllerListAllDTO(Implements service) {
		this.service = service;
 	}
	
	@GetMapping
	public List<CatalogacaoDTO> listAll(){
		return service.listAllDataDTO();
	}
}
