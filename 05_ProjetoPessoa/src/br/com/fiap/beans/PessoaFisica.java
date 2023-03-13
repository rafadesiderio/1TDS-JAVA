package br.com.fiap.beans;

public class PessoaFisica extends Pessoa {

	private String rg;
	private String cpf;

	// Construtor vazio
	public PessoaFisica() {
		super();
	}

	// Construtor com Herança cheio
	public PessoaFisica(String nome, String email, double renda, String rg, String cpf) {
		super(nome, email, renda);
		this.rg = rg;
		this.cpf = cpf;
	}

	// Getters e Setters

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double pagarTaxa() {
		double taxaRenda;

		if (getRenda() > 2000) {

			return taxaRenda = getRenda() * 12 / 100;
		} else {

			taxaRenda = 0;
			return taxaRenda;
		}

	}

	@Override
	public String identificador() {
		
		return "Pessoa Física";
	}

}
