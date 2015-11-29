package com.av2.bilhete;

public class Bilhete {
	
	//variáveis privadas pois só poderão ser vistas por esta classe
	private int numeroVagao;
	private int numeroAssento;
	private String classeAssento;
	
	//métodos publicos para pode manipular as variaveis em outra classe
	public int getNumeroVagao() {
		return numeroVagao;
	}
	public void setNumeroVagao(int numeroVagao) {
		this.numeroVagao = numeroVagao;
	}
	public int getNumeroAssento() {
		return numeroAssento;
	}
	public void setNumeroAssento(int numeroAssento) {
		this.numeroAssento = numeroAssento;
	}
	public String getClasseAssento() {
		return classeAssento;
	}
	public void setClasseAssento(String classeAssento) {
		this.classeAssento = classeAssento;
	}	
	
}
