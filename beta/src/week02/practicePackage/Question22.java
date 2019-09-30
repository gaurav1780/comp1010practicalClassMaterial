package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question22 {
	
	/**
	 * 
	 * @param n
	 * @return the number of digits in n.
	 * For example, 
	 * if n = 5, return 1.
	 * if n = 18, return 2.
	 * if n = 20478, return 5.
	 * 
	 * Noet: return 0 if n is less than or equal to 0.
	 */
	public static int countDigits(int n) {
		return 0; //to be completed
	}
	
	@Test
	void testCountDigits() {
		assertEquals(0, countDigits(0));
		assertEquals(1, countDigits(5));
		assertEquals(2, countDigits(18));
		assertEquals(7, countDigits(2147483));
	}
}
