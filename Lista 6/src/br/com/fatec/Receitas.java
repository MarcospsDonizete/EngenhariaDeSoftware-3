package br.com.fatec;

import java.util.HashMap;
import java.util.Map;

public class Receitas extends Comida{
	public Map<Alimento, String> ingredientes = new HashMap<Alimento, String>();
	public String modoPreparo;
	public String tempoPreparo;
	
	public Receitas(String nome, Map<Alimento, String> ingredientes, String modoPreparo, String tempoPreparo) {
		this.nome = nome;
		this.ingredientes = ingredientes;
		this.modoPreparo = modoPreparo;
		this.tempoPreparo = tempoPreparo;
	}
	
	@Override
	public void print() {
		System.out.println(nome);
	}
}
