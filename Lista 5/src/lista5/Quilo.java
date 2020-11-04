package lista5;

public class Quilo extends Peso{

	public Quilo(double peso) {
		this.peso = peso;
	}
	
	@Override
	double convertePesoArroba() {
		return peso/30;
	}

	@Override
	double convertePesoQuilo() {
		return peso;
	}
}
