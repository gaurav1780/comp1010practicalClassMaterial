package practicePackage.arrays.testsAttempts;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.arrays.attempts.Stage3;

public class Stage3Test {

	private int[] empty;
	private int[] singleItemArray;
	private int[] multiplesTen1;
	private int[] multiplesTen2;
	private int[] reverseMultiplesTen;
	private int[] mixedPosNeg;
	private int[] allZeroes1;
	private int[] allZeroes2;

	@BeforeEach
	void run() {
		empty = new int[]{};
		singleItemArray = new int[]{777};
		multiplesTen1 = new int[]{10, 70, 20, 90};
		multiplesTen2 = new int[]{10, 70, 20, 90};
		reverseMultiplesTen = new int[]{90, 20, 70, 10};
		mixedPosNeg = new int[]{-50, 30, -20, 0, 20, -30, 50};
		allZeroes1 = new int[]{0, 0, 0, 0, 0};
		allZeroes2 = new int[]{0, 0, 0, 0, 0};
	}

	@Test
	void testGeneratePatternedArray() {
		assertNull(Stage3.generatePatternedArray(-1, 2, 5));

		assertNotNull(Stage3.generatePatternedArray(0, 2, 5));
		assertEquals("[]", Arrays.toString(Stage3.generatePatternedArray(0, 2, 5)));

		assertNotNull(Stage3.generatePatternedArray(5, 2, 3));
		assertEquals("[2, 5, 8, 11, 14]", Arrays.toString(Stage3.generatePatternedArray(5, 2, 3)));

		assertNotNull(Stage3.generatePatternedArray(7, 0, -3));
		assertEquals("[0, -3, -6, -9, -12, -15, -18]", Arrays.toString(Stage3.generatePatternedArray(7, 0, -3)));
	}

	@Test
	void testCountUniqueItems() {
		assertEquals(0, Stage3.countUniqueItems(null));
		assertEquals(0, Stage3.countUniqueItems(empty));
		assertEquals(1, Stage3.countUniqueItems(singleItemArray));
		assertEquals(4, Stage3.countUniqueItems(multiplesTen1));
		assertEquals(0, Stage3.countUniqueItems(allZeroes1));
		assertEquals(1, Stage3.countUniqueItems(new int[] {10,20,30,40,40,30,20,10,50}));
	}

	@Test
	void testIdentical() {
		assertFalse(Stage3.identical(multiplesTen1, null));
		assertFalse(Stage3.identical(null, multiplesTen2));
		assertFalse(Stage3.identical(null, null));
		assertFalse(Stage3.identical(empty, singleItemArray));
		assertTrue(Stage3.identical(multiplesTen1, multiplesTen2));
		assertTrue(Stage3.identical(multiplesTen2, multiplesTen1));
		assertFalse(Stage3.identical(multiplesTen1, new int[]{10, 20, 70, 90}));
		assertFalse(Stage3.identical(multiplesTen2, new int[]{10, 70, 20}));
		assertFalse(Stage3.identical(multiplesTen1, new int[]{10, 70}));
		assertFalse(Stage3.identical(multiplesTen2, new int[]{10}));
		assertTrue(Stage3.identical(allZeroes1, allZeroes2));
		assertTrue(Stage3.identical(allZeroes2, allZeroes1));
	}

	@Test
	void testContains() {
		assertFalse(Stage3.contains(multiplesTen1, null));
		assertFalse(Stage3.contains(null, multiplesTen2));
		assertFalse(Stage3.contains(null, null));
		assertFalse(Stage3.contains(empty, singleItemArray));
		assertTrue(Stage3.contains(singleItemArray, empty));
		assertTrue(Stage3.contains(multiplesTen1, multiplesTen2));
		assertTrue(Stage3.contains(multiplesTen2, multiplesTen1));
		assertTrue(Stage3.contains(multiplesTen1, reverseMultiplesTen));
		assertTrue(Stage3.contains(reverseMultiplesTen, multiplesTen1));
		int[] arr = {10, -70, 20, -90, 90, -20, 70, -10};
		assertTrue(Stage3.contains(arr, multiplesTen1));
		assertTrue(Stage3.contains(arr, multiplesTen2));
		assertTrue(Stage3.contains(arr, reverseMultiplesTen));
		assertTrue(Stage3.contains(allZeroes1, allZeroes2));
		assertTrue(Stage3.contains(allZeroes2, allZeroes1));
	}

