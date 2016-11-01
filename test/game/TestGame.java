package game;

import static org.junit.Assert.*;

import org.junit.Test;

import cards.EClass;
import player.Player;

public class TestGame {

	@Test
	public void testMatch() {
		Player p1 = new Player(EClass.DRUID);
		Player p2 = new Player(EClass.HUNTER);
		Game game = new Game(p1, p2);
		fail("Not yet implemented");
	}

}
