package modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class MarretaBionica {
	
	// variavel do tipo Image da imagem da Marreta Bionica
	private Image imagem;
	
	private int altura, largura;
	
	private int x,y;
	
	private boolean isVisivel;
	
	
	private static final int limite = 936;
	
	// variavel estática definida a velocidade da Marreta Bionica
	private static int velocidadeMartelo = 2;
	
	
	// Construtor MarretaBionica
	public MarretaBionica (int x, int y) {
		super();
		this.x = x;
		this.y = y;
		isVisivel = true;
	}
		
	// Getters e Setters 
	public Image getImagem() {
		return imagem;
	}
	public void setImagem(Image imagem) {
		this.imagem = imagem;
	}

	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public boolean isVisivel() {
		return isVisivel;
	}
	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public static int getVelocidadeMartelo() {
		return velocidadeMartelo;
	}
	public static void setVelocidadeMartelo(int velocidadeMartelo) {
		MarretaBionica.velocidadeMartelo = velocidadeMartelo;
	}

	public static int getLimite() {
		return limite;
	}
	
	public void load() {
		ImageIcon objetoImageIcon = new ImageIcon("res//MarretaBionicaOk.png");
		imagem = objetoImageIcon.getImage();
		
		this.altura = imagem.getHeight(null);
		this.largura = imagem.getWidth(null);		
	}
	
	public void update() {
		this.x += velocidadeMartelo;
			if (this.x > limite)  {
				isVisivel = false;
			}
	}	

}
