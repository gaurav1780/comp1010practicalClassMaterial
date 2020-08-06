package lectureCodes.week04.classesObjects2.classesObjects2;

public class Person {
	public Date dob;
	public String name;
	public Date getDob() {
		return dob;
	}
	public String getName() {
		return name;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Person(String n, Date d) {
		setName(n);
		setDob(d);
	}
	
	public String toString() {
		return name+", born "+dob;
	}
}
