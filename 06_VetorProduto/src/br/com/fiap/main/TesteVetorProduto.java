package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetorProduto {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	static double valorTotal(Produto[] p, int i) {
		double total = 0;
		for (int c = 0; c < i; c++) {
			total += p[c].getValor() * p[c].getQuantidade();
		}
		return total;
	}

	public static void main(String[] args) {

		Produto[] objVetorProduto = new Produto[2];

		int indice = 0;

		do {

			// Entrada ao Instanciar Produto
			/*objVetorProduto[indice] = new Produto(texto("Digite a marca"), inteiro("Digite a quantidade"),
					decimal("Digite o valor"));
			*/		
			
			// Entrada através do set
			objVetorProduto[indice] = new Produto();
			objVetorProduto[indice].setMarca(texto("Digite a marca"));
			objVetorProduto[indice].setQuantidade(inteiro("Digite a quantidade"));
			objVetorProduto[indice].setValor(decimal("Digite o valor"));			
			
			indice++;

		} while (JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?", "Carrinho de Compras",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

		for (int contador = 0; contador < indice; contador++) {
			System.out.println("Marca: " + objVetorProduto[contador].getMarca() + "\n" + "Quantidade: "
					+ objVetorProduto[contador].getQuantidade() + "\n" + "Valor: "
					+ objVetorProduto[contador].getValor());
		}
		
		System.out.println("Valor Total: " + valorTotal(objVetorProduto, indice));

	}

}
