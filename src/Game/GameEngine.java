package Game;

import LevelMaps.DungeonLevel;

public class GameEngine {

	private DungeonLevel dungeon = new DungeonLevel();
	public GameEngine() {
		
	}
	
	public void makeDungeon() {
		dungeon.populate();
	}
	
	public DungeonLevel getDungeon() {return dungeon;}
}
