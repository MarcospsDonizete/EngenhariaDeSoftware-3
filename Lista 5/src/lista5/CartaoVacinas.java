package lista5;

import java.util.ArrayList;
import java.util.List;

public class CartaoVacinas {
	List<Vacinas> todasVacinas= new ArrayList<Vacinas>();
	
	public CartaoVacinas(Animal animal) {
		if(animal instanceof Bovinos)
			bovino();
		else if(animal instanceof Suinos)
			suino();
	}

	public void bovino() {
		todasVacinas.add(new Vacinas("Febre Aftosa", false, ""));
		todasVacinas.add(new Vacinas("Brucelose", false, ""));
		todasVacinas.add(new Vacinas("Clostridioses", false, ""));
		todasVacinas.add(new Vacinas("Botulismo", false, ""));
		todasVacinas.add(new Vacinas("Lepstospirose", false, ""));
		todasVacinas.add(new Vacinas("Raiva Bovina", false, ""));
		todasVacinas.add(new Vacinas("IBR", false, ""));
		todasVacinas.add(new Vacinas("BVD", false, ""));
	}
	public void suino() {
		todasVacinas.add(new Vacinas("Pneumonia Micoplasma", false, ""));
		todasVacinas.add(new Vacinas("Rinite Atr�fica", false, ""));
		todasVacinas.add(new Vacinas("Parvovirose", false, ""));
		todasVacinas.add(new Vacinas("Pleuropneumonia", false, ""));
		todasVacinas.add(new Vacinas("Lepstospirose", false, ""));
		todasVacinas.add(new Vacinas("Colibacilose", false, ""));
		todasVacinas.add(new Vacinas("Aujeszky", false, ""));
		todasVacinas.add(new Vacinas("Peste Su�na Cl�ssica", false, ""));
		todasVacinas.add(new Vacinas("Erisipela", false, ""));
	}
	
	public String imprimeVacinas() {
		String vacinas = "";
		for(Vacinas vacina:todasVacinas) {
			vacinas+=(vacina.toString());
		}
		return vacinas;
	}
}

