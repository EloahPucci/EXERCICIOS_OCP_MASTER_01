public class Frete_Correios implements Frete_Padrao{

	@Override
	public double para(String cidade) {
		if ("SAO PAULO".equals(cidade.toUpperCase())) {
			return 15;
		}
		return 30;
	}	
}
