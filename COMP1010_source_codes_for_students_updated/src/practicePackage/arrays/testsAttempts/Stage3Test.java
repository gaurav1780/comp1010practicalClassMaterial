package practicePackage.arrays.testsAttempts;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.arrays.attempts.Stage3;

public class Stage3Test {
	protected practicePackage.arrays.attempts.Stage3 testObject;
	
	private int[] empty;
	private int[] singleItemArray;
	private int[] multiplesTen1;
	private int[] multiplesTen2;
	private int[] reverseMultiplesTen;
	private int[] mixedPosNeg;
	private int[] allZeroes1;
	private int[] allZeroes2;

	@BeforeEach
	public void run() {
		testObject = new practicePackage.arrays.attempts.Stage3();
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
	public void testGeneratePatternedArray() {
		assertNull(testObject.generatePatternedArray(-1, 2, 5));

		assertNotNull(testObject.generatePatternedArray(0, 2, 5));
		assertEquals("[]", Arrays.toString(testObject.generatePatternedArray(0, 2, 5)));

		assertNotNull(testObject.generatePatternedArray(5, 2, 3));
		assertEquals("[2, 5, 8, 11, 14]", Arrays.toString(testObject.generatePatternedArray(5, 2, 3)));

		assertNotNull(testObject.generatePatternedArray(7, 0, -3));
		assertEquals("[0, -3, -6, -9, -12, -15, -18]", Arrays.toString(testObject.generatePatternedArray(7, 0, -3)));
	}

	@Test
	public void testCountUniqueItems() {
		assertEquals(0, testObject.countUniqueItems(null));
		assertEquals(0, testObject.countUniqueItems(empty));
		assertEquals(1, testObject.countUniqueItems(singleItemArray));
		assertEquals(4, testObject.countUniqueItems(multiplesTen1));
		assertEquals(0, testObject.countUniqueItems(allZeroes1));
		assertEquals(1, testObject.countUniqueItems(new int[] {10,20,30,40,40,30,20,10,50}));
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
	public void testContains() {
		assertFalse(testObject.contains(multiplesTen1, null));
		assertFalse(testObject.contains(null, multiplesTen2));
		assertFalse(testObject.contains(null, null));
		assertFalse(testObject.contains(empty, singleItemArray));
		assertTrue(testObject.contains(singleItemArray, empty));
		assertTrue(testObject.contains(multiplesTen1, multiplesTen2));
		assertTrue(testObject.contains(multiplesTen2, multiplesTen1));
		assertTrue(testObject.contains(multiplesTen1, reverseMultiplesTen));
		assertTrue(testObject.contains(reverseMultiplesTen, multiplesTen1));
		int[] arr = {10, -70, 20, -90, 90, -20, 70, -10};
		assertTrue(testObject.contains(arr, multiplesTen1));
		assertTrue(testObject.contains(arr, multiplesTen2));
		assertTrue(testObject.contains(arr, reverseMultiplesTen));
		assertTrue(testObject.contains(allZeroes1, allZeroes2));
		assertTrue(testObject.contains(allZeroes2, allZeroes1));
		
		int[] arr1 = {10, -70, 20, -90, 90, -20, 70, -10};
		int[] arr2 = {-70, 1};
		assertFalse(testObject.contains(arr1, arr2));
		
	}

	@Test
	public void testSame() {
		assertFalse(testObject.same(multiplesTen1, null));
		assertFalse(testObject.same(null, multiplesTen2));
		assertFalse(testObject.same(null, null));
		assertFalse(testObject.same(empty, singleItemArray));
		assertFalse(testObject.same(singleItemArray, empty));
		assertTrue(testObject.same(multiplesTen1, multiplesTen2));
		assertTrue(testObject.same(multiplesTen2, multiplesTen1));
		assertTrue(testObject.same(multiplesTen1, reverseMultiplesTen));
		assertTrue(testObject.same(reverseMultiplesTen, multiplesTen1));
		int[] arr = {10, -70, 20, -90, 90, -20, 70, -10};
		assertFalse(testObject.same(arr, multiplesTen1));
		assertFalse(testObject.same(arr, multiplesTen2));
		assertFalse(testObject.same(arr, reverseMultiplesTen));
		assertTrue(testObject.same(allZeroes1, allZeroes2));
		assertTrue(testObject.same(allZeroes2, allZeroes1));
		
		int[] arr1 = {10, -70, 20, -90, 90, -20, 70, -10};
		int[] arr2 = {10, -70, 20, -90, 90, -20, 70, -6};
		assertFalse(testObject.same(arr1, arr2));
		
	}

	@Test
	public void testMutuallyReverse() {
		assertFalse(testObject.mutuallyReverse(reverseMultiplesTen, null));
		assertFalse(testObject.mutuallyReverse(null, mixedPosNeg));
		assertFalse(testObject.mutuallyReverse(null, null));
		assertFalse(testObject.mutuallyReverse(empty, singleItemArray));
		assertTrue(testObject.mutuallyReverse(multiplesTen1, reverseMultiplesTen));
		assertTrue(testObject.mutuallyReverse(reverseMultiplesTen, multiplesTen2));
		assertFalse(testObject.mutuallyReverse(multiplesTen1, multiplesTen2));
		assertFalse(testObject.mutuallyReverse(multiplesTen1, new int[]{90, 70, 20, 10}));
		assertFalse(testObject.mutuallyReverse(multiplesTen2, new int[]{90, 20, 70}));
		assertFalse(testObject.mutuallyReverse(multiplesTen1, new int[]{90, 20}));
		assertFalse(testObject.mutuallyReverse(multiplesTen2, new int[]{90})); 
		assertTrue(testObject.mutuallyReverse(allZeroes1, allZeroes2));
		assertTrue(testObject.mutuallyReverse(allZeroes2, allZeroes1));
	}

	@Test
	public void testMerge() {
		assertNull(testObject.merge(reverseMultiplesTen, null));
		assertNull(testObject.merge(null, mixedPosNeg));
		assertNull(testObject.merge(null, null));
		assertEquals(0, testObject.merge(empty, empty).length);
		assertEquals("[777]", Arrays.toString(testObject.merge(empty, singleItemArray)));
		assertEquals("[777]", Arrays.toString(testObject.merge(singleItemArray, empty)));
		assertEquals("[10, 70, 20, 90, 10, 70, 20, 90]", Arrays.toString(testObject.merge(multiplesTen1, multiplesTen2)));
		assertEquals("[10, 70, 20, 90, 90, 20, 70, 10]", Arrays.toString(testObject.merge(multiplesTen2, reverseMultiplesTen)));
		assertEquals("[90, 20, 70, 10, 10, 70, 20, 90]", Arrays.toString(testObject.merge(reverseMultiplesTen, multiplesTen1)));
		assertEquals("[-50, 30, -20, 0, 20, -30, 50, 0, 0, 0, 0, 0]", Arrays.toString(testObject.merge(mixedPosNeg, allZeroes1)));
		assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(testObject.merge(allZeroes1, allZeroes1)));
		assertEquals("[0, 0, 0, 0, 0, -50, 30, -20, 0, 20, -30, 50]", Arrays.toString(testObject.merge(allZeroes2, mixedPosNeg)));
		assertEquals("[-50, 30, -20, 0, 20, -30, 50, -50, 30, -20, 0, 20, -30, 50]", Arrays.toString(testObject.merge(mixedPosNeg, mixedPosNeg)));
	}

	@Test
	public void testGenerate() {
		assertNull(testObject.generate(-1));
		assertEquals(0, testObject.generate(0).length);
		assertEquals(235, testObject.generate(235).length);
		assertEquals("[1, 2]", Arrays.toString(testObject.generate(2)));
		assertNotEquals("[0, 1, 2]", Arrays.toString(testObject.generate(3)));
		assertNotEquals("[2, 3, 4, 5, 6]", Arrays.toString(testObject.generate(5)));
	}

	@Test
	public void testGetReverse() {
		assertNull(testObject.getReverse(null));
		assertEquals(0, testObject.getReverse(empty).length);
		assertEquals("[777]", Arrays.toString(testObject.getReverse(singleItemArray)));
		assertEquals(Arrays.toString(reverseMultiplesTen), Arrays.toString(testObject.getReverse(multiplesTen1)));
		assertEquals(Arrays.toString(multiplesTen2), Arrays.toString(testObject.getReverse(reverseMultiplesTen)));
		assertNotEquals(Arrays.toString(multiplesTen1), Arrays.toString(testObject.getReverse(multiplesTen2)));
		assertNotEquals("[90, 70, 20, 10]", Arrays.toString(testObject.getReverse(multiplesTen1)));
		assertNotEquals("[90, 20, 70]", Arrays.toString(testObject.getReverse(multiplesTen2)));
		assertNotEquals("[90, 20]", Arrays.toString(testObject.getReverse(multiplesTen1)));
		assertNotEquals("[90]", Arrays.toString(testObject.getReverse(multiplesTen2)));
		assertEquals(Arrays.toString(allZeroes1), Arrays.toString(testObject.getReverse(allZeroes2)));
		assertEquals(Arrays.toString(allZeroes2), Arrays.toString(testObject.getReverse(allZeroes1)));
	}

	@Test
	public void testGetMostFrequentItem() {
		assertEquals(2, testObject.getMostFrequentItem(new int[]{1, 2, 2, 3, 5, 2, 2, 7}));
		assertEquals(3, testObject.getMostFrequentItem(new int[]{3, 5, 7, 9, 11, 13, 5, 3}));
		assertEquals(5, testObject.getMostFrequentItem(new int[]{5, 5, 5, 5, 5, 5, 5, 5}));
		assertEquals(1, testObject.getMostFrequentItem(new int[]{1, 2, 3, 4, 5, 6, 7}));
		assertEquals(1, testObject.getMostFrequentItem(new int[]{1, 2, 2, 1, 3, 4, 5, 6, 7}));
		assertEquals(7, testObject.getMostFrequentItem(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7}));
		assertEquals(7, testObject.getMostFrequentItem(new int[]{1, 2, 4, 5, 6, 7, 7, 7, 7, 7, 5, 5}));
		assertEquals(7, testObject.getMostFrequentItem(new int[]{1, 2, 4, 7, 6, 7, 7, 5, 7, 5, 5, 5}));
        assertEquals(2, testObject.getMostFrequentItem(new int[]{1, 2, 4, 7,7,2,5}));
	}

