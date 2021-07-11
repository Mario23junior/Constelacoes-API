package com.project.constelacoes.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Coordenadas {
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String scencaoReta;
    private Double declinacao;
    private Double areaTotal;
    
    @ManyToOne
    private Catalogacao catalogacao;
    

	public Catalogacao getCatalogacao() {
		return catalogacao;
	}
	public void setCatalogacao(Catalogacao catalogacao) {
		this.catalogacao = catalogacao;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getScencaoReta() {
		return scencaoReta;
	}
	public void setScencaoReta(String scencaoReta) {
		this.scencaoReta = scencaoReta;
	}
	public Double getDeclinacao() {
		return declinacao;
	}
	public void setDeclinacao(Double declinacao) {
		this.declinacao = declinacao;
	}
	public Double getAreaTotal() {
		return areaTotal;
	}
	public void setAreaTotal(Double areaTotal) {
		this.areaTotal = areaTotal;
	}
    
    
}
