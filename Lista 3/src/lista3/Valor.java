package lista3;

public class Valor extends Desconto {
	
	public Valor(double desconto) {
		super(desconto);
		}

	@Override
	public double Calcular(Produto produto) {
		return desconto;
	}

}
