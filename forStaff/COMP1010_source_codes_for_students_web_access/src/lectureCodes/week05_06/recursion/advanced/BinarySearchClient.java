package lectureCodes.week05_06.recursion.advanced;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchClient {

	public static void main(String[] args) {
		int[] arr = {0,1,1,2,3,5,8,13,21,34,55};
		for(int item=0; item <= 55; item++) {
			System.out.println("index of "+item+" in "+Arrays.toString(arr)+" = "+RecursionService.binarySearch(arr, item));
		}
	}
}
