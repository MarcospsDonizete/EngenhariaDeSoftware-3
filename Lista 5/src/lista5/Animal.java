package lista5;

public abstract class  Animal {
	private Peso peso;
	private String dataDeNascimento;
	private String raca;
	private String id;
	private String genero;
	private CartaoVacinas cartao;
	
	
	
	public Animal() {
		this.cartao=new CartaoVacinas (this);
	}
	public static class Builder {
		public Peso peso;
		public String dataDeNascimento;
		public String raca;
		public String id;
		public String genero;
		public CartaoVacinas cartao;
		
	
	public Builder Peso (Peso peso) {
		 this.peso=peso;
		 return this;
	}
	
	public Builder dataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento=dataDeNascimento;
		return this;
	}
	public Builder raca(String raca) {
		this.raca=raca;
		return this;
	}
	public Builder id(String id) {
		this.id=id;
		return this;
	}
	public Builder genero(String genero) {
		this.genero=genero;
		return this;
	}
	
	}
private Animal(Builder builder) {
	this.peso = builder.peso;
	this.dataDeNascimento = builder.dataDeNascimento;
	this.raca = builder.raca;
	this.id = builder.id;
	this.genero = builder.genero;	
}

	public String toString() {
        return "ID: " + id +"\n"+
        		"Data de Nascimento: " + dataDeNascimento +"\n"+
        		"Genero: " + genero; 
   }
}




public static class Builder {

	// requerido
	private final int tamanho;

	// opcional
	private boolean queijo = false;
	private boolean tomate = false;
	private boolean bacon = false;

	public Builder(int tamanho) {
		this.tamanho = tamanho;
	}

	public Builder queijo() {
		queijo = true;
		return this;
	}

	public Builder tomate() {
		tomate = true;
		return this;
	}

	public Builder bacon() {
		bacon = true;
		return this;
	}

	public Pizza build() {
		return new Pizza(this);
	}

}

