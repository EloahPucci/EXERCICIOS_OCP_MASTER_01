package Exercicio_em_Sala;

public class Supervisor extends Funcionario{	

	public Supervisor(String nome, String cargo, double salarioBase) {
		super(nome, cargo, salarioBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return getSalarioBase() * 1.5;
	}

}
