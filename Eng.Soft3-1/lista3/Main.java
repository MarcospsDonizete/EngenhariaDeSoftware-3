package lista3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
	Produto Batata = new Unidade(2.0,"\"� uma batata");
	Produto Carro = new Unidade(10,"� um carro");
	Desconto d = new Porcentagem(50);
	Desconto d2 = new Valor(1);

	
	Forma_Pagar pg = new Forma_Pagar(Batata,d2);
	Forma_Pagar pg2 = new Forma_Pagar(Batata,d);
	Forma_Pagar pg3 = new Forma_Pagar(Batata);
	
	List<Produto> produtos = new ArrayList<Produto>();
	produtos.add(Batata);
	produtos.add(Carro);
	
	ListaProdutos carrata = new ListaProdutos(10,"carro e batata",produtos);
	
	//Forma_Pagar pg4 = new Forma_Pagar(carrata,d);
	Forma_Pagar pg5 = new Forma_Pagar(carrata);
	
	System.out.println(pg5.CalcularPre�oFinal());
	
	//System.out.println(pg2.CalcularPre�oFinal() + "\n" + pg.CalcularPre�oFinal()+ "\n" + pg3.CalcularPre�oFinal());
	
	}
}
