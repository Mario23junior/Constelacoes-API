package com.project.constelacoes.DTOModel;

public class CoordenadasDTO {
   
	private Long id;
    private String scencaoReta;
    private Double declinacao;
    private Double areaTotal;
    
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
