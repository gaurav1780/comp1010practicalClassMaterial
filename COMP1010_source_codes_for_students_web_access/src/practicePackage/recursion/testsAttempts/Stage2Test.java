package practicePackage.recursion.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practicePackage.recursion.attempts.Stage2;

class Stage2Test {

	@Test
	void testCountDigits() {
		assertEquals(0, Stage2.countDigits(0));
		assertEquals(1, Stage2.countDigits(8));
		assertEquals(4, Stage2.countDigits(1729));
		assertEquals(4, Stage2.countDigits(-1729));
		assertEquals(5, Stage2.countDigits(80264));
		assertEquals(5, Stage2.countDigits(-80264));
	}

	@Test
	void testSumEvenDigits() {
		assertEquals(2, Stage2.sumEvenDigits(1729));
		assertEquals(2, Stage2.sumEvenDigits(-1729));
		assertEquals(0, Stage2.sumEvenDigits(1739));
		assertEquals(0, Stage2.sumEvenDigits(-1739));
		assertEquals(20, Stage2.sumEvenDigits(80264));
		assertEquals(20, Stage2.sumEvenDigits(-80264));
	}

	@Test
	void testSumDigitsOver() {
		assertEquals(16, Stage2.sumDigitsOver(1729, 3));
		assertEquals(18, Stage2.sumDigitsOver(-1729, 1));
		assertEquals(0, Stage2.sumDigitsOver(1739, 9));
		assertEquals(20, Stage2.sumDigitsOver(8264, 0));
		assertEquals(8, Stage2.sumDigitsOver(-80264, 7));
	}

	@Test
	void testCountDigit() {
		assertEquals(0, Stage2.countDigit(0, 0));
		assertEquals(1, Stage2.countDigit(8, 8));
		assertEquals(0, Stage2.countDigit(8, 5));
		assertEquals(2, Stage2.countDigit(1721, 1));
		assertEquals(2, Stage2.countDigit(-1721, 1));
		assertEquals(3, Stage2.countDigit(888, 8));
		assertEquals(3, Stage2.countDigit(-888, 8));
	}

	@Test
	void testProduct() {
		assertEquals(18, Stage2.product(2, 9));
		assertEquals(1500, Stage2.product(30, 50));
		assertEquals(200, Stage2.product(2, 100));
		assertEquals(61, Stage2.product(61, 1));
	}
	
	@Test
	void testFibonacci() {
		assertEquals(0, Stage2.fibonacci(0));
		assertEquals(1, Stage2.fibonacci(1));
		assertEquals(5, Stage2.fibonacci(5));
		assertEquals(8, Stage2.fibonacci(6));
		assertEquals(21, Stage2.fibonacci(8));
	}

	@Test
	void testTribonacci() {
		assertEquals(0, Stage2.tribonacci(0));
		assertEquals(0, Stage2.tribonacci(1));
		assertEquals(1, Stage2.tribonacci(2));
		assertEquals(1, Stage2.tribonacci(3));
		assertEquals(2, Stage2.tribonacci(4));
		assertEquals(4, Stage2.tribonacci(5));
		assertEquals(7, Stage2.tribonacci(6));
		assertEquals(13, Stage2.tribonacci(7));
	}

}
