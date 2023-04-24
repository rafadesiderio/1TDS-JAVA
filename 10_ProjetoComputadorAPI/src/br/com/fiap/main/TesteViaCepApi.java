package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.models.Endereco;
import br.com.fiap.services.ViaCepService;

public class TesteViaCepApi {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		ViaCepService viaCepService = new ViaCepService();

		try {
			
			String cep = JOptionPane.showInputDialog("Informe o CEP a ser pesquisado");
			
			Endereco endereco = viaCepService.getEndereco(cep);

			String ddd = endereco.getDdd();
			String uf = endereco.getUf();

			System.out.println(endereco + "\n");
			System.out.println(ddd + "\n");
			System.out.println(uf + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}

	}

}
