package com.av2.executavel;
import com.av2.colaborador.Colaborador;
import com.av2.enums.Cargos;
import com.av2.enums.Departamentos;
import com.av2.enums.Requisicoes;
import com.av2.requisicao.Requisicao;

public class Executavel {

	public static void main(String[] args) {

		Colaborador colaboradorJuridico = new Colaborador(Cargos.ANALISTA, Departamentos.JURIDICO);
		Colaborador colaboradorTI = new Colaborador(Cargos.ANALISTA, Departamentos.TI);
		Colaborador colaboradorRH = new Colaborador(Cargos.ANALISTA, Departamentos.RH);
		Colaborador colaboradorOperacao = new Colaborador(Cargos.ANALISTA, Departamentos.OPERACOES);


		Requisicao primeira = new Requisicao(Requisicoes.AQUISICAO, colaboradorJuridico.getDepartamento(), 15000);
		Requisicao segunda = new Requisicao(Requisicoes.ACORDO_LEGAL, colaboradorTI.getDepartamento(), 3500000);
		Requisicao terceira = new Requisicao(Requisicoes.AQUISICAO, colaboradorTI.getDepartamento(), 3500);
		Requisicao quarta = new Requisicao(Requisicoes.CONTRATACAO, colaboradorRH.getDepartamento(), 514654);
		Requisicao quinta = new Requisicao(Requisicoes.AQUISICAO, colaboradorOperacao.getDepartamento(), 7000000);

		System.out.println(primeira.toString());
		colaboradorJuridico.aceitaRequisicao(primeira);

		System.out.println(segunda.toString());
		colaboradorTI.aceitaRequisicao(segunda);

		System.out.println(terceira.toString());
		colaboradorTI.aceitaRequisicao(terceira);

		System.out.println(quarta.toString());
		colaboradorRH.aceitaRequisicao(quarta);

		System.out.println(quinta.toString());
		colaboradorOperacao.aceitaRequisicao(quinta);
	}

}
