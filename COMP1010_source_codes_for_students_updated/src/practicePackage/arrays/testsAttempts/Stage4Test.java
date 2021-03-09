package practicePackage.arrays.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.arrays.attempts.Stage4;

public class Stage4Test {
	protected practicePackage.arrays.attempts.Stage4 testObject;

	private int[] empty;
	private int[] singleItemArray;
	private int[] tenMultiples;
	private int[] nonNegsShort;
	private int[] nonNegsLong;
	private int[] positives;
	private int[] mixed;
	private int[] allZeroes;

	@BeforeEach
	public void run() {
		testObject = new practicePackage.arrays.attempts.Stage4();
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
	public void testProductAllButOne() {
		assertEquals(0, testObject.productAllButOne(empty).length);
		assertEquals("[1]", Arrays.toString(testObject.productAllButOne(singleItemArray)));
		assertEquals("[126000, 18000, 63000, 14000]", Arrays.toString(testObject.productAllButOne(tenMultiples)));
		assertEquals("[362880, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(testObject.productAllButOne(nonNegsShort)));
		assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(testObject.productAllButOne(nonNegsLong)));
		assertEquals("[180, 600, 360, 300, 900]", Arrays.toString(testObject.productAllButOne(positives)));
		assertEquals("[7200, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(testObject.productAllButOne(mixed)));
		assertEquals(Arrays.toString(allZeroes), Arrays.toString(testObject.productAllButOne(allZeroes)));
	}

	@Test
	public void testGetLongestConsecutiveLength() {
		assertEquals(0, testObject.getLongestConsecutiveLength(null));
		assertEquals(0, testObject.getLongestConsecutiveLength(empty));
		assertEquals(1, testObject.getLongestConsecutiveLength(singleItemArray));
		assertEquals(1, testObject.getLongestConsecutiveLength(tenMultiples));
		assertEquals(10, testObject.getLongestConsecutiveLength(nonNegsShort));
		assertEquals(6, testObject.getLongestConsecutiveLength(nonNegsLong));
		assertEquals(2, testObject.getLongestConsecutiveLength(positives));
		assertEquals(6, testObject.getLongestConsecutiveLength(mixed));
		assertEquals(1, testObject.getLongestConsecutiveLength(allZeroes));
	}

	@Test
	public void testGetLongestAscendingSequence() {
		assertEquals(0, testObject.getLongestAscendingSequence(empty).length);
		assertEquals("[777]", Arrays.toString(testObject.getLongestAscendingSequence(singleItemArray)));
		assertEquals("[10, 70]", Arrays.toString(testObject.getLongestAscendingSequence(tenMultiples)));
		assertEquals("[2, 3, 5]", Arrays.toString(testObject.getLongestAscendingSequence(nonNegsShort)));
		assertEquals("[0, 1, 2, 3, 4, 5]", Arrays.toString(testObject.getLongestAscendingSequence(nonNegsLong)));
		assertEquals("[3, 5, 6]", Arrays.toString(testObject.getLongestAscendingSequence(positives)));
		assertEquals("[0, 10]", Arrays.toString(testObject.getLongestAscendingSequence(mixed)));
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(testObject.getLongestAscendingSequence(allZeroes)));
		assertEquals("[30, 30]", Arrays.toString(testObject.getLongestAscendingSequence(new int[] {50, 40, 30, 30})));
	}

	@Test
	public void testGetLongestDescendingSequence() {
		assertEquals(0, testObject.getLongestDescendingSequence(empty).length);
		assertEquals("[777]", Arrays.toString(testObject.getLongestDescendingSequence(singleItemArray)));
		assertEquals("[70, 20]", Arrays.toString(testObject.getLongestDescendingSequence(tenMultiples)));
		assertEquals("[4, 2]", Arrays.toString(testObject.getLongestDescendingSequence(nonNegsShort)));
		assertEquals("[0, 0]", Arrays.toString(testObject.getLongestDescendingSequence(nonNegsLong)));
		assertEquals("[10, 3]", Arrays.toString(testObject.getLongestDescendingSequence(positives)));
		assertEquals("[10, 3, -2]", Arrays.toString(testObject.getLongestDescendingSequence(mixed)));
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(testObject.getLongestDescendingSequence(allZeroes)));
	}

