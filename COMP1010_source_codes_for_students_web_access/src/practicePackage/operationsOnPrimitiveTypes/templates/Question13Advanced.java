package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question13Advanced {
	/**
	 * 
	 * @param val (val can be positive or zero or negative)
	 * @return ceiling of val
	 * ceiling of a floating-point value is defined as the smallest integer
	 * that is more than or equal to the value.
	 * For example, ceiling(4.2) = 5, ceiling(7.0) = 7,
	 * ceiling(5.9999) = 6, ceiling(-3.7) = -3
	 */
	public static int ceilingAdvanced(double val) {
		return 0; //to be completed
	}
	
	@Test
	void testCeiling() {
		assertEquals(5, ceilingAdvanced(4.2));
		assertEquals(7, ceilingAdvanced(7.0));
		assertEquals(6, ceilingAdvanced(5.999));
		assertEquals(-3, ceilingAdvanced(-3.7));
		assertEquals(-3, ceilingAdvanced(-3.1));
		assertEquals(-3, ceilingAdvanced(-3));
		assertEquals(0, ceilingAdvanced(0.0));
		assertEquals(0, ceilingAdvanced(-0.99));
	}
}
