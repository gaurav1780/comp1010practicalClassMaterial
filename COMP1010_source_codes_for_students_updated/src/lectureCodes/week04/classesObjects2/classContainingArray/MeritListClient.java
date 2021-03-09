package lectureCodes.week04.classesObjects2.classContainingArray;

public class MeritListClient {

	public static void main(String[] args) {
		double[] data = {61.3, -78.5, 90.2, 47, 112.3};
		MeritList comp125 = new MeritList(data);
		System.out.println(comp125);
		System.out.println(comp125.average());
		System.out.println(comp125.highest());		
	}

}
