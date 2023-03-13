package modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class ChapolinPlayer {

	// variavel de eixos direita/esquerda e cima/baixo
	private int x, y;
	// variavel de direcao direita/esquerda e cima/baixo
	private int direcaoX, direcaoY;
	// variavel do tipo Image da imagem do player
	private Image imagem;
	// variavel para determinar colisao
	private int largura, altura;
	
	
	private List <MarretaBionica> marretasBionicas;

	// Construtor do ChapolinPlayer
	public ChapolinPlayer() {
		super();
		// x e y recebem valor em qual coordenada vai iniciar na tela
		this.x = 50;
		this.y = 50;
		
		marretasBionicas = new ArrayList<MarretaBionica>();
	}

	// Getters

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDirecaoX() {
		return direcaoX;
	}
	

	public int getDirecaoY() {
		return direcaoY;
	}

	public Image getImagem() {
		return imagem;
	}

	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}
	
	

	public List<MarretaBionica> getMarretasBionicas() {
		return marretasBionicas;
	}

	// Metodo load para carregar o personagem
	public void load() {
		// Instanciar obj para buscar Imagem por parâmetro
		ImageIcon objImageIcon = new ImageIcon("res//Chapolin.png");
		// variavel recebe a imagem do obj através do getImage()
		imagem = objImageIcon.getImage();

		// Largura e altura da mesma dimensão da imagem
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}

	// Metodo para definir movimentação do ChapolinPlayer
	public void update() {
		// Sempre atual posicao do eixo direita/esquerda recebera uma atualização de
		// acordo com o comando
		x += direcaoX;
		// Sempre atual posicao do eixo cima/baixo recebera uma atualização de acordo
		// com o comando
		y += direcaoY;
	}
	
	public void tacaMarreta() {
		this.marretasBionicas.add(new MarretaBionica( x + (largura/2), y + (altura/5)));
	}

	// Metodo para definir comando do teclado
	public void keyPressed(KeyEvent tecla) {
		int clique = tecla.getKeyCode();

		if (clique == KeyEvent.VK_M) {
			tacaMarreta();
		}
		
		if (clique == KeyEvent.VK_UP) {
			direcaoY = -3;
		}
		if (clique == KeyEvent.VK_DOWN) {
			direcaoY = 3;
		}
		if (clique == KeyEvent.VK_RIGHT) {
			direcaoX = 3;
		}
		if (clique == KeyEvent.VK_LEFT) {
			direcaoX = -3;
		}
	}

	public void keyRelease(KeyEvent tecla) {
		int clique = tecla.getKeyCode();

		if (clique == KeyEvent.VK_UP) {
			direcaoY = 0;
		}
		if (clique == KeyEvent.VK_DOWN) {
			direcaoY = 0;
		}
		if (clique == KeyEvent.VK_RIGHT) {
			direcaoX = 0;
		}
		if (clique == KeyEvent.VK_LEFT) {
			direcaoX = 0;
		}
	}

}
