package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question25 {
	/**
	 * this question is intentionally after areCoPrime.
	 * @param a
	 * @param b
	 * @return the highest integer that divides both a and b.
	 * for example, 
	 * gcd(70, 40) = 10
	 * gcd(-70, 40) = 10
	 * gcd(15, 32) = 1
	 * gcd(-51, 153) = 51
	 */
	public static int gcd(int a, int b) {
		return 0; //to be completed
	}
	
	@Test
	void testGcd() {
		assertEquals(10, gcd(70, 40));
		assertEquals(10, gcd(40, 70));
		assertEquals(1, gcd(15, 32));
		assertEquals(51, gcd(-51, 153));
		assertEquals(100, gcd(100, 10000));
	}
}
