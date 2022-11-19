package br.com.fiap.main;

import java.util.Scanner;
import br.com.fiap.beans.Computador;
import br.com.fiap.beans.Monitor;

public class TesteMainComputador {

	public static void main(String[] args) {

		// Instanciar Objetos
		// Através das Classes Instanciamos os Objetos
		Scanner objEntrada = new Scanner(System.in);
		Computador objComputador = new Computador();
		Monitor objMonitor = new Monitor();

		// Entradas de valor com Scanner

		// Exemplo através do objeto da Classe usando o Método Set

		// Computador

		System.out.println("Digite o valor do computador");
		objComputador.setValor(objEntrada.nextDouble());
		System.out.println("Informe o fornecedor");
		objComputador.setFornecedor(objEntrada.next());

		objComputador.setMonitor(objMonitor);

		// Monitor
		System.out.println("Qual a marca do monitor ?");
		objMonitor.setMarca(objEntrada.next());
		System.out.println("Informe a Polegada");
		objMonitor.setTamanho(objEntrada.nextInt());
		System.out.println("Digite o tipo de monitor");
		objMonitor.setTipo(objEntrada.next());

		objEntrada.close();

		// SAÍDAS (EXIBIR)

		/*
		 * Dentro do parâmetro System.out.Println() Exibir o resultado através do objeto
		 * da Classe usando o Método Get
		 */

		// Computador
		System.out.println("\nSAÍDA COMPUTADOR");
		System.out.println("Valor do Computador: \n" + objComputador.getValor());
		System.out.println("Fornecedor: \n" + objComputador.getFornecedor());

		/*
		 * Exemplos de saída do atributo de referência da Classe "Monitor" com o
		 * objetoComputador
		 */
		System.out.println("\nSAÍDA MONITOR");
		System.out.println("Marca do Monitor: " + objComputador.getMonitor().getMarca());
		System.out.println("Tamanho (Polegada) do Monitor: " + objComputador.getMonitor().getTamanho());
		System.out.println("Tipo do Monitor: " + objComputador.getMonitor().getTipo());

		// Exemplo de saída usando o objetoMonitor direto
		// Monitor
		System.out.println("\nSAÍDA USANDO OBJETO MONITOR DIRETO");
		System.out.println("Marca do monitor: " + objMonitor.getMarca());
		System.out.println("Polegadas: " + objMonitor.getTamanho());
		System.out.println("Tipo de monitor: " + objMonitor.getTipo());

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
