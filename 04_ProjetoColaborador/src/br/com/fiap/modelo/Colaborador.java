package br.com.fiap.modelo;

public class Colaborador {
	
	// modificador, tipo de dado e variavel 

	private String nome;
	private double valorHora;
	private String cargo;
	
	// Método Construtor vazio 
	public Colaborador () {
		super();
	}
	
	// Método Construtor cheio 
	public Colaborador (String nome, double valorHora, String cargo) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.cargo = cargo;
	}	
	// Método Construtor com 2 Strings
	public Colaborador (String nome, String cargo) {
		super();
		this.nome = nome;
		this.cargo = cargo;
	}
	
	
	// Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// Método Get para exibir todos os resultados das variáveis 
	
	public String getExibirTudo () {
		return "Nome: " + nome + "\nValor Hora: " + valorHora + "\nCargo: " + cargo;
	}
	
	// Métodos Workers 
	public double calcularTotalSalario(int qtdadeHoras) {
		return valorHora * qtdadeHoras;
	}
	
	public double calcularIr (int quantidadeHoras, double percentual) {
		return (valorHora * quantidadeHoras) * (percentual/ 100);
	}

}
