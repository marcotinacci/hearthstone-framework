package board;

import targets.ITarget;
import cards.Card;

public abstract class Minion implements ITarget{
	private int attackPoints;
	private int maxHealthPoints;
	private int currentHealthPoints;
	private Card generated;
	private boolean taunt;
	private boolean stealth;
	private boolean windFury;
	private boolean divineShield;
	
	public Minion(){
		init();
	}
	
	protected abstract void init();

	public int getAttackPoints() {
		return attackPoints;
	}
	public int getMaxHealthPoints() {
		return maxHealthPoints;
	}
	public int getCurrentHealthPoints() {
		return currentHealthPoints;
	}
	public Card getGenerated() {
		return generated;
	}
	public boolean isTaunt() {
		return taunt;
	}
	public boolean isStealth() {
		return stealth;
	}
	public boolean isWindFury() {
		return windFury;
	}
	public boolean isDivineShield() {
		return divineShield;
	}

}
