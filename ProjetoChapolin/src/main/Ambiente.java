package main;

import javax.swing.JFrame;

import modelo.Cenario;
import modelo.ChapolinPlayer;

//O extends faz herança do JFrame importada da biblioteca para criar a tela
public class Ambiente extends JFrame {

	// Construtor com as iniciações do Ambiente
	public Ambiente() {
		super();
		add(new Cenario());
		
		// Título da Tela aonde irá rodar o jogo
		setTitle("Janela do Jogo");
		// Dimensões da janela do jogo
		setSize(1024,728);
		// Ao fechar a janela o jogo para de rodar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Para abrir a janela no centro da tela
		setLocationRelativeTo(null);
		// Manter a resolução, mas podendo aumentar ou duminuir a tela
		this.setResizable(true);
		// Tornar as renderizações visíveis
		setVisible(true);
	}

	// Metodo estático para execução
	public static void main(String[] args) {

		new Ambiente();
	}

}
