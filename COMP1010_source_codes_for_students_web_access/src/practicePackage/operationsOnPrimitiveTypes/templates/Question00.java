package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question00 {
	/**
	 * 
	 * @param n
	 * @return true if n is positive (more than 0), false otherwise
	 */
	public static boolean isPositive(int n) {
		return false; //to be completed
	}
	
	@Test
	void testIsPositive() {
		assertTrue(isPositive(6));
		assertTrue(isPositive(12));
		assertFalse(isPositive(0));
		assertTrue(isPositive(10000000));
		assertFalse(isPositive(-7));
		assertFalse(isPositive(-1));
		assertFalse(isPositive(-10));
	}
}
