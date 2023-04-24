package br.com.fiap.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TesteArquivoBuffer {

	public static void main(String[] args) {

		// caminho do arquivo 
		String caminho = "caminho do arquivo";

		FileReader lerArquivo = null;
		BufferedReader carregarLeitura = null;
		
		
		try {
			lerArquivo = new FileReader(caminho);
			carregarLeitura = new BufferedReader(lerArquivo);

			String lerLinha = carregarLeitura.readLine();

			while (lerLinha != null) {
				System.out.println(lerLinha);
				lerLinha = carregarLeitura.readLine();
			}

			if (lerArquivo != null) {
				lerArquivo.close();
			}

			if (carregarLeitura != null) {
				carregarLeitura.close();
			}

		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo" + e.getMessage());
		} finally {

		}

	}

}
