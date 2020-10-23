package lista4;

public class Remessa {
	String numeroCartao;
	String nomeTitular;
	String parcelas;
	String nome;
	String CPF;
	String bancoRecebimento;
	String bancoPagamento;
	String data;
	String numeroBoleto;
	String valor;

	public void Imprimir() {
		if(this.nome!=null) System.out.println("Nome: "+this.nome);
		if(this.numeroCartao != null) System.out.println("Número Cartao: "+this.numeroCartao);
		if(this.nomeTitular!=null) System.out.println("Nome Titular: "+this.nomeTitular);
		if(this.parcelas!=null) System.out.println("Parcelas: "+this.parcelas);
		if(this.CPF!=null) System.out.println("Cpf: "+this.CPF);
		if(this.bancoRecebimento!=null) System.out.println("Banco Recebimento: "+this.bancoRecebimento);
		if(this.bancoPagamento!=null) System.out.println("Banco Pagamento: "+this.bancoPagamento);
		if(this.data!=null) System.out.println("Data: "+this.data);
		if(this.numeroBoleto!=null) System.out.println("Número Boleto: "+this.numeroBoleto);
		if(this.valor!=null) System.out.println("Valor: "+this.valor);
		System.out.println("");
	}
}