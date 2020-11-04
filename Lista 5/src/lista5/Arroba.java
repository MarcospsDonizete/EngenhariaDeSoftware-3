package lista5;

public class Arroba extends Peso{

	public Arroba(double peso) {
		this.peso = peso;
	}
	
	@Override
	double convertePesoQuilo() {
		return peso*30;
	}

	@Override
	double convertePesoArroba() {
		return peso;
	}

}
