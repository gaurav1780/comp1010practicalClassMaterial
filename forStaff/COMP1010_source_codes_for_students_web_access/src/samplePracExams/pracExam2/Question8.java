package samplePracExams.pracExam2;

//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;
import org.junit.rules.*;
import java.lang.reflect.*;

 
//10 marks
public class Question8 { //begin class 
	/**
	 * @param arr: an array of positive integers
	 * @return the length of longest chain of integers in arr that add up to an
	 * even number.
	 *
	 * For example, if arr is [1,2,1,3,4,8], then the longest chain is 2,1,3,4,8
	 * thus the method should return 5
	 *
	 * For this question, you can assume that arr is not null and contains at least
	 * one integer.
	 *
	 * Other examples:
	 * 	[13,13,13]	--> return 2
	 *  [12]		--> return 1
	 *  [17]		--> return 0
	 *
	 * You may add a helper method if you need one
	 */
	public static int longestChainAddingUpToEven(int[] arr) {
		return 0; //to be completed
	} //end of method longestChainAddingUpToEven (do not delete this closing bracket)
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="longestChainAddingUpToEven(int[])", marks=10)
	public void testLongestChainAddingUpToEven() {
		int[] a = {1,2,1,3,4,8}; //longest chain is 2,1,3,4,8 (length 5)
		assertEquals(5, Question8.longestChainAddingUpToEven(a));

		int[] b = {1,2,1,2,1,2,1,2}; //longest chain is 1,2,1,2,1,2,1,2 (length 8)
		assertEquals(8, Question8.longestChainAddingUpToEven(b));

		int[] c = {12}; //longest chain is 12 (length 1)
		assertEquals(1, Question8.longestChainAddingUpToEven(c));

		int[] d = {17}; //no chain adding up to even
		assertEquals(0, Question8.longestChainAddingUpToEven(d));

	}
} //end class (do not delete this closing bracket)
