package Items;

import GameInterfaces.Entity;
import GameInterfaces.Item;

public abstract class Potion implements Item {

	private String itemName;
	
	public Potion(String itemName) {
		this.itemName = itemName;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return itemName;
	}

	@Override
	public abstract void use(Entity user);

}
