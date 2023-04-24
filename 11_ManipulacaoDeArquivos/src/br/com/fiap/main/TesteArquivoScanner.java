package br.com.fiap.main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteArquivoScanner {

	public static void main(String[] args) {
		
		// caminho do arquivo no parâmetro
		File arquivo = new File("caminho do arquivo");

		Scanner leitor = null;

		try {
			leitor = new Scanner(arquivo);
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo -" + e.getMessage());
		} finally {
			if (leitor != null) {
				leitor.close();
			}
		}

	}

}
