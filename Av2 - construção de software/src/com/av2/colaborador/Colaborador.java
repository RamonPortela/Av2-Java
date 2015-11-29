package com.av2.colaborador;

import com.av2.enums.Cargos;
import com.av2.enums.Departamentos;
import com.av2.enums.Requisicoes;
import com.av2.fabrica.FabricaDeChain;
import com.av2.requisicao.Requisicao;

public class Colaborador {
	private Cargos cargo;
	private Departamentos departamento;
	private Colaborador proximo;

	public Colaborador(Cargos _cargo, Departamentos _departamento) {
		this.setCargo(_cargo);
		this.setDepartamento(_departamento);
		this.setProximo(null);
	}

	public Colaborador getProximo() {
		return proximo;
	}

	public void setProximo(Colaborador _proximo) {
		this.proximo = _proximo;
	}

	public Departamentos getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamentos _departamento) {
		this.departamento = _departamento;
	}

	public Cargos getCargo() {
		return cargo;
	}

	public void setCargo(Cargos _cargo) {
		this.cargo = _cargo;
	}

	public void aceitaRequisicao(Requisicao requisicao) {

		switch (departamento) {
		case TI:
			switch (cargo) {
			case ANALISTA:
				if (requisicao.getRequisicao() == Requisicoes.AQUISICAO	&& requisicao.getValor() <= 5000) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					FabricaDeChain.getInstance().criaChain(requisicao, this);
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;

			case SUPERVISOR:
				if (requisicao.getRequisicao() == Requisicoes.AQUISICAO	&& requisicao.getValor() <= 100000) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {

					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;

			case GERENTE:
				if (requisicao.getRequisicao() == Requisicoes.AQUISICAO && requisicao.getValor() <= 200000) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;

			case DIRETOR:
				if (requisicao.getRequisicao() == Requisicoes.AQUISICAO && requisicao.getValor() <= 1000000) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;
			}
			break;

		case RH:
			switch (cargo) {
			case ANALISTA:
				if (requisicao.getRequisicao() == Requisicoes.CONTRATACAO && requisicao.getValor() <= 15000) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					FabricaDeChain.getInstance().criaChain(requisicao, this);
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;

			case SUPERVISOR:
				if (requisicao.getRequisicao() == Requisicoes.CONTRATACAO && requisicao.getValor() <= 80000) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;

			case GERENTE:
				if (requisicao.getRequisicao() == Requisicoes.CONTRATACAO && requisicao.getValor() <= 400000) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;

			case DIRETOR:
				if (requisicao.getRequisicao() == Requisicoes.CONTRATACAO && requisicao.getValor() <= 2000000) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;
			}
			break;

		case JURIDICO:
			switch (cargo) {
			case ANALISTA:
				if (requisicao.getRequisicao() == Requisicoes.ACORDO_LEGAL && requisicao.getValor() <= 50000) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					FabricaDeChain.getInstance().criaChain(requisicao, this);
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;

			case GERENTE:
				if (requisicao.getRequisicao() == Requisicoes.ACORDO_LEGAL && requisicao.getValor() <= 250000) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;

			case DIRETOR:
				if ((requisicao.getRequisicao() == Requisicoes.ACORDO_LEGAL && requisicao.getValor() <= 5000000) || (requisicao.getRequisicao() == Requisicoes.CONTRATACAO && requisicao.getValor() <= 500000)) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;
			}
			break;

		case OPERACOES:
			switch (cargo) {
			case ANALISTA:
				if ((requisicao.getRequisicao() == Requisicoes.AQUISICAO && requisicao.getValor() <= 50000) || (requisicao.getRequisicao() == Requisicoes.CONTRATACAO && requisicao.getValor() <= 25000)) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					FabricaDeChain.getInstance().criaChain(requisicao, this);
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;

			case SUPERVISOR:
				if ((requisicao.getRequisicao() == Requisicoes.AQUISICAO && requisicao.getValor() <= 250000) || (requisicao.getRequisicao() == Requisicoes.CONTRATACAO && requisicao.getValor() <= 100000)) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;

			case GERENTE:
				if ((requisicao.getRequisicao() == Requisicoes.AQUISICAO && requisicao.getValor() <= 1000000) || (requisicao.getRequisicao() == Requisicoes.CONTRATACAO && requisicao.getValor() <= 500000)) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;

			case DIRETOR:
				if ((requisicao.getRequisicao() == Requisicoes.AQUISICAO && requisicao.getValor() <= 5000000) || (requisicao.getRequisicao() == Requisicoes.CONTRATACAO && requisicao.getValor() <= 5000000)) {
					System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
				} else {
					this.getProximo().aceitaRequisicao(requisicao);
				}
				break;
			}
			break;
		default:
			System.out.println("Requisi��o aceita pelo " + this.toString()+"\n");
			break;
		}

	}

	@Override
	public String toString() {

		String _cargo = "";

		if(this.getCargo() != Cargos.DIRETOR){
			switch (cargo) {
			case ANALISTA:
				_cargo = _cargo + "Analista do setor de: ";
				break;
			case SUPERVISOR:
				_cargo = _cargo + "Supervisor do setor de: ";
				break;
			case GERENTE:
				_cargo = _cargo + "Gerente do setor de: ";
				break;

			case CEO:
				_cargo = "CEO";
				break;
			}

			switch (departamento) {
			case TI:
				_cargo = _cargo + "TI";
				break;
			case JURIDICO:
				_cargo = _cargo + "Juridico";
				break;
			case RH:
				_cargo = _cargo + "RH";
				break;

			case OPERACOES:
				_cargo = _cargo + "Operacoes";
				break;

			default:

				break;
			}
		}

		else{
			switch (departamento) {
			case TI:
				_cargo = _cargo + "CIO";
				break;
			case JURIDICO:
				_cargo = _cargo + "CLO";
				break;
			case RH:
				_cargo = _cargo + "CHRO";
				break;

			case OPERACOES:
				_cargo = _cargo + "COO";
				break;
			}
		}

		return _cargo;
	}
}