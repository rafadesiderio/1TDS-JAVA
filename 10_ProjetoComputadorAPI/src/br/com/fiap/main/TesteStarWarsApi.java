package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.models.Planeta;
import br.com.fiap.services.StarWarsService;

public class TesteStarWarsApi {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
StarWarsService swService = new StarWarsService();
		
		String pl = JOptionPane.showInputDialog("Informe o numero do Planeta a ser pesquisado");
		
		Planeta planeta = swService.getPlaneta(pl);
		
		System.out.println(planeta);
	}
}
