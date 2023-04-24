package br.com.fiap.modelo;

public class Colaborador {

	// variaveis
	private String nome;
	private double valorHora;
	private String cargo;
	private double qtdadeHora;
	private double percentual;

	public Colaborador() {
		super();
	}

	public Colaborador(String nome, double valorHora, String cargo) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.cargo = cargo;
	}

	public Colaborador(String nome, double valorHora, String cargo, double qtdadeHora) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.cargo = cargo;
		this.qtdadeHora = qtdadeHora;
	}

	public Colaborador(String nome, double valorHora, String cargo, double qtdadeHora, double percentual) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.cargo = cargo;
		this.qtdadeHora = qtdadeHora;
		this.percentual = percentual;
	}

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

	public double getQtdadeHora() {
		return qtdadeHora;
	}

	public void setQtdadeHora(double qtdadeHora) {
		this.qtdadeHora = qtdadeHora;
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

	// Método para exibir tudo
	public String getExibirTudo() {
		return "Nome: " + nome + "\nValorHora: " + valorHora + "\nCargo: " + cargo;
	}

	// Método Worker
	/*
	 * public double calcularTotalSalario(int qtdadeHoras) { return valorHora *
	 * qtdadeHoras; }
	 * 
	 * public double calcularIr (int quantidadeHoras, double percentual) { return
	 * (valorHora * quantidadeHoras) * (percentual/ 100); }
	 */

	public double calcularTotalSalario(double qtdadeHoras) {
		return valorHora * qtdadeHoras;
	}

	public double calcularIr(int quantidadeHoras, double porcentagem) {
		return (valorHora * quantidadeHoras) * (porcentagem / 100);
	}

	public double salarioTotal() {
		return valorHora * qtdadeHora;
	}

	public double irCalculo(double porcentagem) {
		double salario;

		salario = salarioTotal() * porcentagem / 100;

		return salario;
	}

	public String informacaoSalario() {
		String informacao;

		if (salarioTotal() <= 3555) {
			informacao = "Abaixo de 3555";
		} else {
			informacao = "Acima de 3555";
		}
		return informacao;
	}

	public double controleCalculoIr() {
		double salario;

		salario = salarioTotal() * percentual / 100;

		return salario;
	}

}
