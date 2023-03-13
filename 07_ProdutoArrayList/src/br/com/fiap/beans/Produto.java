package br.com.fiap.beans;

public class Produto {

	private String descricao;
	private String marca;
	private double valor;
	private int quantidade;

	public Produto() {
		super();
	}

	public Produto(String descricao, String marca, double valor, int quantidade) {
		super();
		this.descricao = descricao;
		this.marca = marca;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
