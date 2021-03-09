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
public class Question3 { //begin class 
	/**
	 * @param n (assume n > 0)
	 * @return the sum of all positive integers from 1 to n.
	 * for example, if n is 5, method returns 1+2+3+4+5 = 15
	 */
	public static int sum(int n) {
		return 0; //to be completed
	} //closing bracket for method - DO NOT REMOVE
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="sum(int)", marks=20)
	public void testSumInt() {
		assertEquals(1, Question3.sum(1));
		assertEquals(15, Question3.sum(5));
		assertEquals(28, Question3.sum(7));
		assertEquals(55, Question3.sum(10));

	}
} //end class (do not delete this closing bracket)
