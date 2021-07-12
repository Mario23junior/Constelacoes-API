package com.project.constelacoes.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Catalogacao {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
 	private Boolean visibilidadeOlhoNu;
 	private String estrelaPrincipal;		
  	private String magnitudeAparente;
  	
  	@OneToMany(mappedBy = "catalogacao",cascade = CascadeType.ALL)
  	private List<Coordenadas> coordenadas;
  	
  	@OneToMany(mappedBy = "catalogacao",cascade = CascadeType.ALL)
  	private List<DadosObservacionais> dadosObservacionais;
  	
  	@OneToMany(mappedBy = "catalogacao",cascade = CascadeType.ALL)
  	private List<FatosCostelacao> fatosCostelacaos;

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

	public List<Coordenadas> getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(List<Coordenadas> coordenadas) {
		this.coordenadas = coordenadas;
	}

	public List<DadosObservacionais> getDadosObservacionais() {
		return dadosObservacionais;
	}

	public void setDadosObservacionais(List<DadosObservacionais> dadosObservacionais) {
		this.dadosObservacionais = dadosObservacionais;
	}

	public List<FatosCostelacao> getFatosCostelacaos() {
		return fatosCostelacaos;
	}

	public void setFatosCostelacaos(List<FatosCostelacao> fatosCostelacaos) {
		this.fatosCostelacaos = fatosCostelacaos;
	}
}
