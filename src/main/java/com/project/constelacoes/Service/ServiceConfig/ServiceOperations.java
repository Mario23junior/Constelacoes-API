package com.project.constelacoes.Service.ServiceConfig;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import com.project.constelacoes.DTOModel.CatalogacaoDTO;
import com.project.constelacoes.Model.Catalogacao;
import com.project.constelacoes.Repository.CatalogacaoRepository;
import com.project.constelacoes.Service.Implements;

public class ServiceOperations implements Implements {
  
	private CatalogacaoRepository catalogacaoRepository;
	private ModelMapper modelMapper;
	
	public ServiceOperations(CatalogacaoRepository catalogacaoRepository, ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
		this.catalogacaoRepository = catalogacaoRepository;
 	 }
	
	public List<CatalogacaoDTO> ListAllInformations() {
		return ((List<Catalogacao>) catalogacaoRepository
				                     .findAll())
				                     .stream()
				                     .map(this::ConvertToCatalogocaoToCatalogacaoDTO)
				                     .collect(Collectors.toList());
	}
	
	public CatalogacaoDTO ConvertToCatalogocaoToCatalogacaoDTO(Catalogacao catalogacao) {
	    modelMapper.getConfiguration()
	               .setMatchingStrategy(MatchingStrategies.LOOSE);
	    CatalogacaoDTO catalogacaoDTO = modelMapper.map(catalogacao, CatalogacaoDTO.class);
	    
	    return catalogacaoDTO;
 	}
	
	public List<CatalogacaoDTO> listAllDataDTO(){
		List<CatalogacaoDTO> listData = ListAllInformations();
		return listData
				     .stream()
				     .collect(Collectors.toList());
	}
}
