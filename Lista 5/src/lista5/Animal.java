package lista5;

public abstract class  Animal {
	public CalcularPeso peso;
	public String dataDeNascimento;
	public String raca;
	public String id;
	public String genero;
	
	public Animal(double peso, String dataDeNascimento,String raca, String id,String genero) {
		super();
		this.dataDeNascimento = dataDeNascimento;
		this.id = id;
		this.genero = genero;
		this.peso= new CalcularPeso(peso);
	}
	
}
