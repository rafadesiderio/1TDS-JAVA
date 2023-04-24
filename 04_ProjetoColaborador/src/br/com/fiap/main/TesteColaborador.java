package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Colaborador;

public class TesteColaborador {

	public static void main(String[] args) {
	

	// Instanciar objetos 
		
		Colaborador objColaborador = new Colaborador (JOptionPane.showInputDialog("Digite o nome"), 
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor hora")), 
				JOptionPane.showInputDialog("Digite o Cargo"), 
				Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas")),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o Percentual IR")));
		
		System.out.println("Nome do colaborador: " + objColaborador.getNome() + 
						   "\nValor Hora: " + objColaborador.getValorHora() + 
						   "\nCargo: " + objColaborador.getCargo());
		
		
		System.out.println("\n Todas as Informaçoes \n" + objColaborador.getExibirTudo() );
		//System.out.println("Salário total: " + objColaborador.calcularTotalSalario(40));
		
		//System.out.println("Imposto de Renda: " + objColaborador.calcularIr(80, 12));
		
		System.out.println("Total Salário: " + objColaborador.salarioTotal() );		
		
		
		System.out.println("Informação: " + objColaborador.informacaoSalario());	
		
		System.out.println("Imposto de Renda: " + objColaborador.controleCalculoIr());

	}

}
