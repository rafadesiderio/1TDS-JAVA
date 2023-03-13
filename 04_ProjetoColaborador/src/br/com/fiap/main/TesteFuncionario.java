package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Colaborador;

public class TesteFuncionario {

	public static void main(String[] args) {
	

		// Instanciar objetos
		Colaborador objColaborador = new Colaborador(JOptionPane.showInputDialog("Informe o nome do colaborador"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor hora")),
				JOptionPane.showInputDialog("Digite o cargo"));

		// Entrada de dados através do Método Set
		
		//objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome"));
		/*
		 * objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome"));
		 * objColaborador.setValorHora(Double.parseDouble(JOptionPane.
		 * showInputDialog("Digite o valor hora: ")));
		 * objColaborador.setCargo(JOptionPane.showInputDialog("Digite o cargo"));
		 */

		// Saída de dados

		/*
		 * System.out.println("Nome: " + objColaborador.getNome());
		 * System.out.println("Valor Hora: " + objColaborador.getValorHora());
		 * System.out.println("Cargo: " + objColaborador.getCargo());
		 */
		System.out.println("Nome: " + objColaborador.getNome() + "\nValor Hora: " + objColaborador.getValorHora()
				+ "\nCargo: " + objColaborador.getCargo());

		System.out.println("\nMÉTODO PARA EXIBIR TODAS AS SÁIDAS");
		System.out.println(objColaborador.getExibirTudo());

		System.out.println("\nSAÍDAS MÉTODOS WORKERS");
		System.out.println("Total Salário: " + objColaborador.calcularTotalSalario(40));

		System.out.println("Imposto de renda: " + objColaborador.calcularIr(80, 12));

	}

}
