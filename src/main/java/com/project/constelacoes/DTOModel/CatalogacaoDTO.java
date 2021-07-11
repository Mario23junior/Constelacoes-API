package com.project.constelacoes.DTOModel;

import java.util.List;

public class CatalogacaoDTO {
   
	private Long id;
 	private Boolean visibilidadeOlhoNu;
 	private String estrelaPrincipal;		
  	private String magnitudeAparente;
  	
  	private List<CoordenadasDTO> corCoordenadasDTOs;
  	
  	private List<DadosObservacionaisDTO> dadosObservacionaisDTOs;
  	
  	private List<FatosCostelecaoDTO> fatosCostelecaoDTOs;
  	
  	
	public List<CoordenadasDTO> getCorCoordenadasDTOs() {
		return corCoordenadasDTOs;
	}
	public void setCorCoordenadasDTOs(List<CoordenadasDTO> corCoordenadasDTOs) {
		this.corCoordenadasDTOs = corCoordenadasDTOs;
	}
	public List<DadosObservacionaisDTO> getDadosObservacionaisDTOs() {
		return dadosObservacionaisDTOs;
	}
	public void setDadosObservacionaisDTOs(List<DadosObservacionaisDTO> dadosObservacionaisDTOs) {
		this.dadosObservacionaisDTOs = dadosObservacionaisDTOs;
	}
	public List<FatosCostelecaoDTO> getFatosCostelecaoDTOs() {
		return fatosCostelecaoDTOs;
	}
	public void setFatosCostelecaoDTOs(List<FatosCostelecaoDTO> fatosCostelecaoDTOs) {
		this.fatosCostelecaoDTOs = fatosCostelecaoDTOs;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getVisibilidadeOlhoNu() {
		return visibilidadeOlhoNu;
	}
	public void setVisibilidadeOlhoNu(Boolean visibilidadeOlhoNu) {
		this.visibilidadeOlhoNu = visibilidadeOlhoNu;
	}
	public String getEstrelaPrincipal() {
		return estrelaPrincipal;
	}
	public void setEstrelaPrincipal(String estrelaPrincipal) {
		this.estrelaPrincipal = estrelaPrincipal;
	}
	public String getMagnitudeAparente() {
		return magnitudeAparente;
	}
	public void setMagnitudeAparente(String magnitudeAparente) {
		this.magnitudeAparente = magnitudeAparente;
	} 	
}
