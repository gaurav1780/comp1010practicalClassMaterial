package lectureCodes.week07.problemSolvingClassesObjects.iteration2;

public enum Rank {
	ACE (1), TWO (2), THREE (3), FOUR (4), FIVE (5), SIX (6), 
	SEVEN (7), EIGHT (8), NINE (9), TEN (10), JACK (11), 
	QUEEN (12), KING (13);
	
	public int value;
	
	Rank(int value) {
		this.value = value;
	}
	
	public String toString() {
		//look-up array
		//a bit of c-way of doing things
		//replaced by dict in python
		//hashmaps in java
		String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		return values[value - 1];
	}
	
	public int compare(Rank other) {
		if(this.value > other.value)
			return 1;
		if(this.value < other.value)
			return -1;
		return 0;
	}
}
