package departamento;
import enums.Departamentos;

public class Departamento {
	private Departamentos departamento;
	private double orcamento;

	public Departamento(Departamentos _departamento){
		setDepartamento(_departamento);
		setOrcamento(_departamento.getOrcamento());
	}

	private void setDepartamento(Departamentos _departamento){
		this.departamento = _departamento;
	}

	public Departamentos getDepartamento(){
		return this.departamento;
	}

	public void setOrcamento(double _orcamento){
		this.orcamento = _orcamento;
	}

	public double getOrcamento(){
		return this.orcamento;
	}
}
