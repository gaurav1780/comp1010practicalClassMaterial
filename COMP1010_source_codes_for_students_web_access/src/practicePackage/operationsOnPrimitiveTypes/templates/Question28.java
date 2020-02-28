package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question28 {
	/**
	 * 
	 * @param val (val could be positive or zero or negative)
	 * @return val rounded to the nearest integer.
	 */
	public static int roundOffAdvanced(double val) {
		return 0; //to be completed
	}

	@Test
	void testRoundOffAdvanced() {
		assertEquals(2, roundOffAdvanced(1.99));
		assertEquals(-2, roundOffAdvanced(-1.99));
		assertEquals(1, roundOffAdvanced(1.49));
		assertEquals(-1, roundOffAdvanced(-1.49));
		assertEquals(1, roundOffAdvanced(0.75));
		assertEquals(7, roundOffAdvanced(7.0));
		assertEquals(6, roundOffAdvanced(5.9999));
		assertEquals(401, roundOffAdvanced(400.5));
		assertEquals(-1, roundOffAdvanced(-0.501));
	}
}
