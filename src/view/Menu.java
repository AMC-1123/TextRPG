package view;

import javax.swing.*;


public class Menu extends JMenuBar {

	private JMenu menu;
	private JMenuItem menuItem;
	
	public Menu() {
		
		JMenu menu = new JMenu();
		JMenuItem menuItem = new JMenuItem();
		menuItem.setText("Play");
		menu.setText("Menu");
		menu.add(menuItem);
		add(menu);
	}
	

}
