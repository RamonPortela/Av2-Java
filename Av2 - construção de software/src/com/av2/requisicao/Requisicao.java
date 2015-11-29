package com.av2.requisicao;

import com.av2.enums.Departamentos;
import com.av2.enums.Requisicoes;

public class Requisicao {
	private Requisicoes requisicao;
	private Departamentos departamento;
	private double valor;

	public Requisicao(Requisicoes _requisicao, Departamentos _departamento, double _valor){
		this.setRequisicao(_requisicao);
		this.setDepartamento(_departamento);
		this.setValor(_valor);

	}

	public Departamentos getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}

	public Requisicoes getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(Requisicoes requisicao) {
		this.requisicao = requisicao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Requisicao de: "+this.getRequisicao()+ " disparada pelo departamento de: "+ this.getDepartamento()+ " no valor de: "+this.getValor();
	}
}
