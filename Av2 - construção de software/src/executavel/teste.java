package executavel;
import colaborador.Colaborador;
import departamento.Departamento;
import enums.Cargos;
import enums.Departamentos;
import enums.Requisicoes;
import requisicao.Requisicao;

public class teste {

	public static void main(String[] args) {
		Departamento d = new Departamento(Departamentos.OPERACOES);

		System.out.println(d.getOrcamento());

		Colaborador c = new Colaborador(Cargos.ANALISTA, Departamentos.TI);

		System.out.println(c.toString());

		Requisicao r = new Requisicao(Requisicoes.AQUISICAO, Departamentos.RH, 200000);

		
		c.aceitaRequisicao(r);

	}

}
