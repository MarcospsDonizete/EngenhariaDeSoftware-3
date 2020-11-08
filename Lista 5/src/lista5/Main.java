package lista5;

public class Main {

	public static void main(String[] args) {

		Animal vaca = new Bovinos(new Quilo(1), "a","a", "a","a");		
		CartaoVacinas vacinasvaca= new CartaoVacinas(vaca);
		
		System.out.println(vaca.peso.convertePesoArroba());
		vacinasvaca.imprimeVacinas();
		
		vacinasvaca.todasVacinas.get(0).aplicado=true;
	}
	
}