	@Test
	public void testGetLeastFrequentItem() {
		assertEquals(5, testObject.getLeastFrequentItem(new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5}));
		assertEquals(3, testObject.getLeastFrequentItem(new int[]{3, 11, 11, 15, 15, 15, 19, 19, 19, 19, 23, 23, 23, 23, 23, 7}));
		assertEquals(2, testObject.getLeastFrequentItem(new int[]{2, 2, 2, 2, 2, 2, 2, 2}));
		assertEquals(1, testObject.getLeastFrequentItem(new int[]{1, 2, 3, 4, 5, 6, 7}));
		assertEquals(7, testObject.getLeastFrequentItem(new int[]{8, 8, 8, 8, 6, 6, 6, 7, 7}));
		assertEquals(7, testObject.getLeastFrequentItem(new int[]{7, 7, 7, 5, 5, 5}));
		assertEquals(5, testObject.getLeastFrequentItem(new int[]{5, 7, 5, 7, 1, 1, 1, 1, 5, 7}));
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

	@Test
	public void testSubArrayFromIndex() {
		assertNull(testObject.subarrayFromIndex(null, 23));
		assertNull(testObject.subarrayFromIndex(empty, 35));
		assertNull(testObject.subarrayFromIndex(multiplesTen1, -1));
		assertNull(testObject.subarrayFromIndex(multiplesTen2, 4));
		assertEquals("[90, 20, 70, 10]", Arrays.toString(testObject.subarrayFromIndex(reverseMultiplesTen, 0)));
		assertEquals("[50]", Arrays.toString(testObject.subarrayFromIndex(mixedPosNeg, 6)));
		assertEquals("[0, 0, 0, 0]", Arrays.toString(testObject.subarrayFromIndex(allZeroes1, 1)));
		assertEquals("[0, 0, 0]", Arrays.toString(testObject.subarrayFromIndex(allZeroes2, 2)));
	}

