package practicePackage.introduction.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.introduction.attempts.Stage1;

public class Stage1Test {
	protected practicePackage.introduction.attempts.Stage1 testObject;

	@BeforeEach
	public void run() {
		testObject = new practicePackage.introduction.attempts.Stage1();
	}
	
	@Test
	public void testSquare() {
		assertEquals(0, testObject.square(0));
		assertEquals(10000, testObject.square(100));
		assertEquals(121, testObject.square(-11));
		assertEquals(262144, testObject.square(512));
		int n = (int)(Math.random()*1000)-500;
		assertEquals(n*n, testObject.square(n), "Square of "+n+" expected to be "+(n*n)+" but was "+testObject.square(n));
	}
	
	@Test
	public void testCube() {
		assertEquals(125, testObject.cube(5));
		assertEquals(-125, testObject.cube(-5));
		assertEquals(1000000, testObject.cube(100));
		assertEquals(0, testObject.cube(0));
	}
	
	@Test
	public void testAverage() {
		assertEquals(1.4, testObject.average(1.2, 1.6), 0.001);
		assertEquals(-8.5, testObject.average(-9, -8), 0.001);
		assertEquals(0, testObject.average(-1.417, 1.417), 0.001);
	}
	
	@Test
	public void testLastDigit() {
		assertEquals(0, testObject.lastDigit(0));
		assertEquals(9, testObject.lastDigit(1729));
		assertEquals(7, testObject.lastDigit(2147483647));
	}	
	
	@Test
	public void testIsPositive() {
		assertTrue(testObject.isPositive(6));
		assertTrue(testObject.isPositive(12));
		assertFalse(testObject.isPositive(0));
		assertTrue(testObject.isPositive(10000000));
		assertFalse(testObject.isPositive(-7));
		assertFalse(testObject.isPositive(-1));
		assertFalse(testObject.isPositive(-10));
	}
	
	@Test
	public void testIsEven() {
		assertTrue(testObject.isEven(6));
		assertTrue(testObject.isEven(-12));
		assertTrue(testObject.isEven(0));
		assertTrue(testObject.isEven(10000000));
		assertFalse(testObject.isEven(7));
		assertFalse(testObject.isEven(-911));
		assertFalse(testObject.isEven(1010101));
	}
	
	@Test
	public void testHigher() {
		assertEquals(5, testObject.higher(2, 5));
		assertEquals(6, testObject.higher(6, 4));
		assertEquals(123014203, testObject.higher(123014203, 534535));
		assertEquals(56464234, testObject.higher(32342, 56464234));
		assertEquals(443554535, testObject.higher(443554535, 443554535));
	}
	
	@Test
	public void testEvenOne() {
		assertEquals(6, testObject.evenOne(6, 11));
		assertEquals(-12, testObject.evenOne(15, -12));
		assertEquals(-6, testObject.evenOne(-6, 11));
		assertEquals(-1234, testObject.evenOne(-1234, 1235));
		assertEquals(0, testObject.evenOne(-15, 0));
	}
	
	@Test
	public void testIsInRange() {
		assertTrue(testObject.isInRange(4, 1, 6));
		assertTrue(testObject.isInRange(-4, -10, -4));
		assertTrue(testObject.isInRange(-10, -10, -4));
		assertTrue(testObject.isInRange(-100, -100, -100));
		
		assertFalse(testObject.isInRange(7, 1, 6));
		assertFalse(testObject.isInRange(0, 1, 6));
		assertFalse(testObject.isInRange(-11, -10, -4));
		assertFalse(testObject.isInRange(-3, -10, -4));
		assertFalse(testObject.isInRange(100, -100, -100));	
	}
	
	@Test
	public void testHighest() {
		for(int i=1; i < 4; i++) {
			for(int k=1; k < 4; k++) {
				for(int p=1; p < 4; p++) {
					int expected = Math.max(Math.max(i, k), p);
					int actual = testObject.highest(i, k, p);
					assertEquals(expected, actual, "highest of "+i+", "+k+", "+p+" should be "+expected);
				}
			}
		}
	}
}
