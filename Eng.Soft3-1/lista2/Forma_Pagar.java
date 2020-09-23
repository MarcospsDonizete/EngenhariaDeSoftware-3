package lista2;

public class Forma_Pagar {
	public Produto produto;
	public Desconto desconto;
	public double quantidade;

	public Forma_Pagar(Produto produto,double quantidade, Desconto desconto) {
		this.produto = produto;
		this.desconto = desconto;
		this.quantidade = quantidade;
	}
	
	public Forma_Pagar(Produto produto,double quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.desconto = new Valor(0);
	}
	
	public double CalcularPreçoFinal() {
		return produto.preco*quantidade-desconto.Calcular(this);
	}
}
