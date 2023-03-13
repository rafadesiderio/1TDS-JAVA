package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.excecoes.Excecao;

public class TesteProduto {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double decimal (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws Excecao {
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		Produto objProduto;
		
		do {
			//int codigo, String descricao, String marca, int quantidade, double valor
			try {
				objProduto = new Produto();
			objProduto.setCodigo(inteiro("Digite o código do produto"));
			objProduto.setDescricao(texto("Digite a descrição"));
			objProduto.setMarca(texto("Digite a marca"));
			objProduto.setQuantidade(inteiro("Digite a quantidade"));
			objProduto.setValor(decimal("Digite o valor"));
			listaProdutos.add(objProduto);
				
			} catch (Exception e) {
				throw new Excecao(e);
			} finally {
				System.out.println("ok");
			}
			
		} while (JOptionPane.showConfirmDialog(null, "Adicionar mais produtos no carrinho ?",
				"Carrinho de Compras", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE )==0);
		
		for(Produto p : listaProdutos) {
			System.out.println("Código: " + p.getCodigo() + "\n" +
					"Descrição: " + p.getDescricao() + "\n" + 
					"Marca: " + p.getMarca() + "\n" + 
					"Quantidade: " + p.getQuantidade() + "\n" + 
					"Valor: " + p.getValor());
		}
		
		

	}

}
