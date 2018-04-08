package Exercicio_em_Sala;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	public static void main(String[] args) {
		CalculadoraDeSalário calculadora = new CalculadoraDeSalário();
		
		Funcionario roberto = new Gerente("Roberto", "Gerente", 10000);
		Funcionario robson = new Vendedor("Robson", "Vendedor", 5000, 500, 100);
		Funcionario keilane = new Assistente("Keilane", "Assistente", 3000);
		Funcionario gabriel = new Supervisor("Gabriel", "Supervisor", 7500);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(roberto);
		funcionarios.add(robson);
		funcionarios.add(keilane);
		funcionarios.add(gabriel);
		
		for (Funcionario funcionario : funcionarios) {
			
			System.out.printf("%s: %s - Salário: R$%.2f\n", funcionario.getCargo(), funcionario.getNome(),
								calculadora.calcula(funcionario));
		}
	}
}
