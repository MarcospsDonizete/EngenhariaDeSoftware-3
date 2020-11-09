package lista5;

public class Main {

	public static void main(String[] args) {
		
		Peso pesovaca= new Peso(1.0,1);
		
		Bovinos vaca = new Bovinos.Builder()
				.peso(pesovaca);
				.;
		Animal boi = new Bovinos();
		
		RelatorioAnimais coisa= new RelatorioAnimais();
		RelatorioAnimais.getLista().add(vaca);
		RelatorioAnimais.getLista().add(boi);
		coisa.populacao();
	}
	
}
