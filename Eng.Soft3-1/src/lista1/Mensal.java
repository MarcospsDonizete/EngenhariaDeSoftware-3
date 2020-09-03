package lista1;

public class Mensal extends CalculoTempo {

	public Mensal(double tempoTotal) {
		super(Math.ceil(tempoTotal/720));
	}

	@Override
	public double formaCalcular(TipoVeiculo veiculo) {
		return tempoTotal * veiculo.getValorMes()*veiculo.getMultiplicador() + veiculo.getModificador();
		}
}