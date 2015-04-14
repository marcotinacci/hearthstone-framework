package cards.minions;

import board.Minion;
import player.Player;
import cards.ECardExpansionSet;
import cards.ECardRarity;
import cards.EClass;

public class Wisp extends MinionCard {

	public Wisp(Player owner) {
		super(owner);
	}

	@Override
	protected Minion initMinion() {
		return new Minion() {
			@Override
			protected void init() {
				
			}
		};
	}

	@Override
	public String getFlavourText() {
		return "If you hit an Eredar Lord with enough Wisps, it will explode. But why?";
	}

	@Override
	public String getCardText() {
		return "";
	}

	@Override
	public ECardRarity getCardRarity() {
		return ECardRarity.COMMON;
	}

	@Override
	public ECardExpansionSet getCardExpansionSet() {
		return ECardExpansionSet.BASE;
	}

	@Override
	public EClass getCardClass() {
		return EClass.NEUTRAL;
	}

	@Override
	public boolean isGoldenCard() {
		return false;
	}

}
