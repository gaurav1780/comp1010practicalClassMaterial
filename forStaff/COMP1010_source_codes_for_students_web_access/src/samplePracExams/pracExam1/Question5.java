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
public class Question5 { //begin class 
	/**
	 * @param data (assumed to contain at least one item)
	 * @return true if all items of data are positive, false otherwise
	 */
	public static boolean allPositives(int[] data) {
		return true; //to be completed
	} //closing bracket for method - DO NOT REMOVE
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="allPositives(int[])", marks=20)
	public void testAllPositives() {
		int[] a = {4,3,2,1};
		assertTrue(Question5.allPositives(a));

		int[] b = {-5,6,7,8};
		assertFalse(Question5.allPositives(b));

		int[] c = {7,9,-6};
		assertFalse(Question5.allPositives(c));

		int[] d = {7,9,0};
		assertFalse(Question5.allPositives(d));

		int[] e = {0,7,9};
		assertFalse(Question5.allPositives(e));

		int[] f = {1,1,1,1,1,1,1,1,1};
		Random r = new Random();
		f[r.nextInt(f.length)] = 0;
		assertFalse(Question5.allPositives(f));

	}
} //end class (do not delete this closing bracket)
