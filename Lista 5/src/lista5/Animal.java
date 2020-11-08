package lista5;

public abstract class  Animal {
	public Peso peso;
	public String dataDeNascimento;
	public String raca;
	public String id;
	public String genero;
	public CartaoVacinas cartao;
	
	public Animal(Peso peso, String dataDeNascimento,String raca, String id,String genero) {
		super();
		this.dataDeNascimento = dataDeNascimento;
		this.id = id;
		this.genero = genero;
		this.peso= peso;
		this.cartao=new CartaoVacinas (this);
	}	
}
