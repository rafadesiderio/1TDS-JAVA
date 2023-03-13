package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TesteMain {

	static String texto (String texto) {
		
		return JOptionPane.showInputDialog(texto);
	}
	
	static double decimal (String decimal) {
		 return Double.parseDouble(JOptionPane.showInputDialog(decimal));
	}	
	
	
	public static void main(String[] args) {
		
		// Instanciar Objeto 
		PessoaFisica objPf = new PessoaFisica(texto("Informe seu nome"),
				texto("Informe o email"),
				decimal("Informe a renda"),
				texto("RG"),
				texto("CPF"));
		
		PessoaJuridica objPj = new PessoaJuridica(texto("Nome do dono da empresa"), 
				texto("Digite o email da empresa"),
				decimal("Renda da empresa"),
				texto("Informe a Razão Social "),
				texto("Informe o CNPJ"));
		
		
		
		// Saídas 
		System.out.println("INFORMAÇÕES PF");
		System.out.println("Nome: " + objPf.getNome() + 
				"\nEmail: " + objPf.getEmail() + 
				"\nRenda: " + objPf.getRenda() + 
				"\nRG: " + objPf.getRg() + 
				"\nCPF: " + objPf.getCpf());
		System.out.println("Valor da Taxa PF: " + objPf.pagarTaxa());
		System.out.println("Identificação: " + objPf.identificador());
		
		
		System.out.println("\nINFORMAÇÕES PJ");
		System.out.println("Nome do dono da empresa: " + objPj.getNome() + 
				"\nEmail da empresa: " + objPj.getEmail() + 
				"\nRenda da empresa: " + objPj.getRenda() + 
				"\nRazão Social: " + objPj.getRazaoSocial() + 
				"\nCNPJ: " + objPj.getCnpj());
		System.out.println("Valor da Taxa PJ: " + objPj.pagarTaxa());
		System.out.println("Identificação: " + objPf.identificador());
		
	}

}
