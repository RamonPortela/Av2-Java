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
