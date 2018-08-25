package view;

import javax.swing.*;

import Game.GameEngine;

import java.awt.*;


public class GameWindow extends JFrame {
	
	private GameEngine ge = new GameEngine();
	private Menu menu;
	
	// makes the Main Game window
	public GameWindow() {
		
		ge.makeDungeon();
		
		setLayout(new BorderLayout());
		setBounds(100, 100, 720, 500);
		setMinimumSize(new Dimension(720, 500));
		populate();
		JPanel textArea = new JPanel();
		JTextArea text = new JTextArea(ge.getDungeon().dungeonString(), 100, 100);
		
		text.setFont(new Font("monospaced", Font.PLAIN, 12));
		text.setEditable(false);
		text.setBackground(Color.black);
		textArea.add(text);
		text.setVisible(true);
		add(textArea, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
		setVisible(true);
		
	}	
	
	public void populate() {
		menu = new Menu();
		add(menu, BorderLayout.NORTH);
	}
}