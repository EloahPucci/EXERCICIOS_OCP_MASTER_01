package Exercicio_em_Sala;

public class CalculadoraDeSalário {
	private double incentivo;

	public CalculadoraDeSalário(double incentivo) {
		super();
		this.incentivo = incentivo;
	}	
	
	public CalculadoraDeSalário() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double calcula(Funcionario func) {
		return func.calculaSalario() + incentivo;
	}
}
