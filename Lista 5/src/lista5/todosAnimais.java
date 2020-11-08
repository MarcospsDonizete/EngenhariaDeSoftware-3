package lista5;

import java.util.ArrayList;
import java.util.List;

public class todosAnimais {
	List<Animal> todosAnimais = new ArrayList<Animal>();
	
	
	public void pesoRebanho(String tipo) {
		double pesototalkg=0;
		double pesototalarob=0;
		for(Animal animal : todosAnimais) {
			pesototalkg+=animal.peso.convertePesoQuilo();
			pesototalarob+=animal.peso.convertePesoArroba();
		}
		System.out.println("Peso em Quilos: " + pesototalkg + "\n" + "Peso em Arroba: " + pesototalarob);
	}
	
	public void populacao() {
		double macho=0;
		double femea=0;
		for(Animal animal : todosAnimais) {
			if(animal.genero.equalsIgnoreCase("Fêmea")){
				femea++;
			}else {
				macho++;
			}
		}
		
		
	}
	
	public void vacinacao() {
		List<Animal> vacinados = new ArrayList<Animal>();
		List<Animal> Nvacinados = new ArrayList<Animal>();
		for(Animal animal : todosAnimais) {
			
		}
		
		
	}
	
	
}

