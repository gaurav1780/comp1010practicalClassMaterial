package samplePracExams.pracExam1;

//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;
import org.junit.rules.*;
import java.lang.reflect.*;

 
//10 marks
public class Question7 { //begin class 
	/**
	 * HD Question
	 * @param arr
	 * @return the longest sequence of items that occurs
	 * more than once in the array
	 * Examples:
	 * if arr = {1,7,2,9,3,8,7,2,9,8,7,1,7,2,3,8,7,2,9,6,1,1,5,9}
	 * return the array {3,8,7,2,9}
	 * if arr = {1,2,1,2,1,2,1,2,1,2,1,2}
	 * return the array {1,2,1,2,1,2,1,2,1,2}
	 * if arr = {5,6,7,8,9}
	 * return the array {}
	 * if arr = {5,6,7,5,7,6,8,5,9}
	 * return the array {5}
	 */
	public static int[] longestRecurringSequence(int[] arr) {
		return null; //to be completed
	} //closing bracket for method - DO NOT REMOVE
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="longestRecurringSequence(int[])", marks=10)
	public void testlongestRecurringSequence() {
		int[] a = {1,7,2,9,3,8,7,2,9,8,7,1,7,2,3,8,7,2,9,6,1,1,5,9};
		int[] b = {3,8,7,2,9};
		assertNotNull(Question7.longestRecurringSequence(a));
		assertArrayEquals(b, Question7.longestRecurringSequence(a));

		a = new int[]{1,2,1,2,1,2,1,2,1,2,1,2};
		b = new int[]{1,2,1,2,1,2,1,2,1,2}; //occurs starting at index 0 and then again at index 2
		assertNotNull(Question7.longestRecurringSequence(a));
		assertArrayEquals(b, Question7.longestRecurringSequence(a));

		a = new int[]{5,6,7,8};
		b = new int[]{};
		assertNotNull(Question7.longestRecurringSequence(a));
		assertArrayEquals(b, Question7.longestRecurringSequence(a));

		a = new int[]{5,6,7,5,7,6,8,5,9};
		b = new int[]{5};
		assertNotNull(Question7.longestRecurringSequence(a));
		assertArrayEquals(b, Question7.longestRecurringSequence(a));

	}
} //end class (do not delete this closing bracket)
