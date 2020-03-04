package practicePackage.arrays.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.arrays.attempts.Stage4;

public class Stage4Test {

	private int[] empty;
	private int[] singleItemArray;
	private int[] tenMultiples;
	private int[] nonNegsShort;
	private int[] nonNegsLong;
	private int[] positives;
	private int[] mixed;
	private int[] allZeroes;

	@BeforeEach
	void run() {
		empty = new int[]{};
		singleItemArray = new int[]{777};
		tenMultiples = new int[]{10, 70, 20, 90};
		nonNegsShort = new int[]{0, 4, 2, 3, 5, 1, 6, 9, 7, 8};
		nonNegsLong = new int[]{0, 0, 1, 0, 1, 2, 0, 1, 2, 3, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 5};
		positives = new int[]{10, 3, 5, 6, 2};
		mixed = new int[]{0, 10, 3, -2, 5, 2, 1, 12, -1};
		allZeroes = new int[]{0, 0, 0, 0, 0};
	}

	@Test
	void testProductAllButOne() {
		assertEquals(0, Stage4.productAllButOne(empty).length);
		assertEquals("[1]", Arrays.toString(Stage4.productAllButOne(singleItemArray)));
		assertEquals("[126000, 18000, 63000, 14000]", Arrays.toString(Stage4.productAllButOne(tenMultiples)));
		assertEquals("[362880, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(Stage4.productAllButOne(nonNegsShort)));
		assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(Stage4.productAllButOne(nonNegsLong)));
		assertEquals("[180, 600, 360, 300, 900]", Arrays.toString(Stage4.productAllButOne(positives)));
		assertEquals("[7200, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(Stage4.productAllButOne(mixed)));
		assertEquals(Arrays.toString(allZeroes), Arrays.toString(Stage4.productAllButOne(allZeroes)));
	}

	@Test
	void testGetLongestConsecutiveLength() {
		assertEquals(1, Stage4.getLongestConsecutiveLength(empty));
		assertEquals(1, Stage4.getLongestConsecutiveLength(singleItemArray));
		assertEquals(1, Stage4.getLongestConsecutiveLength(tenMultiples));
		assertEquals(10, Stage4.getLongestConsecutiveLength(nonNegsShort));
		assertEquals(2, Stage4.getLongestConsecutiveLength(nonNegsLong));
		assertEquals(2, Stage4.getLongestConsecutiveLength(positives));
		assertEquals(6, Stage4.getLongestConsecutiveLength(mixed));
		assertEquals(1, Stage4.getLongestConsecutiveLength(allZeroes));
	}

	@Test
	void testGetLongestAscendingSequence() {
		assertEquals(0, Stage4.getLongestAscendingSequence(empty).length);
		assertEquals("[777]", Arrays.toString(Stage4.getLongestAscendingSequence(singleItemArray)));
		assertEquals("[10, 70]", Arrays.toString(Stage4.getLongestAscendingSequence(tenMultiples)));
		assertEquals("[2, 3, 5]", Arrays.toString(Stage4.getLongestAscendingSequence(nonNegsShort)));
		assertEquals("[0, 1, 2, 3, 4, 5]", Arrays.toString(Stage4.getLongestAscendingSequence(nonNegsLong)));
		assertEquals("[3, 5, 6]", Arrays.toString(Stage4.getLongestAscendingSequence(positives)));
		assertEquals("[0, 10]", Arrays.toString(Stage4.getLongestAscendingSequence(mixed)));
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(Stage4.getLongestAscendingSequence(allZeroes)));
	}

