package fabrica;

import java.util.ArrayList;

import requisicao.Requisicao;
import colaborador.Colaborador;
import enums.Cargos;
import enums.Departamentos;

public class FabricaDeChain {
	
	private static final int ANALISTA_TI = 0;
	private static final int SUPERVISOR_TI = 1;
	private static final int GERENTE_TI = 2;
	private static final int DIRETOR_TI = 3;
	private static final int ANALISTA_RH = 4;
	private static final int SUPERVISOR_RH = 5;
	private static final int GERENTE_RH = 6;
	private static final int DIRETOR_RH = 7;
	private static final int ANALISTA_OPERACOES = 8;
	private static final int SUPERVISOR_OPERACOES = 9;
	private static final int GERENTE_OPERACOES = 10;
	private static final int DIRETOR_OPERACOES = 11;
	private static final int ANALISTA_JURIDICO = 12;
	private static final int GERENTE_JURIDICO= 13;
	private static final int DIRETOR_JURIDICO = 14;
	private static final int CEO = 15;

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
		colaboradores.add(ANALISTA_TI, analistaTI);
		Colaborador supervisorTI = new Colaborador(Cargos.SUPERVISOR, Departamentos.TI);
		colaboradores.add(SUPERVISOR_TI, supervisorTI);
		Colaborador gerenteTI = new Colaborador(Cargos.GERENTE, Departamentos.TI);
		colaboradores.add(GERENTE_TI, gerenteTI);
		Colaborador diretorTI = new Colaborador(Cargos.DIRETOR, Departamentos.TI);
		colaboradores.add(DIRETOR_TI, diretorTI);
		
		Colaborador analistaRH = new Colaborador(Cargos.ANALISTA, Departamentos.RH);
		colaboradores.add(ANALISTA_RH, analistaRH);
		Colaborador supervisorRH = new Colaborador(Cargos.SUPERVISOR, Departamentos.RH);
		colaboradores.add(SUPERVISOR_RH, supervisorRH);
		Colaborador gerenteRH = new Colaborador(Cargos.GERENTE, Departamentos.RH);
		colaboradores.add(GERENTE_RH, gerenteRH);
		Colaborador diretorRH = new Colaborador(Cargos.DIRETOR, Departamentos.RH);
		colaboradores.add(DIRETOR_RH, diretorRH);
		
		Colaborador analistaOperacao = new Colaborador(Cargos.ANALISTA, Departamentos.OPERACOES);
		colaboradores.add(ANALISTA_OPERACOES, analistaOperacao);
		Colaborador supervisorOperacao = new Colaborador(Cargos.SUPERVISOR, Departamentos.OPERACOES);
		colaboradores.add(SUPERVISOR_OPERACOES, supervisorOperacao);
		Colaborador gerenteOperacao = new Colaborador(Cargos.GERENTE, Departamentos.OPERACOES);
		colaboradores.add(GERENTE_OPERACOES, gerenteOperacao);
		Colaborador diretorOperacoes = new Colaborador(Cargos.DIRETOR, Departamentos.OPERACOES);
		colaboradores.add(DIRETOR_OPERACOES, diretorOperacoes);
		
		Colaborador analistaJuridico = new Colaborador(Cargos.ANALISTA, Departamentos.JURIDICO);
		colaboradores.add(ANALISTA_JURIDICO, analistaJuridico);
		Colaborador gerenteJuridico = new Colaborador(Cargos.GERENTE, Departamentos.JURIDICO);
		colaboradores.add(GERENTE_JURIDICO, gerenteJuridico);
		Colaborador diretorJuridico = new Colaborador(Cargos.DIRETOR, Departamentos.JURIDICO);
		colaboradores.add(DIRETOR_JURIDICO, diretorJuridico);

