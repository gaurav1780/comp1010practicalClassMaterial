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
public class Question5 { //begin class 
	/**
	* @param min
	* @param max
	* @return the sum of the numbers between min and max (inclusive on both sides)
	* return 0 if min > max
	* IMPORTANT: must be solved recursively, that is by calling the method
	* itself in a way that it contributes to the final answer
	*/
	public static int sumBetweenRecursive(int min, int max) {
	 		return 0; //to be completed
	} //end of sumBetweenRecursive (do not delete this closing bracket)
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="sumBetweenRecursive(int, int)", marks=10)
	public void testSumBetweenRecursive() {
		assertEquals(0, Question5.sumBetweenRecursive(6, 5)); //because 6 > 5
		assertEquals(-8, Question5.sumBetweenRecursive(-8, -8)); //only number -8
		assertEquals(26, Question5.sumBetweenRecursive(5, 8)); //5+6+7+8 = 26

	}
} //end class (do not delete this closing bracket)
