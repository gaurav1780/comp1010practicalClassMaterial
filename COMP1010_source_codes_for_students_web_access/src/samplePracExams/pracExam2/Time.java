package samplePracExams.pracExam2;

/**
 * Do not modify the Time class. It is
 * required for Question 7
 */
class Time {
	public int hour, minute;

	public Time(int h, int m) {
		hour = Math.max(0, Math.min(23, h));
		minute = Math.max(0, Math.min(59, m));
	}

	@Override
	public String toString() {
		return hour+":"+minute;
	}

	/**
	* @param other: object against which calling object should be compared
	* @return 	 1 if calling object comes after parameter object
	* 			-1 if calling object comes before parameter object
	* 			 0 if calling object and parameter object are the same
	*/
	public int compareTo(Time other) {
		if(this.hour > other.hour)
			return 1;
		if(this.hour < other.hour)
			return -1;
		if(this.minute > other.minute)
			return 1;
		if(this.minute < other.minute)
			return -1;
		return 0;
	}
}
