package practicePackage.introduction.testsAttempts;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.introduction.attempts.Stage4;

public class Stage5Test {
	protected practicePackage.introduction.attempts.Stage5 testObject;

	private int[] empty;
	private int[] singleItemArray;
	private int[] tenMultiples;
	private int[] negPos;
	private int[] ascAllPos;
	private int[] descNegs;
	private int[] multiplesTen1;
	private int[] multiplesTen2;
	private int[] mixedPosNeg;
	private int[] allZeroes1;
	private int[] allZeroes2;

	@BeforeEach
	public void run() {
		testObject = new practicePackage.introduction.attempts.Stage5();
		empty = new int[]{};
		singleItemArray = new int[]{777};
		multiplesTen1 = new int[]{10, 70, 20, 90};
		multiplesTen2 = new int[]{10, 70, 20, 90};
		mixedPosNeg = new int[]{-50, 30, -20, 0, 20, -30, 50};
		allZeroes1 = new int[]{0, 0, 0, 0, 0};
		allZeroes2 = new int[]{0, 0, 0, 0, 0};
		tenMultiples = new int[]{10,-70,-20,90};
		negPos = new int[]{-3, 15, -13, 16, -1, 10, -101};
		ascAllPos = new int[]{4, 7, 13, 28, 137, 224, 237, 254};
		descNegs = new int[]{-115, -125, -202, -225, -229, -255};
	}

	@Test
	public void testAllPositives() {
		assertFalse(testObject.allPositives(null));
		assertTrue(testObject.allPositives(empty));
		assertTrue(testObject.allPositives(singleItemArray));
		assertFalse(testObject.allPositives(tenMultiples));
		assertFalse(testObject.allPositives(negPos));
		assertTrue(testObject.allPositives(ascAllPos));
		assertFalse(testObject.allPositives(descNegs));
		assertFalse(testObject.allPositives(mixedPosNeg));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(testObject.allPositives(e));
	}

	@Test
	public void testContainsPositive() {
		assertFalse(testObject.containsPositive(null));
		assertFalse(testObject.containsPositive(empty));
		assertTrue(testObject.containsPositive(singleItemArray));
		assertTrue(testObject.containsPositive(tenMultiples));
		assertTrue(testObject.containsPositive(negPos));
		assertTrue(testObject.containsPositive(ascAllPos));
		assertFalse(testObject.containsPositive(descNegs));
		assertTrue(testObject.containsPositive(mixedPosNeg));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(testObject.containsPositive(e));
	}

	@Test
	public void testIdentical() {
		assertFalse(testObject.identical(multiplesTen1, null));
		assertFalse(testObject.identical(null, multiplesTen2));
		assertFalse(testObject.identical(null, null));
		assertFalse(testObject.identical(empty, singleItemArray));
		assertTrue(testObject.identical(multiplesTen1, multiplesTen2));
		assertTrue(testObject.identical(multiplesTen2, multiplesTen1));
		assertFalse(testObject.identical(multiplesTen1, new int[]{10, 20, 70, 90}));
		assertFalse(testObject.identical(multiplesTen2, new int[]{10, 70, 20}));
		assertFalse(testObject.identical(multiplesTen1, new int[]{10, 70}));
		assertFalse(testObject.identical(multiplesTen2, new int[]{10}));
		assertTrue(testObject.identical(allZeroes1, allZeroes2));
		assertTrue(testObject.identical(allZeroes2, allZeroes1));
	}	
	
	@Test
	public void testContainsUptoIndex() {
		assertFalse(testObject.containsUptoIndex(null, 35, 23));
		assertFalse(testObject.containsUptoIndex(empty, 96, 69));
		assertTrue(testObject.containsUptoIndex(singleItemArray, 777, 0));
		assertFalse(testObject.containsUptoIndex(tenMultiples, 90, 4));
		assertFalse(testObject.containsUptoIndex(negPos, -13, -1));
		assertTrue(testObject.containsUptoIndex(ascAllPos, 254, 7));
		assertTrue(testObject.containsUptoIndex(descNegs, -115, 0));
		int[] e = {7, 7, 7, 7, 7, 7, 7};
		assertTrue(testObject.containsUptoIndex(e, 7, 0));
		assertTrue(testObject.containsUptoIndex(e, 7, 6));
	}	
	
	@Test
	public void testGetFrequencyTable() {
		assertNull(testObject.getFrequencyTable(null));
		assertNotNull(testObject.getFrequencyTable(empty));
		assertEquals(0, testObject.getFrequencyTable(empty).length);
		assertNotNull(testObject.getFrequencyTable(singleItemArray));
		assertEquals("[1]", Arrays.toString(testObject.getFrequencyTable(singleItemArray)));
		assertNotNull(testObject.getFrequencyTable(mixedPosNeg));
		assertEquals("[1, 1, 1, 1, 1, 1, 1]", Arrays.toString(testObject.getFrequencyTable(mixedPosNeg)));
		assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(testObject.getFrequencyTable(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5})));
		assertEquals("[2, 3, 5]", Arrays.toString(testObject.getFrequencyTable(new int[]{4, 7, 13, 13, 7, 13, 13, 13, 7, 4})));
	}	
}
