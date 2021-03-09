package lectureCodes.week04.classesObjects2.fullExample;

public class Player {
	public Name name;
	public Date dob;
	public MatchPerformance[] performances;

	/**
	 * 
	 * @param _name
	 * @param dob
	 * @param p: is not null
	 */
	public Player(Name _name, Date dob, MatchPerformance[] p) {
		name = _name;
		this.dob = dob;
		performances = p; //reference copy of the array
		performances = new MatchPerformance[p.length]; //instance copy of the array
		for(int i=0; i < p.length; i++) {
			//performances[i] = p[i]; //reference copy of the object
			performances[i] = new MatchPerformance(p[i]); //instance copy of object at index i
		}
	}

	public String toString() {
		String str = name+" (born "+dob+").\nPerformance stats: \n";
		for(int i=0; i < performances.length; i++) {
			str += performances[i].toString() + "\n\n";
		}
		return str;
	}

	/**
	 * 
	 * @return the game where player scored most goals. in case of tie, 
	 * use passing accuracy. in case passing accuracy is also the same,
	 * return the first game in the array.
	 * 
	 */
	public MatchPerformance bestGame() {
		int maxIndex = 0;
		int counterEqualMax = 1;
		for(int i=1; i < performances.length; i++) {
			if(performances[i].conversionRate() > performances[maxIndex].conversionRate()) {
				maxIndex = i;
				counterEqualMax = 1;
			}
			else {
				if(performances[i].conversionRate() == performances[maxIndex].conversionRate()) {
					counterEqualMax++;
				}
			}
		}
		if(counterEqualMax == 1) { //unique highest - return immediately
			return new MatchPerformance(performances[maxIndex]);
		}
		else {
			int maxIndex2 = maxIndex;
			for(int i=maxIndex2; i < performances.length; i++) {
				if(performances[i].conversionRate() == performances[maxIndex].conversionRate() && 
						performances[i].passingAccuracy() > performances[maxIndex2].passingAccuracy()) {
					maxIndex2 = i;
				}
			}
			return new MatchPerformance(performances[maxIndex2]);
		}
	}
}
