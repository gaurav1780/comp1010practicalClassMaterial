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
public class Question2 { //begin class 
	/**
	 * 
	 * @param n: assumed to be more than 0
	 * @param d, d >= 0 and d <= 9
	 * @return true if number n contains the digit d, false otherwise
	 * you may assume that 0 itself doesn't contain ANY digit (not even 0)
 	 * hint: n%10 gives the last digit, n/10 gives the rest of the number
	 * IMPLEMENTATION MUST BE RECURSIVE
	 * DO NOT CALL ANY OTHER METHOD (NO HELPERS ALLOWED)
	 */
	public static boolean containsDigitRecursive(int n, int d) {
		return false; //to be completed
	}
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="containsDigitRecursive(int, int)", marks=10)
	public void testContainsDigitRecursive() throws NoSuchMethodException, SecurityException {
		assertTrue(Question2.containsDigitRecursive(1729, 1));
		assertTrue(Question2.containsDigitRecursive(1729, 7));
		assertTrue(Question2.containsDigitRecursive(1729, 2));
		assertTrue(Question2.containsDigitRecursive(1729, 9));
		assertFalse(Question2.containsDigitRecursive(1729, 0));
		assertFalse(Question2.containsDigitRecursive(1729, 3));
		assertFalse(Question2.containsDigitRecursive(1729, 4));
		assertFalse(Question2.containsDigitRecursive(1729, 5));
		assertFalse(Question2.containsDigitRecursive(1729, 6));
		assertFalse(Question2.containsDigitRecursive(1729, 8));
		assertTrue(Question2.containsDigitRecursive(8999999, 8));
		assertTrue(Question2.containsDigitRecursive(899999, 8));
		assertTrue(Question2.containsDigitRecursive(89999, 8));
		assertFalse(Question2.containsDigitRecursive(8999999, 7));

	}
} //end class (do not delete this closing bracket)
