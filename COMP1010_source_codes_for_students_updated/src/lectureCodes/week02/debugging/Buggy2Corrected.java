package lectureCodes.week02.debugging;

public class Buggy2Corrected {

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
	 * Corrected version
	 */
	public static int sumPositiveEvens(int[] arr) {
		int result = 0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > 0 && arr[i] % 2 == 0) {
				result = result + arr[i];
			}
		}
		return result;
	}

}
