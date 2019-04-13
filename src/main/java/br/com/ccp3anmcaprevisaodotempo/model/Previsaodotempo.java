package br.com.ccp3anmcaprevisaodotempo.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Previsaodotempo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(nullable = false,name = "ID_SEMANA",foreignKey = @ForeignKey(name="FK_SEMANA_PERIODO"))
	private DiaSemana diaSemana;
	private double temperaturamin;
	private double temperaturamax;
	private double humidadedoar;
	private String descricao;
	private long latitude;
	private long logitude;
	private String datahr;



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public double getTemperaturamin() {
		return temperaturamin;
	}

	public void setTemperaturamin(double temperaturamin) {
		this.temperaturamin = temperaturamin;
	}

	public double getTemperaturamax() {
		return temperaturamax;
	}

	public void setTemperaturamax(double temperaturamax) {
		this.temperaturamax = temperaturamax;
	}

	public double getHumidadedoar() {
		return humidadedoar;
	}

	public void setHumidadedoar(double humidadedoar) {
		this.humidadedoar = humidadedoar;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	public long getLogitude() {
		return logitude;
	}

	public void setLogitude(long logitude) {
		this.logitude = logitude;
	}

	public String getDatahr() {
		return datahr;
	}

	public void setDatahr(String datahr) {
		this.datahr = datahr;
	}

	public DiaSemana getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
}
