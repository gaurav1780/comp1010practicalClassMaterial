package lectureCodes.week07.problemSolvingClassesObjects.iteration1;

import java.util.Random;

public class Deck {
	public Card[] deck;

	public Deck() {
		deck = new Card[Card.possibleCardCount()];
		Card c = null;
		int counter = 0;
		String[] suits = Card.SUITS;
		for(int i=0; i < suits.length; i++) { //go through each suit
			for(int r = 1; r <= Card.POSSIBLE_RANKS; r++) { //go through each rank
				c = new Card();
				c.setRank(r);
				c.setSuit(suits[i]);
				deck[counter] = c;
				counter++;
			}
		}
	}
	
	public void shuffle(int strength) {
		Random r = new Random();
		for(int i=1; i <= strength; i++) {  //depending on strength of shuffling
			//pick two random cards
			int idx1 = r.nextInt(Card.possibleCardCount());
			int idx2 = r.nextInt(Card.possibleCardCount());
			
			//swap them
			Card temp = deck[idx1];
			deck[idx1] = deck[idx2];
			deck[idx2] = temp;
		}
	}
	
	public String toString() {
		String result = "";
		for(int i=0; i < deck.length; i++) {
			result+=deck[i].toString()+"\n";
		}
		return result+"\n";
	}
}
