package lista4;

public class Boleto extends Remessa{
	Boleto(Remessa rem) {
		this.nome = rem.nome;
		CPF = rem.CPF;
		this.bancoRecebimento = rem.bancoRecebimento;
		this.bancoPagamento = rem.bancoPagamento;
		this.data = rem.data;
		this.numeroBoleto = rem.numeroBoleto;
		this.valor = rem.valor;
	}
}
