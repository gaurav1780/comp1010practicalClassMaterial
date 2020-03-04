package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question18 {
	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of all positive odd integers up to, and including n  
	 * either (1+3+...+n) or (1+3+...+(n-1))
	 */
	public static int sumOddV2(int n) {
		return 0; //to be completed
	}
	
	@Test
	void testSumOddV2() {
		assertEquals(1, sumOddV2(1));
		assertEquals(25, sumOddV2(10));
		assertEquals(625, sumOddV2(50));	
	}
}
