package cards.spells;

import player.Player;
import cards.Card;
import cards.ECardType;

public abstract class SpellCard extends Card {

	public SpellCard(Player owner) {
		super(owner);
	}

	@Override
	public ECardType getCardType() {
		return ECardType.SPELL;
	}

}
