package lista5;

public class CalcularPeso {
	public double pesoAroba;
	public double pesoKg;
	
	public CalcularPeso(double peso) {
		this.pesoKg=peso;
		calcPeso(peso);
	}
	
	void calcPeso(double peso) {
		pesoAroba=peso*14.688;		
	}
	
}
