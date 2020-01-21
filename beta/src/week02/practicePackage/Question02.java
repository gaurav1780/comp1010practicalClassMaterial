package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question02 {
	/**
	 * assumption: one of the two values passed is even, other is odd
	 * 
	 * @param a
	 * @param b
	 * @return the value that is even
	 */
	public static int evenOne(int a, int b) {
		return 0; //to be completed
	}
	
	@Test
	void testEvenOne() {
		assertEquals(6, evenOne(6, 11));
		assertEquals(-12, evenOne(15, -12));
		assertEquals(-6, evenOne(-6, 11));
		assertEquals(-1234, evenOne(-1234, 1235));
		assertEquals(0, evenOne(-15, 0));
	}
}
