package br.com.fiap.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TesteArquivoBufferTryCatch {

	public static void main(String[] args) {

		// caminho do arquivo
		String caminho = "caminho do arquivo";

		try (BufferedReader carregarLeitura = new BufferedReader(new FileReader(caminho))) {

			String lerLinha = carregarLeitura.readLine();
			while (lerLinha != null) {
				System.out.println(lerLinha);
				lerLinha = carregarLeitura.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
