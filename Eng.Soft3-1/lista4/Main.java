package lista4;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException  {		
		Receber.addCaminho("C:\\Users\\sergi\\Desktop\\Fatec\\Eng de Soft.- 3\\arquivos\\arquivos IV\\remessa.json");
		Receber.addCaminho("C:\\Users\\sergi\\Desktop\\Fatec\\Eng de Soft.- 3\\arquivos\\arquivos IV\\remessa.xml");
		
		Receber.ImprimirCredito();
		Receber.ImprimirDebito();
		Receber.ImprimirBoleto();
		Receber.ImprimirNCPFs();
		
		
		
	}
}
