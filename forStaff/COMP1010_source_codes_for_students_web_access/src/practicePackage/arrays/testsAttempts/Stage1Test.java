package practicePackage.arrays.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.arrays.attempts.Stage1;

public class Stage1Test {
	private int[] empty;
	private int[] singleItemArray;
	private int[] multiplesTen1;
	private int[] nonNegSequential;
	private int[] mixed;
	private int[] multiplesTen2;

	@BeforeEach
	void run() {
		empty = new int[]{};
		singleItemArray = new int[]{888};
		multiplesTen1 = new int[]{10,70,20,90};
		nonNegSequential = new int[]{0,1,2,3,4,5,6,7,8,9,10};
		mixed = new int[]{-5,0,-12,3,7,6,-4,-8,0,0,0,2,6,9,-1};
		multiplesTen2 = new int[]{10,70,20,90};
	}

	@Test
	void testIsNull() {
		assertTrue(Stage1.isNull(null));
		assertFalse(Stage1.isNull(empty));
		assertFalse(Stage1.isNull(singleItemArray));
		assertFalse(Stage1.isNull(multiplesTen1));
		assertFalse(Stage1.isNull(nonNegSequential));
		assertFalse(Stage1.isNull(mixed));
		assertFalse(Stage1.isNull(multiplesTen2));
	}

	@Test
	void testIsEmpty() {
		assertTrue(Stage1.isEmpty(null));
		assertTrue(Stage1.isEmpty(empty));
		assertFalse(Stage1.isEmpty(singleItemArray));
		assertFalse(Stage1.isEmpty(multiplesTen1));
		assertFalse(Stage1.isEmpty(nonNegSequential));
		assertFalse(Stage1.isEmpty(mixed));
		assertFalse(Stage1.isEmpty(multiplesTen2));
	}

	@Test
	void testGetLastItemIndex() {
		assertEquals(0, Stage1.getLastItemIndex(null));
		assertEquals(0, Stage1.getLastItemIndex(empty));
		assertEquals(0, Stage1.getLastItemIndex(singleItemArray));
		assertEquals(3, Stage1.getLastItemIndex(multiplesTen1));
		assertEquals(10, Stage1.getLastItemIndex(nonNegSequential));
		assertEquals(14, Stage1.getLastItemIndex(mixed));
		assertEquals(3, Stage1.getLastItemIndex(multiplesTen2));
	}

	@Test
	void testGetLastItem() {
		assertEquals(0, Stage1.getLastItem(null));
		assertEquals(0, Stage1.getLastItem(empty));
		assertEquals(888, Stage1.getLastItem(singleItemArray));
		assertEquals(90, Stage1.getLastItem(multiplesTen1));
		assertEquals(10, Stage1.getLastItem(nonNegSequential));
		assertEquals(-1, Stage1.getLastItem(mixed));
		assertEquals(90, Stage1.getLastItem(multiplesTen2));
	}

	@Test
	void testGetSecondLastItem() {
		assertEquals(0, Stage1.getSecondLastItem(null));
		assertEquals(0, Stage1.getSecondLastItem(empty));
		assertEquals(0, Stage1.getSecondLastItem(singleItemArray));

		assertEquals(20, Stage1.getSecondLastItem(multiplesTen1));
		assertEquals(9, Stage1.getSecondLastItem(nonNegSequential));
		assertEquals(9, Stage1.getSecondLastItem(mixed));
		assertEquals(20, Stage1.getSecondLastItem(multiplesTen2));
	}

	@Test
	void testSecondLastLessThanLast() {
		assertFalse(Stage1.secondLastLessThanLast(null));
		assertFalse(Stage1.secondLastLessThanLast(empty));
		assertFalse(Stage1.secondLastLessThanLast(singleItemArray));

		assertTrue(Stage1.secondLastLessThanLast(multiplesTen1));
		assertTrue(Stage1.secondLastLessThanLast(nonNegSequential));
		assertFalse(Stage1.secondLastLessThanLast(mixed));
		assertTrue(Stage1.secondLastLessThanLast(multiplesTen2));
	}

	@Test
	void testGetMedian() {
		assertEquals(0, Stage1.getMedian(null));
		assertEquals(0, Stage1.getMedian(empty));
		assertEquals(888, Stage1.getMedian(singleItemArray));
		assertEquals(20, Stage1.getMedian(multiplesTen1));
		assertEquals(5, Stage1.getMedian(nonNegSequential));
		assertEquals(-8, Stage1.getMedian(mixed));
		assertEquals(20, Stage1.getMedian(multiplesTen2));
	}

