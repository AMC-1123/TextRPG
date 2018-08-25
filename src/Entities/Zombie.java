package Entities;

public class Zombie extends Enemy {

	private final String name = "Zombie";
	private final int maxHP = 10;
	private final char token = 'Z';
	
	public Zombie(String name, int maxHP, char token) {
		super(name, maxHP, token);
		// TODO Auto-generated constructor stub
	}
	
}
