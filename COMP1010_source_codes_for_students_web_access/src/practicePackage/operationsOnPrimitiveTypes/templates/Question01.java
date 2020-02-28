package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question01 {
	/**
	 * 
	 * @param n
	 * @return true if n is even (divisible by 2), false otherwise
	 */
	public static boolean isEven(int n) {
		return false; //to be completed
	}
	
	@Test
	void testIsEven() {
		assertTrue(isEven(6));
		assertTrue(isEven(-12));
		assertTrue(isEven(0));
		assertTrue(isEven(10000000));
		assertFalse(isEven(7));
		assertFalse(isEven(-911));
		assertFalse(isEven(1010101));
	}
}
