package lista1;

public class Diaria extends CalculoTempo {

	public Diaria(double tempoTotal) {
		super(Math.ceil(tempoTotal/24));
	}

	@Override
	public double formaCalcular(TipoVeiculo veiculo) {
		return tempoTotal * veiculo.getValorDia() *veiculo.getMultiplicador() + veiculo.getModificador();
	}

}
