package com.av2.viajante;

public class Viajante {

	//vari�veis privadas pois s� poder�o ser vistas por esta classe
	private String nomeCompletoViajante;
	private String cpfViajante;
	
	//m�todos publicos para pode manipular as variaveis em outra classe	
	public String getNomeCompletoViajante() {
		return nomeCompletoViajante;
	}
	public void setNomeCompletoViajante(String nomeCompletoViajante) {
		this.nomeCompletoViajante = nomeCompletoViajante;
	}
	public String getCpfViajante() {
		return cpfViajante;
	}
	public void setCpfViajante(String cpfViajante) {
		this.cpfViajante = cpfViajante;
	}
}
