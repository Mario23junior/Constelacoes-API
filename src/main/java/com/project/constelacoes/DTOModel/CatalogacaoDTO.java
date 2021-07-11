package com.project.constelacoes.DTOModel;

public class CatalogacaoDTO {
   
	private Long id;
 	private Boolean visibilidadeOlhoNu;
 	private String estrelaPrincipal;		
  	private String magnitudeAparente;
  	
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
