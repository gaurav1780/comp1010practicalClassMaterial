package lectureCodes.week02.debugging;

public class Buggy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {8, 0, 5, -6, -7, 0, -19, 2, -5, 13};
		int b = sumPositiveEvens(a);
		System.out.println(b); //should be 10 (8+2)
	}

	/**
	 * 
	 * @param arr (assume arr contains at least 1 item)
	 * @return sum of items that are even (divisible by 2) AND positive (more than 0)
	 * 
	 * CONTAINS LOTS OF BUGS IN THE CURRENT FORM
	 */
	public static int sumPositiveEvens(int[] arr) {
		int result = 0;
		for(int i=1; i < arr.length; i++) {
			if(i % 2 == 0) {
				result = result + i;
			}
		}
		return result;
	}

}
