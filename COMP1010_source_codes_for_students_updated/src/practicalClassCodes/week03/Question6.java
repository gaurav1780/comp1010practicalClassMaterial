package practicalClassCodes.week03;
import static org.junit.Assert.*;
import org.junit.*;

import java.io.*;
import java.text.*;
import java.util.*;

public class Question6 {
	/**
	 * return true if the array is in ascending order, false otherwise.
	 * ascending order is where every item is less than or equal to the
	 * the item after it.
	 */
	public static boolean isAscending(int[] data) {
		return false; //to be completed
	}

	@Test
	public void testIsAscending() {
		int[] a = {10, 20, 30, 40};
		assertTrue(Question6.isAscending(a));

		int[] b = {40, 30, 20, 10};
		assertFalse(Question6.isAscending(b));

		//add more test cases
	}
}
