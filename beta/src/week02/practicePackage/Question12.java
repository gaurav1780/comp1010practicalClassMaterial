package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question12 {
	/**
	 * 
	 * @param val (assume val is more than or equal to zero)
	 * @return floor of val
	 * floor of a floating-point value is defined as the highest integer
	 * that is less than or equal to the value.
	 * For example, floor(4.2) = 4, floor(7.0) = 7, floor(5.9999) = 5
	 */
	public static int floor(double val) {
		return 0; //to be completed
	}

	@Test
	void testFloor() {
		assertEquals(1, floor(1.99));
		assertEquals(0, floor(0.75));
		assertEquals(7, floor(7.00));
		assertEquals(5, floor(5.9999));
		assertEquals(400, floor(400.001));
	}
}