	@Test
	void testSame() {
		assertFalse(Stage3.same(multiplesTen1, null));
		assertFalse(Stage3.same(null, multiplesTen2));
		assertFalse(Stage3.same(null, null));
		assertFalse(Stage3.same(empty, singleItemArray));
		assertFalse(Stage3.same(singleItemArray, empty));
		assertTrue(Stage3.same(multiplesTen1, multiplesTen2));
		assertTrue(Stage3.same(multiplesTen2, multiplesTen1));
		assertTrue(Stage3.same(multiplesTen1, reverseMultiplesTen));
		assertTrue(Stage3.same(reverseMultiplesTen, multiplesTen1));
		int[] arr = {10, -70, 20, -90, 90, -20, 70, -10};
		assertFalse(Stage3.same(arr, multiplesTen1));
		assertFalse(Stage3.same(arr, multiplesTen2));
		assertFalse(Stage3.same(arr, reverseMultiplesTen));
		assertTrue(Stage3.same(allZeroes1, allZeroes2));
		assertTrue(Stage3.same(allZeroes2, allZeroes1));
	}

	@Test
	void testMutuallyReverse() {
		assertFalse(Stage3.mutuallyReverse(reverseMultiplesTen, null));
		assertFalse(Stage3.mutuallyReverse(null, mixedPosNeg));
		assertFalse(Stage3.mutuallyReverse(null, null));
		assertFalse(Stage3.mutuallyReverse(empty, singleItemArray));
		assertTrue(Stage3.mutuallyReverse(multiplesTen1, reverseMultiplesTen));
		assertTrue(Stage3.mutuallyReverse(reverseMultiplesTen, multiplesTen2));
		assertFalse(Stage3.mutuallyReverse(multiplesTen1, multiplesTen2));
		assertFalse(Stage3.mutuallyReverse(multiplesTen1, new int[]{90, 70, 20, 10}));
		assertFalse(Stage3.mutuallyReverse(multiplesTen2, new int[]{90, 20, 70}));
		assertFalse(Stage3.mutuallyReverse(multiplesTen1, new int[]{90, 20}));
		assertFalse(Stage3.mutuallyReverse(multiplesTen2, new int[]{90})); 
		assertTrue(Stage3.mutuallyReverse(allZeroes1, allZeroes2));
		assertTrue(Stage3.mutuallyReverse(allZeroes2, allZeroes1));
	}

