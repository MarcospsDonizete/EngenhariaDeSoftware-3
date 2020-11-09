package lista5;

import java.util.ArrayList;
import java.util.List;

public class RelatorioAnimais {
	private static List<Animal> todosAnimais = new ArrayList<Animal>();
	
	public RelatorioAnimais() {};
	
	public static List<Animal> getLista() {
		if(todosAnimais==null) {
			RelatorioAnimais.todosAnimais = new ArrayList<Animal>();
		}
		return todosAnimais;
	}
	
	public void addAnimal(Animal animal) {
		todosAnimais.add(animal);
	}

	public void printList() {
		for(Animal a :todosAnimais) {
			System.out.println(a.toString());
		}
	}
	
	public void pesoRebanho(String tipo) {
		double pesototalkg=0;

		for(Animal animal : todosAnimais) {
			pesototalkg+=animal.peso.peso;
		}
		System.out.println("Peso em Quilos: " + pesototalkg + "\n" + "Peso em Arroba: " + pesototalkg*29.376);
	}
	
	public void populacao() {
		double macho=0;
		double femea=0;
		double aux;
		for(Animal animal : todosAnimais) {
			if(animal.genero.equalsIgnoreCase("Macho")){
				macho++;
			}else {
				femea++;
			}
		}
		
		aux = (macho + femea)/100;
		System.out.println("O rebanho tem: " + Math.round(femea/aux) + "% de femêas");
		
	}
	
	public void vacinacao() {
		List<Animal> vacinados = new ArrayList<Animal>();
		List<Animal> Nvacinados = new ArrayList<Animal>();
		boolean flag=true;
		for(Animal animal : todosAnimais) {
			for(Vacinas vacina: animal.cartao.todasVacinas) {
				if(vacina.aplicado==false) {
					Nvacinados.add(animal);
					flag=false;
					break;
				}
				if (flag==true) {
					vacinados.add(animal);
				}
			}
		}
		System.out.println("--------Vacinados--------");
		for(Animal animal:vacinados) {
			System.out.println(animal.id);
		}
		System.out.println("--------Não Vacinados--------");
		for(Animal animal:Nvacinados) {
			System.out.println(animal.id);
		}			
	}
	
	public void venda() {
		
	}
	
	public void precoDoRebanho() {
		
	}
	
}

