package events;

import game.Game;

public class EmptyDelegate implements Delegate {

	@Override
	public void execute(Game game) {
		// nothing to do
	}

}
