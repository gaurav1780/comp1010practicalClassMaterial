package practicePackage.recursion.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.recursion.attempts.Stage2;

public class Stage2Test {
	protected Stage2 testObject;

	@BeforeEach
	public void run() {
		testObject = new Stage2();
	}

	@Test
	public void testCountDigits() {
		assertEquals(0, testObject.countDigits(0));
		assertEquals(1, testObject.countDigits(8));
		assertEquals(4, testObject.countDigits(1729));
		assertEquals(4, testObject.countDigits(-1729));
		assertEquals(5, testObject.countDigits(80264));
		assertEquals(5, testObject.countDigits(-80264));
	}

	@Test
	public void testSumEvenDigits() {
		assertEquals(2, testObject.sumEvenDigits(1729));
		assertEquals(2, testObject.sumEvenDigits(-1729));
		assertEquals(0, testObject.sumEvenDigits(1739));
		assertEquals(0, testObject.sumEvenDigits(-1739));
		assertEquals(20, testObject.sumEvenDigits(80264));
		assertEquals(20, testObject.sumEvenDigits(-80264));
	}

	@Test
	public void testSumDigitsOver() {
		assertEquals(16, testObject.sumDigitsOver(1729, 3));
		assertEquals(18, testObject.sumDigitsOver(-1729, 1));
		assertEquals(0, testObject.sumDigitsOver(1739, 9));
		assertEquals(20, testObject.sumDigitsOver(8264, 0));
		assertEquals(8, testObject.sumDigitsOver(-80264, 7));
	}

	@Test
	public void testCountDigit() {
		assertEquals(0, testObject.countDigit(0, 0));
		assertEquals(1, testObject.countDigit(8, 8));
		assertEquals(0, testObject.countDigit(8, 5));
		assertEquals(2, testObject.countDigit(1721, 1));
		assertEquals(2, testObject.countDigit(-1721, 1));
		assertEquals(3, testObject.countDigit(888, 8));
		assertEquals(3, testObject.countDigit(-888, 8));
	}

	@Test
	public void testProduct() {
		assertEquals(18, testObject.product(2, 9));
		assertEquals(1500, testObject.product(30, 50));
		assertEquals(200, testObject.product(2, 100));
		assertEquals(61, testObject.product(61, 1));
	}

	@Test
	public void testFibonacci() {
		assertEquals(0, testObject.fibonacci(0));
		assertEquals(1, testObject.fibonacci(1));
		assertEquals(5, testObject.fibonacci(5));
		assertEquals(8, testObject.fibonacci(6));
		assertEquals(21, testObject.fibonacci(8));
	}

	@Test
	public void testTribonacci() {
		assertEquals(0, testObject.tribonacci(0));
		assertEquals(0, testObject.tribonacci(1));
		assertEquals(1, testObject.tribonacci(2));
		assertEquals(1, testObject.tribonacci(3));
		assertEquals(2, testObject.tribonacci(4));
		assertEquals(4, testObject.tribonacci(5));
		assertEquals(7, testObject.tribonacci(6));
		assertEquals(13, testObject.tribonacci(7));
	}
	
	@Test
	public void testCombinations() {
		assertEquals(1, testObject.combinations(5, 0));
		assertEquals(1, testObject.combinations(2, 2));
		assertEquals(10, testObject.combinations(5, 3));
		assertEquals(120, testObject.combinations(10, 7));
	}		
}
