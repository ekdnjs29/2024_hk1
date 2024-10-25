package project.CardGame;

import java.util.ArrayList;
import java.util.List;

public class CardCase {

	private List<Card> cards;
	public static final int NUMOFCARDS=Card.DECK.length*Card.STECK.length+1;
	
	public CardCase() {
		cards = new ArrayList<Card>();
		shuffle();
	}
	
	public void shuffle() {
		int i = 0;
		int r = (int)(Math.random()*NUMOFCARDS);
		while (true) {
			Card card = new Card();
			if (r == i) {
				card.setCard(r);
				cards.add(card);
				i++;
			}
			else if (!cards.contains(card)) {
				cards.add(card);
				i++;
			}
			if (i==NUMOFCARDS)
				break;
		}
	}
	
	public List<Card> getCards() {
		return cards;
	}
}
