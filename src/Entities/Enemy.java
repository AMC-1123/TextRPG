package Entities;

import GameInterfaces.Entity;

public abstract class Enemy implements Entity {

	private String enemyName;
	private final char enemyToken;
	private final int maxHP;
	private int currentHP;
	private boolean dead;
	
	public Enemy(String enemyName, int maxHP, char enemyToken) {
		this.enemyName = enemyName;
		this.enemyToken = enemyToken;
		this.maxHP = maxHP;
		currentHP = maxHP;
		dead = false;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return enemyName;
	}
	
	@Override
	public char getEntityToken() {
		// TODO Auto-generated method stub
		return enemyToken;
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
			currentHP += modifier;
			if (currentHP < 0) {
				currentHP = 0;
				dead = true;
			}
		}
	}

	@Override
	public void attack(Entity target) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return dead;
	}

}
