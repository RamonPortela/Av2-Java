package fabrica;

import java.util.ArrayList;

import colaborador.Colaborador;
import enums.Cargos;
import enums.Departamentos;

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
		colaboradores.add(analistaTI);
		Colaborador analistaRH = new Colaborador(Cargos.ANALISTA, Departamentos.RH);
		colaboradores.add(analistaRH);
		Colaborador analistaOperacao = new Colaborador(Cargos.ANALISTA, Departamentos.OPERACOES);
		colaboradores.add(analistaOperacao);
		Colaborador analistaJuridico = new Colaborador(Cargos.ANALISTA, Departamentos.JURIDICO);
		colaboradores.add(analistaJuridico);

		Colaborador supervisorTI = new Colaborador(Cargos.SUPERVISOR, Departamentos.TI);
		colaboradores.add(supervisorTI);
		Colaborador supervisorRH = new Colaborador(Cargos.SUPERVISOR, Departamentos.RH);
		colaboradores.add(supervisorRH);
		Colaborador supervisorOperacao = new Colaborador(Cargos.SUPERVISOR, Departamentos.OPERACOES);
		colaboradores.add(supervisorOperacao);

		Colaborador gerenteTI = new Colaborador(Cargos.GERENTE, Departamentos.TI);
		colaboradores.add(gerenteTI);
		Colaborador gerenteRH = new Colaborador(Cargos.GERENTE, Departamentos.RH);
		colaboradores.add(gerenteRH);
		Colaborador gerenteOperacao = new Colaborador(Cargos.GERENTE, Departamentos.OPERACOES);
		colaboradores.add(gerenteOperacao);
		Colaborador gerenteJuridico = new Colaborador(Cargos.GERENTE, Departamentos.JURIDICO);
		colaboradores.add(gerenteJuridico);

		Colaborador diretorTI = new Colaborador(Cargos.DIRETOR, Departamentos.TI);
		colaboradores.add(diretorTI);
		Colaborador diretorRH = new Colaborador(Cargos.DIRETOR, Departamentos.RH);
		colaboradores.add(diretorRH);
		Colaborador diretorOperacoes = new Colaborador(Cargos.DIRETOR, Departamentos.OPERACOES);
		colaboradores.add(diretorOperacoes);
		Colaborador diretorJuridico = new Colaborador(Cargos.DIRETOR, Departamentos.JURIDICO);
		colaboradores.add(diretorJuridico);

		Colaborador ceo = new Colaborador(Cargos.CEO, null);
		colaboradores.add(ceo);
	}



}
