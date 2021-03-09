package lectureCodes.week01.introduction;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = 71.3;
		double height = 1.77;
		double bmi = weight/(height*height);
		System.out.println(bmi);

		int num = 32768;
		int nDigits = countDigits(num);
		System.out.println("number of digits in "+num+" is "+nDigits);
		double[] a = {10,0,-20,30,0};
		System.out.println(countPositives(a));
	}

	/**
	 * 
	 * @param n: integer for which we need to count digits
	 * @return number of digits in n
	 * NOTE: 0 has 0 digits
	 * For example, 1729 has 4 digits
	 * 1729 -> (n/10 = 172, n%10 = 9)
	 * 
	 *  1729
	 *  172
	 *  17
	 *  1
	 *  0
	 */
	static int countDigits(int n) {
		/*
		 * set a counter to 0
		 * as long as n is not 0
		 * begin loop
		 * 		increase counter by 1
		 * 		remove last digit from the number
		 * end loop
		 */
		int counter = 0;
		while(n != 0) {
			counter = counter + 1;
			n = n / 10;
		} //end loop
		return counter;
	}

	/**
	 * 
	 * @param arr
	 * @return number of positive values (more than 0)
	 * in the array arr
	 * 
	 * {1,0,3,0,-5} --> 2
	 * {12,0,0,0,0} --> 1
	 * {0,0,0,0,12} --> 1
	 * {-6, -6, -6} --> 0
	 */
	static int countPositives(double[] arr) {
		/*
		 * set counter to 0
		 * go through each item of the array
		 * begin loop
		 * 		if the current item is more than 0
		 * 		begin if
		 * 			increase counter by 1
		 * 		end if
		 * end loop
		 * return counter
		 */
		int counter = 0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > 0) {
				counter++;
			}
		} //end of loop
		return counter;
	}
}
