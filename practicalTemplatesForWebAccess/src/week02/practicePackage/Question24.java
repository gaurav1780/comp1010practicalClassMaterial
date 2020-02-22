package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question24 {
	/**
	 * fibonacci sequence begins with a 0 and 1
	 * and each term is the sum of previous two terms.
	 * so 
	 * fibonacci(0) = 0,
	 * fibonacci(1) = 1,
	 * fibonacci(2) = 1,
	 * fibonacci(3) = 2,
	 * fibonacci(4) = 3,
	 * fibonacci(5) = 5,
	 * fibonacci(6) = 8,
	 * fibonacci(7) = 13,
	 * 
	 * @param n (assume n is more than or equal to 0)
	 * @return fibonacci(n)
	 */
	public static int fibonacci(int n) {
		return 0; //to be completed
	}
	
	@Test
	void testFibonacci() {
		assertEquals(0, fibonacci(0));
		assertEquals(1, fibonacci(1));
		assertEquals(5, fibonacci(5));
		assertEquals(8, fibonacci(6));
		assertEquals(34, fibonacci(9));
		assertEquals(9227465, fibonacci(35));
	}
}
