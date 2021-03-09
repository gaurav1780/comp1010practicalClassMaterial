package samplePracExams.pracExam1;

//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;
import org.junit.rules.*;
import java.lang.reflect.*;

 
//20 marks
public class Question4 { //begin class 
  /**
   * @param data (assumed to contain at least one item)
   * @return the sum of all odd numbers in the array.
   * Tip: a number (n) is odd if n%2 != 0
   */
  public static int sumOdd(int[] data) {
  	return 0; //to be completed
  } //closing bracket for method - DO NOT REMOVE
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="sumOdd(int[])", marks=20)
	public void testSumOdd() {
		int[] a = {4,3,2,8};
		assertEquals(3, Question4.sumOdd(a));

		int[] b = {-5,6,7,8};
		assertEquals(2, Question4.sumOdd(b));

		int[] c = {4,8,-2};
		assertEquals(0, Question4.sumOdd(c));

		int[] f = {1,1,1,1,1,1,1,1,1};
		assertEquals(9, Question4.sumOdd(f));

	}
} //end class (do not delete this closing bracket)
