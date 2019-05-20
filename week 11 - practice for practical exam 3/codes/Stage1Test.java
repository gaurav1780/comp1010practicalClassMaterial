package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import recursionPracticeProject.Stage1;

class Stage1Test {

	@Test
	void testSum() {
		assertEquals(0, Stage1.sum(0));
		assertEquals(0, Stage1.sum(-5));
		assertEquals(6, Stage1.sum(3));
	}

	@Test
	void testProduct() {
		fail("Not yet implemented");
	}

	@Test
	void testSumSquares() {
		assertEquals(0, Stage1.sumSquares(0));
		assertEquals(0, Stage1.sumSquares(-5));
		assertEquals(14, Stage1.sumSquares(3));
	}

	@Test
	void testSumEven() {
		fail("Not yet implemented");
	}

	@Test
	void testSumOdd() {
		fail("Not yet implemented");
	}

	@Test
	void testPower() {
		fail("Not yet implemented");
	}

	@Test
	void testPowerV2() {
		fail("Not yet implemented");
	}

}
