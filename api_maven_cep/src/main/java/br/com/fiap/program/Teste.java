package br.com.fiap.program;

import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.http.client.ClientProtocolException;
import br.com.fiap.model.Endereco;
import br.com.fiap.service.ViaCepService;

public class Teste {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		ViaCepService viaCepService = new ViaCepService();

		try {
		String cep = JOptionPane.showInputDialog("Informe o CEP");		

			Endereco endereco = viaCepService.getEndereco(cep);

			String ddd = endereco.getDdd();
			String uf = endereco.getUf();

			System.out.println(endereco + "\n");
			System.out.println(ddd + "\n");
			System.out.println(uf + "\n");

			} finally {
		}
	}
}

