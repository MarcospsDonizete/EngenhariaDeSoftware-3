package lista4;

public class Credito extends Remessa{
	Credito(Remessa rem) {
		this.numeroCartao = rem.numeroCartao;
		this.nomeTitular = rem.nomeTitular;
		this.parcelas = rem.parcelas;
		this.nome = rem.nome;
		CPF = rem.CPF;
		this.bancoRecebimento = rem.bancoRecebimento;
		this.bancoPagamento = rem.bancoPagamento;
		this.data = rem.data;
		this.valor = rem.valor;
	}
	
	
}
