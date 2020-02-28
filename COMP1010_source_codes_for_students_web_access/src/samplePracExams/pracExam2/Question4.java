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
public class Question4 { //begin class 
	/**
	 * @param data
	 * @param minValue
	 * @return index of the first value in array that is HIGHER THAN minValue
	 *
	 * IMPORTANT: return -1 if array is null or if none of the items of the array are higher than minValue
	 */
	public static int indexOfHigherThan(int[] data, int minValue) {
		return -1; //to be completed
	} //end of method (do not delete this closing bracket)
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="indexOfHigherThan(int[], int)", marks=10)
	public void testIndexOfHigherThan() {
		assertEquals(-1, Question4.indexOfHigherThan(null, 0));

		int[] a = {1,7,2,9};
		assertEquals(3, Question4.indexOfHigherThan(a, 8));
		assertEquals(1, Question4.indexOfHigherThan(a, 1));
		assertEquals(0, Question4.indexOfHigherThan(a, -1));
		assertEquals(-1, Question4.indexOfHigherThan(a, 9));

	}
} //end class (do not delete this closing bracket)
