package lectureCodes.week02.debugging;

public class Buggy1Corrected {

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
	 * Correct version
	 */
	public static int factorial(int n) {
		int result = 1; //not 0
		for(int i=1; i <= n; i++) { //goes till <=n, not <n
			result = result * i; //MULTIPLY i into result instead of ADDING n into result  
		}
		return result;
	}

}
