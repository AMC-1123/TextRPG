package GameInterfaces;

/*
* Interface for representing Dungeon Levels in game
*
* @author Anthony Connelly
*/

public interface Level {
	
	public final int LEVEL_WIDTH = 49;
	public final int LEVEL_HEIGHT = 19;
	
	// method to populate the level
	public abstract void populate();
	
	// sets tile at x and y to c
	public abstract void setTile(int x, int y, char c);
	
}
