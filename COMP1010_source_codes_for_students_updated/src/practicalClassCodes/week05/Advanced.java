package practicalClassCodes.week05;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Advanced {
	public static Rectangle[][] groupSameAreas(Rectangle[] arr) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Test
	void testGroupSameAreas() {
		Rectangle a1 = new Rectangle(5, 4);
		Rectangle a2 = new Rectangle(2, 10);
		Rectangle a3 = new Rectangle(1, 20);
		Rectangle a4 = new Rectangle(20, 1);
		Rectangle a5 = new Rectangle(10, 2);
		Rectangle a6 = new Rectangle(4, 5);

		Rectangle b1 = new Rectangle(3, 6);
		Rectangle b2 = new Rectangle(6, 3);
		Rectangle b3 = new Rectangle(9, 2);
		Rectangle b4 = new Rectangle(2, 9);

		Rectangle c1 = new Rectangle(9, 6);

		Rectangle d1 = new Rectangle(5, 7);
		Rectangle d2 = new Rectangle(35, 1);

		Rectangle[] arr = {a1,b3,a2,c1,d1,a6,b1,b2,d2,a3,b4,a5,a4};
		Rectangle[][] b = Advanced.groupSameAreas(arr);

		assertNotNull(b);
		assertEquals(4, b.length);
		assertNotNull(b[0]);
		assertEquals(6, b[0].length);
		assertEquals("[5 by 4, 2 by 10, 4 by 5, 1 by 20, 10 by 2, 20 by 1]", Arrays.toString(b[0]));
		assertNotNull(b[1]);
		assertEquals(4, b[1].length);
		assertEquals("[9 by 2, 3 by 6, 6 by 3, 2 by 9]", Arrays.toString(b[1]));
		assertNotNull(b[2]);
		assertEquals(1, b[2].length);
		assertEquals("[9 by 6]", Arrays.toString(b[2]));
		assertNotNull(b[3]);
		assertEquals(2, b[3].length);
		assertEquals("[5 by 7, 35 by 1]", Arrays.toString(b[3]));
	}

	/**
	 * HD Question
	 * @param arr
	 * @return the longest sequence of items that occurs
	 * more than once in the array. return the array that occurs first
	 * in case of a tie.
	 * Examples:
	 * if arr = {1,7,2,9,3,8,7,2,9,8,7,1,7,2,3,8,7,2,9,6,1,1,5,9}
	 * return the array {3,8,7,2,9}
	 * if arr = {1,2,1,2,1,2,1,2,1,2,1,2}
	 * return the array {1,2,1,2,1,2}
	 * if arr = {5,6,7,8,9}
	 * return the array {}
	 * if arr = {5,6,7,5,7,6,8,5,9}
	 * return the array {}
	 */
	public static int[] longestRecurringSequence(int[] arr) {
		return null; //to be completed
	} //closing bracket for method - DO NOT REMOVE

	@Test 
	void testLongestRecurringSequence() {
		int[] a = {1,7,2,9,3,8,7,2,9,8,7,1,7,2,3,8,7,2,9,6,1,1,5,9};
		int[] b = {3,8,7,2,9};
		assertNotNull(Advanced.longestRecurringSequence(a));
		assertArrayEquals(b, Advanced.longestRecurringSequence(a));

		a = new int[]{1,2,1,2,1,2,1,2,1,2,1,2};
		b = new int[]{1,2,1,2,1,2,1,2,1,2};
		assertNotNull(Advanced.longestRecurringSequence(a));
		assertArrayEquals(b, Advanced.longestRecurringSequence(a));

		a = new int[]{5,6,7,8};
		b = new int[]{};
		assertNotNull(Advanced.longestRecurringSequence(a));
		assertArrayEquals(b, Advanced.longestRecurringSequence(a));

		a = new int[]{5,6,7,5,7,6,8,5,9};
		b = new int[]{5};
		assertNotNull(Advanced.longestRecurringSequence(a));
		assertArrayEquals(b, Advanced.longestRecurringSequence(a));
	}

}
