package lista3;

public class Forma_Pagar {
	public Produto produto;
	public Desconto desconto;

	public Forma_Pagar(Produto produto, Desconto desconto) {
		this.produto = produto;
		this.desconto = desconto;
	}
	
	public Forma_Pagar(Produto produto) {
		this.produto = produto;
		this.desconto = new Valor(0);
	}
	
	public double CalcularPreçoFinal() {
		return produto.preco-desconto.Calcular(this.produto);
	}
}
