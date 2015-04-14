package targets.predicates;

import game.Game;

import java.util.Set;

import targets.ITarget;

public abstract class Predicate {
	protected Game game;

	public Predicate(Game game) {
		super();
		this.game = game;
	}
	
	public abstract Set<ITarget> getAvailableTargets();
	
}
