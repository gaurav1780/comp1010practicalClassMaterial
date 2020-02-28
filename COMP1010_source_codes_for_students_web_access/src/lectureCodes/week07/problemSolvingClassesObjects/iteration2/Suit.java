package lectureCodes.week07.problemSolvingClassesObjects.iteration2;

public enum Suit {
	CLUBS (1), DIAMONDS (2), HEARTS (4), SPADES (3);
	
	public int value;
	
	Suit(int value) {
		this.value = value;
	}
	
	public String toString() {
		String[] values = {"Clubs", "Diamonds", "Spades", "Hearts"};
		return values[value - 1];
	}
}
