package lista3;

public abstract class Desconto {
	public double desconto;
	
	public Desconto(double desconto) {
		this.desconto = desconto;
	}

	public abstract double Calcular(Produto produto);
	
}
