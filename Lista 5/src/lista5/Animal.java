package lista5;

public abstract class  Animal {
	public double peso;
	public String raca;
	public String dataDeNascimento;
	public String id;
	
	public Animal(double peso, String raca, String dataDeNascimento, String id) {
		super();
		this.peso = peso;
		this.raca = raca;
		this.dataDeNascimento = dataDeNascimento;
		this.id = id;
	}
	
	public double CalculoPeso() {
		return peso;
	}
}
