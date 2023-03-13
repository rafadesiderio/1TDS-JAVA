package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteArrayListProduto {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double valorTotal (List<Produto> listaProduto, Produto produto) {
		double total = 0;
		
		for(Produto p : listaProduto) {
			total += p.getValor() * p.getQuantidade();
		}
		
		return total;
	}

	public static void main(String[] args) {

		List<Produto> listaProduto = new ArrayList<Produto>();

		Produto objProduto = null;
		
		int continuar =0;
		
		while (continuar ==0) {
			
			objProduto = new Produto();
			objProduto.setDescricao(texto("Digite a descrição do Produto"));
			objProduto.setMarca(texto("Informe a marca"));
			objProduto.setQuantidade(inteiro("Informe a quantidade"));
			objProduto.setValor(decimal("Digite o valor"));
			listaProduto.add(objProduto);
			
			continuar = JOptionPane.showConfirmDialog(null, "Adicionar mais item no carrinho?",
					"Carrinho de Compras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		
		for (Produto produto : listaProduto) {
			System.out.println("Descrição: " + produto.getDescricao() + "\n" + 
					"Marca: " + produto.getMarca() + "\n" + 
					"Quantidade: " + produto.getQuantidade() + "\n" + 
					"Valor: " + produto.getValor());
		}
		
		System.out.println("Valor Total: " + valorTotal(listaProduto, objProduto));

	}

}
