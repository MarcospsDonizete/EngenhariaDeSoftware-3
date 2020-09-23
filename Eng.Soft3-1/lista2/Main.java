package lista2;

public class Main {

	public static void main(String[] args) {
		
	Produto Batata = new Produto(2.0);
	Desconto d = new Porcentagem(50);
	Desconto d2 = new Valor(1);

	
	Forma_Pagar pg = new Forma_Pagar(Batata,2,d2);
	Forma_Pagar pg2 = new Forma_Pagar(Batata,2,d);
	Forma_Pagar pg3 = new Forma_Pagar(Batata,2);
	
	System.out.println(pg2.CalcularPreçoFinal() + "\n" + pg.CalcularPreçoFinal()+ "\n" + pg3.CalcularPreçoFinal());
	
	}
}
