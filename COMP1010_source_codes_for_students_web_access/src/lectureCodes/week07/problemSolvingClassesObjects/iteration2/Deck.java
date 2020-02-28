package lectureCodes.week07.problemSolvingClassesObjects.iteration2;

import java.util.Random;

public class Deck {
	public Card[] cards;
	public int cardsLeft;
	
	public Deck() {
		cards = new Card[Suit.values().length * Rank.values().length];
		cardsLeft = Suit.values().length * Rank.values().length;
		int counter = 0;
		for(Suit s: Suit.values()) { //for each possible value of Suit
			for(Rank r: Rank.values()) {
				cards[counter] = new Card(s, r);
				counter++;
			}
		}
	}
	
	public String toString() {
		String result = "";
		int counter = 1;
		for(int i=0; i < cards.length; i++) {
			if(cards[i] != null) {
				result+=counter+". "+cards[i].toString()+"\n";
				counter++;
			}
		}
		return result+"\n";
	}
	
	
	public void shuffle(int strength) {
		Random r = new Random();
		for(int i=1; i <= strength; i++) {
			int idx1 = r.nextInt(Suit.values().length * Rank.values().length);
			int idx2 = r.nextInt(Suit.values().length * Rank.values().length);
			Card temp = cards[idx1];
			cards[idx1] = cards[idx2];
			cards[idx2] = temp;
		}
	}

	public Card remove() {
		if(cardsLeft > 0) {
			for(int i=0; i < cards.length; i++) {
				if(cards[i] != null) {
					cardsLeft--;
					Card result = cards[i];
					cards[i] = null;
					return result;
				}
			}
		}
		return null;
	}

	public int getCardsLeft() {
		return cardsLeft;
	}
}