	@Test
	public void testSubArrayUptoIndex() {
		assertNull(testObject.subarrayUptoIndex(null, 69));
		assertNull(testObject.subarrayUptoIndex(empty, 96));
		assertNull(testObject.subarrayUptoIndex(multiplesTen1, -1));
		assertNull(testObject.subarrayUptoIndex(multiplesTen2, 4));
		assertEquals("[90, 20, 70, 10]", Arrays.toString(testObject.subarrayUptoIndex(reverseMultiplesTen, 3)));
		assertEquals("[-50]", Arrays.toString(testObject.subarrayUptoIndex(mixedPosNeg, 0)));
		assertEquals("[0, 0]", Arrays.toString(testObject.subarrayUptoIndex(allZeroes1, 1)));
		assertEquals("[0, 0, 0]", Arrays.toString(testObject.subarrayUptoIndex(allZeroes2, 2)));
	}

	@Test
	public void testSubarray() {
		assertNull(testObject.subarray(null, 23, 35)); 
		assertNull(testObject.subarray(empty, 69, 96));
		assertNull(testObject.subarray(multiplesTen1, -1, 2));
		assertNull(testObject.subarray(multiplesTen2, 3, 4));
		assertNull(testObject.subarray(reverseMultiplesTen, 1, 0));
		assertEquals("[-20, 0, 20]", Arrays.toString(testObject.subarray(mixedPosNeg, 2, 4)));
		assertEquals(Arrays.toString(allZeroes1), Arrays.toString(testObject.subarray(allZeroes2, 0, 4)));
	}

