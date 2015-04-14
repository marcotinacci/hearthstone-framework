package game;

import static org.junit.Assert.fail;

import org.junit.Test;

import player.Player;
import cards.EClass;

public class TestPlayer {

	@Test
	public void testNeutralPlayerClassFail() {
		try {
			new Player(EClass.NEUTRAL);
		} catch (IllegalArgumentException iae) {
			return;
		}
		fail("Missed expected exception.");
	}
	
	@Test
	public void testShamanPlayerClass() {
		try {
			new Player(EClass.SHAMAN);
		} catch (IllegalArgumentException iae) {
			fail();
		}
	}
}
