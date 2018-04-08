package Exercicio_em_Sala;

public class CalculadoraDeSal�rio {
	private double incentivo;

	public CalculadoraDeSal�rio(double incentivo) {
		super();
		this.incentivo = incentivo;
	}	
	
	public CalculadoraDeSal�rio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double calcula(Funcionario func) {
		return func.calculaSalario() + incentivo;
	}
}
