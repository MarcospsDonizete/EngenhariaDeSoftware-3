package lista5;

public class Main {

	public static void main(String[] args) {

		Animal vaca = new Bovinos(new Quilo(1), "a","a", "a","a");		
		
		System.out.println(vaca.peso.convertePesoQuilo());
	}
	
}
