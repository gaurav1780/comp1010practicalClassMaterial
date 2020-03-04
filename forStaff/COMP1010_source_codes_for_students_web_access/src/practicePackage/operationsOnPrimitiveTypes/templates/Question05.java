package practicePackage.operationsOnPrimitiveTypes.templates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question05 {
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return true if exactly two out of the three values are the same, false otherwise
	 */
	public static boolean twoOutOfThree(int a, int b, int c) {
		return false; //to be completed
	}
	
	@Test
	void testTwoOutOfThree() {
		assertTrue(twoOutOfThree(1,1,10));
		assertTrue(twoOutOfThree(1,10,10));
		assertTrue(twoOutOfThree(10,25,10));
		assertTrue(twoOutOfThree(0,0,-1));
		assertTrue(twoOutOfThree(-5,-5,5));
		assertTrue(twoOutOfThree(100,100,-100));
		assertFalse(twoOutOfThree(1,2,3));
		assertFalse(twoOutOfThree(0,0,0));
		assertFalse(twoOutOfThree(10000,-20,0));
		assertFalse(twoOutOfThree(-300,-300,-300));
		assertFalse(twoOutOfThree(-101,-20,-300));
		assertFalse(twoOutOfThree(-100,-100,-100));
		assertFalse(twoOutOfThree(250,250,250));
	}
}
