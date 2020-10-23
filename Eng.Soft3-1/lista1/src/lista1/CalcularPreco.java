package lista1;

public class CalcularPreco {
	public CalculoTempo tipo; 
	public TipoVeiculo veiculo;

	public double preco() {
		return tipo.formaCalcular(veiculo); 
	}
	
	public CalcularPreco (int tempo, TipoVeiculo veiculo) {
		
		if (tempo <= 12) {
			this.tipo = new Hora(tempo);
		} else if (tempo <= 360) {
			this.tipo = new Diaria(tempo);
		} else {
			this.tipo = new Mensal(tempo);
		}
		
		this.veiculo= veiculo;
	}
}
