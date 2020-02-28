package lectureCodes.week12.transition2000;
import java.util.*;
import java.util.Map.Entry;

public class BirthdayBook {
	public HashMap<Name, Date> entries;

	public BirthdayBook() {
		entries = new HashMap<Name, Date>();
	}

	public void add(Name name, Date dob) {
		entries.put(name, dob);
	}

	public ArrayList<Name> getByDate(int day, int month) {
		ArrayList<Name> result = new ArrayList<Name>();
		Iterator<Entry<Name, Date>> iter = entries.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<Name, Date> pair = iter.next();
			if(((Date)pair.getValue()).getDay() == day && ((Date)pair.getValue()).getMonth() == month) {
				result.add((Name)pair.getKey());
			}
		}
		return result;
	}
	
	public ArrayList<Name> getByMonth(int month) {
		ArrayList<Name> result = new ArrayList<Name>();
		Iterator<Entry<Name, Date>> iter = entries.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<Name, Date> pair = iter.next();
			if(((Date)pair.getValue()).getMonth() == month) {
				result.add((Name)pair.getKey());
			}
		}
		return result;
	}
	
		public ArrayList<Name> getByYear(int year) {
		ArrayList<Name> result = new ArrayList<Name>();
		Iterator<Entry<Name, Date>> iter = entries.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<Name, Date> pair = iter.next();
			if(((Date)pair.getValue()).getYear() == year) {
				result.add((Name)pair.getKey());
			}
		}
		return result;
	}

	public String toString() {
		return entries.toString();
	}
}
