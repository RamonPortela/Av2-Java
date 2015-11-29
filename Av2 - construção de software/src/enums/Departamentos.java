package enums;

public enum Departamentos {
	TI(2500000), OPERACOES(50000000), JURIDICO(5000000), RH(2000000), CEO(0);

	private double orcamento;

	private void setOrcamento(double _orcamento){
		this.orcamento = _orcamento;
	}

	public double getOrcamento(){
		return this.orcamento;
	}

	Departamentos(double _orcamento){
		setOrcamento(_orcamento);
	}
}
