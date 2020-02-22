package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question20 {
	
	/**
	 * 
	 * @param n
	 * @return the product of the first n positive even integers.
	 * for example, if n = 5, return 2*4*6*8*10 = 3840
	 * return 1 if n < 1
	 */
	public static int productEven(int n) {
		return 0; //to be completed
	}
	
	@Test
	void testProductEven() {
		assertEquals(3840, productEven(5));
		assertEquals(2, productEven(1));
		assertEquals(1, productEven(0));
		assertEquals(1, productEven(-4));
		assertEquals(46080, productEven(6));
	}
}
