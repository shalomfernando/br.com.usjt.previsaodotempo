package br.com.ccp3anmcaprevisaodotempo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Previsaodotempo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomediasemana;
	private double temperaturamin;
	private double temperaturamax;
	private double humidadedoar;
	private String descricao;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeDiaSemana() {
		return nomediasemana;
	}
	public void setNomeDiaSemana(String nomeDiaSemana) {
		this.nomediasemana = nomeDiaSemana;
	}
	public double getTemperaturaMin() {
		return temperaturamin;
	}
	public void setTemperaturaMin(double temperaturaMin) {
		this.temperaturamin = temperaturaMin;
	}
	public double getTemperaturaMax() {
		return temperaturamax;
	}
	public void setTemperaturaMax(double temperaturaMax) {
		this.temperaturamax = temperaturaMax;
	}
	public double getHumidadeDoAr() {
		return humidadedoar;
	}
	public void setHumidadeDoAr(double humidadeDoAr) {
		this.humidadedoar = humidadeDoAr;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
