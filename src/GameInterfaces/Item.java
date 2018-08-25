package GameInterfaces;

/*
* Interface for representing items in game
* Entities should have a constructor that initialises the item name.
*
* @author Anthony Connelly
*/

public interface Item {

	// @return item name
	public abstract String getName();
	
	// method to use item
	public abstract void use(Entity user);
	
}
