package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Computador;
import br.com.fiap.beans.Monitor;

public class TesteMainComputador {

	public static void main(String[] args) {

		// Instanciar Objetos
		// Através das Classes Instanciamos os Objetos
		Computador objComputador = new Computador(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do computador")),
				JOptionPane.showInputDialog("Digite o fornecedor do computador"));
		
		Monitor objMonitor = new Monitor(JOptionPane.showInputDialog("Digitar marca do monitor"), 
				Integer.parseInt(JOptionPane.showInputDialog("Digite a polegada")), 
				JOptionPane.showInputDialog("Digite o tipo"));
	

		// SAÍDAS (EXIBIR)         
		
		// Computador
		System.out.println("INFORMAÇÕES DO COMPUTADOR");
		System.out.println("Valor do Computador: \n" + objComputador.getValor());
		System.out.println("Fornecedor: \n" + objComputador.getFornecedor());	

		
		// Monitor
		System.out.println("\nINFORMAÇÕES DO MONITOR");
		System.out.println("Marca do monitor: " + objMonitor.getMarca());
		System.out.println("Polegada: " + objMonitor.getTamanho());
		System.out.println("Tipo de monitor: " + objMonitor.getTipo());

		// Exemplo de Saída usando apenas um System.out.Println();

		/*
		 * System.out.println("Valor do Computador: " + objComputador.getValor()+ "\n" +
		 * "Fornecedor: " + objComputador.getFornecedor() + "\n" + "Marca do Monitor: "
		 * + objComputador.getMonitor().getMarca() + "\n" +
		 * "Tamanho (Polegada) do Monitor: " + objComputador.getMonitor().getTamanho() +
		 * "\n" + "Tipo do Monitor: " + objComputador.getMonitor().getTipo());
		 */

	}

}
