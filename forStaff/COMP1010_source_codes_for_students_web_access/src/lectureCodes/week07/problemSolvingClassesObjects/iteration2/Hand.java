package lectureCodes.week07.problemSolvingClassesObjects.iteration2;

public class Hand {
	public Card[] cards;
	
	public Hand(int n, Deck deck) {
		n = Math.max(1,  n);
		n = Math.min(n, deck.getCardsLeft());
		cards = new Card[n];
		for(int i=0; i < cards.length; i++)
			cards[i] = deck.remove();
	}
	
	public String toString() {
		String result = "";
		for(int i=0; i < cards.length; i++) {
			if(cards[i] != null) {
				result+=cards[i].toString()+"\n";
			}
		}
		return result+"\n";
	}
	
	public int size() {
		return cards.length;
	}
}
