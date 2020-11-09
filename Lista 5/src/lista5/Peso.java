package lista5;

public class Peso {
	double peso;
	
	public Peso(double peso,int check) {
		this.peso = peso;
		if(check==1) {
			this.peso = peso;
		}
		else if (check==2) {
			this.peso = peso/29.376;
		}
	}
	
	public String toString() {
        return "Peso em KG: " + peso + "\n" +
        		"Peso em Aroba: " + peso*29.376; 
   }
}
