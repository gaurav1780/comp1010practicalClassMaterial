package practicePackage.introduction.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.introduction.attempts.Stage4;

public class Stage4Test {
	protected practicePackage.introduction.attempts.Stage4 testObject;

	@BeforeEach
	public void run() {
		testObject = new practicePackage.introduction.attempts.Stage4();
	}
	
	@Test
	void testIndexOf() {
		assertEquals(0, testObject.indexOf(new int[] {10,10,10}, 10));
		assertEquals(2, testObject.indexOf(new int[] {10,10,20}, 20));
		assertEquals(-1, testObject.indexOf(new int[] {10,10,20}, 30));
		assertEquals(8, testObject.indexOf(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, 9));
	}
	
	@Test
	void testlastIndexOf() {
		assertEquals(2, testObject.lastIndexOf(new int[] {10,10,10}, 10));
		assertEquals(0, testObject.lastIndexOf(new int[] {20,10,10}, 20));
		assertEquals(-1, testObject.lastIndexOf(new int[] {10,10,20}, 30));
		assertEquals(8, testObject.lastIndexOf(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, 9));
	}
	
	@Test
	void testFibonacci() {
		assertEquals(0, testObject.fibonacci(0));
		assertEquals(1, testObject.fibonacci(1));
		assertEquals(5, testObject.fibonacci(5));
		assertEquals(8, testObject.fibonacci(6));
		assertEquals(34, testObject.fibonacci(9));
		assertEquals(9227465, testObject.fibonacci(35));
	}
	
	@Test
	void testGcd() {
		assertEquals(10, testObject.gcd(70, 40));
		assertEquals(10, testObject.gcd(40, 70));
		assertEquals(1, testObject.gcd(15, 32));
		assertEquals(51, testObject.gcd(-51, 153));
		assertEquals(100, testObject.gcd(100, 10000));
	}
	
	@Test
	void testHighestPerfectSquare() {
		assertEquals(16, testObject.highestPerfectSquare(20));
		assertEquals(1, testObject.highestPerfectSquare(1));
		assertEquals(256, testObject.highestPerfectSquare(278));
		assertEquals(1000000, testObject.highestPerfectSquare(1000000));
	}
	
	@Test
	void testMedian() {
		assertEquals(2, testObject.median(2, 2, 8));
		assertEquals(5, testObject.median(5, 2, 5));
		assertEquals(7, testObject.median(2, 7, 7));
		assertEquals(8, testObject.median(8, 8, 8));
		assertEquals(2, testObject.median(2, 1, 8));
		assertEquals(3, testObject.median(5, 2, 3));
		assertEquals(7, testObject.median(9, 7, 2));
		assertEquals(7, testObject.median(2, 7, 9));
		assertEquals(831325, testObject.median(831325, 725353, 9345363));
	}
	
	@Test
	void testRoundOffAdvanced() {
		assertEquals(2, testObject.roundOffAdvanced(1.99));
		assertEquals(-2, testObject.roundOffAdvanced(-1.99));
		assertEquals(1, testObject.roundOffAdvanced(1.49));
		assertEquals(-1, testObject.roundOffAdvanced(-1.49));
		assertEquals(1, testObject.roundOffAdvanced(0.75));
		assertEquals(7, testObject.roundOffAdvanced(7.0));
		assertEquals(6, testObject.roundOffAdvanced(5.9999));
		assertEquals(401, testObject.roundOffAdvanced(400.5));
		assertEquals(-1, testObject.roundOffAdvanced(-0.501));
	}
	
	@Test
	void testFloorAdvanced() {
		assertEquals(1, testObject.floorAdvanced(1.99));
		assertEquals(0, testObject.floorAdvanced(0.75));
		assertEquals(7, testObject.floorAdvanced(7.00));
		assertEquals(5, testObject.floorAdvanced(5.9999));
		assertEquals(-4, testObject.floorAdvanced(-3.7));
		assertEquals(-4, testObject.floorAdvanced(-3.1));
		assertEquals(400, testObject.floorAdvanced(400.001));
		assertEquals(-500, testObject.floorAdvanced(-499.99999));
	}
	
	@Test
	void testCeilingAdvanced() {
		assertEquals(5, testObject.ceilingAdvanced(4.2));
		assertEquals(7, testObject.ceilingAdvanced(7.0));
		assertEquals(6, testObject.ceilingAdvanced(5.999));
		assertEquals(-3, testObject.ceilingAdvanced(-3.7));
		assertEquals(-3, testObject.ceilingAdvanced(-3.1));
		assertEquals(0, testObject.ceilingAdvanced(0.0));
		assertEquals(0, testObject.ceilingAdvanced(-0.99));
	}
	
	@Test
	void testGetWithout() {
		assertEquals("super", testObject.getWithout("super", -1)); //no change
		assertEquals("super", testObject.getWithout("super", 5)); //no change
		assertEquals("uper", testObject.getWithout("super", 0));
		assertEquals("supe", testObject.getWithout("super", 4));
		assertEquals("sper", testObject.getWithout("super", 1));
		assertEquals("suer", testObject.getWithout("super", 2));
		assertEquals("a b cd ", testObject.getWithout("a b c d ", 5));
	}
	
	@Test
	void testIsNumeric() {
		assertTrue(testObject.isNumeric("1234567890"));
		assertTrue(testObject.isNumeric("34038459308572893457549637966556"));
		assertFalse(testObject.isNumeric("a234567890"));
		assertFalse(testObject.isNumeric("123456789a"));
		assertFalse(testObject.isNumeric("01234-67890"));
		assertTrue(testObject.isNumeric("340753287585732985735923659364572365139576329563578326583756328573265872635873658376587356387563875365873"));
		assertFalse(testObject.isNumeric("340753287585732985735923659364572365139576329563578326583756328573265872635873658376587356387%563875365873"));
	}	
	
	@Test
	void testWithoutLeadingZeroes() {
		assertEquals("7", testObject.withoutLeadingZeroes("007"));
		assertEquals("", testObject.withoutLeadingZeroes(""));
		assertEquals("COMP1010", testObject.withoutLeadingZeroes("0COMP1010"));
		assertEquals("COMP1010 is the best unit ever! 000000000000", testObject.withoutLeadingZeroes("COMP1010 is the best unit ever! 000000000000"));
		assertEquals("", testObject.withoutLeadingZeroes("000000000000000000000000000"));
	}
	
	@Test
	void testReverse() {
		assertEquals("", testObject.reverse(""));
		assertEquals("$", testObject.reverse("$"));
		assertEquals("Super nintendo chalmers", testObject.reverse("sremlahc odnetnin repuS"));
	}
	
	@Test
	void testIsPalindrome() {
		assertTrue(testObject.isPalindrome("madam"));
		assertFalse(testObject.isPalindrome("reaper"));
		assertTrue(testObject.isPalindrome("nintendo odnetnin"));
		assertTrue(testObject.isPalindrome(""));
		assertTrue(testObject.isPalindrome("%"));
	}	
}
