package lectureCodes.week12.transition2000;

public class Date {
	public int day, month, year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(month == 2) {
			if(year%400==0 || (year%4==0 && year%100 !=0)) {
				days[2] = 29;
			}
		}
		this.day = Math.max(1, Math.min(days[month], day));
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = Math.max(1, Math.min(12, month));
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date(int day, int month, int year) {
		setMonth(month);
		setYear(year);
		setDay(day);
	}

	public String toString() {
		return day+"/"+month+"/"+year;
	}

	public int compareTo(Date other) {
		if(year > other.year)
			return 1;
		if(year < other.year)
			return -1;
		if(month > other.month)
			return 1;
		if(month < other.month)
			return -1;
		if(day > other.day)
			return 1;
		if(day < other.day)
			return -1;
		return 0;
	}
}
