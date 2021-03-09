package practicePackage.recursion.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.recursion.attempts.Stage4;

public class Stage4Test {
	protected Stage4 testObject;

	@BeforeEach
	public void run() {
		testObject = new Stage4();
	}
	
	@Test
	public void testBinarySearch() {
		int[] a = {10,10,10,10,10,10};
		assertTrue(testObject.binarySearch(a, 10, 0, a.length-1) >= 0);
		assertEquals(-1, testObject.binarySearch(a, 20, 0, a.length-1));

		a = new int[]{10,20,30,40,50,60,70,80,80,80,80,80,90};

		assertTrue(testObject.binarySearch(a, 10, 0, a.length-1) >= 0);
		assertTrue(testObject.binarySearch(a, 10, 0, a.length-1) < a.length);
		assertEquals(10, a[testObject.binarySearch(a, 10, 0, a.length-1)]);

		assertTrue(testObject.binarySearch(a, 80, 0, a.length-1) >= 0);
		assertTrue(testObject.binarySearch(a, 80, 0, a.length-1) < a.length);
		assertEquals(80, a[testObject.binarySearch(a, 80, 0, a.length-1)]);

		assertEquals(-1, testObject.binarySearch(a, 100, 0, a.length-1));
	}

	@Test
	public void testFastPower() {
		assertEquals(4, testObject.fastPower(2, 2));	
		assertEquals(4, testObject.fastPower(-2, 2));	
		assertEquals(8, testObject.fastPower(2, 3));	
		assertEquals(-8, testObject.fastPower(-2, 3));	
		assertEquals(1, testObject.fastPower(4, 0));	
		assertEquals(6561, testObject.fastPower(3, 8));	
	}

	@Test
	public void testFastFibonacci() {
		assertEquals(0, testObject.fastFibonacci(0));
		assertEquals(1, testObject.fastFibonacci(1));
		assertEquals(5, testObject.fastFibonacci(5));
		assertEquals(8, testObject.fastFibonacci(6));
		assertEquals(21, testObject.fastFibonacci(8));
	}

	@Test
	public void testGetPermutation() {
		assertNull(testObject.getPermutation(5, -1));
		assertNull(testObject.getPermutation(5, 120));
		assertNull(testObject.getPermutation(0, 120));

		assertNotNull(testObject.getPermutation(5, 0));
		assertEquals("12345", testObject.getPermutation(5, 0));

		assertNotNull(testObject.getPermutation(5, 7));
		assertEquals("13254", testObject.getPermutation(5, 7));

		assertNotNull(testObject.getPermutation(5, 119));
		assertEquals("54321", testObject.getPermutation(5, 119));

		assertNotNull(testObject.getPermutation(9, 0));
		assertEquals("123456789", testObject.getPermutation(9, 0));
	}
	
	@Test
	public void testVeryFastFibonacci() {
		assertNotNull(testObject.veryFastFibonacci(0));
		assertEquals(new BigInteger("0"), testObject.veryFastFibonacci(0));
		assertNotNull(testObject.veryFastFibonacci(1));
		assertEquals(new BigInteger("1"), testObject.veryFastFibonacci(1));
		assertNotNull(testObject.veryFastFibonacci(5));
		assertEquals(new BigInteger("5"), testObject.veryFastFibonacci(5));
		assertNotNull(testObject.veryFastFibonacci(6));
		assertEquals(new BigInteger("8"), testObject.veryFastFibonacci(6));

		//will timeout for O(phi^n) complexity

		assertNotNull(testObject.veryFastFibonacci(2000));
		BigInteger expected = new BigInteger("4224696333392304878706725602341482782579852840250681098010280137314308584370130707224123599639141511088446087538909603607640194711643596029271983312598737326253555802606991585915229492453904998722256795316982874482472992263901833716778060607011615497886719879858311468870876264597369086722884023654422295243347964480139515349562972087652656069529806499841977448720155612802665404554171717881930324025204312082516817125");
		assertEquals(expected, testObject.veryFastFibonacci(2000));
	}	
	
	@Test
	public void testAddsUpTo() {
		assertTrue(testObject.addsUpTo(new int[] {10, 70, 20, 90}, 0, 110));
		assertFalse(testObject.addsUpTo(new int[] {10, 70, 20, 90}, 0, 50));
		assertTrue(testObject.addsUpTo(new int[] {10, 70, 20, 90, 30, 80}, 0, 270));
		assertTrue(testObject.addsUpTo(new int[] {1,2,3,4,5,6,7,8,9,10}, 0, 30));
		assertTrue(testObject.addsUpTo(new int[] {10, 70, 2000, 90, 300, 80}, 0, 2310));
	}
	
	@Test
	public void testCombinesUpTo() {
		assertTrue(testObject.combinesUpTo(new int[] {10, 70, 20, 90}, 0, 110));
		assertFalse(testObject.combinesUpTo(new int[] {80, 90, 10}, 0, 150));
		assertTrue(testObject.combinesUpTo(new int[] {80, 90, 10}, 0, 160));
		assertTrue(testObject.combinesUpTo(new int[] {10, 70, 20, 90}, 0, 50));
		assertTrue(testObject.combinesUpTo(new int[] {10, 70, 20, 90, 30, 80}, 0, 270));
		assertTrue(testObject.combinesUpTo(new int[] {1,2,3,4,5,6,7,8,9,10}, 0, 30));
		assertTrue(testObject.combinesUpTo(new int[] {10, 70, 2000, 90, 300, 80}, 0, 1690));
		assertTrue(testObject.combinesUpTo(new int[] {10, 100, 1000, 10000}, 0, 8890));
		assertFalse(testObject.combinesUpTo(new int[] {10, 100, 1000, 10000}, 0, 8880));
	}
	
	@Test
	public void testWaysAddsUpTo() {
		assertEquals(2, testObject.waysAddsUpTo(new int[] {10, 70, 20, 90}, 0, 100));
		/*
		 * 10,70,20
		 * 10,90
		 */
		
		assertEquals(6, testObject.waysAddsUpTo(new int[] {10, 70, 20, 90, -20, 20}, 0, 100));
		/*
		 * 10,70,20
		 * 10,70,20,-20,20
		 * 10,70,20 (the last 20)
		 * 100,20,90,-20
		 * 10,90
		 * 10,90,-20,20
		 */
		
		assertEquals(5, testObject.waysAddsUpTo(new int[] {10, 70, 20, 90, -30, 30}, 0, 100));
		/*
		 * 10,70,20
		 * 10,70,20,-30,30
		 * 10,90
		 * 10,90,-30,30
		 * 70,30
		 */
	}

	@Test
	public void testSplit53() {
		assertTrue(testObject.split53(new int[] {1, 1}));
		assertTrue(testObject.split53(new int[] {2, 4, 2}));
		assertTrue(testObject.split53(new int[] {3, 3, 5, 1}));
		assertTrue(testObject.split53(new int[] {3, 5, 6, 10, 3, 3}));

		assertFalse(testObject.split53(new int[] {3, 5, 8}));
		assertFalse(testObject.split53(new int[] {2, 2, 2, 1}));
		assertFalse(testObject.split53(new int[] {5,5,5, 5, 3,3,3,3,3})); //extra 5
	}

}
