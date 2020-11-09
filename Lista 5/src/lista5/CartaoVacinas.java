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

	public CartaoVacinas(String vacinas, String dataVacs, Animal animal) {
		String[] vacs = vacinas.replace("[", "").replace("]","").replace("1", "true").replace("0", "false").split(",");
		String[] datVacs = dataVacs.replace("[", "").replace("]","").split(",");
		if(animal instanceof Bovinos) {
			todasVacinas.add(new Vacinas("Febre Aftosa", Boolean.parseBoolean(vacs[0]), datVacs[0]));
			todasVacinas.add(new Vacinas("Brucelose", Boolean.parseBoolean(vacs[1]), datVacs[1]));
			todasVacinas.add(new Vacinas("Clostridioses", Boolean.parseBoolean(vacs[2]), datVacs[2]));
			todasVacinas.add(new Vacinas("Botulismo", Boolean.parseBoolean(vacs[3]), datVacs[3]));
			todasVacinas.add(new Vacinas("Lepstospirose", Boolean.parseBoolean(vacs[4]), datVacs[4]));
			todasVacinas.add(new Vacinas("Raiva Bovina", Boolean.parseBoolean(vacs[5]), datVacs[5]));
			todasVacinas.add(new Vacinas("IBR", Boolean.parseBoolean(vacs[6]), datVacs[6]));
			todasVacinas.add(new Vacinas("BVD", Boolean.parseBoolean(vacs[7]), datVacs[7]));
		}
		else if(animal instanceof Suinos) {
			todasVacinas.add(new Vacinas("Pneumonia Micoplasma", Boolean.parseBoolean(vacs[0]), datVacs[0]));
			todasVacinas.add(new Vacinas("Rinite Atrófica", Boolean.parseBoolean(vacs[1]), datVacs[1]));
			todasVacinas.add(new Vacinas("Parvovirose", Boolean.parseBoolean(vacs[2]), datVacs[2]));
			todasVacinas.add(new Vacinas("Pleuropneumonia", Boolean.parseBoolean(vacs[3]), datVacs[3]));
			todasVacinas.add(new Vacinas("Lepstospirose", Boolean.parseBoolean(vacs[4]), datVacs[4]));
			todasVacinas.add(new Vacinas("Colibacilose", Boolean.parseBoolean(vacs[5]), datVacs[5]));
			todasVacinas.add(new Vacinas("Aujeszky", Boolean.parseBoolean(vacs[6]), datVacs[6]));
			todasVacinas.add(new Vacinas("Peste Suína Clássica", Boolean.parseBoolean(vacs[7]), datVacs[7]));
			todasVacinas.add(new Vacinas("Erisipela", Boolean.parseBoolean(vacs[8]), datVacs[8]));
		}
	}
//[1,0,1,0,0,0,1,0];[X,X,X,X,20/11/2020,X,X,X]
	public void bovino() {
		todasVacinas.add(new Vacinas("Febre Aftosa", false, "X"));
		todasVacinas.add(new Vacinas("Brucelose", false, "X"));
		todasVacinas.add(new Vacinas("Clostridioses", false, "X"));
		todasVacinas.add(new Vacinas("Botulismo", false, "X"));
		todasVacinas.add(new Vacinas("Lepstospirose", false, "X"));
		todasVacinas.add(new Vacinas("Raiva Bovina", false, "X"));
		todasVacinas.add(new Vacinas("IBR", false, "X"));
		todasVacinas.add(new Vacinas("BVD", false, "X"));
	}
	public void suino() {
		todasVacinas.add(new Vacinas("Pneumonia Micoplasma", false, "X"));
		todasVacinas.add(new Vacinas("Rinite Atrófica", false, "X"));
		todasVacinas.add(new Vacinas("Parvovirose", false, "X"));
		todasVacinas.add(new Vacinas("Pleuropneumonia", false, "X"));
		todasVacinas.add(new Vacinas("Lepstospirose", false, "X"));
		todasVacinas.add(new Vacinas("Colibacilose", false, "X"));
		todasVacinas.add(new Vacinas("Aujeszky", false, "X"));
		todasVacinas.add(new Vacinas("Peste Suína Clássica", false, "X"));
		todasVacinas.add(new Vacinas("Erisipela", false, "X"));
	}
	
	public String imprimeVacinas() {
		String vacinas = "";
		for(Vacinas vacina:todasVacinas) {
			vacinas+=(vacina.toString());
		}
		return vacinas;
	}
}

