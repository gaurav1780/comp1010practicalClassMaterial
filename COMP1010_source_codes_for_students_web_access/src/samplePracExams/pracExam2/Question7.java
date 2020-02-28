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
public class Question7 { //begin class 
	/**
	*
	* @param arr: an array of Time objects
	* @param target: a Time object
	* @return number of items in arr that are "before" target
	* return 0 if array is null
	*
	* ***HINT*** you can use compareTo method
	*
	* Note: if targetTime is 10:30, then 10:29 is the first time that occurs before 10:30
	*/
	public static int countBefore(Time[] arr, Time target) {
		return 0; //to be completed
	} //end of method countBefore (do not delete this closing bracket)
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="countBefore(Time[], Time)", marks=10)
	public void testCountBeforeTime() {
		Time target = new Time(10, 20);
		assertEquals(0, Question7.countBefore(null, target)); //should not raise NullPointerException

		Time[] a = new Time[5];
		a[0] = new Time(10, 20);
		a[1] = new Time(10, 50);
		a[2] = new Time(11, 20);
		a[3] = new Time(11, 50);
		a[4] = new Time(12, 20);

		target = new Time(12, 30);
		assertEquals(5, Question7.countBefore(a, target));

		target = new Time(10, 30);
		assertEquals(1, Question7.countBefore(a, target));

		target = new Time(9, 30);
		assertEquals(0, Question7.countBefore(a, target));

		target = new Time(10, 20); //BEFORE 10:20
		assertEquals(0, Question7.countBefore(a, target));

	}
} //end class (do not delete this closing bracket)
