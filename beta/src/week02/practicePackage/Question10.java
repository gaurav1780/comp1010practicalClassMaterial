package week02.practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question10 {
	/**
	 * 
	 * @param x
	 * @param y
	 * @return the quadrant in which coordinate (x, y) exists
	 * quadrant 1: non-negative x, non-negative y
	 * quadrant 2: negative x, non-negative y
	 * quadrant 3: negative x, negative y
	 * quadrant 4: non-negative x, negative y
	 * 
	 */
	public static int getQuadrant(int x, int y) {
		return 0; //to be completed
	}
	
	@Test
	//which Quadrant would 0,0 be?
	
	void testGetQuadrant() {
		assertEquals(1, getQuadrant(2,2));
		assertEquals(2, getQuadrant(-2,3));
		assertEquals(3, getQuadrant(-3,-4));
		assertEquals(4, getQuadrant(3,-3));
	}
}
