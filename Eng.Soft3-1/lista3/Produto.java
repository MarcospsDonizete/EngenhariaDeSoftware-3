package lista3;

public abstract class Produto {
	protected double preco;
	protected String descricoes;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricoes() {
		return descricoes;
	}

	public void setDescricoes(String descricoes) {
		this.descricoes = descricoes;
	}

	public Produto( double preco, String descricoes) {
		this.preco = preco;
	}

}
