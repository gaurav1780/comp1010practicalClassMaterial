package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question26 {
	/**
	 * 
	 * @param n (assume n is more than 0)
	 * Cannot use Math library
	 * @return the highest perfect square (square of an integer) that is less than or equal to n
	 * for example, 
	 * highestPerfectSquare(20) = 16
	 * highestPerfectSquare(1) = 1
	 * highestPerfectSquare(278) = 256
	 * highestPerfectSquare(10000) = 10000
	 */
	public static int highestPerfectSquare(int n) {
		return 0; //to be completed
	}

	@Test
	void testHighestPerfectSquare() {
		assertEquals(16, highestPerfectSquare(20));
		assertEquals(1, highestPerfectSquare(1));
		assertEquals(256, highestPerfectSquare(278));
		assertEquals(1000000, highestPerfectSquare(1000000));
	}
}
