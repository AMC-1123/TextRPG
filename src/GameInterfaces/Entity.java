package GameInterfaces;

/*
* Interface for representing Entities in game
* Entities should have a constructor that initialises the entitie's
* name, maximum hit points, and base attack value.
*
* @author Anthony Connelly
*/

public interface Entity {
	
	// @return entity name
	public abstract String getName();
	
	// @return entity token
	public abstract char getEntityToken();
	
	// @return entity hit points
	public abstract int getHP();
	
	/** @param modifier
	 * 	changes entity hit points based on modifier value
	 */ 
	public abstract void setHP(int modifier);
	
	// method to attack another entity
	public abstract void attack(Entity target);
	
	// method checks if entity is still alive
	public abstract boolean isAlive();
	
}
