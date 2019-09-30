package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question08 {
	/**
	 * 
	 * @param n
	 * @return the absolute value for n.
	 * absolute value is defined as the number without the negative sign, if any
	 * For example, absolute(-6) = 6, absolute(9) = 9
	 */
	public static int absolute(int n) {
		return 0; //to be completed
	}

	@Test
	void testAbsolute() {
		assertEquals(10, absolute(10));
		assertEquals(10, absolute(-10));
		assertEquals(0, absolute(0));
		assertEquals(1237, absolute(-1237));
	}
}