	@Test
	public void testGetPositives() {
		assertNull(testObject.getPositives(null)); 
		assertEquals(0, testObject.getPositives(empty).length); 
		assertEquals(Arrays.toString(multiplesTen1), Arrays.toString(testObject.getPositives(multiplesTen2)));
		assertEquals(Arrays.toString(multiplesTen2), Arrays.toString(testObject.getPositives(multiplesTen1)));
		assertEquals(Arrays.toString(reverseMultiplesTen), Arrays.toString(testObject.getPositives(reverseMultiplesTen)));
		assertNotEquals("[30, 0, 20, 50]", Arrays.toString(testObject.getPositives(mixedPosNeg)));
		assertEquals("[30, 20, 50]", Arrays.toString(testObject.getPositives(mixedPosNeg)));
		assertEquals(0, testObject.getPositives(allZeroes1).length);
		assertEquals(0, testObject.getPositives(allZeroes2).length);
	}

	@Test
	public void testGetNegatives() {
		assertNull(testObject.getNegatives(null)); 
		assertEquals(0, testObject.getNegatives(empty).length); 
		assertEquals(0, testObject.getNegatives(multiplesTen1).length);
		assertEquals(0, testObject.getNegatives(multiplesTen2).length);
		assertEquals(0, testObject.getNegatives(reverseMultiplesTen).length);
		assertNotEquals("[-50, -20, 0, -30]", Arrays.toString(testObject.getNegatives(mixedPosNeg)));
		assertEquals("[-50, -20, -30]", Arrays.toString(testObject.getNegatives(mixedPosNeg)));
		assertEquals(0, testObject.getNegatives(allZeroes1).length);
		assertEquals(0, testObject.getNegatives(allZeroes2).length);
	}

	@Test
	public void testGetNonZeroes() {
		assertNull(testObject.getNonZeroes(null));
		assertEquals(0, testObject.getNonZeroes(empty).length);
		assertEquals("[10, 70, 20, 90]", Arrays.toString(testObject.getNonZeroes(multiplesTen1)));
		assertEquals("[10, 70, 20, 90]", Arrays.toString(testObject.getNonZeroes(multiplesTen2)));
		assertEquals("[90, 20, 70, 10]", Arrays.toString(testObject.getNonZeroes(reverseMultiplesTen)));
		assertEquals("[-50, 30, -20, 20, -30, 50]", Arrays.toString(testObject.getNonZeroes(mixedPosNeg)));
		assertEquals(0, testObject.getNonZeroes(allZeroes1).length);
		assertEquals(0, testObject.getNonZeroes(allZeroes2).length);
	}

