package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import recursionPracticeProject.Stage2;

class Stage2Test {

	@Test
	void testCountDigits() {
		fail("Not yet implemented");
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
		fail("Not yet implemented");
	}

	@Test
	void testCountDigit() {
		fail("Not yet implemented");
	}

	@Test
	void testFibonacci() {
		fail("Not yet implemented");
	}

	@Test
	void testTribonacci() {
		fail("Not yet implemented");
	}

}
