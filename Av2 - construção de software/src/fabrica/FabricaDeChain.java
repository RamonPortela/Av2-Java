package fabrica;

import java.util.ArrayList;

import requisicao.Requisicao;
import colaborador.Colaborador;
import enums.Cargos;
import enums.Departamentos;
import enums.Requisicoes;

public class FabricaDeChain {

	private ArrayList<Colaborador> colaboradores;
	private static FabricaDeChain instance = null;

	public static FabricaDeChain getInstance(){

		if(instance == null){
			instance = new FabricaDeChain();
		}

		return instance;
	}

	private FabricaDeChain(){

		colaboradores = new ArrayList<Colaborador>();

		Colaborador analistaTI = new Colaborador(Cargos.ANALISTA, Departamentos.TI);
		colaboradores.add(0, analistaTI);
		Colaborador supervisorTI = new Colaborador(Cargos.SUPERVISOR, Departamentos.TI);
		colaboradores.add(1, supervisorTI);
		Colaborador gerenteTI = new Colaborador(Cargos.GERENTE, Departamentos.TI);
		colaboradores.add(2, gerenteTI);
		Colaborador diretorTI = new Colaborador(Cargos.DIRETOR, Departamentos.TI);
		colaboradores.add(3, diretorTI);
		
		Colaborador analistaRH = new Colaborador(Cargos.ANALISTA, Departamentos.RH);
		colaboradores.add(4, analistaRH);
		Colaborador supervisorRH = new Colaborador(Cargos.SUPERVISOR, Departamentos.RH);
		colaboradores.add(5, supervisorRH);
		Colaborador gerenteRH = new Colaborador(Cargos.GERENTE, Departamentos.RH);
		colaboradores.add(6, gerenteRH);
		Colaborador diretorRH = new Colaborador(Cargos.DIRETOR, Departamentos.RH);
		colaboradores.add(7, diretorRH);
		
		Colaborador analistaOperacao = new Colaborador(Cargos.ANALISTA, Departamentos.OPERACOES);
		colaboradores.add(8, analistaOperacao);
		Colaborador supervisorOperacao = new Colaborador(Cargos.SUPERVISOR, Departamentos.OPERACOES);
		colaboradores.add(9, supervisorOperacao);
		Colaborador gerenteOperacao = new Colaborador(Cargos.GERENTE, Departamentos.OPERACOES);
		colaboradores.add(10, gerenteOperacao);
		Colaborador diretorOperacoes = new Colaborador(Cargos.DIRETOR, Departamentos.OPERACOES);
		colaboradores.add(11, diretorOperacoes);
		
		Colaborador analistaJuridico = new Colaborador(Cargos.ANALISTA, Departamentos.JURIDICO);
		colaboradores.add(12, analistaJuridico);
		Colaborador gerenteJuridico = new Colaborador(Cargos.GERENTE, Departamentos.JURIDICO);
		colaboradores.add(13, gerenteJuridico);
		Colaborador diretorJuridico = new Colaborador(Cargos.DIRETOR, Departamentos.JURIDICO);
		colaboradores.add(14, diretorJuridico);

		Colaborador ceo = new Colaborador(Cargos.CEO, Departamentos.CEO);
		colaboradores.add(15, ceo);
	}

	public void criaChain(Requisicao requisicao, Colaborador colaborador){
		if(colaborador.getDepartamento() == Departamentos.TI){
			if(requisicao.getRequisicao() == Requisicoes.AQUISICAO){
				colaborador.setProximo(colaboradores.get(1));
				colaboradores.get(1).setProximo(colaboradores.get(2));
				colaboradores.get(2).setProximo(colaboradores.get(3));
				colaboradores.get(3).setProximo(colaboradores.get(15));
			}
		}
	}


}
