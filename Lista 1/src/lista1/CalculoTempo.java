package lista1;

public abstract class CalculoTempo{
		
	public double tempoTotal;

	public CalculoTempo(double tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	public abstract double formaCalcular(TipoVeiculo veiculo); 
}
