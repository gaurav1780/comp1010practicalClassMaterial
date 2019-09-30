package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question19 {

	/**
	 * 
	 * @param n
	 * @return the product of the first n positive integers.
	 * for example, if n = 5, return 1*2*3*4*5 = 120
	 * return 1 if n < 1
	 */
	public static int product(int n) {
		return 0; //to be completed
	}

	@Test
	void testProduct() {
		assertEquals(120, product(5));
		assertEquals(1, product(1));
		assertEquals(1, product(0));
		assertEquals(1, product(-4));
		assertEquals(3628800, product(10));
	}
}
