package lectureCodes.week03.classesObjects1.toStaticOrNotToStatic;

public class MathService {
	
	/**
	 * the method higher operates on the parameters and 
	 * only on the parameters. it does not care about 
	 * an instance of the class (MathService) being created.
	 * Therefore, it's static
	 * 
	 * @param a
	 * @param b
	 * @return higher of the two
	 */
	public static int higher(int a, int b) {
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	
	public static double power(double x, int n) {
		//deliberately buggy, don't throw stuff
		boolean isNegativePower = false;
		if(n < 0) {
			isNegativePower = true;
			n = Math.abs(n);
		}
		double result = 1;
		for(int i=1; i<=n; i++)
			result = result * x;
		if(isNegativePower)
			return 1/result;
		else //not negative power
			return result;
	}
	
	/**
	 * A static method can directly call another static method
	 * belonging to the same class
	 * @param a
	 * @param b
	 * @param c
	 * @return highest of the three parameters
	 */
	public static int highest(int a, int b, int c) {
		int temp = higher(a, b);
		return higher(temp, c);
	}
}
