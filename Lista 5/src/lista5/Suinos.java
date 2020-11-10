package lista5;

public class Suinos extends Animal {

	public Suinos() {
		super();
	}
	
	public Suinos(String nome, String peso, String check, String nasc, String raca, String id, String sexo, String vacinas, String dataVacs) {
		this.nome = nome;
		this.peso = new Peso(Double.parseDouble(peso), Integer.parseInt(check));
		this.dataDeNascimento = nasc;
		this.raca = raca;
		this.id = id;
		this.genero = sexo;
		this.cartao = new CartaoVacinas(vacinas, dataVacs, this);
	}
}
