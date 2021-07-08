package com.project.constelacoes.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.constelacoes.Repository.CoordenadasRepository;

@RestController
@RequestMapping("/v1/api/coordenadas")
public class ControllerCoordenadas {
   
	private CoordenadasRepository coodeCoordenadasRepository;
	
	public ControllerCoordenadas(CoordenadasRepository coodeCoordenadasRepository) {
		this.coodeCoordenadasRepository = coodeCoordenadasRepository;
 	}

	
}
