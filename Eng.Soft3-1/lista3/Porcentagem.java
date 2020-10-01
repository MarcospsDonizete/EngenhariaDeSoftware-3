package lista3;

public class Porcentagem extends Desconto {

	public Porcentagem(double desconto) {
		super(desconto);
	}

	@Override 
	  public double Calcular(Produto produto) { 
	    return (desconto/100)*produto.preco; 
	  } 
}