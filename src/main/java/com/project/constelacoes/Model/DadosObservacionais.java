package com.project.constelacoes.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DadosObservacionais {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Double latitudeMinima;
	private Double latitudeMaxima;
	private Date passagemMeridianal;
 	private Double hora;
 	
	public Double getLatitudeMinima() {
		return latitudeMinima;
	}
	public void setLatitudeMinima(Double latitudeMinima) {
		this.latitudeMinima = latitudeMinima;
	}
	public Double getLatitudeMaxima() {
		return latitudeMaxima;
	}
	public void setLatitudeMaxima(Double latitudeMaxima) {
		this.latitudeMaxima = latitudeMaxima;
	}
	public Date getPassagemMeridianal() {
		return passagemMeridianal;
	}
	public void setPassagemMeridianal(Date passagemMeridianal) {
		this.passagemMeridianal = passagemMeridianal;
	}
	public Double getHora() {
		return hora;
	}
	public void setHora(Double hora) {
		this.hora = hora;
	}
 	
 	
 	
 	
}
