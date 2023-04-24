package br.com.fiap.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TesteApagarArquivo {

	public static void main(String[] args) {
		
		// caminho do arquivo no parâmetro
File arquivo = new File("caminho do arquivo");
		
		try {
		
			FileReader leitorArquivo = new FileReader(arquivo);
			BufferedReader carregarLeitura = new BufferedReader(leitorArquivo);
			
			
			
			String linha = carregarLeitura.readLine();
			
			ArrayList<String> salvar = new ArrayList<String>();
			
			while (linha != null) {
				if(linha.equals("me deixa aqui")) {
					salvar.add(linha);
				}
				linha = carregarLeitura.readLine();
			}
			leitorArquivo.close();
			carregarLeitura.close();
			
			FileWriter escreverArquivo = new FileWriter(arquivo, true);
			escreverArquivo.close();
			
			FileWriter novaEscrita = new FileWriter(arquivo);
			BufferedWriter novoCarregaEscrita = new BufferedWriter(novaEscrita);
			
			for(int contador =0 ; contador< salvar.size(); contador ++) {
				
				novoCarregaEscrita.write(salvar.get(contador));
				
				novoCarregaEscrita.newLine();
			}
			novoCarregaEscrita.close();
			
		} catch (IOException e) {
			
		}
	}
}
