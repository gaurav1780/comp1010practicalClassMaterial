package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question09 {
	
	/**
	 * 
	 * @param val
	 * @param low
	 * @param high (assume low is less than or equal to high)
	 * @return value val constrained between low and high.
	 * that is,
	 * 
	 * if val is less than low, return low
	 * if val is more than high, return high
	 * in all other cases, return val
	 */
	public static int constrain(int val, int low, int high) {
		return 0; //to be completed
	}
	
	@Test
	void testConstrain() {
		assertEquals(10, constrain(0,10,20));
		assertEquals(20, constrain(30,10,20));
		assertEquals(15, constrain(15,10,20));
		assertEquals(-10, constrain(0,-20,-10));
		assertEquals(0, constrain(0,0,0));
		assertEquals(40,constrain(10,40,50));
		assertEquals(0, constrain(0,-10,10));
		assertEquals(-10, constrain(-10,-15,-5));
	}
}
