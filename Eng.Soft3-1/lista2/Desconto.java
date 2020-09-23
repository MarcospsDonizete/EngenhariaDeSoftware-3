package lista2;

public abstract class Desconto {
	
	public double desconto;
	
	public Desconto(double desconto) {
		this.desconto = desconto;
	}

	public abstract double Calcular(Forma_Pagar pagar);
	
}
