package br.com.fatec;

public class Main {

	public static void main(String[] args) {
		
		Alimento queijo = new Alimento("derivados","Grupo 1 ");
		
		GrupoAlimentos grupo = new GrupoAlimentos();
		
		//grupo.Adiciona(queijo);
		
		Calculos calculo = new Calculos();
		calculo.Imc(67.9, 1.87);
		
		queijo.tabela.add("Vitamina B", "700");
		
		queijo.tabela.printAll();
	}

}
