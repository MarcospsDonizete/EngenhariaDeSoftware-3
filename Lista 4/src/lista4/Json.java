package lista4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;



public class Json{
	String caminho;

	public Json(String caminho) {
		this.caminho = caminho;
	}
		
	private List<Remessa> Separar(Remessa[] rem) {
		List<Remessa> list = new ArrayList<Remessa>();
		for (Remessa elem:rem) {
			if(elem.parcelas!=null) {
				list.add(new Credito(elem));
			}
			else if(elem.numeroBoleto!=null) {
				list.add(new Boleto(elem));
			}
			else {
				list.add(new Debito(elem));
			}
		}
		
		return list;
		
	}

	public Remessa[] lerArquivo() throws FileNotFoundException {
		Reader leitor = new FileReader(this.caminho);
		
		Gson gson = new Gson();
		Remessa[] objCliente = gson.fromJson(leitor, Remessa[].class);
		List<Remessa> lista= Separar(objCliente);
		Remessa[] listaOrganizada = lista.toArray(new Remessa[0]);
		
		return listaOrganizada;
	}


}

