package lista2;

public class Porcentagem extends Desconto {

	public Porcentagem(double desconto) {
		super(desconto);
	}

	@Override 
	  public double Calcular(Forma_Pagar pagar) { 
	    return (desconto/100)*pagar.produto.preco*pagar.quantidade; 
	  } 
}