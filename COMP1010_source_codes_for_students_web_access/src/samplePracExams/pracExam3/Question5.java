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
public class Question5 { //begin class 
	/**
	 *
	 * @param list
	 * remove any negative items from the list.
	 * for example,
	 * if list passed = [5, 0, -3, 6, -7], after the execution it should be [5, 0, 6]
	 * if list is null or empty, no changes should be made to the list
	*/
	public static void removeNegatives(ArrayList<Integer> list) {
		//to be completed
	}
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="removeNegatives(ArrayList<Integer>)", marks=10)
	public void testRemoveNegativesArrayList() throws NoSuchMethodException, SecurityException {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(-5);
		list.add(0);
		list.add(-7);
		list.add(3);
		list.add(-8);
		Question5.removeNegatives(list);
		assertEquals("[0, 3]", list.toString());


		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(-20);
		list2.add(-50);
		list2.add(7);
		list2.add(8);
		Question5.removeNegatives(list2);
		assertEquals("[5, 7, 8]", list2.toString());

	}
} //end class (do not delete this closing bracket)
