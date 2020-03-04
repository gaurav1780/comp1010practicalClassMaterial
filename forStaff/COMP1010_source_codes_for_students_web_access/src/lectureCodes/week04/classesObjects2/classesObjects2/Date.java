package lectureCodes.week04.classesObjects2.classesObjects2;

public class Date {
	public int day, month, year;

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		//leap year
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) 
			maxDays[1] = 29;

		if(day < 1)
			day = 1;
		if(day > maxDays[month-1])
			day = maxDays[month-1];
		
		this.day = day;
	}

	public void setMonth(int month) {
		//this.month = Math.max(1, Math.min(12, month));
		
		if(month < 1)
			month = 1;
		if(month > 12)
			month = 12;
		
		this.month = month; 
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
		String[] monthNames = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
		return day + " of " + monthNames[month - 1]+", "+year;
	}
}
