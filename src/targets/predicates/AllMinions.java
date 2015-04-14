package targets.predicates;

import java.util.HashSet;
import java.util.Set;

import targets.ITarget;
import game.Game;

public class AllMinions extends Predicate{
	
	public AllMinions(Game game) {
		super(game);
	}

	@Override
	public Set<ITarget> getAvailableTargets() {
		Set<ITarget> targets = new HashSet<ITarget>();
		// add all minions from both players' board
		targets.addAll(game.getP1().getBoard().getMinions());
		targets.addAll(game.getP2().getBoard().getMinions());
		return targets;
	}
	
}
