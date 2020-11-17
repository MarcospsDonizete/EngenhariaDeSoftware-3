package br.com.fatec;

public class Alimento {
	public String tipo;
	public String grupo;
	public Tabela tabela = new Tabela();
	
	public Alimento(String tipo, String grupo) {
		this.tipo = tipo;
		this.grupo = grupo;
	}
	
	public Alimento(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
        return this.tipo + this.grupo + "\n"; 
    }
}
