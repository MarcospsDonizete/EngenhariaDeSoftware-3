package lista1;

public abstract class TipoVeiculo {
	public double valorHora = 0;
	public double valorDia = 0;
	public double valorMes = 0;
	public double modificador = 0;
	public double multiplicador = 1;
	
	public double getValorHora() {
		return valorHora;
	}
	public double getValorDia() {
		return valorDia;
	}
	public double getValorMes() {
		return valorMes;
	}
	public double getModificador() {
		return modificador;
	}
	public double getMultiplicador() {
		return multiplicador;
	}
}