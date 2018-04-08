
public class CalculadoraDePrecos {
	
	public double calcula(Compra produto) {
		
		TabelaPrecos_Correios tabela = new TabelaPrecos_Correios();
		Frete_Correios correios = new Frete_Correios();
		
		double desconto = tabela.descontoPara(produto.getValor());
		double frete = correios.para(produto.getCidade());
	
		return produto.getValor() * (1 - desconto) + frete;
	}
}