	@Test
	public void testGetPrimes() {
		assertNull(testObject.getPrimes(null)); 
		assertEquals(0, testObject.getPrimes(empty).length); 
		assertEquals(0, testObject.getPrimes(mixedPosNeg).length);
		assertEquals("[2, 3, 5]", Arrays.toString(testObject.getPrimes(new int[]{2, 3, 5})));
		assertEquals("[7]", Arrays.toString(testObject.getPrimes(new int[]{0, 1, 4, 6, 7, 8, 9})));
	}

	@Test
	public void testGetWithoutNegatives() {
		assertNull(testObject.getWithoutNegatives(null)); 
		assertEquals(0, testObject.getWithoutNegatives(empty).length); 
		assertEquals(Arrays.toString(multiplesTen1), Arrays.toString(testObject.getWithoutNegatives(multiplesTen2)));
		assertEquals(Arrays.toString(multiplesTen2), Arrays.toString(testObject.getWithoutNegatives(multiplesTen1)));
		assertEquals(Arrays.toString(reverseMultiplesTen), Arrays.toString(testObject.getWithoutNegatives(reverseMultiplesTen)));
		assertNotEquals("[30, 20, 50]", Arrays.toString(testObject.getWithoutNegatives(mixedPosNeg)));
		assertEquals("[30, 0, 20, 50]", Arrays.toString(testObject.getWithoutNegatives(mixedPosNeg)));
		assertEquals(Arrays.toString(allZeroes1), Arrays.toString(testObject.getWithoutNegatives(allZeroes2)));
		assertEquals(Arrays.toString(allZeroes2), Arrays.toString(testObject.getWithoutNegatives(allZeroes1)));
	}

	@Test
	public void testGetWithoutPositives() {
		assertNull(testObject.getWithoutPositives(null)); 
		assertEquals(0, testObject.getWithoutPositives(empty).length); 
		assertEquals(0, testObject.getWithoutPositives(multiplesTen1).length);
		assertEquals(0, testObject.getWithoutPositives(multiplesTen2).length);
		assertEquals(0, testObject.getWithoutPositives(reverseMultiplesTen).length);
		assertNotEquals("[-50, -20, -30]", Arrays.toString(testObject.getWithoutPositives(mixedPosNeg)));
		assertEquals("[-50, -20, 0, -30]", Arrays.toString(testObject.getWithoutPositives(mixedPosNeg)));
		assertEquals(Arrays.toString(allZeroes1), Arrays.toString(testObject.getWithoutPositives(allZeroes2)));
		assertEquals(Arrays.toString(allZeroes2), Arrays.toString(testObject.getWithoutPositives(allZeroes1)));
	}

	@Test
	public void testGetUniqueItems() {
		assertNull(testObject.getUniqueItems(null));
		assertEquals(0, testObject.getUniqueItems(empty).length);
		assertEquals(Arrays.toString(multiplesTen1), Arrays.toString(testObject.getUniqueItems(multiplesTen2)));
		assertEquals(Arrays.toString(multiplesTen2), Arrays.toString(testObject.getUniqueItems(multiplesTen1)));
		assertEquals(Arrays.toString(reverseMultiplesTen), Arrays.toString(testObject.getUniqueItems(reverseMultiplesTen)));
		assertEquals(Arrays.toString(mixedPosNeg), Arrays.toString(testObject.getUniqueItems(mixedPosNeg)));
		assertEquals(0, testObject.getUniqueItems(allZeroes1).length);
		assertEquals(0, testObject.getUniqueItems(allZeroes2).length);
		assertEquals("[2, 3, 5]", Arrays.toString(testObject.getUniqueItems(new int[]{4, 2, 4, 3, 6, 5, 6})));
	}

	@Test
	public void testGetDeepCopy() {
		assertNull(testObject.getDeepCopy(null));
		assertEquals(0, testObject.getDeepCopy(new int[][]{}).length);
		int[][] temp = new int[][]{multiplesTen1, reverseMultiplesTen, allZeroes1};
		assertNotEquals(multiplesTen1, testObject.getDeepCopy(temp)[0]);
		assertNotEquals(reverseMultiplesTen, testObject.getDeepCopy(temp)[1]);
		assertNotEquals(allZeroes1, testObject.getDeepCopy(temp)[2]);
		assertEquals(Arrays.toString(multiplesTen2), Arrays.toString(testObject.getDeepCopy(temp)[0]));
		assertEquals(Arrays.toString(reverseMultiplesTen), Arrays.toString(testObject.getDeepCopy(temp)[1]));
		assertEquals(Arrays.toString(allZeroes2), Arrays.toString(testObject.getDeepCopy(temp)[2]));
	}

