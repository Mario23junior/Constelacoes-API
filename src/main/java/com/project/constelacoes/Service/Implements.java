package com.project.constelacoes.Service;

import java.util.List;

import com.project.constelacoes.DTOModel.CatalogacaoDTO;
import com.project.constelacoes.Model.Catalogacao;

public interface Implements {
    
	public List<CatalogacaoDTO> ListAllInformations();
	public CatalogacaoDTO ConvertToCatalogocaoToCatalogacaoDTO(Catalogacao catalogacao);
	public List<CatalogacaoDTO> listAllDataDTO();




}