		Colaborador ceo = new Colaborador(Cargos.CEO, Departamentos.CEO);
		colaboradores.add(CEO, ceo);
	}

	public void criaChain(Requisicao requisicao, Colaborador colaborador){
		
		switch(colaborador.getDepartamento()){
		case TI:
			switch(requisicao.getRequisicao()){
			case AQUISICAO:
				colaborador.setProximo(colaboradores.get(ANALISTA_TI));
				colaboradores.get(ANALISTA_TI).setProximo(colaboradores.get(SUPERVISOR_TI));
				colaboradores.get(SUPERVISOR_TI).setProximo(colaboradores.get(GERENTE_TI));
				colaboradores.get(GERENTE_TI).setProximo(colaboradores.get(DIRETOR_TI));
				colaboradores.get(DIRETOR_TI).setProximo(colaboradores.get(CEO));
				break;
				
			case ACORDOLEGAL:
				System.out.println("Requisição transferida do setor: " + requisicao.getDepartamento() + " para o setor: " + Departamentos.JURIDICO);
				colaborador.setProximo(colaboradores.get(ANALISTA_JURIDICO));
				colaboradores.get(ANALISTA_JURIDICO).setProximo(colaboradores.get(GERENTE_JURIDICO));
				colaboradores.get(GERENTE_JURIDICO).setProximo(colaboradores.get(DIRETOR_JURIDICO));
				colaboradores.get(DIRETOR_JURIDICO).setProximo(colaboradores.get(CEO));
				break;
				
			case CONTRATACAO:
				System.out.println("Requisição transferida do setor: " + requisicao.getDepartamento() + " para o setor: " + Departamentos.RH);
				colaborador.setProximo(colaboradores.get(ANALISTA_RH));
				colaboradores.get(ANALISTA_RH).setProximo(colaboradores.get(SUPERVISOR_RH));
				colaboradores.get(SUPERVISOR_RH).setProximo(colaboradores.get(GERENTE_RH));
				colaboradores.get(GERENTE_RH).setProximo(colaboradores.get(DIRETOR_RH));
				colaboradores.get(DIRETOR_RH).setProximo(colaboradores.get(CEO));
				break;
			}
			break;
			
		case RH:
			switch(requisicao.getRequisicao()){
			case AQUISICAO:
				System.out.println("Requisição transferida do setor: " + requisicao.getDepartamento() + " para o setor: " + Departamentos.OPERACOES);
				colaborador.setProximo(colaboradores.get(ANALISTA_OPERACOES));
				colaboradores.get(ANALISTA_OPERACOES).setProximo(colaboradores.get(SUPERVISOR_OPERACOES));
				colaboradores.get(SUPERVISOR_OPERACOES).setProximo(colaboradores.get(GERENTE_OPERACOES));
				colaboradores.get(GERENTE_OPERACOES).setProximo(colaboradores.get(DIRETOR_OPERACOES));
				colaboradores.get(DIRETOR_OPERACOES).setProximo(colaboradores.get(CEO));
				break;
				
			case ACORDOLEGAL:
				System.out.println("Requisição transferida do setor: " + requisicao.getDepartamento() + " para o setor: " + Departamentos.JURIDICO);
				colaborador.setProximo(colaboradores.get(ANALISTA_JURIDICO));
				colaboradores.get(ANALISTA_JURIDICO).setProximo(colaboradores.get(GERENTE_JURIDICO));
				colaboradores.get(GERENTE_JURIDICO).setProximo(colaboradores.get(DIRETOR_JURIDICO));
				colaboradores.get(DIRETOR_JURIDICO).setProximo(colaboradores.get(CEO));
				break;
				
			case CONTRATACAO:
				colaborador.setProximo(colaboradores.get(ANALISTA_RH));
				colaboradores.get(ANALISTA_RH).setProximo(colaboradores.get(SUPERVISOR_RH));
				colaboradores.get(SUPERVISOR_RH).setProximo(colaboradores.get(GERENTE_RH));
				colaboradores.get(GERENTE_RH).setProximo(colaboradores.get(DIRETOR_RH));
				colaboradores.get(DIRETOR_RH).setProximo(colaboradores.get(CEO));
				break;
			}
			break;
			
		case OPERACOES:
			switch(requisicao.getRequisicao()){
			case AQUISICAO:
				colaborador.setProximo(colaboradores.get(ANALISTA_OPERACOES));
				colaboradores.get(ANALISTA_OPERACOES).setProximo(colaboradores.get(SUPERVISOR_OPERACOES));
				colaboradores.get(SUPERVISOR_OPERACOES).setProximo(colaboradores.get(GERENTE_OPERACOES));
				colaboradores.get(GERENTE_OPERACOES).setProximo(colaboradores.get(DIRETOR_OPERACOES));
				colaboradores.get(DIRETOR_OPERACOES).setProximo(colaboradores.get(CEO));
				break;
				
			case ACORDOLEGAL:
				System.out.println("Requisição transferida do setor: " + requisicao.getDepartamento() + " para o setor: " + Departamentos.JURIDICO);
				colaborador.setProximo(colaboradores.get(ANALISTA_JURIDICO));
				colaboradores.get(ANALISTA_JURIDICO).setProximo(colaboradores.get(GERENTE_JURIDICO));
				colaboradores.get(GERENTE_JURIDICO).setProximo(colaboradores.get(DIRETOR_JURIDICO));
				colaboradores.get(DIRETOR_JURIDICO).setProximo(colaboradores.get(CEO));
				break;
				
			case CONTRATACAO:
				colaborador.setProximo(colaboradores.get(ANALISTA_OPERACOES));
				colaboradores.get(ANALISTA_OPERACOES).setProximo(colaboradores.get(SUPERVISOR_OPERACOES));
				colaboradores.get(SUPERVISOR_OPERACOES).setProximo(colaboradores.get(GERENTE_OPERACOES));
				colaboradores.get(GERENTE_OPERACOES).setProximo(colaboradores.get(DIRETOR_OPERACOES));
				colaboradores.get(DIRETOR_OPERACOES).setProximo(colaboradores.get(CEO));
				break;
			}
			break;
			
		case JURIDICO:
			switch(requisicao.getRequisicao()){
			case AQUISICAO:
				System.out.println("Requisição transferida do setor: " + requisicao.getDepartamento() + " para o setor: " + Departamentos.JURIDICO);
				colaborador.setProximo(colaboradores.get(ANALISTA_TI));
				colaboradores.get(ANALISTA_TI).setProximo(colaboradores.get(SUPERVISOR_TI));
				colaboradores.get(SUPERVISOR_TI).setProximo(colaboradores.get(GERENTE_TI));
				colaboradores.get(GERENTE_TI).setProximo(colaboradores.get(DIRETOR_TI));
				colaboradores.get(DIRETOR_TI).setProximo(colaboradores.get(CEO));
				break;
				
			case ACORDOLEGAL:
				colaborador.setProximo(colaboradores.get(ANALISTA_JURIDICO));
				colaboradores.get(ANALISTA_JURIDICO).setProximo(colaboradores.get(GERENTE_JURIDICO));
				colaboradores.get(GERENTE_JURIDICO).setProximo(colaboradores.get(DIRETOR_JURIDICO));
				colaboradores.get(DIRETOR_JURIDICO).setProximo(colaboradores.get(CEO));
				break;
				
			case CONTRATACAO:
				colaborador.setProximo(colaboradores.get(ANALISTA_JURIDICO));
				colaboradores.get(ANALISTA_JURIDICO).setProximo(colaboradores.get(GERENTE_JURIDICO));
				colaboradores.get(GERENTE_JURIDICO).setProximo(colaboradores.get(DIRETOR_JURIDICO));
				colaboradores.get(DIRETOR_JURIDICO).setProximo(colaboradores.get(ANALISTA_RH));
				colaboradores.get(ANALISTA_RH).setProximo(colaboradores.get(SUPERVISOR_RH));
				colaboradores.get(SUPERVISOR_RH).setProximo(colaboradores.get(GERENTE_RH));
				colaboradores.get(GERENTE_RH).setProximo(colaboradores.get(DIRETOR_RH));
				colaboradores.get(DIRETOR_RH).setProximo(colaboradores.get(CEO));
				break;
			}
			break;
			
		default:
			break;
		}
	}
}
