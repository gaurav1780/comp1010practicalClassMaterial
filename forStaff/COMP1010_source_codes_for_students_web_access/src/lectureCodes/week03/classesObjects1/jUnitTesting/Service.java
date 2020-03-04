package lectureCodes.week03.classesObjects1.jUnitTesting;

public class Service {
	//CONTAINS LOTS OF BUGS!
	@SuppressWarnings("unused")
	public static boolean allPositivesBuggy(double[] a) {
		if(a == null)
			return false; //failure if array is not properly instantiated

		for(int i=1; i < a.length; i++) {
			if(a[i] < 0) { 
				return false;
			}
			else {
				return true;
			}
		}
		return true; //we know this will never be reached
	}
	
	//CORRECT VERSION
	/**
	 * 
	 * @param a
	 * @return true if all the items in a are positive (more than 0),
	 * false otherwise
	 */
	public static boolean allPositives(double[] a) {
		if(a == null)
			return false; //failure if array is not properly instantiated

		for(int i=0; i < a.length; i++) {
			if(a[i] <= 0) { 
				return false;
			}
		}
		return true; //we know this will never be reached
	}
}
