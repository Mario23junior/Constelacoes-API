package com.project.constelacoes.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.constelacoes.Controller.Service.ServiceCoordenadas;
import com.project.constelacoes.Model.Coordenadas;

@RestController
@RequestMapping("/v1/api/coordenadas")
public class ControllerCoordenadas {
      
	ServiceCoordenadas  serviceCoordenadas;
 	
	public ControllerCoordenadas(ServiceCoordenadas serviceCoordenadas) {
		this.serviceCoordenadas = serviceCoordenadas;
 	}
	
	@PostMapping
	public Coordenadas save(@RequestBody Coordenadas coreCoordenadas) {
		return serviceCoordenadas.save(coreCoordenadas);
	}
	

	
}
