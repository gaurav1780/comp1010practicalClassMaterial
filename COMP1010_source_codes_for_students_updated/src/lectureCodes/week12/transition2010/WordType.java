package lectureCodes.week12.transition2010;

public enum WordType {
	NOUN("Noun"), VERB("Verb"), CONJUNCTION("Conjunction");
	
	public String kind;

	WordType(String kind) {
		this.kind = kind;
	}
	
	public String toString() {
		return kind;
	}
}
