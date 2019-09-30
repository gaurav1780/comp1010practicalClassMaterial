package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question04Advanced {
	/**
	 * DO NOT use Math library
	 * @param a
	 * @param b
	 * @param c
	 * @return the median of the three integers passed 
	 * (the value that is in the middle when the three are arranged in ascending order) 
	 */
	public static int median(int a, int b, int c) {
		return 0; //to be completed
	}

	@Test
	void testHighest() {
		assertEquals(2, median(2, 2, 8));
		assertEquals(5, median(5, 2, 5));
		assertEquals(7, median(2, 7, 7));
		assertEquals(8, median(8, 8, 8));
		assertEquals(2, median(2, 1, 8));
		assertEquals(3, median(5, 2, 3));
		assertEquals(7, median(9, 7, 2));
		assertEquals(7, median(2, 7, 9));
	}
}
