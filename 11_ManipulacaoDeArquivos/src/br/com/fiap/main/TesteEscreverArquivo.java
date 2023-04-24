package br.com.fiap.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscreverArquivo {

	public static void main(String[] args) {

		String[] linhas = new String[] { "Turma", "Java", "Top" };

		// caminho do arquivo
		String caminho = "caminho do arquivo";

		// Carrega e escreve no caminho onde esta o arquivo
		try {
			try (BufferedWriter carregarEscrita = new BufferedWriter(new FileWriter(caminho))) {
				for (String linha : linhas) {

					// Escreve a linha no arquivo
					carregarEscrita.write(linha);

					// Pula uma linha no arquivo
					carregarEscrita.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
