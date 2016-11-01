package player;
import game.OwnedObject;

import java.util.LinkedList;
import java.util.List;

import cards.Card;
import cards.DeathCard;


public class Deck extends OwnedObject {
	private List<Card> cards;
	private int DeathCardCounter = 0;
	
	public Deck() {
		super();
		cards = new LinkedList<Card>();
	}
	
	public Card draw(){
		if(cards.isEmpty()){
			DeathCardCounter++;
			return new DeathCard(DeathCardCounter, getOwner());
		}else{
			return cards.remove(0);
		}
	}
}
