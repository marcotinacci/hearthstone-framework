package cards.spells;

import player.Player;
import cards.ECardExpansionSet;
import cards.ECardRarity;
import cards.EClass;
import events.Delegate;
import game.Game;

public class Fireball extends SpellCard {

	public Fireball(Player owner) {
		super(owner);
	}

	@Override
	public String getFlavourText() {
		return "This spell is useful for burning things. If you're looking for spells that toast things, or just warm them a little, you're in the wrong place.";
	}

	@Override
	public String getCardText() {
		return "Deal 6 damage.";
	}
	
	@Override
	public ECardRarity getCardRarity() {
		return ECardRarity.NONE;
	}

	@Override
	public ECardExpansionSet getCardExpansionSet() {
		return ECardExpansionSet.BASE;
	}

	@Override
	public EClass getCardClass() {
		return EClass.MAGE;
	}

	@Override
	public boolean isGoldenCard() {
		return false;
	}

	@Override
	public Delegate onPlay() {
		// TODO Auto-generated method stub
		return new Delegate() {
			
			@Override
			public void execute(Game game) {
				// TODO Auto-generated method stub
				
			}
		};
	}



}
