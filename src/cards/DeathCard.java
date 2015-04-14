package cards;

import player.Player;
import events.Delegate;
import events.EmptyDelegate;
import game.Game;

public class DeathCard extends Card {
	private int damage;

	public DeathCard(int damage, Player owner) {
		super(owner);
		this.damage = damage;
	}
	
	@Override
	public String getFlavourText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ECardType getCardType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ECardRarity getCardRarity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ECardExpansionSet getCardExpansionSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EClass getCardClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isGoldenCard() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Delegate onPlay() {
		return new EmptyDelegate();
	}
	
	@Override
	public Delegate onDraw() {
		return new Delegate() {
			
			@Override
			public void execute(Game game) {
				int chp = getOwner().getHero().getCurrentHealthPoints();
				getOwner().getHero().setCurrentHealthPoints(chp-damage);
			}
		};
	}

	@Override
	public String getCardText() {
		// TODO Auto-generated method stub
		return null;
	}

}
