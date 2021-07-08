package com.project.constelacoes.Controller.Service;

import org.springframework.stereotype.Service;

import com.project.constelacoes.Model.Coordenadas;
import com.project.constelacoes.Repository.CoordenadasRepository;

@Service
public class ServiceCoordenadas {
  
	private CoordenadasRepository coordenadasRepository;
	
	public ServiceCoordenadas(CoordenadasRepository coordenadasRepository) {
		 this.coordenadasRepository = coordenadasRepository;
	}
	
	public Coordenadas save(Coordenadas cordeCoordenadas) {
		Coordenadas salvarCoor = coordenadasRepository.save(cordeCoordenadas);
		return salvarCoor;
	}
}
