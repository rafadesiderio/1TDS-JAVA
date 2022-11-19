package br.com.fiap.beans;

public class Computador {

	// Modificador de acesso, tipo de dado e variável
	private double valor;
	private String fornecedor;
	private Monitor monitor;

	// Método Construtor vazio
	public Computador() {
		super();
	}
	// Método Construtor sem atributo de referência
	public Computador(double valor, String fornecedor) {
		super();
		this.valor = valor;
		this.fornecedor = fornecedor;
	}
	
	// Método Construtor cheio
	public Computador(double valor, String fornecedor, Monitor monitor) {
		super();
		this.valor = valor;
		this.fornecedor = fornecedor;
		this.monitor = monitor;
	}
	
	// Métodos Setters
	/*
	 * Modificador de acesso, sem retorno "void", nome do Método, dentro do
	 * parâmetro o tipo de dado e o nome do parâmetro que se refere a variável, abre
	 * e fecha bloco
	 */
	public void setValor(double valor) {
		/*
		 * Com o "this." podemos indicar que se trata de uma variável mesmo tendo o nome
		 * idêntico com o nome do parâmetro
		 */
		this.valor = valor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	// Métodos Getters
	/*
	 * Modificador de acesso, tipo de dado, abre e fecha parâmetro,
	 * abre e fecha bloco
	 */
	public double getValor() {
		/*
		 * Com o "return" podemos retornar o valor da variável 
		 * quando acessado para exibir
		 */
		return valor;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public Monitor getMonitor() {
		return monitor;
	}	

}
