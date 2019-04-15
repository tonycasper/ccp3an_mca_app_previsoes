package br.ustj.exercicios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Previsao {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String nomeDiaSemana;
	private double temperaturaMaxima;
	private double temperaturaMinima;
	private int humidadeRelativa;
	private String decricao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDiaSemana() {
		return nomeDiaSemana;
	}
	public void setNomeDiaSemana(String nomeDiaSemana) {
		this.nomeDiaSemana = nomeDiaSemana;
	}
	public double getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	public void setTemperaturaMaxima(double temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}
	public double getTemperaturaMinima() {
		return temperaturaMinima;
	}
	public void setTemperaturaMinima(double temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
	public int getHumidadeRelativa() {
		return humidadeRelativa;
	}
	public void setHumidadeRelativa(int humidadeRelativa) {
		this.humidadeRelativa = humidadeRelativa;
	}
	public String getDecricao() {
		return decricao;
	}
	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}		
}
