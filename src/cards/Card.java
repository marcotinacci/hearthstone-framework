package cards;

import events.Delegate;
import events.EmptyDelegate;
import game.OwnedObject;
import targets.ITarget;

public abstract class Card extends OwnedObject {
	
	public abstract String getFlavourText();
	public abstract String getCardText();
	public abstract ECardType getCardType();
	public abstract ECardRarity getCardRarity();
	public abstract ECardExpansionSet getCardExpansionSet();
	public abstract EClass getCardClass();
	public abstract boolean isGoldenCard();
	
	/**
	 * Event handlers that must be implemented
	 */
	
	/**
	 * Event handlers that may be overridden
	 */
	public Delegate onPlay(){ return new EmptyDelegate(); }
	public Delegate onPlay(ITarget target){ return new EmptyDelegate(); }
	public Delegate onDraw(){ return new EmptyDelegate(); }
	
}