	@Test
	void testGetLongestDescendingSequence() {
		assertEquals(0, Stage4.getLongestDescendingSequence(empty).length);
		assertEquals("[777]", Arrays.toString(Stage4.getLongestDescendingSequence(singleItemArray)));
		assertEquals("[70, 20]", Arrays.toString(Stage4.getLongestDescendingSequence(tenMultiples)));
		assertEquals("[4, 2]", Arrays.toString(Stage4.getLongestDescendingSequence(nonNegsShort)));
		assertEquals("[0, 0]", Arrays.toString(Stage4.getLongestDescendingSequence(nonNegsLong)));
		assertEquals("[10, 3]", Arrays.toString(Stage4.getLongestDescendingSequence(positives)));
		assertEquals("[10, 3, -2]", Arrays.toString(Stage4.getLongestDescendingSequence(mixed)));
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(Stage4.getLongestDescendingSequence(allZeroes)));
	}

	@Test
	void testGetLongestUnchangedSequence() {
		assertEquals(0, Stage4.getLongestUnchangedSequence(empty).length);
		assertEquals("[777]", Arrays.toString(Stage4.getLongestUnchangedSequence(singleItemArray)));
		assertEquals("[10]", Arrays.toString(Stage4.getLongestUnchangedSequence(tenMultiples)));
		assertEquals("[2, 2, 2]", Arrays.toString(Stage4.getLongestUnchangedSequence(new int[]{2, 2, 2, 3})));
		assertEquals("[3, 3, 3, 3, 3]", Arrays.toString(Stage4.getLongestUnchangedSequence(new int[]{2, 2, 2, 3, 3, 3, 3, 3})));
		assertEquals("[5, 5, 5, 5, 5, 5, 5, 5]", Arrays.toString(Stage4.getLongestUnchangedSequence(new int[]{2, 2, 2, 3, 3, 3, 3, 3, 2, 3, 3, 5, 5, 5, 5, 5, 5, 5, 5})));
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(Stage4.getLongestUnchangedSequence(allZeroes)));
	}

	@Test
	void testGetCommonItemsSorted() {
		//First sort all the arrays
		Arrays.sort(tenMultiples);
		Arrays.sort(nonNegsShort);
		Arrays.sort(nonNegsLong);
		Arrays.sort(positives);
		Arrays.sort(mixed);
		Arrays.sort(allZeroes);

		assertEquals(0, Stage4.getCommonItemsSorted(tenMultiples, nonNegsShort).length); //no items in common

		assertEquals("[0, 1, 2, 3, 4, 5]", Arrays.toString(Stage4.getCommonItemsSorted(nonNegsShort, nonNegsLong))); //some items in common

		assertEquals("[2, 3, 5, 6, 10]", Arrays.toString(Stage4.getCommonItemsSorted(positives, positives))); //all items in common

		assertEquals("[0]", Arrays.toString(Stage4.getCommonItemsSorted(mixed, allZeroes))); //only 1 item in common

		assertEquals("[0, 0]", Arrays.toString(Stage4.getCommonItemsSorted(new int[] {0, 0}, new int[] {0, 0, 0})));
	}

	@Test
	void testSortAsc() {
		Stage4.sortAsc(null); //NullPointerException check
		Stage4.sortAsc(empty);
		assertEquals("[]", Arrays.toString(empty));
		Stage4.sortAsc(singleItemArray);
		assertEquals("[777]", Arrays.toString(singleItemArray));
		Stage4.sortAsc(tenMultiples);
		assertEquals("[10, 20, 70, 90]", Arrays.toString(tenMultiples));
		Stage4.sortAsc(nonNegsShort);
		assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(nonNegsShort));
		Stage4.sortAsc(nonNegsLong);
		assertEquals("[0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5]", Arrays.toString(nonNegsLong));
		Stage4.sortAsc(positives);
		assertEquals("[2, 3, 5, 6, 10]", Arrays.toString(positives));
		Stage4.sortAsc(mixed);
		assertEquals("[-2, -1, 0, 1, 2, 3, 5, 10, 12]", Arrays.toString(mixed));
		Stage4.sortAsc(allZeroes);
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(allZeroes));
	}

	@Test
	void testSortDesc() {
		Stage4.sortDesc(null); //NullPointerException check
		Stage4.sortDesc(empty);
		assertEquals("[]", Arrays.toString(empty));
		Stage4.sortDesc(singleItemArray);
		assertEquals("[777]", Arrays.toString(singleItemArray));
		Stage4.sortDesc(tenMultiples);
		assertEquals("[90, 70, 20, 10]", Arrays.toString(tenMultiples));
		Stage4.sortDesc(nonNegsShort);
		assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]", Arrays.toString(nonNegsShort));
		Stage4.sortDesc(nonNegsLong);
		assertEquals("[5, 4, 4, 3, 3, 3, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0]", Arrays.toString(nonNegsLong));
		Stage4.sortDesc(positives);
		assertEquals("[10, 6, 5, 3, 2]", Arrays.toString(positives));
		Stage4.sortDesc(mixed);
		assertEquals("[12, 10, 5, 3, 2, 1, 0, -1, -2]", Arrays.toString(mixed));
		Stage4.sortDesc(allZeroes);
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(allZeroes));
	}

	@Test
	void testSort() {
		Stage4.sort(null, true); //NullPointerException check
		Stage4.sort(null, false); //NullPointerException check
		Stage4.sort(empty, true);
		assertEquals(0, empty.length);
		Stage4.sort(singleItemArray, false);
		assertEquals("[777]", Arrays.toString(singleItemArray));
		Stage4.sort(tenMultiples, true);
		assertEquals("[10, 20, 70, 90]", Arrays.toString(tenMultiples));
		Stage4.sort(nonNegsShort, false);
		assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]", Arrays.toString(nonNegsShort));
		Stage4.sort(nonNegsLong, true);
		assertEquals("[0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5]", Arrays.toString(nonNegsLong));
		Stage4.sort(positives, false);
		assertEquals("[10, 6, 5, 3, 2]", Arrays.toString(positives));
		Stage4.sort(mixed, true);
		assertEquals("[-2, -1, 0, 1, 2, 3, 5, 10, 12]", Arrays.toString(mixed));
		Stage4.sort(allZeroes, false);
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(allZeroes));
	}

	@Test
	void testSortIfNeeded() {
		Stage4.sortIfNeeded(null, true); //NullPointerException check
		Stage4.sortIfNeeded(null, false); //NullPointerException check
		Stage4.sortIfNeeded(empty, true);
		assertEquals(0, empty.length);
		Stage4.sortIfNeeded(singleItemArray, false);
		assertEquals("[777]", Arrays.toString(singleItemArray));
		Stage4.sortIfNeeded(tenMultiples, true);
		assertEquals("[10, 20, 70, 90]", Arrays.toString(tenMultiples));
		Stage4.sortIfNeeded(nonNegsShort, false);
		assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]", Arrays.toString(nonNegsShort));
		Stage4.sortIfNeeded(nonNegsLong, true);
		assertEquals("[0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5]", Arrays.toString(nonNegsLong));
		Stage4.sortIfNeeded(positives, false);
		assertEquals("[10, 6, 5, 3, 2]", Arrays.toString(positives));
		Stage4.sortIfNeeded(mixed, true);
		assertEquals("[-2, -1, 0, 1, 2, 3, 5, 10, 12]", Arrays.toString(mixed));
		Stage4.sortIfNeeded(allZeroes, false);
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(allZeroes));

		int[] buggy1 = {4, 7, 13, 28};
		Stage4.sortIfNeeded(buggy1, false);
		assertNotEquals("[28, 13, 7, 4]", Arrays.toString(buggy1));
		assertEquals("[4, 7, 13, 28]", Arrays.toString(buggy1));

		int[] buggy2 = {235, 96, 69, 35, 23};
		Stage4.sortIfNeeded(buggy2, true);
		assertNotEquals("[23, 35, 69, 96, 235]", Arrays.toString(buggy2));
		assertEquals("[235, 96, 69, 35, 23]", Arrays.toString(buggy2));
	}

	@Test
	void testReverseSort() {
		Stage4.reverseSort(null); //NullPointerException check
		Stage4.reverseSort(empty);
		assertEquals(0, empty.length);
		Stage4.reverseSort(singleItemArray);
		assertEquals("[777]", Arrays.toString(singleItemArray));
		Stage4.reverseSort(tenMultiples);
		assertNotEquals("[10, 20, 70, 90]", Arrays.toString(tenMultiples));
		assertNotEquals("[90, 70, 20, 10]", Arrays.toString(tenMultiples));
		assertEquals("[10, 70, 20, 90]", Arrays.toString(tenMultiples));

		int[] asc = {23, 35, 69, 96, 235};
		Stage4.reverseSort(asc);
		assertEquals("[235, 96, 69, 35, 23]", Arrays.toString(asc));

		int[] desc = {28, 13, 7, 4};
		Stage4.reverseSort(desc);
		assertEquals("[4, 7, 13, 28]", Arrays.toString(desc));
	}

	@Test
	void testGetCommonItemsUnsorted() {
		assertEquals(0, Stage4.getCommonItemsUnsorted(tenMultiples, nonNegsShort).length); //no items in common
		assertEquals("[0, 4, 2, 3, 5, 1]", Arrays.toString(Stage4.getCommonItemsUnsorted(nonNegsShort, nonNegsLong))); //some items in common
		assertEquals("[10, 3, 5, 6, 2]", Arrays.toString(Stage4.getCommonItemsUnsorted(positives, positives))); //all items in common
		assertEquals("[0]", Arrays.toString(Stage4.getCommonItemsUnsorted(mixed, allZeroes))); //only 1 item in common
		assertEquals("[1, 1, 1, 0, 0]", Arrays.toString(Stage4.getCommonItemsUnsorted(new int[] {2, 1, 0, 1, 0, 1, 1, 1, 3}, new int[] {5, 0, 1, 1, 0, 0, 0, 0, 1, 6}))); 
	}

	@Test
	void testNoCommonItems() {
		assertTrue(Stage4.noCommonItems(new int[][]{empty, singleItemArray}));
		assertTrue(Stage4.noCommonItems(new int[][]{tenMultiples, nonNegsShort})); 
		assertFalse(Stage4.noCommonItems(new int[][]{nonNegsLong, positives})); 
		assertFalse(Stage4.noCommonItems(new int[][]{mixed, allZeroes}));
		assertFalse(Stage4.noCommonItems(new int[][]{tenMultiples, nonNegsShort, nonNegsLong})); 
		assertFalse(Stage4.noCommonItems(new int[][]{positives, mixed, allZeroes})); 

		int[] w = {1,2,3,4};
		int[] x = {5,6,7,8};
		int[] y = {9,10,11,12};
		int[] z = {13,14,15,16};
		assertTrue(Stage4.noCommonItems(new int[][]{w, x, y, z})); 

		x = null;
		assertTrue(Stage4.noCommonItems(new int[][]{w, x, y, z})); 

		z[3] = 10;
		assertFalse(Stage4.noCommonItems(new int[][]{w, x, y, z})); //because y and z have 10 in common
	}

	@Test
	void testGetLongestMirroredSequence() {
		assertEquals("[777]", Arrays.toString(Stage4.getLongestMirroredSequence(singleItemArray)));
		assertEquals("[20, 30, 40]", Arrays.toString(Stage4.getLongestMirroredSequence(new int[]{10, 20, 30, 40, 50, 20, 10, 40, 30, 20, 50, 40})));
		assertEquals("[1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1]", Arrays.toString(Stage4.getLongestMirroredSequence(new int[]{1,2,1,2,1,2,1,2,1,2,1,2})));
		assertEquals("[1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1]", Arrays.toString(Stage4.getLongestMirroredSequence(new int[]{1,2,1,2,1,2,1,2,1,2,1,2,1})));
		assertEquals("[5]", Arrays.toString(Stage4.getLongestMirroredSequence(new int[]{5,6,7,8,9})));
		assertEquals("[6, 7, 5, 7, 6]", Arrays.toString(Stage4.getLongestMirroredSequence(new int[]{5,6,7,5,7,6,8,5,6,9})));
		assertEquals("[10]", Arrays.toString(Stage4.getLongestMirroredSequence(tenMultiples)));
	}
	
	@Test 
	void testGetSet() {
		int[] a = null;
		assertNull(Stage4.getSet(a));

		a = new int[]{};
		int[] b = new int[]{};
		assertNotNull(Stage4.getSet(a));
		assertArrayEquals(b, Stage4.getSet(a));

		a = new int[]{5, 5, 7, 2, 2, 2, 2};
		b = new int[]{5, 7, 2};
		assertNotNull(Stage4.getSet(a));
		assertArrayEquals(b, Stage4.getSet(a));

		a = new int[]{10, 10, 3, 20, 20};
		b = new int[]{10, 3, 20};
		assertNotNull(Stage4.getSet(a));
		assertArrayEquals(b, Stage4.getSet(a));

		a = new int[]{6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 6 ,6 ,6, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7};
		b = new int[]{6, 7};
		assertNotNull(Stage4.getSet(a));
		assertArrayEquals(b, Stage4.getSet(a));
	}
}
