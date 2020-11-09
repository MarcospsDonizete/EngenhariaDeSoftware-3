package lista5;

public class Vacinas {
	public String nome;
	public boolean aplicado;
	public String agendamento;
	
	public Vacinas(String nome, boolean aplicado, String agendamento) {
		this.nome = nome;
		this.aplicado = aplicado;
		this.agendamento = agendamento;
	}
	
	 public String toString() {
	        return "Nome: " + this.nome + "|| Aplicado: " + this.aplicado + "|| Agendamento/data da aplicação: " + this.agendamento + "\n"; 
	   }
}
