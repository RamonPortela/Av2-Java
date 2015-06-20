package com.av2.viagem;

public class Viagem {

	//variáveis privadas pois só poderão ser vistas por esta classe
	private int duracaoViagem;
	private String destinoViagem;
	private String origemViagem;
	private String dataViagem;
	private String horaViagem;

	//métodos publicos para pode manipular as variaveis em outra classe	
	public int getDuracaoViagem() {
		return duracaoViagem;
	}
	public void setDuracaoViagem(int duracaoViagem) {
		this.duracaoViagem = duracaoViagem;
	}
	public String getDestinoViagem() {
		return destinoViagem;
	}
	public void setDestinoViagem(String destinoViagem) {
		this.destinoViagem = destinoViagem;
	}
	public String getOrigemViagem() {
		return origemViagem;
	}
	public void setOrigemViagem(String origemViagem) {
		this.origemViagem = origemViagem;
	}
	public String getDataViagem() {
		return dataViagem;
	}
	public void setDataViagem(String dataViagem) {
		this.dataViagem = dataViagem;
	}
	public String getHoraViagem() {
		return horaViagem;
	}
	public void setHoraViagem(String horaViagem) {
		this.horaViagem = horaViagem;
	}
}
