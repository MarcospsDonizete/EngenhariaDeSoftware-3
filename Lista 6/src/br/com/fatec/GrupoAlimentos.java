package br.com.fatec;

import java.util.ArrayList;
import java.util.List;

public class GrupoAlimentos {
	private static List<Alimento> TodosAlimentos = new ArrayList<Alimento>();
	
	public GrupoAlimentos() {};
	
	public static List<Alimento> getLista() {
		return TodosAlimentos;
	}
	
	public void printList() {
		for(Alimento a :TodosAlimentos) {
			System.out.println(a.toString());
		}
	}
	
	
}
