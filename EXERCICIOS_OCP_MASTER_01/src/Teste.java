
public class Teste {
	
	public static void main(String[] args) {
		
	}
	public void testeMetodoCalcula() {
		Compra compra = new Compra(100.0, "SAO PAULO");
		System.out.println(new CalculadoraDePrecos().calcula(compra));
	}
}
