package lista4;

import com.thoughtworks.xstream.*;
import java.io.*;

public class Xml{
	String caminho;

	public Xml(String caminho) {
		this.caminho = caminho;
	}

	public Remessa[] lerArquivo() throws FileNotFoundException {
		Reader leitor = new FileReader(this.caminho);
		XStream xstream = new XStream();

		xstream.alias("list", Remessa[].class);
		xstream.alias("br.com.pageseguro.RemessaCartaoCredito", Credito.class);
		xstream.alias("br.com.pageseguro.RemessaBoleto", Boleto.class);
		xstream.alias("br.com.pageseguro.RemessaCartaoDebito", Debito.class);
		
		Remessa[] cliente = (Remessa[])xstream.fromXML(leitor);
		
		return cliente;	
	}
}