package lectureCodes.week05_06.recursion.advanced;

import java.util.Arrays;
import java.util.Random;

public class AddsUpToClient {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[r.nextInt(6) + 5];
		for(int i=0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) - 2;
		}
		int start = r.nextInt(arr.length);
		int total = r.nextInt(15);
		if(RecursionService.addsUpTo(arr, total, start)) {
			System.out.println(", starting at index "+start+", in "+Arrays.toString(arr)+", add up to "+total);
		}
		else {
			System.out.println("None of the items, starting at index "+start+", in "+Arrays.toString(arr)+", add up to "+total);
		}
	}

}
