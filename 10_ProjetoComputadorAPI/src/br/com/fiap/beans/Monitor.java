package br.com.fiap.beans;

public class Monitor {

	// Modificador de acesso, tipo de dado e variável
		private String marca;
		private int tamanho;
		private String tipo;
		
		
		public Monitor () {
			super();
			
		}
		
		public Monitor (String marca, int tamanho, String tipo ) {
			super();
			this.marca = marca;
			this.tamanho = tamanho;
			this.tipo = tipo;
			
		}

		// Setters
		public void setMarca(String marca) {
			this.marca = marca;
		}

		public void setTamanho(int tamanho) {
			this.tamanho = tamanho;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		// Getters
		public String getMarca() {
			return marca;
		}

		public int getTamanho() {
			return tamanho;
		}

		public String getTipo() {
			return tipo;
		}
}
