package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question15 {
	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of the first n positive EVEN integers (2+4+...+(2*n))
	 */
	public static int sumEvenV1(int n) {
		return 0; //to be completed
	}
	
	@Test
	void testSumEvenV1() {
		assertEquals(2, sumEvenV1(1));
		assertEquals(110, sumEvenV1(10));
		assertEquals(2550, sumEvenV1(50));
	}
}
