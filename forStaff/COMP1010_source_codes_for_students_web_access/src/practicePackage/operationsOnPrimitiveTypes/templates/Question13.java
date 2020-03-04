package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question13 {
	/**
	 * 
	 * @param val (assume val is more than or equal to zero)
	 * @return ceiling of val
	 * ceiling of a floating-point value is defined as the smallest integer
	 * that is more than or equal to the value.
	 * For example, ceiling(4.2) = 5, ceiling(7.0) = 7,
	 * ceiling(5.9999) = 6, ceiling(-3.7) = -3
	 */
	public static int ceiling(double val) {
		return 0; //to be completed
	}
	
	@Test
	void testCeiling() {
		assertEquals(5, ceiling(4.2));
		assertEquals(7, ceiling(7.0));
		assertEquals(6, ceiling(5.999));
		assertEquals(0, ceiling(0.0));
	}
}
