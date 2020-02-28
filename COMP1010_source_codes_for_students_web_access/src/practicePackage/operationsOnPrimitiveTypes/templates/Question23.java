package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question23 {
	
	/**
	 * 
	 * @param x
	 * @param n (assume n is more than or equal to 0)
	 * @return x to the power of n without using Math library
	 */
	public static int power(int x, int n) {
		return 0; //to be completed
	}
	
	@Test
	void testPower() {
		assertEquals(1, power(-5, 0));
		assertEquals(-12, power(-12, 1));
		assertEquals(9, power(-3, 2));
		assertEquals(1024, power(-2, 10));
		assertEquals(-2048, power(-2, 11));
	}
}
