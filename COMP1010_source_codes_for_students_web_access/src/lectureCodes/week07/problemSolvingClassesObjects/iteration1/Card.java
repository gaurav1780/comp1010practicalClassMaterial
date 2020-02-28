package lectureCodes.week07.problemSolvingClassesObjects.iteration1;

import java.util.Random;

public class Card {
	public String suit;
	public int rank;
	
	//suits organized from more powerful to less powerful
	public static final String[] SUITS = {	"dragons", "tigers", "snakes", 
											"mice", "cats", "lions", "bees", 
											"ladybirds", "possums", "goannas"};
	public static final int POSSIBLE_RANKS = 13;

	public String getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	public void setSuit(String s) {
		String source = s.toLowerCase();
		for(int i=0; i < SUITS.length; i++) {
			if(source.equals(SUITS[i])) {
				suit = source;
				return;
			}
		}
		Random r = new Random();
		int index = r.nextInt(SUITS.length);
		suit = SUITS[index];
	}

	public void setRank(int r) {
		if(r < 1)
			rank = 1;
		else if(r > POSSIBLE_RANKS)
			rank = POSSIBLE_RANKS;
		else //r was in the range 1 to POSSIBLE_RANKS
			rank = r;
		//rank = Math.max(1, Math.min(POSSIBLE_RANKS, r));
	}

	public String toString() {
		if(rank == 1)
			return "ace of "+suit;
		if(rank == POSSIBLE_RANKS - 2)
			return "jack of "+suit;
		if(rank == POSSIBLE_RANKS - 1)
			return "queen of "+suit;
		if(rank == POSSIBLE_RANKS)
			return "king of "+suit;
		return rank + " of " + suit;
	}

	public int compareTo(Card other) {
		if(this.rank > other.rank)
			return 1;
		if(this.rank < other.rank)
			return -1;
		return 0;
	}

	public int compareToV2(Card other) {
		if(this.rank > other.rank)
			return 1;
		if(this.rank < other.rank)
			return -1;

		for(int i=0; i < SUITS.length; i++) {
			String s = SUITS[i];
			if(this.suit.equals(s) && !other.suit.equals(s))
				return 1;
			if(!this.suit.equals(s) && other.suit.equals(s))
				return -1;
			if(this.suit.equals(s) && other.suit.equals(s))
				return 0;
		}
		return 0; //will never really be reached
	}

	public static int possibleCardCount() {
		return SUITS.length * POSSIBLE_RANKS;
	}
}
