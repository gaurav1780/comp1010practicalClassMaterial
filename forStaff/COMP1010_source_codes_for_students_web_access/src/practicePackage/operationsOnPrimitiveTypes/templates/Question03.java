package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question03 {
	/**
	 * 
	 * @param n
	 * @param low
	 * @param high (assume low is less than or equal to high)
	 * @return true if n is in the range [low...high], false otherwise
	 */
	public static boolean isInRange(int n, int low, int high) {
		return false; //to be completed
	}

	@Test
	void testIsInRange() {
		assertFalse(isInRange(7, 1, 6));

		assertTrue(isInRange(4, 1, 6));
		assertTrue(isInRange(-4, -10, -4));
		assertTrue(isInRange(-10, -10, -4));
		assertTrue(isInRange(-100, -100, -100));
		
		assertFalse(isInRange(0, 1, 6));
		assertFalse(isInRange(-11, -10, -4));
		assertFalse(isInRange(-3, -10, -4));
		assertFalse(isInRange(100, -100, -100));	
	}
}
