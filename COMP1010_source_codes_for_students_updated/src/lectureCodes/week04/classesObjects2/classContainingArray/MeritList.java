package lectureCodes.week04.classesObjects2.classContainingArray;

public class MeritList {
	public double[] marks;
	
	/**
	 * 
	 * @return a deep copy of the array
	 */
	public double[] getMarksCopy() { 
		double[] result = new double[marks.length];
		for(int i=0; i < marks.length; i++)
			result[i] = marks[i];
		return marks;
	}
	
	/**
	 * make a deep copy of the parameter into instance variable marks.
	 * validate each item to constrain in the range [0 - 100].
	 * if an item is less than 0, corresponding item in marks should become 0
	 * else if an item is more than 100, corresponding item in marks should become 100
	 * else corresponding item in marks should become that item
	 * @param m
	 */
	public void setMarks(double[] m) {
		marks = new double[m.length]; 
		for(int i=0; i < m.length; i++) {
			if(m[i] < 0)
				marks[i] = 0;
			else if(m[i] > 100)
				marks[i] = 100;
			else 
				marks[i] = m[i];
		}
	}
	
	/**
	 * set marks to the parameter using setter
	 * @param m
	 */
	public MeritList(double[] m) {
		setMarks(m); //this is fine
	}
	
	public String toString() {
		String result = "";
		for(int i=0; i < marks.length; i++) {
			result = result + "Student "+(i+1)+": "+marks[i]+"\n";
		}
		result = result + "average: "+ average() + "\n";
		return result;
	}
	
	/**
	 * 
	 * @return the average mark
	 */
	public double average() {
		double total = 0;
		for(int i=0; i < marks.length; i++) {
			total = total + marks[i];
		}
		double avg = total / marks.length;
		return avg;
	}
	
	/**
	 * for you to complete
	 * @return the highest mark in the meritlist
	 */
	public double highest() {
		return 0;
	}
}
