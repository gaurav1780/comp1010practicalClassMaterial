package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question17 {
	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of all positive even integers up to, and including n  
	 * either (2+4+...+n) or (2+4+...+(n-1))
	 */
	public static int sumEvenV2(int n) {
		return 0; //to be completed
	}
	
	@Test
	void testSumEvenV2() {
		assertEquals(0, sumEvenV2(1));
		assertEquals(30, sumEvenV2(10));
		assertEquals(650, sumEvenV2(50));
	}
}
