package lista1;

public class Hora extends CalculoTempo{
	
	public Hora(double tempoTotal) {
		super(tempoTotal);
	}

	@Override
	public double formaCalcular(TipoVeiculo veiculo) {
		return tempoTotal * veiculo.getValorHora()*veiculo.getMultiplicador() + veiculo.getModificador();
	}
}