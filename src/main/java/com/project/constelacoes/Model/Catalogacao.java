package com.project.constelacoes.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Catalogacao {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Boolean visibilidadeOlhoNu;
	private String estrelaPrincipal;	
 	private String magnitudeAparente;
	
	public Long getId() {
		return id;
	}
	public void setMagnitudeAparente(String magnitudeAparente) {
		this.magnitudeAparente = magnitudeAparente;
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
	 
	
}
