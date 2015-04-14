package board;

import java.util.LinkedList;
import java.util.List;

public class Board {
	
	private List<Minion> minions;
	
	public Board() {
		minions = new LinkedList<Minion>();
	}

	public List<Minion> getMinions() {
		return minions;
	}

}
