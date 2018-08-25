package Entities;

import java.util.*;

import GameInterfaces.*;

public class Player implements Entity {

	private String playerName;
	private final char playerToken;
	private final int maxHP;
	private int currentHP;
	private boolean dead;
	private int attack;
	private int defence;
	private List<Equipment> equipment = new ArrayList<>();
	private List<Item> items = new ArrayList<>();
	
	public Player(String playerName, int maxHP, char playerToken) {
		this.playerName = playerName;
		this.playerToken = playerToken;
		this.maxHP = maxHP;
		currentHP = maxHP;
		attack = 2;
		defence = 2;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return playerName;
	}
	
	@Override
	public char getEntityToken() {
		// TODO Auto-generated method stub
		return playerToken;
	}

	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return currentHP;
	}

	@Override
	public void setHP(int modifier) {
		// TODO Auto-generated method stub
		if (modifier > 0) {
			currentHP += modifier;
			if (currentHP > maxHP)
				currentHP = maxHP;
		} else {
			currentHP += (modifier + defence);
			if (currentHP < 0) {
				currentHP = 0;
				dead = true;
			}
		}
	}

	@Override
	public void attack(Entity target) {
		// TODO Auto-generated method stub
		target.setHP(-attack);
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return dead;
	}
	
	public void setAttack(int attack) {this.attack = attack;}
	public void setDefence(int defence) {this.defence = defence;}

	
}
