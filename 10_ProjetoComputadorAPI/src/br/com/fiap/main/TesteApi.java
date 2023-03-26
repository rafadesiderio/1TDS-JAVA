package br.com.fiap.main;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Endereco;
import br.com.fiap.service.ViaCepService;

public class TesteApi {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		ViaCepService viaCepService = new ViaCepService();

		try {
			Endereco endereco = viaCepService.getEndereco("04347150");

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
