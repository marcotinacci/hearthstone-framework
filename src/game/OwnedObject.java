package game;

import player.Player;


public abstract class OwnedObject {
	private Player owner;

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

}
