package LevelMaps;

import Entities.Player;
import GameInterfaces.*;

public class DungeonLevel implements Level {
	
	private char[][] level = new char[LEVEL_HEIGHT][LEVEL_WIDTH];
	private Player p = new Player("Player", 20, 'P');
	
	public DungeonLevel() {
		for (int i = 0; i < LEVEL_HEIGHT; i++) {
			for (int j = 0; j < LEVEL_WIDTH; j++) {
				level[i][j] = ' ';
			}
		}
		
		spawnPlayer();
	}
	
	
	@Override
	public void populate() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < LEVEL_HEIGHT; i++) {
			for (int j = 0; j < LEVEL_WIDTH; j++) {
				if ((i == 0 || i == LEVEL_HEIGHT - 1) || (j == 0 || j == LEVEL_WIDTH - 1)) {
					level[i][j] = '#';
				}
			}
			
			
			
		}
	}

	@Override
	public void setTile(int x, int y, char c) {
		// TODO Auto-generated method stub
		level[x][y] = c;
	}
	
	public void draw() {
		for (int i = 0; i < LEVEL_HEIGHT; i++) {
			for (int j = 0; j < LEVEL_WIDTH; j++) {
				System.out.print(level[i][j]);;
			}
			System.out.println();
		}
		
	}
	
	public String dungeonString() {
		String temp = "";
		for (int i = 0; i < LEVEL_HEIGHT; i++) {
			for (int j = 0; j < LEVEL_WIDTH; j++) {
				temp += level[i][j];
			}
			temp += '\n';
		}
		
		return temp;
	}
	
	private void spawnPlayer() {
		int playerSpawnX;
		int playerSpawnY;
		boolean goodSpawn = false;
		
		while(!goodSpawn) {
			playerSpawnX = (int) ((Math.random() * (LEVEL_WIDTH - 2)) + 1);
			playerSpawnY = (int) ((Math.random() * (LEVEL_HEIGHT - 2)) + 1);
			if (level[playerSpawnY][playerSpawnX] == ' ') {
				level[playerSpawnY][playerSpawnX] = p.getEntityToken();
				goodSpawn = true;
			}
		}
		
	}
}
