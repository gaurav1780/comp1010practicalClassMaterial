package lectureCodes.week07.problemSolvingClassesObjects.iteration2;

public class Card {
	public Suit suit;
	public Rank rank;
	
	public Card(Suit suit, Rank rank) {
		setSuit(suit);
		setRank(rank);
	}

	public void setRank(Rank rank) {
		// TODO Auto-generated method stub
		this.rank = rank;
	}

	public void setSuit(Suit suit) {
		// TODO Auto-generated method stub
		this.suit = suit;
	}
	
	public String toString() {
		return rank.toString() + " of " + suit.toString();
	}
	
	public int compareTo(Card other) {
		return this.rank.compare(other.rank);
	}
	
//	public boolean equals(Object obj) {
//		if(obj instanceof Card) {
//			Card other = (Card)obj;
//			if(this.rank.equals(other.rank))
//				if(this.suit.equals(other.suit))
//					return true;
//			return false;
//		}
//		else {
//			return false;
//		}
//	}
}
