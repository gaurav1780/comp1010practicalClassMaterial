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
public class Question6 { //begin class 
	/**
	 * @param arr
	 * note: all items of an empty array ARE one of a kind
	 * @return true if each item in the array exists exactly once
	 * TIP: you MAY add a helper method with signature int count(int[] data, int target)
	 * that returns number of times item target exists in array data
	 */
	public static boolean oneOfAKind(int[] arr) {
		return false; //to be completed
	} //closing bracket for method - DO NOT REMOVE
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="oneOfAKind(int[])", marks=10)
	public void testOneOfAKind() {
		int[] empty = {};
		assertTrue(Question6.oneOfAKind(empty)); //each item in an empty array IS one of a kind
		int[] a = {1,7,2,9};
		assertTrue(Question6.oneOfAKind(a));
		int[] b = {1,7,2,1};
		assertFalse(Question6.oneOfAKind(b));
		int[] c = {1,2,3,4,5,6,7,8,4,9};
		assertFalse(Question6.oneOfAKind(c));
		int[] d = {1,2,3,4,5,6,7,8,9,9};
		assertFalse(Question6.oneOfAKind(d));
		int[] e = {8};
		assertTrue(Question6.oneOfAKind(e));
		int[] f = {8,8,8};
		assertFalse(Question6.oneOfAKind(f));
		
	}
} //end class (do not delete this closing bracket)
