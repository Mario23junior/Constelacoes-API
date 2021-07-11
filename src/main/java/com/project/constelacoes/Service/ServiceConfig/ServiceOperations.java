package com.project.constelacoes.Service.ServiceConfig;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import com.project.constelacoes.DTOModel.CatalogacaoDTO;
import com.project.constelacoes.Model.Catalogacao;
import com.project.constelacoes.Repository.CatalogacaoRepository;
import com.project.constelacoes.Service.Implements;

public class ServiceOperations implements Implements {
  
	private CatalogacaoRepository catalogacaoRepository;
	private ModelMapper modelMapper;
	
	public ServiceOperations(CatalogacaoRepository ModelMapper) {
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
		return null;
	}
	
	
}
