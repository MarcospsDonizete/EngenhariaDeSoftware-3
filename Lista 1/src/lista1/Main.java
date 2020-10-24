package lista1;

public class Main {
	public static void main(String[] args) {
		
		int tempo = 37;

		TipoVeiculo carro1 = new Passeio();
		CalcularPreco calc = new CalcularPreco(tempo,carro1);
				
		System.out.println("Valor de cobrança: " + calc.preco());
	}
}
