package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question29 {
	/**
	 * 
	 * @param val (can be positive or zero or negative)
	 * @return floor of val
	 * floor of a floating-point value is defined as the highest integer
	 * that is less than or equal to the value.
	 * For example, floorAdvanced(4.2) = 4, floorAdvanced(7.0) = 7,
	 * floorAdvanced(5.9999) = 5, floorAdvanced(-3.7) = -4
	 */
	public static int floorAdvanced(double val) {
		return 0; //to be completed
	}

	@Test
	void testFloorAdvanced() {
		assertEquals(1, floorAdvanced(1.99));
		assertEquals(0, floorAdvanced(0.75));
		assertEquals(7, floorAdvanced(7.00));
		assertEquals(5, floorAdvanced(5.9999));
		assertEquals(-4, floorAdvanced(-3.7));
		assertEquals(-4, floorAdvanced(-3.1));
		assertEquals(-6, floorAdvanced(-6));
		assertEquals(400, floorAdvanced(400.001));
		assertEquals(-500, floorAdvanced(-499.99999));
	}
}
