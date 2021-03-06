package com.project.constelacoes.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
 
@Entity
public class FatosCostelacao {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String imagem;
	private String nome;
	private String abreviacao;
	
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
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAbreviacao() {
		return abreviacao;
	}
	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}
}