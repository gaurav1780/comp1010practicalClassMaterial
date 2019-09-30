package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question14 {
	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of the first n positive integers (1+2+...+n)
	 */
	public static int sum(int n) {
		return 0; //to be completed
	}
	
	@Test
	void testSum() {
		assertEquals(1, sum(1));
		assertEquals(55, sum(10));
		assertEquals(1275, sum(50));
	}
}
