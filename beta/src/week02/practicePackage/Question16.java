package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question16 {
	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of the first n positive ODD integers (1+3+...+(2*n-1))
	 */
	public static int sumOddV1(int n) {
		return 0; //to be completed
	}
	
	@Test
	void testSumOddV1() {
		assertEquals(1, sumOddV1(1));
		assertEquals(100, sumOddV1(10));
		assertEquals(2500, sumOddV1(50));
	}
}
