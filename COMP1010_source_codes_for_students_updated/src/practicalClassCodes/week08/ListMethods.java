package practicalClassCodes.week08;

import java.util.ArrayList;

public class ListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ages.add(10);
		ages.add(70);
		ages.add(20);
		ages.add(90);
		ages.add(30);
		ages.add(80);
		double avgAge = average(ages);
		System.out.println("average of list "+ages+": "+avgAge);
		
		ArrayList<Double> marks = new ArrayList<Double>();
		marks.add(78.5);
		marks.add(82.5);
		marks.add(60.0);
		marks.add(95.5);
		marks.add(52.0);
		System.out.println("Original marks: "+marks);
		scale(marks, 5); //scale marks up by 5%
		System.out.println("Scaled up by 5%: "+marks);
	}

	/**
	 * 
	 * @param marks
	 * @param factor: percentage by which marks are scaled (negative means scale down)
	 * scale each item of the list by given factor
	 * make sure each updated value stays within range [0, 100]
	 */
	public static void scale(ArrayList<Double> list, double factor) {
		for(int i=0; i < list.size(); i++) {
			double cur = list.get(i);
			double updated = cur*(1 + factor/100.0);
			if(updated < 0) {
				list.set(i, 0.0);
			}
			else if(updated > 100) {
				list.set(i, 100.0);
			}
			else {
				list.set(i, updated);
			}
		}
	}

	public static double average(ArrayList<Integer> list) {
		if(list.size() == 0)
			return 0;
		
		double total = 0; //declaring as double to retain precision
		for(int i=0; i < list.size(); i++) {
			total = total + list.get(i);
		}
		return total / list.size();
	}

}
