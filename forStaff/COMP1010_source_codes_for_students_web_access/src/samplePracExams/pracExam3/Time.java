package samplePracExams.pracExam3;

/**
 * Do not modify the Time class. It is 
 * required for Question 6 
 */
class Time {
	private int hour, minute;

	public Time(int hour, int minute) {
		setHour(hour);
		setMinute(minute);
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = Math.max(0, Math.min(23, hour));
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = Math.max(0, Math.min(59, minute));

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
