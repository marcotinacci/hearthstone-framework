package cards.minions;

import board.Minion;
import player.Player;
import cards.Card;
import cards.ECardType;
import events.Delegate;
import game.Game;

public abstract class MinionCard extends Card {

	private Minion minion;
	
	public MinionCard(Player owner) {
		super(owner);
		minion = initMinion();
	}

	protected abstract Minion initMinion();
	
	@Override
	public ECardType getCardType() {
		return ECardType.MINION;
	}
	
	@Override
	public Delegate onPlay() {
		return new Delegate() {
			
			@Override
			public void execute(Game game) {
				game.getPlayer(getOwner()).getBoard().getMinions().add(minion);
			}
		};
	}

}
