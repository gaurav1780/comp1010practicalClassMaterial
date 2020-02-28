package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question04 {
	/**
	 * DO NOT use Math library
	 * @param a
	 * @param b
	 * @param c
	 * @return the highest of the three integers passed
	 */
	public static int highest(int a, int b, int c) {
		return 0; //to be completed
	}
	
	@Test
	void testHighest() {
		for(int i=1; i < 4; i++) {
			for(int k=1; k < 4; k++) {
				for(int p=1; p < 4; p++) {
					int expected = Math.max(Math.max(i, k), p);
					int actual = highest(i, k, p);
					assertEquals(expected, actual, "highest of "+i+", "+k+", "+p+" should be "+expected);
				}
			}
		}
	}
}