	@Test
	public void testGetLongestUnchangedSequence() {
		assertEquals(0, testObject.getLongestUnchangedSequence(empty).length);
		assertEquals("[777]", Arrays.toString(testObject.getLongestUnchangedSequence(singleItemArray)));
		assertEquals("[10]", Arrays.toString(testObject.getLongestUnchangedSequence(tenMultiples)));
		assertEquals("[2, 2, 2]", Arrays.toString(testObject.getLongestUnchangedSequence(new int[]{2, 2, 2, 3})));
		assertEquals("[3, 3, 3, 3, 3]", Arrays.toString(testObject.getLongestUnchangedSequence(new int[]{2, 2, 2, 3, 3, 3, 3, 3})));
		assertEquals("[5, 5, 5, 5, 5, 5, 5, 5]", Arrays.toString(testObject.getLongestUnchangedSequence(new int[]{2, 2, 2, 3, 3, 3, 3, 3, 2, 3, 3, 5, 5, 5, 5, 5, 5, 5, 5})));
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(testObject.getLongestUnchangedSequence(allZeroes)));
	}

	@Test
	public void testGetCommonItemsSorted() {
		//First sort all the arrays
		Arrays.sort(tenMultiples);
		Arrays.sort(nonNegsShort);
		Arrays.sort(nonNegsLong);
		Arrays.sort(positives);
		Arrays.sort(mixed);
		Arrays.sort(allZeroes);

		assertEquals(0, testObject.getCommonItemsSorted(tenMultiples, nonNegsShort).length); //no items in common

		assertEquals("[0, 1, 2, 3, 4, 5]", Arrays.toString(testObject.getCommonItemsSorted(nonNegsShort, nonNegsLong))); //some items in common

		assertEquals("[2, 3, 5, 6, 10]", Arrays.toString(testObject.getCommonItemsSorted(positives, positives))); //all items in common

		assertEquals("[0]", Arrays.toString(testObject.getCommonItemsSorted(mixed, allZeroes))); //only 1 item in common

		assertEquals("[0, 0]", Arrays.toString(testObject.getCommonItemsSorted(new int[] {0, 0}, new int[] {0, 0, 0})));
	}

	@Test
	public void testSortAsc() {
		testObject.sortAsc(null); //NullPointerException check
		testObject.sortAsc(empty);
		assertEquals("[]", Arrays.toString(empty));
		testObject.sortAsc(singleItemArray);
		assertEquals("[777]", Arrays.toString(singleItemArray));
		testObject.sortAsc(tenMultiples);
		assertEquals("[10, 20, 70, 90]", Arrays.toString(tenMultiples));
		testObject.sortAsc(nonNegsShort);
		assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(nonNegsShort));
		testObject.sortAsc(nonNegsLong);
		assertEquals("[0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5]", Arrays.toString(nonNegsLong));
		testObject.sortAsc(positives);
		assertEquals("[2, 3, 5, 6, 10]", Arrays.toString(positives));
		testObject.sortAsc(mixed);
		assertEquals("[-2, -1, 0, 1, 2, 3, 5, 10, 12]", Arrays.toString(mixed));
		testObject.sortAsc(allZeroes);
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(allZeroes));
	}

	@Test
	public void testSortDesc() {
		testObject.sortDesc(null); //NullPointerException check
		testObject.sortDesc(empty);
		assertEquals("[]", Arrays.toString(empty));
		testObject.sortDesc(singleItemArray);
		assertEquals("[777]", Arrays.toString(singleItemArray));
		testObject.sortDesc(tenMultiples);
		assertEquals("[90, 70, 20, 10]", Arrays.toString(tenMultiples));
		testObject.sortDesc(nonNegsShort);
		assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]", Arrays.toString(nonNegsShort));
		testObject.sortDesc(nonNegsLong);
		assertEquals("[5, 4, 4, 3, 3, 3, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0]", Arrays.toString(nonNegsLong));
		testObject.sortDesc(positives);
		assertEquals("[10, 6, 5, 3, 2]", Arrays.toString(positives));
		testObject.sortDesc(mixed);
		assertEquals("[12, 10, 5, 3, 2, 1, 0, -1, -2]", Arrays.toString(mixed));
		testObject.sortDesc(allZeroes);
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(allZeroes));
	}

	@Test
	public void testSort() {
		testObject.sort(null, true); //NullPointerException check
		testObject.sort(null, false); //NullPointerException check
		testObject.sort(empty, true);
		assertEquals(0, empty.length);
		testObject.sort(singleItemArray, false);
		assertEquals("[777]", Arrays.toString(singleItemArray));
		testObject.sort(tenMultiples, true);
		assertEquals("[10, 20, 70, 90]", Arrays.toString(tenMultiples));
		testObject.sort(nonNegsShort, false);
		assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]", Arrays.toString(nonNegsShort));
		testObject.sort(nonNegsLong, true);
		assertEquals("[0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5]", Arrays.toString(nonNegsLong));
		testObject.sort(positives, false);
		assertEquals("[10, 6, 5, 3, 2]", Arrays.toString(positives));
		testObject.sort(mixed, true);
		assertEquals("[-2, -1, 0, 1, 2, 3, 5, 10, 12]", Arrays.toString(mixed));
		testObject.sort(allZeroes, false);
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(allZeroes));
	}

	@Test
	public void testSortIfNeeded() {
		testObject.sortIfNeeded(null, true); //NullPointerException check
		testObject.sortIfNeeded(null, false); //NullPointerException check
		testObject.sortIfNeeded(empty, true);
		assertEquals(0, empty.length);
		testObject.sortIfNeeded(singleItemArray, false);
		assertEquals("[777]", Arrays.toString(singleItemArray));
		testObject.sortIfNeeded(tenMultiples, true);
		assertEquals("[10, 20, 70, 90]", Arrays.toString(tenMultiples));
		testObject.sortIfNeeded(nonNegsShort, false);
		assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]", Arrays.toString(nonNegsShort));
		testObject.sortIfNeeded(nonNegsLong, true);
		assertEquals("[0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5]", Arrays.toString(nonNegsLong));
		testObject.sortIfNeeded(positives, false);
		assertEquals("[10, 6, 5, 3, 2]", Arrays.toString(positives));
		testObject.sortIfNeeded(mixed, true);
		assertEquals("[-2, -1, 0, 1, 2, 3, 5, 10, 12]", Arrays.toString(mixed));
		testObject.sortIfNeeded(allZeroes, false);
		assertEquals("[0, 0, 0, 0, 0]", Arrays.toString(allZeroes));

		int[] buggy1 = {4, 7, 13, 28};
		testObject.sortIfNeeded(buggy1, false);
		assertNotEquals("[28, 13, 7, 4]", Arrays.toString(buggy1));
		assertEquals("[4, 7, 13, 28]", Arrays.toString(buggy1));

		int[] buggy2 = {235, 96, 69, 35, 23};
		testObject.sortIfNeeded(buggy2, true);
		assertNotEquals("[23, 35, 69, 96, 235]", Arrays.toString(buggy2));
		assertEquals("[235, 96, 69, 35, 23]", Arrays.toString(buggy2));
	}

	@Test
	public void testReverseSort() {
		testObject.reverseSort(null); //NullPointerException check
		testObject.reverseSort(empty);
		assertEquals(0, empty.length);
		testObject.reverseSort(singleItemArray);
		assertEquals("[777]", Arrays.toString(singleItemArray));
		testObject.reverseSort(tenMultiples);
		assertNotEquals("[10, 20, 70, 90]", Arrays.toString(tenMultiples));
		assertNotEquals("[90, 70, 20, 10]", Arrays.toString(tenMultiples));
		assertEquals("[10, 70, 20, 90]", Arrays.toString(tenMultiples));

		int[] asc = {23, 35, 69, 96, 235};
		testObject.reverseSort(asc);
		assertEquals("[235, 96, 69, 35, 23]", Arrays.toString(asc));

		int[] desc = {28, 13, 7, 4};
		testObject.reverseSort(desc);
		assertEquals("[4, 7, 13, 28]", Arrays.toString(desc));
	}

	@Test
	public void testGetCommonItemsUnsorted() {
		assertEquals(0, testObject.getCommonItemsUnsorted(tenMultiples, nonNegsShort).length); //no items in common
		assertEquals("[0, 4, 2, 3, 5, 1]", Arrays.toString(testObject.getCommonItemsUnsorted(nonNegsShort, nonNegsLong))); //some items in common
		assertEquals("[10, 3, 5, 6, 2]", Arrays.toString(testObject.getCommonItemsUnsorted(positives, positives))); //all items in common
		assertEquals("[0]", Arrays.toString(testObject.getCommonItemsUnsorted(mixed, allZeroes))); //only 1 item in common
		assertEquals("[1, 1, 1, 0, 0]", Arrays.toString(testObject.getCommonItemsUnsorted(new int[] {2, 1, 0, 1, 0, 1, 1, 1, 3}, new int[] {5, 0, 1, 1, 0, 0, 0, 0, 1, 6}))); 
	}

	@Test
	public void testNoCommonItems() {
		assertTrue(testObject.noCommonItems(new int[][]{empty, singleItemArray}));
		assertTrue(testObject.noCommonItems(new int[][]{tenMultiples, nonNegsShort})); 
		assertFalse(testObject.noCommonItems(new int[][]{nonNegsLong, positives})); 
		assertFalse(testObject.noCommonItems(new int[][]{mixed, allZeroes}));
		assertFalse(testObject.noCommonItems(new int[][]{tenMultiples, nonNegsShort, nonNegsLong})); 
		assertFalse(testObject.noCommonItems(new int[][]{positives, mixed, allZeroes})); 

		int[] w = {1,2,3,4};
		int[] x = {5,6,7,8};
		int[] y = {9,10,11,12};
		int[] z = {13,14,15,16};
		assertTrue(testObject.noCommonItems(new int[][]{w, x, y, z})); 

		x = null;
		assertTrue(testObject.noCommonItems(new int[][]{w, x, y, z})); 

		z[3] = 10;
		assertFalse(testObject.noCommonItems(new int[][]{w, x, y, z})); //because y and z have 10 in common
	}

	@Test
	public void testGetLongestMirroredSequence() {
		assertEquals("[777]", Arrays.toString(testObject.getLongestMirroredSequence(singleItemArray)));
		assertEquals("[20, 30, 40]", Arrays.toString(testObject.getLongestMirroredSequence(new int[]{10, 20, 30, 40, 50, 20, 10, 40, 30, 20, 50, 40})));
		assertEquals("[1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1]", Arrays.toString(testObject.getLongestMirroredSequence(new int[]{1,2,1,2,1,2,1,2,1,2,1,2})));
		assertEquals("[1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1]", Arrays.toString(testObject.getLongestMirroredSequence(new int[]{1,2,1,2,1,2,1,2,1,2,1,2,1})));
		assertEquals("[5]", Arrays.toString(testObject.getLongestMirroredSequence(new int[]{5,6,7,8,9})));
		assertEquals("[6, 7, 5, 7, 6]", Arrays.toString(testObject.getLongestMirroredSequence(new int[]{5,6,7,5,7,6,8,5,6,9})));
		assertEquals("[10]", Arrays.toString(testObject.getLongestMirroredSequence(tenMultiples)));
	}
	
	@Test 
	public void testGetSet() {
		int[] a = null;
		assertNull(testObject.getSet(a));

		a = new int[]{};
		int[] b = new int[]{};
		assertNotNull(testObject.getSet(a));
		assertArrayEquals(b, testObject.getSet(a));

		a = new int[]{5, 5, 7, 2, 2, 2, 2};
		b = new int[]{5, 7, 2};
		assertNotNull(testObject.getSet(a));
		assertArrayEquals(b, testObject.getSet(a));

		a = new int[]{10, 10, 3, 20, 20};
		b = new int[]{10, 3, 20};
		assertNotNull(testObject.getSet(a));
		assertArrayEquals(b, testObject.getSet(a));

		a = new int[]{6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 6 ,6 ,6, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7};
		b = new int[]{6, 7};
		assertNotNull(testObject.getSet(a));
		assertArrayEquals(b, testObject.getSet(a));
	}
}
