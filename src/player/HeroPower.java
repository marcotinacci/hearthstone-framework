package player;

public class HeroPower {
	private int manaCost;
	
	public HeroPower(int cost){
		if(cost < 0)
			throw new IllegalArgumentException("Mana cost must be non-negative");
		this.manaCost = cost;
	}
	
	
}
