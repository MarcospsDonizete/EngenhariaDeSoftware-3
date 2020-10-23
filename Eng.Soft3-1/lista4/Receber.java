package lista4;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Receber {
	public static List<String> caminhos = new ArrayList<String>();
	static List<Json> jsons = new ArrayList<Json>();
	static List<Xml> xmls = new ArrayList<Xml>();
	static List<Remessa> nCPF = new ArrayList<Remessa>();
	
	private static Receber coisa;

	Receber() {
	}

	public static synchronized Receber addCaminho(String caminho) throws FileNotFoundException {
		if (coisa == null) {
			coisa = new Receber();
		}
		Receber.caminhos.add(caminho);
		
		if(caminho.substring(caminho.length()-1).equals("n")) {
			Json json = new Json(caminho);
			jsons.add(json);
		}
		if(caminho.substring(caminho.length()-1).equals("l")) {
			Xml xml = new Xml(caminho);
			xmls.add(xml);
		}
			
		return coisa;
	}

	public static void ImprimirCredito() throws FileNotFoundException {
		System.out.println("---------------------CRÉDITOS---------------------");
		for(Json elemento:jsons) {
			for(Remessa elemento2:elemento.lerArquivo()) {
				if(elemento2 instanceof Credito) {
					if(isCPF(elemento2.CPF)==true) {
						elemento2.Imprimir();
					}
					else {
						nCPF.add(elemento2);
					}
					
				}
			}
		}
		
		for(Xml elemento:xmls) {
			for(Remessa elemento2:elemento.lerArquivo()) {
				if(elemento2 instanceof Credito) {
					if(isCPF(elemento2.CPF)==true) {
						elemento2.Imprimir();
					}
					else {
						nCPF.add(elemento2);
					}
				}
			}
		}
		
		
	}
	
	public static void ImprimirDebito() throws FileNotFoundException {
		System.out.println("---------------------DÉBITOS---------------------");
		for(Json elemento:jsons) {
			for(Remessa elemento2:elemento.lerArquivo()) {
				if(elemento2 instanceof Debito) {
					if(isCPF(elemento2.CPF)==true) {
						elemento2.Imprimir();
					}
					else {
						nCPF.add(elemento2);
					}
				}
			}
		}
		
		for(Xml elemento:xmls) {
			for(Remessa elemento2:elemento.lerArquivo()) {
				if(elemento2 instanceof Debito) {
					if(isCPF(elemento2.CPF)==true) {
						elemento2.Imprimir();
					}
					else {
						nCPF.add(elemento2);
					}
				}
			}
		}
		
		
	}
	
	public static void ImprimirBoleto() throws FileNotFoundException {
		System.out.println("---------------------BOLETOS---------------------");
		for(Json elemento:jsons) {
			for(Remessa elemento2:elemento.lerArquivo()) {
				if(elemento2 instanceof Boleto) {
					if(isCPF(elemento2.CPF)==true) {
						elemento2.Imprimir();
					}
					else {
						nCPF.add(elemento2);
					}
				}
			}
		}
		
		for(Xml elemento:xmls) {
			for(Remessa elemento2:elemento.lerArquivo()) {
				if(elemento2 instanceof Boleto) {
					if(isCPF(elemento2.CPF)==true) {
						elemento2.Imprimir();
					}
					else {
						nCPF.add(elemento2);
					}
				}
			}
		}
		
		
	}
	
	public static void ImprimirNCPFs() {
		System.out.println("---------------------REJEITADOS---------------------");
		for(Remessa element:nCPF) {
			element.Imprimir();
		}
	}
	
	public static boolean isCPF(String CPF) {
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;
        try {
       
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); 

            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }

    public static String imprimeCPF(String CPF) {
    	return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
        }
	
    
}
