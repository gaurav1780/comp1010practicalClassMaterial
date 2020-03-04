package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question06 {
	/**
	 * 
	 * @param n
	 * @return the last digit of the number
	 * For example,
	 * lastDigit(15) = 5
	 * lastDigit(-15) = 5
	 * lastDigit(0) = 0
	 * lastDigit(8) = 8
	 */
	public static int lastDigit(int n) {
		return 0; //to be completed
	}
	
	@Test
	void testLastDigit() {
		assertEquals(0,lastDigit(0));
		assertEquals(8,lastDigit(8));
		assertEquals(5,lastDigit(15));
		assertEquals(5,lastDigit(-15));
		assertEquals(7,lastDigit(-1000007));
		assertEquals(4,lastDigit(1000004));
		assertEquals(5,lastDigit(5555));
	}
}
