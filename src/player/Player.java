package player;

import board.Board;
import cards.EClass;
import cards.EClass.Type;

public class Player {
	
	private Deck deck;
	private EClass playerClass;
	private Hero hero;
	private Board board;
	
	public Player(EClass playerClass){
		this.deck = new Deck();
		this.deck.setOwner(this);
		if(!playerClass.isType(Type.PLAYER))
			throw new IllegalArgumentException("Wrong class "+playerClass+", a player class expected.");
		this.playerClass = playerClass;
	}
	
	public Player(Deck deck, EClass playerClass){
		this(playerClass);
		board = new Board();
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}

	public Deck getDeck() {
		return deck;
	}

	public EClass getPlayerClass() {
		return playerClass;
	}

	public Board getBoard() {
		return board;
	}
}
