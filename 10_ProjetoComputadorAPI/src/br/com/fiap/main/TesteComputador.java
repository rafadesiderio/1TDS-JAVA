package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Computador;
import br.com.fiap.beans.Monitor;

public class TesteComputador {
	
	public static void main(String[] args) {

		// Instanciar Objetos
		// Através das Classes Instanciamos os Objetos
		Computador objComputador = new Computador();
		Monitor objMonitor = new Monitor();

		// ENTRADAS DE VALOR

		// Exemplo através do objeto da Classe usando o Método Set

		// Computador

		objComputador.setFornecedor(JOptionPane.showInputDialog("Digite o fornecedor do computador"));
		objComputador.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do computador")));

		objComputador.setMonitor(objMonitor);

		// Monitor

		objMonitor.setMarca(JOptionPane.showInputDialog("Digite a marca do monitor"));
		objMonitor.setTamanho(Integer.parseInt(JOptionPane.showInputDialog("Digite a polegada do monitor")));
		objMonitor.setTipo(JOptionPane.showInputDialog("Digite o Tipo do monitor "));

		// SAÍDAS (EXIBIR)

		/*
		 * Dentro do parâmetro System.out.Println() Exibir o resultado através do objeto
		 * da Classe usando o Método Get
		 */

		// Computador
		System.out.println("SAÍDA COMPUTADOR");
		System.out.println("Valor do Computador: \n" + objComputador.getValor());
		System.out.println("Fornecedor: \n" + objComputador.getFornecedor());

		/*
		 * Exemplos de saída do atributo de referência da Classe "Monitor" com o
		 * objetoComputador
		 */
		System.out.println("\nSAÍDA MONITOR");
		System.out.println("Marca do Monitor: \n" + objComputador.getMonitor().getMarca());
		System.out.println("Tamanho (Polegada) do Monitor: \n" + objComputador.getMonitor().getTamanho());
		System.out.println("Tipo do Monitor: \n" + objComputador.getMonitor().getTipo());

		// Exemplo de saída usando o objetoMonitor direto
		// Monitor
		System.out.println("\nSAÍDA USANDO OBJETO MONITOR DIRETO");
		System.out.println(objMonitor.getMarca());
		System.out.println(objMonitor.getTamanho());
		System.out.println(objMonitor.getTipo());

		// Exemplo de saída usando apenas um System.out.Println();

		/*
		 * System.out.println("Valor do Computador: " + objComputador.getValor()+ "\n" +
		 * "Fornecedor: " + objComputador.getFornecedor() + "\n" + "Marca do Monitor: "
		 * + objComputador.getMonitor().getMarca() + "\n" +
		 * "Tamanho (Polegada) do Monitor: " + objComputador.getMonitor().getTamanho() +
		 * "\n" + "Tipo do Monitor: " + objComputador.getMonitor().getTipo());
		 */

	}

}
