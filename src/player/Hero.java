package player;

import targets.ITarget;

public abstract class Hero implements ITarget {
	private int maxHealthPoints;
	private int currentHealthPoints;
	private String heroName;
	private HeroPower heroPower;
	
	public Hero(int maxHealthPoints, String heroName, HeroPower heroPower) {
		super();
		this.maxHealthPoints = maxHealthPoints;
		this.currentHealthPoints = maxHealthPoints;
		this.heroName = heroName;
		this.heroPower = heroPower;
	}

	public int getMaxHealthPoints() {
		return maxHealthPoints;
	}

	public void setMaxHealthPoints(int maxHealthPoints) {
		this.maxHealthPoints = maxHealthPoints;
	}

	public int getCurrentHealthPoints() {
		return currentHealthPoints;
	}

	public void setCurrentHealthPoints(int currentHealthPoints) {
		this.currentHealthPoints = currentHealthPoints;
	}
	
	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public HeroPower getHeroPower() {
		return heroPower;
	}

	public void setHeroPower(HeroPower heroPower) {
		this.heroPower = heroPower;
	}
	
	
	
}
