package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {

	private String razaoSocial;
	private String cnpj;

	// Construtor vazio
	public PessoaJuridica() {
		super();
	}

	// Construtor com Herança cheio
	public PessoaJuridica(String nome, String email, double renda, String razaoSocial, String cnpj) {
		super(nome, email, renda);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	// Getters e Setters

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double pagarTaxa() {

		double taxaRenda;

		if (getRenda() > 2000) {

			return taxaRenda = getRenda() * 20 / 100;
		} else {
			taxaRenda = 0;
			return taxaRenda;
		}
	}

	@Override
	public String identificador() {

		return "Pessoa Jurídica";
	}

}
