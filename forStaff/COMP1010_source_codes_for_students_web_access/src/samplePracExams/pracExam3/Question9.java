package samplePracExams.pracExam3;

//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;
import org.junit.rules.*;
import java.lang.reflect.*;

 
//10 marks
public class Question9 { //begin class 
	/**
	* @param start: starting index
	* @param nums: array
	* @param target
	* @return true if it is possible (and false if not)
	* to choose a group of some of the ints (starting at index start),
	* such that the group sums to the
	* given target with these additional constraints:
	* all multiples of 5 in the array must be included
	* in the group. If the value immediately following
	* a multiple of 5 is 1, the 1 must not be chosen.
	* IMPLEMENTATION MUST BE RECURSIVE AND NO LOOPS SHOULD BE USED
	*
	* start = 0, nums = 5,1,25,4, target = 30 --> return true
	* start = 0, nums = 5,1,25,4, target = 34 --> return true
	* start = 0, nums = 5,1,25,4, target = 31 --> return false
	* start = 0, nums = 5,1,25,4, target = 29 --> return false
	*/
	public static boolean groupSum5Recursive(int start, int[] nums, int target) {
	  return false; //to be completed
	}
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="groupSum5Recursive(int, int[], int)", marks=10)
	public void testGroupSum5Recursive() throws NoSuchMethodException, SecurityException {
		int[] a = {2,5,10,4};
		assertTrue(Question9.groupSum5Recursive(0, a, 19));
		assertFalse(Question9.groupSum5Recursive(0, a, 12));

		int[] b = {3,5,1};
		assertTrue(Question9.groupSum5Recursive(0, b, 5));
		assertFalse(Question9.groupSum5Recursive(0, b, 9));

		int[] c = {5,1,25,4};
		assertTrue(Question9.groupSum5Recursive(0, c, 30));
		assertTrue(Question9.groupSum5Recursive(0, c, 34));
		assertFalse(Question9.groupSum5Recursive(0, c, 31));
		assertFalse(Question9.groupSum5Recursive(0, c, 29));

		int[] empty = {};
		assertTrue(Question9.groupSum5Recursive(0, empty, 0));

	}
} //end class (do not delete this closing bracket)