	@Test
	public void testIndexOf() {
		assertEquals(-1, testObject.indexOf(empty, singleItemArray));
		assertEquals(-1, testObject.indexOf(multiplesTen1, new int[]{0, 10, 70, 20, 90}));
		assertEquals(0, testObject.indexOf(multiplesTen1, multiplesTen2));
		assertEquals(1, testObject.indexOf(multiplesTen2, new int[]{70, 20}));
		assertEquals(-1, testObject.indexOf(mixedPosNeg, reverseMultiplesTen));
		assertEquals(3, testObject.indexOf(mixedPosNeg, new int[]{0}));
		assertEquals(2, testObject.indexOf(new int[]{23, 35, 90, 20, 70, 10, 69, 90, 20, 70, 10, 96, 90, 20, 70, 10, 13, 4, 7, 13}, reverseMultiplesTen));
		assertEquals(0, testObject.indexOf(allZeroes2, allZeroes1));
		assertEquals(0, testObject.indexOf(allZeroes1, allZeroes2));
	}

	@Test
	public void testLastIndexOf() {
		assertEquals(-1, testObject.lastIndexOf(empty, singleItemArray));
		assertEquals(-1, testObject.lastIndexOf(multiplesTen2, new int[]{0, 10, 70, 20, 90}));
		assertEquals(0, testObject.lastIndexOf(multiplesTen2, multiplesTen1));
		assertEquals(1, testObject.lastIndexOf(multiplesTen1, new int[]{70, 20}));
		assertEquals(-1, testObject.lastIndexOf(mixedPosNeg, reverseMultiplesTen));
		assertEquals(3, testObject.lastIndexOf(mixedPosNeg, new int[]{0}));
		assertEquals(12, testObject.lastIndexOf(new int[]{23, 35, 90, 20, 70, 10, 69, 90, 20, 70, 10, 96, 90, 20, 70, 10, 13, 4, 7, 13}, reverseMultiplesTen));
		assertEquals(0, testObject.lastIndexOf(allZeroes1, allZeroes2));
		assertEquals(0, testObject.lastIndexOf(allZeroes2, allZeroes1));
	}

