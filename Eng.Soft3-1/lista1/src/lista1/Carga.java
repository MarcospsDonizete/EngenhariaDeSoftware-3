package lista1;

public class Carga extends TipoVeiculo {
	
	public Carga(double eixos, double valorCarga) {
		this.valorHora = 4;
		this.valorDia = 49;
		this.valorMes = 600;
		this.modificador = valorCarga*0.03;
		this.multiplicador = 1+(eixos/10);
	}

}