	@Test
	void testGetSumFirstLastItems() {
		assertEquals(0, Stage1.getSumFirstLastItems(null));
		assertEquals(0, Stage1.getSumFirstLastItems(empty));
		assertEquals(0, Stage1.getSumFirstLastItems(singleItemArray));
		assertEquals(100, Stage1.getSumFirstLastItems(multiplesTen1));
		assertEquals(10, Stage1.getSumFirstLastItems(nonNegSequential));
		assertEquals(-6, Stage1.getSumFirstLastItems(mixed));
		assertEquals(100, Stage1.getSumFirstLastItems(multiplesTen2));
	}

	@Test
	void testItemExistsAt() {
		assertFalse(Stage1.itemExistsAt(null, 0));
		assertTrue(Stage1.itemExistsAt(singleItemArray, 0));
		assertFalse(Stage1.itemExistsAt(singleItemArray, 1));
		assertTrue(Stage1.itemExistsAt(multiplesTen1,0));
		assertTrue(Stage1.itemExistsAt(multiplesTen1,1));
		assertTrue(Stage1.itemExistsAt(multiplesTen1,2));
		assertTrue(Stage1.itemExistsAt(multiplesTen1,3));
		assertFalse(Stage1.itemExistsAt(multiplesTen1,-1));
		assertFalse(Stage1.itemExistsAt(multiplesTen1,4));
		assertTrue(Stage1.itemExistsAt(multiplesTen2, multiplesTen2.length-1));
		assertFalse(Stage1.itemExistsAt(multiplesTen2, multiplesTen2.length));
	}

	@Test
	void testGet() {
		assertEquals(0, Stage1.get(null, 0));
		assertEquals(0, Stage1.get(singleItemArray, 1));
		assertEquals(888, Stage1.get(singleItemArray, 0));
		assertEquals(10, Stage1.get(multiplesTen1,0));
		assertEquals(70, Stage1.get(multiplesTen1,1));
		assertEquals(20, Stage1.get(multiplesTen1,2));
		assertEquals(90, Stage1.get(multiplesTen1,3));
		assertEquals(0, Stage1.get(multiplesTen1,-1));
		assertEquals(0, Stage1.get(multiplesTen1,4));
		assertEquals(90, Stage1.get(multiplesTen2, multiplesTen2.length-1));
		assertEquals(0, Stage1.get(multiplesTen2, multiplesTen2.length));
	}

	@Test
	void testGenerate() {
		assertNull(Stage1.generate(-1));
		assertEquals(0, Stage1.generate(0).length);
		assertEquals(235, Stage1.generate(235).length);
	}

	@Test
	void testSameSize() {
		assertFalse(Stage1.sameSize(null, nonNegSequential));
		assertFalse(Stage1.sameSize(multiplesTen1, null));
		assertFalse(Stage1.sameSize(null, null));
		assertFalse(Stage1.sameSize(empty, singleItemArray));
		assertTrue(Stage1.sameSize(multiplesTen1, multiplesTen2));
		assertFalse(Stage1.sameSize(nonNegSequential, mixed));
	}

	@Test
	void testSameItemAt() {
		assertFalse(Stage1.sameItemAt(null, nonNegSequential, 0));
		assertFalse(Stage1.sameItemAt(multiplesTen1, null, 69));
		assertFalse(Stage1.sameItemAt(null, null, 96));
		assertFalse(Stage1.sameItemAt(empty, empty, 0));
		assertFalse(Stage1.sameItemAt(empty, singleItemArray, 0));
		assertFalse(Stage1.sameItemAt(empty, singleItemArray, 1));
		assertFalse(Stage1.sameItemAt(singleItemArray, singleItemArray, 1));
		assertTrue(Stage1.sameItemAt(multiplesTen1, multiplesTen2, 0));
		assertTrue(Stage1.sameItemAt(multiplesTen1, multiplesTen2, 1));
		assertTrue(Stage1.sameItemAt(multiplesTen1, multiplesTen2, 2));
		assertTrue(Stage1.sameItemAt(multiplesTen1, multiplesTen2, 3));
		assertFalse(Stage1.sameItemAt(multiplesTen1, multiplesTen2, -1));
		assertFalse(Stage1.sameItemAt(multiplesTen1, multiplesTen2, 4));
		assertFalse(Stage1.sameItemAt(nonNegSequential, mixed, 0));
		assertTrue(Stage1.sameItemAt(nonNegSequential, mixed, 3));
		assertFalse(Stage1.sameItemAt(nonNegSequential, mixed, 6));
	}
}
