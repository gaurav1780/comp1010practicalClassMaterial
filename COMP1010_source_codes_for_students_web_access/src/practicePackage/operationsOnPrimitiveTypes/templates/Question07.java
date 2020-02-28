package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question07 {
	/**
	 * 
	 * @param a
	 * @param b
	 * @return the average of the two integers passed.
	 * for example,
	 * average(5, 9) = 7 (or 7.0)
	 * average(5, 8) = 6.5
	 */
	public static double average(int a, int b) {
		return 0; //to be completed
	}
	
	@Test
	void testAverage() {
		assertEquals(5,average(0,10));
		assertEquals(-20,average(-10,-30));
		assertEquals(0,average(0,0));
		assertEquals(12.5,average(10,15));
		assertEquals(0,average(-20,20));
		assertEquals(7.5,average(-5,20));
		assertEquals(-7.5,average(-20,5));
		assertEquals(4999.5,average(-1,10000));
		assertNotEquals(4,average(0,9));
		assertNotEquals(0,average(0,1));
	}
}
