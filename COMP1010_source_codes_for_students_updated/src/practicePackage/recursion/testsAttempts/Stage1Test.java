package practicePackage.recursion.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.recursion.attempts.Stage1;

public class Stage1Test  {
	protected Stage1 testObject;

	@BeforeEach
	public void run() {
		testObject = new Stage1();
	}
	
	@Test
	public void testSum() {
		assertEquals(0, testObject.sum(0));
		assertEquals(0, testObject.sum(-5));
		assertEquals(6, testObject.sum(3));	
	}

	@Test
	public void testSumRange() {
		assertEquals(0, testObject.sumRange(0, 0));
		assertEquals(20, testObject.sumRange(20, 20));
		assertEquals(0, testObject.sumRange(20, 10));
		assertEquals(26, testObject.sumRange(5, 8));
		assertEquals(55, testObject.sumRange(1, 10));
	}

	@Test
	public void testProduct() {
		assertEquals(1, testObject.product(0));
		assertEquals(1, testObject.product(-5));
		assertEquals(120, testObject.product(5));	
	}

	@Test
	public void testSumSquares() {
		assertEquals(0, testObject.sumSquares(0));
		assertEquals(0, testObject.sumSquares(-5));
		assertEquals(14, testObject.sumSquares(3));	
	}

	@Test
	public void testSumEven() {
		assertEquals(0, testObject.sumEven(0));
		assertEquals(0, testObject.sumEven(-5));
		assertEquals(2, testObject.sumEven(3));	
		assertEquals(6, testObject.sumEven(4));	
	}

	@Test
	public void testSumOdd() {
		assertEquals(0, testObject.sumOdd(0));
		assertEquals(0, testObject.sumOdd(-5));
		assertEquals(4, testObject.sumOdd(3));	
		assertEquals(4, testObject.sumOdd(4));	
		assertEquals(9, testObject.sumOdd(5));	
	}

	@Test
	public void testSumEvenSquares() {
		assertEquals(0, testObject.sumEvenSquares(0));
		assertEquals(0, testObject.sumEvenSquares(-5));
		assertEquals(20, testObject.sumEvenSquares(5));	
		assertEquals(56, testObject.sumEvenSquares(7));	
		assertEquals(120, testObject.sumEvenSquares(8));	
	}

	@Test
	public void testContainsDigit() {
		assertFalse(testObject.containsDigit(null));
		assertFalse(testObject.containsDigit(""));
		assertTrue(testObject.containsDigit("c3po"));
		assertTrue(testObject.containsDigit("90210"));
		assertTrue(testObject.containsDigit("4chan"));
		assertFalse(testObject.containsDigit("superman"));
		assertFalse(testObject.containsDigit("no digits here :("));
	}

	@Test
	public void testIsNumeric() {
		assertFalse(testObject.isNumeric(null));
		assertTrue(testObject.isNumeric(""));
		assertFalse(testObject.isNumeric("c3po"));
		assertTrue(testObject.isNumeric("90210"));
		assertTrue(testObject.isNumeric("0"));
		assertTrue(testObject.isNumeric("4057342587835373489543479354573967546947644293853429569365934"));
		assertFalse(testObject.isNumeric("4chan"));
		assertFalse(testObject.isNumeric("superman"));
		assertFalse(testObject.isNumeric("no digits here :("));
	}

	@Test
	public void testContainsStringChar() {
		assertFalse(testObject.contains(null, '$'));
		assertFalse(testObject.contains("", '$'));
		assertFalse(testObject.contains("superman", 'N')); //upper case
		assertTrue(testObject.contains("superman", 'n'));
		assertTrue(testObject.contains("superman", 's'));
		assertTrue(testObject.contains("the quick brown fox jumped over something", 'x'));
		assertFalse(testObject.contains("the quick brown fox jumped over something", 'z'));
	}

	@Test
	public void testContainsStringString() {
		assertFalse(testObject.contains(null, "super"));
		assertFalse(testObject.contains("", "super"));
		assertFalse(testObject.contains("hi", null));
		assertFalse(testObject.contains("superman", "MAN")); //upper case
		assertTrue(testObject.contains("superman", "man"));
		assertTrue(testObject.contains("Trinity? THE Trinity!?", "Trinity"));
		assertFalse(testObject.contains("Trinity? THE Trinity!?", "night"));
	}

	@Test
	public void testSumOddSquares() {
		assertEquals(0, testObject.sumOddSquares(0));
		assertEquals(0, testObject.sumOddSquares(-5));
		assertEquals(10, testObject.sumOddSquares(4));	
		assertEquals(35, testObject.sumOddSquares(6));	
		assertEquals(84, testObject.sumOddSquares(7));	
	}

	@Test
	public void testPower() {
		assertEquals(4, testObject.power(2, 2));	
		assertEquals(4, testObject.power(-2, 2));	
		assertEquals(8, testObject.power(2, 3));	
		assertEquals(-8, testObject.power(-2, 3));	
		assertEquals(1, testObject.power(4, 0));	
		assertEquals(6561, testObject.power(3, 8));	
	}
}
