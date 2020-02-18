package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question11 {
	/**
	 * 
	 * @param val (assume val is more than or equal to zero)
	 * @return val rounded to the nearest integer.
	 */
	public static int roundOff(double val) {
		return 0; //to be completed
	}

	@Test
	void testRoundOff() {
		assertEquals(2, roundOff(1.99));
		assertEquals(1, roundOff(1.49));
		assertEquals(1, roundOff(0.75));
		assertEquals(7, roundOff(7.0));
		assertEquals(6, roundOff(5.9999));
		assertEquals(401, roundOff(400.5));
		assertEquals(0, roundOff(0.001));
	}
}
