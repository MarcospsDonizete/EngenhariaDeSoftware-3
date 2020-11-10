package lista5;

import java.util.ArrayList;

public class Bovinos extends Animal{

	public Bovinos() {
		super();
	}
	
	public Bovinos(String nome, String peso, String check, String nasc, String raca, String id, String sexo, String vacinas, String dataVacs) {
		this.nome = nome;
		this.peso = new Peso(Double.parseDouble(peso), Integer.parseInt(check));
		this.dataDeNascimento = nasc;
		this.raca = raca;
		this.id = id;
		this.genero = sexo;
		this.cartao = new CartaoVacinas(vacinas, dataVacs, this);
	}
//bovino;jairo;20;10/02/1981;angus;11151618;F;[1,0,1,0,0,0,1,0];[X,X,X,X,20/11/2020,X,X,X];0;X;
}
