package lectureCodes.week02.debugging;

public class Buggy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = factorial(a);
		System.out.println(b);
	}

	/**
	 * 
	 * @param n (assume n >= 1)
	 * @return product of integers from 1 to n (including n)
	 * 
	 * CONTAINS LOTS OF BUGS IN THE CURRENT FORM
	 */
	public static int factorial(int n) {
		int result = 0;
		for(int i=1; i < n; i++) {
			result = result + n;
		}
		return result;
	}
}
