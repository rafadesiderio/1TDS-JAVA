package modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Cenario extends JPanel implements ActionListener {

	// variavel do tipo Image para imagem fundo de tela
	private Image telaDeFundo;
	// variavel do tipo Image para imagem Chapolin
	private ChapolinPlayer chapolin;
	// variavel para velocidade e timer de resposta  
	private Timer timer;
	
	private List<Aerolito> aerolitos;

	// Construtor com as iniciações do Cenario
	public Cenario() {
		super();
		
		// Para performance
		setFocusable(true);
		setDoubleBuffered(true);
		
		// Instanciar obj para buscar Imagem por parâmetro
		ImageIcon objImageIcon = new ImageIcon("res//Espaco.png");
		// variavel recebe a imagem do obj através do getImage()
		telaDeFundo = objImageIcon.getImage();

		// Instaciar o ChapolinPlayer no Cenario
		chapolin = new ChapolinPlayer();
		// Metodo para carregar o Chapolin no Cenário
		chapolin.load();
		
		// Adicionar AdaptadorTeclado para os comandos 
		addKeyListener(new AdaptadorTeclado());
		
		// Velocidade de resposta 
		timer  = new Timer(3,this);
		timer.start();
		
		aparecerInimigos();
	}
	
	
	public void aparecerInimigos() {
		int coordenadas [] = new int[100];
		aerolitos  = new ArrayList<Aerolito>();
		
		for (int i= 0; i < coordenadas.length; i++) {
			int x = (int) (Math.random() * 8000 + 1024);
			int y = (int) (Math.random() * 	750 + 100);
			aerolitos.add(new Aerolito (x,y));
		}
	}
	

	// Método paint para adcionar valores gráficos que vão ser exibidos na tela
	public void paint(Graphics pGrafico) {
		// Especificando o tipo de gráfico 2D
		Graphics2D objGrafico2d = (Graphics2D) pGrafico;
		// Recebe imagem telaDeFundo por parâmetro e seu posicionamento
		objGrafico2d.drawImage(telaDeFundo, 0, 0, null);
		// Recebe imagem do Chapolin por parâmetro e seu posicionamento, nesse caso
		// chamando os Metodos
		objGrafico2d.drawImage(chapolin.getImagem(), chapolin.getX(), chapolin.getY(), this);
		
		
		List<MarretaBionica> marretasBionicas = chapolin.getMarretasBionicas();
		for (int i =0; i <marretasBionicas.size(); i++) {
			MarretaBionica marreta = marretasBionicas.get(i);
			marreta.load();
			objGrafico2d.drawImage(marreta.getImagem(), marreta.getX(), marreta.getY(), this);
		}
		
		
		for (int o =0; o < aerolitos.size(); o++) {
			Aerolito aerolito = aerolitos.get(o);
			aerolito.load();
			objGrafico2d.drawImage(aerolito.getImagem(), aerolito.getX(), aerolito.getY(), this);
		}

		// Liberamos recursos do Sistema para funcionamento da janela do ambiente
		pGrafico.dispose();
	}

	// Sobrescreve, atualiza as alterações do ChapolinPlayer no Cenário
	@Override
	public void actionPerformed(ActionEvent e) {
		chapolin.update();
		
		List<MarretaBionica> marretasBionicas = chapolin.getMarretasBionicas();
		
		for (int i =0; i < marretasBionicas.size(); i++) {
			MarretaBionica marreta = marretasBionicas.get(i);
				if(marreta.isVisivel()) {
					marreta.update();
				}else {
					marretasBionicas.remove(i);
				}
		}
		
		for (int o =0; o < aerolitos.size(); o++) {
			Aerolito aerolito = aerolitos.get(o);
			if(aerolito.isVisivel()) {
				aerolito.update();
			}else {
				aerolitos.remove(o);
			}
		}
		
		repaint();
	}
	
	// Adaptar entrada dos comandos do teclado dentro do Cenario 
	private class AdaptadorTeclado extends KeyAdapter	{

		// Comando de quando pressionar a tecla 
		@Override
		public void keyPressed(KeyEvent e) {
			chapolin.keyPressed(e);
		}
		// Comando para quando não tiver pressionado a tecla
		@Override
		public void keyReleased(KeyEvent e) {
			chapolin.keyRelease(e);
		}
	}

}	


