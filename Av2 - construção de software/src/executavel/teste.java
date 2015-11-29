package executavel;
import colaborador.Colaborador;
import departamento.Departamento;
import enums.Cargos;
import enums.Departamentos;
import enums.Requisicoes;
import requisicao.Requisicao;

public class teste {

	public static void main(String[] args) {
		
		Departamento juridico = new Departamento(Departamentos.JURIDICO);
		Departamento ti = new Departamento(Departamentos.TI);
		Departamento rh = new Departamento(Departamentos.RH);
		Departamento operacao = new Departamento(Departamentos.OPERACOES);
		
		Colaborador colaboradorJuridico = new Colaborador(Cargos.ANALISTA, Departamentos.JURIDICO);
		Colaborador colaboradorTI = new Colaborador(Cargos.ANALISTA, Departamentos.TI);
		Colaborador colaboradorRH = new Colaborador(Cargos.ANALISTA, Departamentos.RH);
		Colaborador colaboradorOperacao = new Colaborador(Cargos.ANALISTA, Departamentos.OPERACOES);

		
		Requisicao primeira = new Requisicao(Requisicoes.ACORDOLEGAL, colaboradorJuridico.getDepartamento() , 514654);
		Requisicao segunda = new Requisicao(Requisicoes.ACORDOLEGAL, colaboradorTI.getDepartamento() , 514654);
		Requisicao terceira = new Requisicao(Requisicoes.ACORDOLEGAL, colaboradorRH.getDepartamento() , 514654);
		Requisicao quarta = new Requisicao(Requisicoes.ACORDOLEGAL, colaboradorOperacao.getDepartamento() , 514654);

		colaboradorTI.aceitaRequisicao(segunda);
		
		
		

	}

}
