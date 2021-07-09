package com.project.constelacoes.Controller.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.constelacoes.Exceptions.NotValueDataCatalogacao;
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
	
	public Optional<Coordenadas> list(Long id) {
		 Optional<Coordenadas> listIdCoor = coordenadasRepository.findById(id);
		 listIdCoor.orElseThrow(() -> new NotValueDataCatalogacao("Id inesistente na base de dados"));
		 return listIdCoor;
 	}
	
	public void deleteData(Long id) {
		 coordenadasRepository
		                   .findById(id)
		                   .map(deleteId -> {
		                	   coordenadasRepository.deleteById(id);
		                	   return deleteId;
		                   }).orElseThrow(() -> new NotValueDataCatalogacao("Informacão não encontrada para ser deletadas"));
		 
	}
}
