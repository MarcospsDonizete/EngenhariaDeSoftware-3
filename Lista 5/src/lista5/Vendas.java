package lista5;

import java.util.ArrayList;
import java.util.List;

public class Vendas {
	List<Animal> animais = new ArrayList<Animal>();
	double preco;
	
	public Vendas(List<Animal> animais, double preco) {
		this.animais = animais;
		this.preco = preco;
	}
	
	public Vendas(Animal animal, double preco) {
		this.animais.add(animal);
		this.preco = preco;
	}
	
    public String toString() {
    	String result = "Animais:\n";
        for(Animal animal:animais) {
        	result+=animal.nome+ " - " +animal.id +"\n";
        }
        result+="\nPreço: " + preco + "\n"; 
        return result;
    }
}
