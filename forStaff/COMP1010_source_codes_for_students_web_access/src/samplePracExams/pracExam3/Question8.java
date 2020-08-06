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
public class Question8 { //begin class 
	/**
	* @param list
	* @return a list containing the longest ascending run inside the parameter.
	* return first of the runs if there is a tie.
	* for example,
	* if list = null or an empty list, return null
	* if list = [6, 1, 4, 2, 8, 3, 9], return the list [1, 4]
	* if list = [6, 1, 4, 2, 8, 3, 3, 4, 9], return the list [3, 3, 4, 9]
	*
	* IMPORTANT: you should NOT modify the passed list
	*/
	public static ArrayList<Integer> getLongestAscendingRun(ArrayList<Integer> list) {
		return new ArrayList<Integer>(); //to be completed
	}
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(marks=10, description="getLongestAscendingRun(List)")
	public void testGetLongestAscendingRunList() throws NoSuchMethodException, SecurityException {
		ArrayList<Integer> list = null;
		ArrayList<Integer> asc = Question8.getLongestAscendingRun(list);
		assertNull(asc);

		list = new ArrayList<Integer>();
		asc = Question8.getLongestAscendingRun(list);
		assertNull(asc);

		list.add(3);
		list.add(2);
		list.add(1);
		asc = Question8.getLongestAscendingRun(list);
		assertEquals("[3]", asc.toString());

		list.add(4);
		asc = Question8.getLongestAscendingRun(list);
		assertEquals("[1, 4]", asc.toString());

		list.add(2);
		list.add(0);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		asc = Question8.getLongestAscendingRun(list);
		assertEquals("[0, 5, 6, 7, 8]", asc.toString());

	}
} //end class (do not delete this closing bracket)
