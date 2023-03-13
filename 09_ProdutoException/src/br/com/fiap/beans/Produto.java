package br.com.fiap.beans;

public class Produto {

	private int codigo;
	private String descricao;
	private String marca;
	private int quantidade;
	private double valor;	
	
	public Produto() {
		super();
	}

	public Produto(int codigo, String descricao, String marca, int quantidade, double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.marca = marca;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
