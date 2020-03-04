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
public class Question3 { //begin class 
	/**
	 *
	 * @param list
	 * @return sum of all items except the first and last items
	 * return 0 if list is null or empty
	 * for example,
	 * if list = [20, 50, 80, 60, 30], return 50+80+60=190
	 * if list = [20, 30], return 0
	 * if list = [40], return 0
	 */
	public static int sumNotOnBoundaries(ArrayList<Integer> list) {
		return 0; //to be completed
	}
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="sumNotOnBoundaries(ArrayList<Integer>)", marks=10)
	public void testsumNotOnBoundariesArrayList() throws NoSuchMethodException, SecurityException {
		assertEquals(0, Question3.sumNotOnBoundaries(null)); //null list check
		ArrayList<Integer> list = new ArrayList<Integer>();
		assertEquals(0, Question3.sumNotOnBoundaries(list)); //empty list check

		list.add(20);
		assertEquals(0, Question3.sumNotOnBoundaries(list));
		list.add(30);
		assertEquals(0, Question3.sumNotOnBoundaries(list));

		list.add(60);
		assertEquals(30, Question3.sumNotOnBoundaries(list));

		list.add(10);
		list.add(50);
		list.add(30);
		assertEquals(150, Question3.sumNotOnBoundaries(list));

	}
} //end class (do not delete this closing bracket)