	@Test
	public void testTotalNumberOfItems() {
		assertEquals(0, testObject.totalNumberOfItems(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, testObject.totalNumberOfItems(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(1, testObject.totalNumberOfItems(multi2));

		int[][] multi3 = new int[][]{{0, 1}, {2, 3, 5}, {4, 6, 8, 7, 9}};
		assertEquals(10, testObject.totalNumberOfItems(multi3));

		int[][] multi4 = new int[][]{null, {4, 7, 13, 28}, null, {10, 70, 20, 90}};     
		assertEquals(8, testObject.totalNumberOfItems(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};	     
		assertEquals(0, testObject.totalNumberOfItems(multi5));
	}

	@Test
	public void testTotalNumberOfEvenItems() {
		assertEquals(0, testObject.totalNumberOfEvenItems(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, testObject.totalNumberOfEvenItems(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(0, testObject.totalNumberOfEvenItems(multi2));

		int[][] multi3 = new int[][]{{0, 1}, {2, 3, 5}, {4, 6, 8, 7, 9}};
		assertEquals(5, testObject.totalNumberOfEvenItems(multi3));

		int[][] multi4 = new int[][]{null, {4, 7, 13, 28}, null, {10, 70, 20, 90}};     
		assertEquals(6, testObject.totalNumberOfEvenItems(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};	     
		assertEquals(0, testObject.totalNumberOfEvenItems(multi5));
	}

	@Test
	public void testTotalNumberOfOddItems() {
		assertEquals(0, testObject.totalNumberOfOddItems(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, testObject.totalNumberOfOddItems(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(1, testObject.totalNumberOfOddItems(multi2));

		int[][] multi3 = new int[][]{{0, 1}, {2, 3, 5}, {4, 6, 8, 7, 9}};
		assertEquals(5, testObject.totalNumberOfOddItems(multi3));

		int[][] multi4 = new int[][]{null, {4, 7, 13, 28}, null, {10, 70, 20, 90}};     
		assertEquals(2, testObject.totalNumberOfOddItems(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};	     
		assertEquals(0, testObject.totalNumberOfOddItems(multi5));
	}

	@Test
	public void testTotalNumberOfPositiveItems() {
		assertEquals(0, testObject.totalNumberOfPositiveItems(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, testObject.totalNumberOfPositiveItems(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(1, testObject.totalNumberOfPositiveItems(multi2));

		int[][] multi3 = new int[][]{{0, -1}, {-2, 3, -5}, {4, -6, 8, -7, 9}};
		assertEquals(4, testObject.totalNumberOfPositiveItems(multi3));

		int[][] multi4 = new int[][]{null, {4, -7, 13, -28}, null, {-10, 70, -20, 90}};     
		assertEquals(4, testObject.totalNumberOfPositiveItems(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};	     
		assertEquals(0, testObject.totalNumberOfPositiveItems(multi5));
	}

	@Test
	public void testTotalNumberOfNegativeItems() {
		assertEquals(0, testObject.totalNumberOfNegativeItems(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, testObject.totalNumberOfNegativeItems(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(0, testObject.totalNumberOfNegativeItems(multi2));

		int[][] multi3 = new int[][]{{0, -1}, {-2, 3, -5}, {4, -6, 8, -7, 9}};
		assertEquals(5, testObject.totalNumberOfNegativeItems(multi3));

		int[][] multi4 = new int[][]{null, {4, -7, 13, -28}, null, {-10, 70, -20, 90}};     
		assertEquals(4, testObject.totalNumberOfNegativeItems(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};	     
		assertEquals(0, testObject.totalNumberOfNegativeItems(multi5));
	}

	@Test
	public void testTotalNumberOfUniqueItems() {
		assertEquals(0, testObject.totalNumberOfUniqueItems(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, testObject.totalNumberOfUniqueItems(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(1, testObject.totalNumberOfUniqueItems(multi2));

		int[][] multi3 = new int[][]{{0, -1}, {-2, 3, -5}, {4, -6, 8, -7, 9}};
		assertEquals(10, testObject.totalNumberOfUniqueItems(multi3));

		int[][] multi4 = new int[][]{null, {2, 4, 2, -7, 3, 13, 3, -28}, null, {0, -10, 0, 70, 5, -20, 5, 90}};     
		assertEquals(8, testObject.totalNumberOfUniqueItems(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};	     
		assertEquals(0, testObject.totalNumberOfUniqueItems(multi5));
	}

	@Test
	public void testCountNullSubarrays() {
		assertEquals(0, testObject.countNullSubarrays(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(0, testObject.countNullSubarrays(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(0, testObject.countNullSubarrays(multi2));

		int[][] multi3 = new int[][]{{0, 1}, {2, 3, 5}, {4, 6, 8, 7, 9}};
		assertEquals(0, testObject.countNullSubarrays(multi3));

		int[][] multi4 = new int[][]{null, {4, 7, 13, 28}, null, {10, 70, 20, 90}};
		assertEquals(2, testObject.countNullSubarrays(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};
		assertEquals(5, testObject.countNullSubarrays(multi5));
	}

	@Test
	public void testCountNonNullSubarrays() {
		assertEquals(0, testObject.countNonNullSubarrays(null));

		int[][] multi1 = new int[][]{{}};
		assertEquals(1, testObject.countNonNullSubarrays(multi1));

		int[][] multi2 = new int[][]{{777}};
		assertEquals(1, testObject.countNonNullSubarrays(multi2));

		int[][] multi3 = new int[][]{{0, 1}, {2, 3, 5}, {4, 6, 8, 7, 9}};
		assertEquals(3, testObject.countNonNullSubarrays(multi3));

		int[][] multi4 = new int[][]{null, {4, 7, 13, 28}, null, {10, 70, 20, 90}};
		assertEquals(2, testObject.countNonNullSubarrays(multi4));

		int[][] multi5 = new int[][]{null, null, null, null, null};
		assertEquals(0, testObject.countNonNullSubarrays(multi5));
	}
}
