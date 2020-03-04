package lectureCodes.week05_06.recursion.advanced;

import java.util.Arrays;

public class GetPermutationClient {

	public static void main(String[] args) {
		String[] s = RecursionService.getPermutations("super");
		System.out.println(Arrays.toString(s));
//		String str = "said";
//
//		for(int i=0; i < RecursionService.factorial(str.length()); i++) {
//			System.out.println("Permutation "+i+" of "+str+": "+RecursionService.getPermutation(str, i));
//		}
	}

}
