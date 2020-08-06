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
public class Question3 { //begin class 
	 /**
	 * @param data (assumed to contain at least one item)
	 * @return true if data contains at least one positive integer,
	 * false otherwise
	 */
	public static boolean containsPositive(int[] data) {
		return false; //to be completed
	} //end of containsPositive (do not delete this closing bracket)
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="containsPositive(int[])", marks=10)
	public void testContainsPositive() {
		int[] a = {-4,-3,-2,-1};
		assertFalse(Question3.containsPositive(a));

		int[] b = {5,-6,-7,-8};
		assertTrue(Question3.containsPositive(b));

		int[] c = {-7,-9,6};
		assertTrue(Question3.containsPositive(c));

		int[] d = {-7,-9,0};
		assertFalse(Question3.containsPositive(d));

		int[] e = {0,-7,-9};
		assertFalse(Question3.containsPositive(e));

	}
} //end class (do not delete this closing bracket)
