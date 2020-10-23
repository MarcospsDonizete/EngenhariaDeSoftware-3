package lista2;

public class Valor extends Desconto {
	
	public Valor(double desconto) {
		super(desconto);
		}

	@Override
	public double Calcular(Forma_Pagar pagar) {
		return desconto;
	}

}
