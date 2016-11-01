package game;

import player.Player;

// TODO implements events as an Observer design pattern
// TODO implements minions' modification as a Decorator design pattern
// TODO event serialisation queue
// TODO design a property structure for owned objects
// TODO hashcode equals

public class Game {
	
	private Player p1;
	private Player p2;
	
	public Game(Player p1, Player p2) {
		this.p1 = p1;		
		this.p2 = p2;
	}
	
	public Player getP1() {
		return p1;
	}
	public Player getP2() {
		return p2;
	}

	public Player getPlayer(Player owner) {
		if(owner == p1)
			return p1;
		if(owner == p2)
			return p2;
		throw new IllegalArgumentException("Player "+owner+" can not be found.");
	}
	

}
