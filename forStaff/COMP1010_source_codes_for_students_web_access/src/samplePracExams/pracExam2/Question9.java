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
public class Question9 { //begin class 
	/**
	* @param data
	* @param target
	* @param start
	* @return true if there exists a collection of non-adjacent items in data,
	* (not necessarily sequential) starting at index start,
	* that add up to target, and false otherwise
  * examples:
	* if data ={1,2,7,9} and target = 16, start = 0, return false (as we cannot select both 7 and 9)
	* if data ={1,2,7,9,3,8} and target = 18, start = 0, return true as 1+9+8 = 18
	*
	* IMPORTANT: must be solved recursively, that is by calling the method
	* itself in a way that it contributes to the final answer
	*/
	public static boolean addUpToNoAdjacentRecursive(int[] data, int target, int start) {
	 		return false; //to be completed
	} //end of addUpToNoAdjacentRecursive (do not delete this closing bracket)
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="addUpToNoAdjacentRecursive(int[], int, int)", marks=10)
	public void testAddUpToNoAdjacentRecursive() {
		assertFalse(Question9.addUpToNoAdjacentRecursive(new int[]{2,3}, 5, 0));
		//cannot select both 2 and 3

		assertTrue(Question9.addUpToNoAdjacentRecursive(new int[]{2,3,8}, 10, 0));
		//2+8=10

		assertFalse(Question9.addUpToNoAdjacentRecursive(new int[]{2,3}, 5, 1));
		//no values starting at index 1 add up to 5

		assertTrue(Question9.addUpToNoAdjacentRecursive(new int[]{5,1,8,4}, 13, 0));
		//5+8 = 13

		assertTrue(Question9.addUpToNoAdjacentRecursive(new int[]{-2,1,6,-3,1,15}, 10, 0));
		//-2+-3+15 = 10

		assertTrue(Question9.addUpToNoAdjacentRecursive(new int[]{1,2,3,4,5,-5,-4,-3,-2,-1}, 0, 0));
		//1+-1=0

		assertFalse(Question9.addUpToNoAdjacentRecursive(new int[]{1,2,3,4,5,-5,-4,-3,-2,-1}, 15, 0));
		//cannot select 1,2,3,4,5 together

		assertFalse(Question9.addUpToNoAdjacentRecursive(new int[]{10,2,8,2}, 10, 1));
		//10 cannot be counted (at index 0), cannot select 2 and 8 or 8 and 2 together.

	}
} //end class (do not delete this closing bracket)
