package practicePackage.introduction.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.introduction.attempts.Stage3;

public class Stage3Test {
	protected practicePackage.introduction.attempts.Stage3 testObject;

	@BeforeEach
	public void run() {
		testObject = new practicePackage.introduction.attempts.Stage3();
	}

	@Test
	public void testSum() {
		assertEquals(1, testObject.sum(1));
		assertEquals(55, testObject.sum(10));
		assertEquals(1275, testObject.sum(50));
	}

	@Test
	public void testSumEvenV1() {
		assertEquals(2, testObject.sumEvenV1(1));
		assertEquals(110, testObject.sumEvenV1(10));
		assertEquals(2550, testObject.sumEvenV1(50));
	}

	@Test
	public void testSumOddV1() {
		assertEquals(1, testObject.sumOddV1(1));
		assertEquals(100, testObject.sumOddV1(10));
		assertEquals(2500, testObject.sumOddV1(50));
	}

	@Test
	public void testSumEvenV2() {
		assertEquals(0, testObject.sumEvenV2(1));
		assertEquals(30, testObject.sumEvenV2(10));
		assertEquals(650, testObject.sumEvenV2(50));
	}

	@Test
	public void testSumOddV2() {
		assertEquals(1, testObject.sumOddV2(1));
		assertEquals(25, testObject.sumOddV2(10));
		assertEquals(625, testObject.sumOddV2(50));	
	}

	@Test
	public void testProduct() {
		assertEquals(120, testObject.product(5));
		assertEquals(1, testObject.product(1));
		assertEquals(1, testObject.product(0));
		assertEquals(1, testObject.product(-4));
		assertEquals(3628800, testObject.product(10));
	}

	@Test
	public void testProductEven() {
		assertEquals(3840, testObject.productEven(5));
		assertEquals(2, testObject.productEven(1));
		assertEquals(1, testObject.productEven(0));
		assertEquals(1, testObject.productEven(-4));
		assertEquals(46080, testObject.productEven(6));
	}

	@Test
	public void testProductOdd() {
		assertEquals(945, testObject.productOdd(5));
		assertEquals(1, testObject.productOdd(1));
		assertEquals(1, testObject.productOdd(0));
		assertEquals(1, testObject.productOdd(-4));
		assertEquals(135135, testObject.productOdd(7));
	}

	@Test
	public void testCountDigits() {
		assertEquals(0, testObject.countDigits(0));
		assertEquals(1, testObject.countDigits(5));
		assertEquals(2, testObject.countDigits(18));
		assertEquals(7, testObject.countDigits(2147483));
	}

	@Test
	public void testPower() {
		assertEquals(1, testObject.power(-5, 0));
		assertEquals(-12, testObject.power(-12, 1));
		assertEquals(9, testObject.power(-3, 2));
		assertEquals(1024, testObject.power(-2, 10));
		assertEquals(-2048, testObject.power(-2, 11));
	}

	@Test
	public void testSumIntArray() {
		assertEquals(190, testObject.sum(new int[] {10,70,20,90}));
		assertEquals(0, testObject.sum(new int[] {})); //empty array
		assertEquals(0, testObject.sum(new int[] {-50,50})); 
		assertEquals(100, testObject.sum(new int[] {100})); 
	}

	@Test
	public void testSumEvenIntArray() {
		assertEquals(150, testObject.sumEven(new int[] {10,70,-20,90}));
		assertEquals(0, testObject.sumEven(new int[] {11,73,-29,95}));
		assertEquals(0, testObject.sumEven(new int[] {})); //empty array
		assertEquals(0, testObject.sumEven(new int[] {-50,50})); 
		assertEquals(30, testObject.sumEven(new int[] {1,2,3,4,5,6,7,8,9,10})); 
		assertEquals(-30, testObject.sumEven(new int[] {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10})); 
	}
}
