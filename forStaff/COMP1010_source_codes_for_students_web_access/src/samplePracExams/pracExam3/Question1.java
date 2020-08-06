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
public class Question1 { //begin class 
		/**
		 *
		 * @param list
		 * @return the number of values that are even in the list
		 * return 0 if list is null or empty
		 */
		public static int countEven(ArrayList<Integer> list) {
			return 0; //to be completed
		}
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="testCountEvenArrayList(ArrayList<Integer>)", marks=10)
	public void testCountEvenArrayList() throws NoSuchMethodException, SecurityException {
		assertEquals(0, Question1.countEven(null));

		ArrayList<Integer> emptyList = new ArrayList<Integer>();
		assertEquals(0, Question1.countEven(emptyList));

		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(6, 0, 5, -7, -10));
		assertEquals(3, Question1.countEven(list1)); //3 values (6, 0 and -10) are even

		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(0, -2, 2, 4, -4));
		assertEquals(5, Question1.countEven(list2)); //all 5 values are even

		ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1, -1, 3, -3));
		assertEquals(0, Question1.countEven(list3)); //none of the values are even

	}
} //end class (do not delete this closing bracket)
