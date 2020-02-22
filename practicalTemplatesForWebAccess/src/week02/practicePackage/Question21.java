package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question21 {
	
	/**
	 * 
	 * @param n
	 * @return the productOdd of the first n odd positive integers.
	 * for example, if n = 5, return 1*3*5*7*9 = 945
	 * return 1 if n < 1
	 */
	public static int productOdd(int n) {
		return 0; //to be completed
	}
	
	@Test
	void testProductOdd() {
		assertEquals(945, productOdd(5));
		assertEquals(1, productOdd(1));
		assertEquals(1, productOdd(0));
		assertEquals(1, productOdd(-4));
		assertEquals(135135, productOdd(7));
	}
}
