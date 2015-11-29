package colaborador;
import enums.Cargos;
import enums.Departamentos;
import enums.Requisicoes;
import javafx.scene.shape.ArcType;
import requisicao.Requisicao;

public class Colaborador {
	private Cargos cargo;
	private Departamentos departamento;
	private Colaborador proximo;

	public Colaborador(Cargos _cargo, Departamentos _departamento){
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

	public void aceitaRequisicao(Requisicao requisicao){

		switch (departamento) {
		case TI:
			switch(cargo){
				case ANALISTA:
					if(requisicao.getRequisicao() == Requisicoes.AQUISICAO && requisicao.getValor() <= 5000){
						System.out.println("Requisi��o aceita pelo "+ this.toString());
					}
					else{
						this.getProximo().aceitaRequisicao(requisicao);
					}
				break;

				case SUPERVISOR:
					if(requisicao.getRequisicao() == Requisicoes.AQUISICAO && requisicao.getValor() <= 100000){
						System.out.println("Requisi��o aceita pelo "+ this.toString());
					}
					else{
						this.getProximo().aceitaRequisicao(requisicao);
					}
				break;

				case GERENTE:
					if(requisicao.getRequisicao() == Requisicoes.AQUISICAO && requisicao.getValor() <= 200000){
						System.out.println("Requisi��o aceita pelo "+ this.toString());
					}
					else{
						this.getProximo().aceitaRequisicao(requisicao);
					}
				break;

				case DIRETOR:
					if(requisicao.getRequisicao() == Requisicoes.AQUISICAO && requisicao.getValor() <= 1000000){
						System.out.println("Requisi��o aceita pelo "+ this.toString());
					}
					else{
						this.getProximo().aceitaRequisicao(requisicao);
					}
				break;
			}
			break;

		default:
			System.out.println("Requisi��o aceita pelo "+ this.toString());
			break;
		}

	}

	@Override
	public String toString() {

		String _cargo = "";

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

		case DIRETOR:
			_cargo = _cargo + "Diretor do setor de: ";
			break;

		case CEO:
			_cargo = "CEO DA EMPRESA FION!";
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

		return _cargo;
	}
}