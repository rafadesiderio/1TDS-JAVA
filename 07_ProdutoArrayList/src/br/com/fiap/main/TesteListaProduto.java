package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteListaProduto {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		Produto objProduto;
		
		do {
		// Entrada
		objProduto = new Produto();
		objProduto.setDescricao(texto("Digite a Descrição"));
		objProduto.setMarca(texto("Digite a marca"));
		objProduto.setValor(decimal("Digite o Valor"));
		objProduto.setQuantidade(inteiro("Digite a quantidade"));
		listaProdutos.add(objProduto);
		
		// Escolhemos entre ecerrar ou adicionar mais um produto no carrinho de compras
		} while (JOptionPane.showConfirmDialog(null, "Mais produto no carrinho?", "Carrinho de Compras",
		JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		// Saída
		// O foreach percorre todos os elementos do Produto para serem exibidos 
		for (Produto p : listaProdutos) {
			System.out.println("Descrição: " + p.getDescricao() + "\n" + 
					"Marca: " + p.getMarca() + "\n" + 
					"Valor: " + p.getValor() + "\n" + 
					"Quantidade: " + p.getQuantidade());
		}

	}

}