	@Test
	void testMerge() {
		assertNull(Stage3.merge(reverseMultiplesTen, null));
		assertNull(Stage3.merge(null, mixedPosNeg));
		assertNull(Stage3.merge(null, null));
		assertEquals(0, Stage3.merge(empty, empty).length);
		assertEquals("[777]", Arrays.toString(Stage3.merge(empty, singleItemArray)));
		assertEquals("[777]", Arrays.toString(Stage3.merge(singleItemArray, empty)));
		assertEquals("[10, 70, 20, 90, 10, 70, 20, 90]", Arrays.toString(Stage3.merge(multiplesTen1, multiplesTen2)));
		assertEquals("[10, 70, 20, 90, 90, 20, 70, 10]", Arrays.toString(Stage3.merge(multiplesTen2, reverseMultiplesTen)));
		assertEquals("[90, 20, 70, 10, 10, 70, 20, 90]", Arrays.toString(Stage3.merge(reverseMultiplesTen, multiplesTen1)));
		assertEquals("[-50, 30, -20, 0, 20, -30, 50, 0, 0, 0, 0, 0]", Arrays.toString(Stage3.merge(mixedPosNeg, allZeroes1)));
		assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(Stage3.merge(allZeroes1, allZeroes1)));
		assertEquals("[0, 0, 0, 0, 0, -50, 30, -20, 0, 20, -30, 50]", Arrays.toString(Stage3.merge(allZeroes2, mixedPosNeg)));
		assertEquals("[-50, 30, -20, 0, 20, -30, 50, -50, 30, -20, 0, 20, -30, 50]", Arrays.toString(Stage3.merge(mixedPosNeg, mixedPosNeg)));
	}

	@Test
	void testGenerate() {
		assertNull(Stage3.generate(-1));
		assertEquals(0, Stage3.generate(0).length);
		assertEquals(235, Stage3.generate(235).length);
		assertEquals("[1, 2]", Arrays.toString(Stage3.generate(2)));
		assertNotEquals("[0, 1, 2]", Arrays.toString(Stage3.generate(3)));
		assertNotEquals("[2, 3, 4, 5, 6]", Arrays.toString(Stage3.generate(5)));
	}

	@Test
	void testGetReverse() {
		assertNull(Stage3.getReverse(null));
		assertEquals(0, Stage3.getReverse(empty).length);
		assertEquals("[777]", Arrays.toString(Stage3.getReverse(singleItemArray)));
		assertEquals(Arrays.toString(reverseMultiplesTen), Arrays.toString(Stage3.getReverse(multiplesTen1)));
		assertEquals(Arrays.toString(multiplesTen2), Arrays.toString(Stage3.getReverse(reverseMultiplesTen)));
		assertNotEquals(Arrays.toString(multiplesTen1), Arrays.toString(Stage3.getReverse(multiplesTen2)));
		assertNotEquals("[90, 70, 20, 10]", Arrays.toString(Stage3.getReverse(multiplesTen1)));
		assertNotEquals("[90, 20, 70]", Arrays.toString(Stage3.getReverse(multiplesTen2)));
		assertNotEquals("[90, 20]", Arrays.toString(Stage3.getReverse(multiplesTen1)));
		assertNotEquals("[90]", Arrays.toString(Stage3.getReverse(multiplesTen2)));
		assertEquals(Arrays.toString(allZeroes1), Arrays.toString(Stage3.getReverse(allZeroes2)));
		assertEquals(Arrays.toString(allZeroes2), Arrays.toString(Stage3.getReverse(allZeroes1)));
	}

	@Test
	void testGetMostFrequentItem() {
		assertEquals(2, Stage3.getMostFrequentItem(new int[]{1, 2, 2, 3, 5, 2, 2, 7}));
		assertEquals(3, Stage3.getMostFrequentItem(new int[]{3, 5, 7, 9, 11, 13, 5, 3}));
		assertEquals(5, Stage3.getMostFrequentItem(new int[]{5, 5, 5, 5, 5, 5, 5, 5}));
	}

	@Test
	void testGetLeastFrequentItem() {
		assertEquals(5, Stage3.getLeastFrequentItem(new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5}));
		assertEquals(3, Stage3.getLeastFrequentItem(new int[]{3, 11, 11, 15, 15, 15, 19, 19, 19, 19, 23, 23, 23, 23, 23, 7}));
		assertEquals(2, Stage3.getLeastFrequentItem(new int[]{2, 2, 2, 2, 2, 2, 2, 2}));
	}

	@Test
	void testGetFrequencyTable() {
		assertNull(Stage3.getFrequencyTable(null));
		assertNotNull(Stage3.getFrequencyTable(empty));
		assertEquals(0, Stage3.getFrequencyTable(empty).length);
		assertNotNull(Stage3.getFrequencyTable(singleItemArray));
		assertEquals("[1]", Arrays.toString(Stage3.getFrequencyTable(singleItemArray)));
		assertNotNull(Stage3.getFrequencyTable(mixedPosNeg));
		assertEquals("[1, 1, 1, 1, 1, 1, 1]", Arrays.toString(Stage3.getFrequencyTable(mixedPosNeg)));
		assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(Stage3.getFrequencyTable(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5})));
		assertEquals("[2, 3, 5]", Arrays.toString(Stage3.getFrequencyTable(new int[]{4, 7, 13, 13, 7, 13, 13, 13, 7, 4})));
	}

	@Test
	void testSubArrayFromIndex() {
		assertNull(Stage3.subarrayFromIndex(null, 23));
		assertNull(Stage3.subarrayFromIndex(empty, 35));
		assertNull(Stage3.subarrayFromIndex(multiplesTen1, -1));
		assertNull(Stage3.subarrayFromIndex(multiplesTen2, 4));
		assertEquals("[90, 20, 70, 10]", Arrays.toString(Stage3.subarrayFromIndex(reverseMultiplesTen, 0)));
		assertEquals("[50]", Arrays.toString(Stage3.subarrayFromIndex(mixedPosNeg, 6)));
		assertEquals("[0, 0, 0, 0]", Arrays.toString(Stage3.subarrayFromIndex(allZeroes1, 1)));
		assertEquals("[0, 0, 0]", Arrays.toString(Stage3.subarrayFromIndex(allZeroes2, 2)));
	}

	@Test
	void testSubArrayUptoIndex() {
		assertNull(Stage3.subarrayUptoIndex(null, 69));
		assertNull(Stage3.subarrayUptoIndex(empty, 96));
		assertNull(Stage3.subarrayUptoIndex(multiplesTen1, -1));
		assertNull(Stage3.subarrayUptoIndex(multiplesTen2, 4));
		assertEquals("[90, 20, 70, 10]", Arrays.toString(Stage3.subarrayUptoIndex(reverseMultiplesTen, 3)));
		assertEquals("[-50]", Arrays.toString(Stage3.subarrayUptoIndex(mixedPosNeg, 0)));
		assertEquals("[0, 0]", Arrays.toString(Stage3.subarrayUptoIndex(allZeroes1, 1)));
		assertEquals("[0, 0, 0]", Arrays.toString(Stage3.subarrayUptoIndex(allZeroes2, 2)));
	}

	@Test
	void testSubarray() {
		assertNull(Stage3.subarray(null, 23, 35)); 
		assertNull(Stage3.subarray(empty, 69, 96));
		assertNull(Stage3.subarray(multiplesTen1, -1, 2));
		assertNull(Stage3.subarray(multiplesTen2, 3, 4));
		assertNull(Stage3.subarray(reverseMultiplesTen, 1, 0));
		assertEquals("[-20, 0, 20]", Arrays.toString(Stage3.subarray(mixedPosNeg, 2, 4)));
		assertEquals(Arrays.toString(allZeroes1), Arrays.toString(Stage3.subarray(allZeroes2, 0, 4)));
	}

	@Test
	void testGetPositives() {
		assertNull(Stage3.getPositives(null)); 
		assertEquals(0, Stage3.getPositives(empty).length); 
		assertEquals(Arrays.toString(multiplesTen1), Arrays.toString(Stage3.getPositives(multiplesTen2)));
		assertEquals(Arrays.toString(multiplesTen2), Arrays.toString(Stage3.getPositives(multiplesTen1)));
		assertEquals(Arrays.toString(reverseMultiplesTen), Arrays.toString(Stage3.getPositives(reverseMultiplesTen)));
		assertNotEquals("[30, 0, 20, 50]", Arrays.toString(Stage3.getPositives(mixedPosNeg)));
		assertEquals("[30, 20, 50]", Arrays.toString(Stage3.getPositives(mixedPosNeg)));
		assertEquals(0, Stage3.getPositives(allZeroes1).length);
		assertEquals(0, Stage3.getPositives(allZeroes2).length);
	}

	@Test
	void testGetNegatives() {
		assertNull(Stage3.getNegatives(null)); 
		assertEquals(0, Stage3.getNegatives(empty).length); 
		assertEquals(0, Stage3.getNegatives(multiplesTen1).length);
		assertEquals(0, Stage3.getNegatives(multiplesTen2).length);
		assertEquals(0, Stage3.getNegatives(reverseMultiplesTen).length);
		assertNotEquals("[-50, -20, 0, -30]", Arrays.toString(Stage3.getNegatives(mixedPosNeg)));
		assertEquals("[-50, -20, -30]", Arrays.toString(Stage3.getNegatives(mixedPosNeg)));
		assertEquals(0, Stage3.getNegatives(allZeroes1).length);
		assertEquals(0, Stage3.getNegatives(allZeroes2).length);
	}

	@Test
	void testGetNonZeroes() {
		assertNull(Stage3.getNonZeroes(null));
		assertEquals(0, Stage3.getNonZeroes(empty).length);
		assertEquals("[10, 70, 20, 90]", Arrays.toString(Stage3.getNonZeroes(multiplesTen1)));
		assertEquals("[10, 70, 20, 90]", Arrays.toString(Stage3.getNonZeroes(multiplesTen2)));
		assertEquals("[90, 20, 70, 10]", Arrays.toString(Stage3.getNonZeroes(reverseMultiplesTen)));
		assertEquals("[-50, 30, -20, 20, -30, 50]", Arrays.toString(Stage3.getNonZeroes(mixedPosNeg)));
		assertEquals(0, Stage3.getNonZeroes(allZeroes1).length);
		assertEquals(0, Stage3.getNonZeroes(allZeroes2).length);
	}

	@Test
	void testGetPrimes() {
		assertNull(Stage3.getPrimes(null)); 
		assertEquals(0, Stage3.getPrimes(empty).length); 
		assertEquals(0, Stage3.getPrimes(mixedPosNeg).length);
		assertEquals("[2, 3, 5]", Arrays.toString(Stage3.getPrimes(new int[]{2, 3, 5})));
		assertEquals("[7]", Arrays.toString(Stage3.getPrimes(new int[]{0, 1, 4, 6, 7, 8, 9})));
	}

	@Test
	void testGetWithoutNegatives() {
		assertNull(Stage3.getWithoutNegatives(null)); 
		assertEquals(0, Stage3.getWithoutNegatives(empty).length); 
		assertEquals(Arrays.toString(multiplesTen1), Arrays.toString(Stage3.getWithoutNegatives(multiplesTen2)));
		assertEquals(Arrays.toString(multiplesTen2), Arrays.toString(Stage3.getWithoutNegatives(multiplesTen1)));
		assertEquals(Arrays.toString(reverseMultiplesTen), Arrays.toString(Stage3.getWithoutNegatives(reverseMultiplesTen)));
		assertNotEquals("[30, 20, 50]", Arrays.toString(Stage3.getWithoutNegatives(mixedPosNeg)));
		assertEquals("[30, 0, 20, 50]", Arrays.toString(Stage3.getWithoutNegatives(mixedPosNeg)));
		assertEquals(Arrays.toString(allZeroes1), Arrays.toString(Stage3.getWithoutNegatives(allZeroes2)));
		assertEquals(Arrays.toString(allZeroes2), Arrays.toString(Stage3.getWithoutNegatives(allZeroes1)));
	}

	@Test
	void testGetWithoutPositives() {
		assertNull(Stage3.getWithoutPositives(null)); 
		assertEquals(0, Stage3.getWithoutPositives(empty).length); 
		assertEquals(0, Stage3.getWithoutPositives(multiplesTen1).length);
		assertEquals(0, Stage3.getWithoutPositives(multiplesTen2).length);
		assertEquals(0, Stage3.getWithoutPositives(reverseMultiplesTen).length);
		assertNotEquals("[-50, -20, -30]", Arrays.toString(Stage3.getWithoutPositives(mixedPosNeg)));
		assertEquals("[-50, -20, 0, -30]", Arrays.toString(Stage3.getWithoutPositives(mixedPosNeg)));
		assertEquals(Arrays.toString(allZeroes1), Arrays.toString(Stage3.getWithoutPositives(allZeroes2)));
		assertEquals(Arrays.toString(allZeroes2), Arrays.toString(Stage3.getWithoutPositives(allZeroes1)));
	}

	@Test
	void testGetUniqueItems() {
		assertNull(Stage3.getUniqueItems(null));
		assertEquals(0, Stage3.getUniqueItems(empty).length);
		assertEquals(Arrays.toString(multiplesTen1), Arrays.toString(Stage3.getUniqueItems(multiplesTen2)));
		assertEquals(Arrays.toString(multiplesTen2), Arrays.toString(Stage3.getUniqueItems(multiplesTen1)));
		assertEquals(Arrays.toString(reverseMultiplesTen), Arrays.toString(Stage3.getUniqueItems(reverseMultiplesTen)));
		assertEquals(Arrays.toString(mixedPosNeg), Arrays.toString(Stage3.getUniqueItems(mixedPosNeg)));
		assertEquals(0, Stage3.getUniqueItems(allZeroes1).length);
		assertEquals(0, Stage3.getUniqueItems(allZeroes2).length);
		assertEquals("[2, 3, 5]", Arrays.toString(Stage3.getUniqueItems(new int[]{4, 2, 4, 3, 6, 5, 6})));
	}

	@Test
	void testGetDeepCopy() {
		assertNull(Stage3.getDeepCopy(null));
		assertEquals(0, Stage3.getDeepCopy(new int[][]{}).length);
		int[][] temp = new int[][]{multiplesTen1, reverseMultiplesTen, allZeroes1};
		assertNotEquals(multiplesTen1, Stage3.getDeepCopy(temp)[0]);
		assertNotEquals(reverseMultiplesTen, Stage3.getDeepCopy(temp)[1]);
		assertNotEquals(allZeroes1, Stage3.getDeepCopy(temp)[2]);
		assertEquals(Arrays.toString(multiplesTen2), Arrays.toString(Stage3.getDeepCopy(temp)[0]));
		assertEquals(Arrays.toString(reverseMultiplesTen), Arrays.toString(Stage3.getDeepCopy(temp)[1]));
		assertEquals(Arrays.toString(allZeroes2), Arrays.toString(Stage3.getDeepCopy(temp)[2]));
	}

	@Test
	void testIndexOf() {
		assertEquals(-1, Stage3.indexOf(empty, singleItemArray));
		assertEquals(-1, Stage3.indexOf(multiplesTen1, new int[]{0, 10, 70, 20, 90}));
		assertEquals(0, Stage3.indexOf(multiplesTen1, multiplesTen2));
		assertEquals(1, Stage3.indexOf(multiplesTen2, new int[]{70, 20}));
		assertEquals(-1, Stage3.indexOf(mixedPosNeg, reverseMultiplesTen));
		assertEquals(3, Stage3.indexOf(mixedPosNeg, new int[]{0}));
		assertEquals(2, Stage3.indexOf(new int[]{23, 35, 90, 20, 70, 10, 69, 90, 20, 70, 10, 96, 90, 20, 70, 10, 13, 4, 7, 13}, reverseMultiplesTen));
		assertEquals(0, Stage3.indexOf(allZeroes2, allZeroes1));
		assertEquals(0, Stage3.indexOf(allZeroes1, allZeroes2));
	}

	@Test
	void testLastIndexOf() {
		assertEquals(-1, Stage3.lastIndexOf(empty, singleItemArray));
		assertEquals(-1, Stage3.lastIndexOf(multiplesTen2, new int[]{0, 10, 70, 20, 90}));
		assertEquals(0, Stage3.lastIndexOf(multiplesTen2, multiplesTen1));
		assertEquals(1, Stage3.lastIndexOf(multiplesTen1, new int[]{70, 20}));
		assertEquals(-1, Stage3.lastIndexOf(mixedPosNeg, reverseMultiplesTen));
		assertEquals(3, Stage3.lastIndexOf(mixedPosNeg, new int[]{0}));
		assertEquals(12, Stage3.lastIndexOf(new int[]{23, 35, 90, 20, 70, 10, 69, 90, 20, 70, 10, 96, 90, 20, 70, 10, 13, 4, 7, 13}, reverseMultiplesTen));
		assertEquals(0, Stage3.lastIndexOf(allZeroes1, allZeroes2));
		assertEquals(0, Stage3.lastIndexOf(allZeroes2, allZeroes1));
	}

	@Test
	void testTotalNumberOfItems() {
		assertEquals(0, Stage3.totalNumberOfItems(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, Stage3.totalNumberOfItems(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(1, Stage3.totalNumberOfItems(multi2));

		int[][] multi3 = new int[][]{{0, 1}, {2, 3, 5}, {4, 6, 8, 7, 9}};
		assertEquals(10, Stage3.totalNumberOfItems(multi3));

		int[][] multi4 = new int[][]{null, {4, 7, 13, 28}, null, {10, 70, 20, 90}};     
		assertEquals(8, Stage3.totalNumberOfItems(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};	     
		assertEquals(0, Stage3.totalNumberOfItems(multi5));
	}

	@Test
	void testTotalNumberOfEvenItems() {
		assertEquals(0, Stage3.totalNumberOfEvenItems(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, Stage3.totalNumberOfEvenItems(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(0, Stage3.totalNumberOfEvenItems(multi2));

		int[][] multi3 = new int[][]{{0, 1}, {2, 3, 5}, {4, 6, 8, 7, 9}};
		assertEquals(5, Stage3.totalNumberOfEvenItems(multi3));

		int[][] multi4 = new int[][]{null, {4, 7, 13, 28}, null, {10, 70, 20, 90}};     
		assertEquals(6, Stage3.totalNumberOfEvenItems(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};	     
		assertEquals(0, Stage3.totalNumberOfEvenItems(multi5));
	}

	@Test
	void testTotalNumberOfOddItems() {
		assertEquals(0, Stage3.totalNumberOfOddItems(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, Stage3.totalNumberOfOddItems(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(1, Stage3.totalNumberOfOddItems(multi2));

		int[][] multi3 = new int[][]{{0, 1}, {2, 3, 5}, {4, 6, 8, 7, 9}};
		assertEquals(5, Stage3.totalNumberOfOddItems(multi3));

		int[][] multi4 = new int[][]{null, {4, 7, 13, 28}, null, {10, 70, 20, 90}};     
		assertEquals(2, Stage3.totalNumberOfOddItems(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};	     
		assertEquals(0, Stage3.totalNumberOfOddItems(multi5));
	}

	@Test
	void testTotalNumberOfPositiveItems() {
		assertEquals(0, Stage3.totalNumberOfPositiveItems(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, Stage3.totalNumberOfPositiveItems(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(1, Stage3.totalNumberOfPositiveItems(multi2));

		int[][] multi3 = new int[][]{{0, -1}, {-2, 3, -5}, {4, -6, 8, -7, 9}};
		assertEquals(4, Stage3.totalNumberOfPositiveItems(multi3));

		int[][] multi4 = new int[][]{null, {4, -7, 13, -28}, null, {-10, 70, -20, 90}};     
		assertEquals(4, Stage3.totalNumberOfPositiveItems(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};	     
		assertEquals(0, Stage3.totalNumberOfPositiveItems(multi5));
	}

	@Test
	void testTotalNumberOfNegativeItems() {
		assertEquals(0, Stage3.totalNumberOfNegativeItems(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, Stage3.totalNumberOfNegativeItems(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(0, Stage3.totalNumberOfNegativeItems(multi2));

		int[][] multi3 = new int[][]{{0, -1}, {-2, 3, -5}, {4, -6, 8, -7, 9}};
		assertEquals(5, Stage3.totalNumberOfNegativeItems(multi3));

		int[][] multi4 = new int[][]{null, {4, -7, 13, -28}, null, {-10, 70, -20, 90}};     
		assertEquals(4, Stage3.totalNumberOfNegativeItems(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};	     
		assertEquals(0, Stage3.totalNumberOfNegativeItems(multi5));
	}

	@Test
	void testTotalNumberOfUniqueItems() {
		assertEquals(0, Stage3.totalNumberOfUniqueItems(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, Stage3.totalNumberOfUniqueItems(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(1, Stage3.totalNumberOfUniqueItems(multi2));

		int[][] multi3 = new int[][]{{0, -1}, {-2, 3, -5}, {4, -6, 8, -7, 9}};
		assertEquals(10, Stage3.totalNumberOfUniqueItems(multi3));

		int[][] multi4 = new int[][]{null, {2, 4, 2, -7, 3, 13, 3, -28}, null, {0, -10, 0, 70, 5, -20, 5, 90}};     
		assertEquals(8, Stage3.totalNumberOfUniqueItems(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};	     
		assertEquals(0, Stage3.totalNumberOfUniqueItems(multi5));
	}

	@Test
	void testCountNullSubarrays() {
		assertEquals(0, Stage3.countNullSubarrays(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, Stage3.countNullSubarrays(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(0, Stage3.countNullSubarrays(multi2));

		int[][] multi3 = new int[][]{{0, 1}, {2, 3, 5}, {4, 6, 8, 7, 9}};
		assertEquals(0, Stage3.countNullSubarrays(multi3));

		int[][] multi4 = new int[][]{null, {4, 7, 13, 28}, null, {10, 70, 20, 90}};
		assertEquals(2, Stage3.countNullSubarrays(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};
		assertEquals(5, Stage3.countNullSubarrays(multi5));
	}

	@Test
	void testCountNonNullSubarrays() {
		assertEquals(0, Stage3.countNonNullSubarrays(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(1, Stage3.countNonNullSubarrays(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(1, Stage3.countNonNullSubarrays(multi2));

		int[][] multi3 = new int[][]{{0, 1}, {2, 3, 5}, {4, 6, 8, 7, 9}};
		assertEquals(3, Stage3.countNonNullSubarrays(multi3));

		int[][] multi4 = new int[][]{null, {4, 7, 13, 28}, null, {10, 70, 20, 90}};
		assertEquals(2, Stage3.countNonNullSubarrays(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};
		assertEquals(0, Stage3.countNonNullSubarrays(multi5));
	}
}
