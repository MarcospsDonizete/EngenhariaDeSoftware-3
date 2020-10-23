package lista3;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutos extends Produto {
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public ListaProdutos(double preco,String descricoes,List<Produto> produto) {
		super(preco, descricoes);
		this.produtos.addAll(produto);
	}
	public ListaProdutos(String descricoes,List<Produto> produto) {
		super(0, descricoes);
		this.produtos.addAll(produto);
		double valorTotal=0;
		for (Produto produtos:produtos) {
			valorTotal = valorTotal + produtos.preco;
		}
		preco = valorTotal;
	}

}
