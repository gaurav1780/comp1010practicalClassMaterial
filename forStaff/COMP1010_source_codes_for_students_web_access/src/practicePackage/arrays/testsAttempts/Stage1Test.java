package practicePackage.arrays.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Stage1Test {
	protected practicePackage.arrays.attempts.Stage1 testObject;
	
	private int[] empty;
	private int[] singleItemArray;
	private int[] multiplesTen1;
	private int[] nonNegSequential;
	private int[] mixed;
	private int[] multiplesTen2;

	@BeforeEach
	public void run() {
		testObject = new practicePackage.arrays.attempts.Stage1();
		empty = new int[]{};
		singleItemArray = new int[]{888};
		multiplesTen1 = new int[]{10,70,20,90};
		nonNegSequential = new int[]{0,1,2,3,4,5,6,7,8,9,10};
		mixed = new int[]{-5,0,-12,3,7,6,-4,-8,0,0,0,2,6,9,-1};
		multiplesTen2 = new int[]{10,70,20,90};
	}

	@Test
	public void testIsNull() {
		assertTrue(testObject.isNull(null));
		assertFalse(testObject.isNull(empty));
		assertFalse(testObject.isNull(singleItemArray));
		assertFalse(testObject.isNull(multiplesTen1));
		assertFalse(testObject.isNull(nonNegSequential));
		assertFalse(testObject.isNull(mixed));
		assertFalse(testObject.isNull(multiplesTen2));
	}

	@Test
	public void testIsEmpty() {
		assertTrue(testObject.isEmpty(null));
		assertTrue(testObject.isEmpty(empty));
		assertFalse(testObject.isEmpty(singleItemArray));
		assertFalse(testObject.isEmpty(multiplesTen1));
		assertFalse(testObject.isEmpty(nonNegSequential));
		assertFalse(testObject.isEmpty(mixed));
		assertFalse(testObject.isEmpty(multiplesTen2));
	}

	@Test
	public void testGetLastItemIndex() {
		assertEquals(0, testObject.getLastItemIndex(null));
		assertEquals(0, testObject.getLastItemIndex(empty));
		assertEquals(0, testObject.getLastItemIndex(singleItemArray));
		assertEquals(3, testObject.getLastItemIndex(multiplesTen1));
		assertEquals(10, testObject.getLastItemIndex(nonNegSequential));
		assertEquals(14, testObject.getLastItemIndex(mixed));
		assertEquals(3, testObject.getLastItemIndex(multiplesTen2));
	}

	@Test
	public void testGetLastItem() {
		assertEquals(0, testObject.getLastItem(null));
		assertEquals(0, testObject.getLastItem(empty));
		assertEquals(888, testObject.getLastItem(singleItemArray));
		assertEquals(90, testObject.getLastItem(multiplesTen1));
		assertEquals(10, testObject.getLastItem(nonNegSequential));
		assertEquals(-1, testObject.getLastItem(mixed));
		assertEquals(90, testObject.getLastItem(multiplesTen2));
	}

	@Test
	public void testGetSecondLastItem() {
		assertEquals(0, testObject.getSecondLastItem(null));
		assertEquals(0, testObject.getSecondLastItem(empty));
		assertEquals(0, testObject.getSecondLastItem(singleItemArray));

		assertEquals(20, testObject.getSecondLastItem(multiplesTen1));
		assertEquals(9, testObject.getSecondLastItem(nonNegSequential));
		assertEquals(9, testObject.getSecondLastItem(mixed));
		assertEquals(20, testObject.getSecondLastItem(multiplesTen2));
	}

	@Test
	public void testSecondLastLessThanLast() {
		assertFalse(testObject.secondLastLessThanLast(null));
		assertFalse(testObject.secondLastLessThanLast(empty));
		assertFalse(testObject.secondLastLessThanLast(singleItemArray));

		assertTrue(testObject.secondLastLessThanLast(multiplesTen1));
		assertTrue(testObject.secondLastLessThanLast(nonNegSequential));
		assertFalse(testObject.secondLastLessThanLast(mixed));
		assertTrue(testObject.secondLastLessThanLast(multiplesTen2));
	}

	@Test
	public void testGetMedian() {
		assertEquals(0, testObject.getMedian(null));
		assertEquals(0, testObject.getMedian(empty));
		assertEquals(888, testObject.getMedian(singleItemArray));
		assertEquals(20, testObject.getMedian(multiplesTen1));
		assertEquals(5, testObject.getMedian(nonNegSequential));
		assertEquals(-8, testObject.getMedian(mixed));
		assertEquals(20, testObject.getMedian(multiplesTen2));
	}

	@Test
	public void testGetSumFirstLastItems() {
		assertEquals(0, testObject.getSumFirstLastItems(null));
		assertEquals(0, testObject.getSumFirstLastItems(empty));
		assertEquals(0, testObject.getSumFirstLastItems(singleItemArray));
		assertEquals(100, testObject.getSumFirstLastItems(multiplesTen1));
		assertEquals(10, testObject.getSumFirstLastItems(nonNegSequential));
		assertEquals(-6, testObject.getSumFirstLastItems(mixed));
		assertEquals(100, testObject.getSumFirstLastItems(multiplesTen2));
	}

	@Test
	public void testItemExistsAt() {
		assertFalse(testObject.itemExistsAt(null, 0));
		assertTrue(testObject.itemExistsAt(singleItemArray, 0));
		assertFalse(testObject.itemExistsAt(singleItemArray, 1));
		assertTrue(testObject.itemExistsAt(multiplesTen1,0));
		assertTrue(testObject.itemExistsAt(multiplesTen1,1));
		assertTrue(testObject.itemExistsAt(multiplesTen1,2));
		assertTrue(testObject.itemExistsAt(multiplesTen1,3));
		assertFalse(testObject.itemExistsAt(multiplesTen1,-1));
		assertFalse(testObject.itemExistsAt(multiplesTen1,4));
		assertTrue(testObject.itemExistsAt(multiplesTen2, multiplesTen2.length-1));
		assertFalse(testObject.itemExistsAt(multiplesTen2, multiplesTen2.length));
	}

	@Test
	public void testGet() {
		assertEquals(0, testObject.get(null, 0));
		assertEquals(0, testObject.get(singleItemArray, 1));
		assertEquals(888, testObject.get(singleItemArray, 0));
		assertEquals(10, testObject.get(multiplesTen1,0));
		assertEquals(70, testObject.get(multiplesTen1,1));
		assertEquals(20, testObject.get(multiplesTen1,2));
		assertEquals(90, testObject.get(multiplesTen1,3));
		assertEquals(0, testObject.get(multiplesTen1,-1));
		assertEquals(0, testObject.get(multiplesTen1,4));
		assertEquals(90, testObject.get(multiplesTen2, multiplesTen2.length-1));
		assertEquals(0, testObject.get(multiplesTen2, multiplesTen2.length));
	}

	@Test
	public void testGenerate() {
		assertNull(testObject.generate(-1));
		assertEquals(0, testObject.generate(0).length);
		assertEquals(235, testObject.generate(235).length);
	}

	@Test
	public void testSameSize() {
		assertFalse(testObject.sameSize(null, nonNegSequential));
		assertFalse(testObject.sameSize(multiplesTen1, null));
		assertFalse(testObject.sameSize(null, null));
		assertFalse(testObject.sameSize(empty, singleItemArray));
		assertTrue(testObject.sameSize(multiplesTen1, multiplesTen2));
		assertFalse(testObject.sameSize(nonNegSequential, mixed));
	}

	@Test
	public void testSameItemAt() {
		assertFalse(testObject.sameItemAt(null, nonNegSequential, 0));
		assertFalse(testObject.sameItemAt(multiplesTen1, null, 69));
		assertFalse(testObject.sameItemAt(null, null, 96));
		assertFalse(testObject.sameItemAt(empty, empty, 0));
		assertFalse(testObject.sameItemAt(empty, singleItemArray, 0));
		assertFalse(testObject.sameItemAt(empty, singleItemArray, 1));
		assertFalse(testObject.sameItemAt(singleItemArray, singleItemArray, 1));
		assertTrue(testObject.sameItemAt(multiplesTen1, multiplesTen2, 0));
		assertTrue(testObject.sameItemAt(multiplesTen1, multiplesTen2, 1));
		assertTrue(testObject.sameItemAt(multiplesTen1, multiplesTen2, 2));
		assertTrue(testObject.sameItemAt(multiplesTen1, multiplesTen2, 3));
		assertFalse(testObject.sameItemAt(multiplesTen1, multiplesTen2, -1));
		assertFalse(testObject.sameItemAt(multiplesTen1, multiplesTen2, 4));
		assertFalse(testObject.sameItemAt(nonNegSequential, mixed, 0));
		assertTrue(testObject.sameItemAt(nonNegSequential, mixed, 3));
		assertFalse(testObject.sameItemAt(nonNegSequential, mixed, 6));
	}
}
