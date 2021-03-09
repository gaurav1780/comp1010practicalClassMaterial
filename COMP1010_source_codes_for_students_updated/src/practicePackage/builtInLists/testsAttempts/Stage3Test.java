package practicePackage.builtInLists.testsAttempts;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ServiceClasses.Rectangle;
import practicePackage.builtInLists.attempts.*;

class Stage3Test {
	public ArrayList<Integer> nullList, emptyList, singleItemList, list1, list2;

	public ArrayList<Integer> multiplesTen1, multiplesTen2, reverseMultiplesTen, mixedPosNeg, allZeroes1, allZeroes2;

	@BeforeEach
	public void run() {
		nullList = null;
		emptyList = new ArrayList<Integer>();
		singleItemList = new ArrayList<Integer>(Arrays.asList(777));
		list1 = new ArrayList<Integer>(Arrays.asList(10,70,20,90));
		list2 = new ArrayList<Integer>(Arrays.asList(-5, 0, 8, -7, 9, 15, 23, -1, 5));
		multiplesTen1 = new ArrayList<Integer>(Arrays.asList(10, 70, 20, 90));
		multiplesTen2 = new ArrayList<Integer>(Arrays.asList(10, 70, 20, 90));
		reverseMultiplesTen = new ArrayList<Integer>(Arrays.asList(90, 20, 70, 10));
		mixedPosNeg = new ArrayList<Integer>(Arrays.asList(-50, 30, -20, 0, 20, -30, 50));
		allZeroes1 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		allZeroes2 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
	}

	@Test
	void testIsAscending() {
		assertFalse(Stage3.isAscending(nullList));
		assertTrue(Stage3.isAscending(emptyList));
		assertTrue(Stage3.isAscending(singleItemList));
		assertFalse(Stage3.isAscending(list1));
		assertFalse(Stage3.isAscending(list2));
		list1 = new ArrayList<Integer>(Arrays.asList(10,70,70,90));
		assertTrue(Stage3.isAscending(list1));
		list1 = new ArrayList<Integer>(Arrays.asList(10,70,70,60));
		assertFalse(Stage3.isAscending(list1));
	}

	@Test
	void testGetPositives() {
		assertNotNull(Stage3.getPositives(list1));
		assertEquals("[10, 70, 20, 90]", Stage3.getPositives(list1).toString());

		//to check that you are not modifying the list passed	
		assertNotNull(Stage3.getPositives(list1));
		assertEquals("[10, 70, 20, 90]", Stage3.getPositives(list1).toString());

		assertNotNull(Stage3.getPositives(list2).toString());
		assertEquals("[8, 9, 15, 23, 5]", Stage3.getPositives(list2).toString());
		assertNotNull(Stage3.getPositives(singleItemList).toString());
		assertEquals("[777]", Stage3.getPositives(singleItemList).toString());
		assertNotNull(Stage3.getPositives(emptyList).toString());
		assertEquals("[]", Stage3.getPositives(emptyList).toString());
		assertNull(Stage3.getPositives(nullList));
	}

	@Test
	void testRemoveNegatives() {
		list2.add(-6);
		list2.add(-6);
		list2.add(-6);
		list2.add(-6);
		list2.add(-6);
		list2.add(-6);
		list2.add(-6);
		list2.add(-6);
		list2.add(-6);
		list2.add(-6);
		//a whole lot of -6s at the end
		Stage3.removeNegatives(list2);
		assertEquals("[0, 8, 9, 15, 23, 5]", list2.toString());
		Stage3.removeNegatives(singleItemList);
		assertEquals("[777]", singleItemList.toString());
	}

	@Test
	void testTwoInARow() {
		assertFalse(Stage3.twoInARow(list1, 5));
		assertFalse(Stage3.twoInARow(list1, 10));
		assertFalse(Stage3.twoInARow(list1, 70));
		assertFalse(Stage3.twoInARow(list1, 20));
		assertFalse(Stage3.twoInARow(list1, 90));

		list1 = new ArrayList<Integer>(Arrays.asList(10,70,5,5));
		assertTrue(Stage3.twoInARow(list1, 5));

		list1 = new ArrayList<Integer>(Arrays.asList(5,5,8,3));
		assertTrue(Stage3.twoInARow(list1, 5));

		list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,4,3,2,1));
		assertTrue(Stage3.twoInARow(list1, 5));	
	}

	@Test
	void testThreeInARow() {
		assertFalse(Stage3.threeInARow(list1, 5));

		list1 = new ArrayList<Integer>(Arrays.asList(10,5,0,5,5));
		assertFalse(Stage3.threeInARow(list1, 5));

		list1 = new ArrayList<Integer>(Arrays.asList(10,70,5,5,5));
		assertTrue(Stage3.threeInARow(list1, 5));

		list1 = new ArrayList<Integer>(Arrays.asList(10,70,5,5));
		assertFalse(Stage3.threeInARow(list1, 5));		

		list1 = new ArrayList<Integer>(Arrays.asList(5,5,5,8,3));
		assertTrue(Stage3.threeInARow(list1, 5));

		list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,5,5,5,5,5,5,4,3,2,1));
		assertTrue(Stage3.threeInARow(list1, 5));	
	}

	@Test
	void testMutuallyReverse() {
		assertFalse(Stage3.mutuallyReverse(list1, list2));
		list2 = new ArrayList<Integer>(Arrays.asList(90,20,70,10));
		assertTrue(Stage3.mutuallyReverse(list1, list2));
		list2 = new ArrayList<Integer>(Arrays.asList(90,70,20,10));
		assertFalse(Stage3.mutuallyReverse(list1, list2));
	}

	@Test
	void testAllUnique() {
		assertTrue(Stage3.allUnique(list1));
		assertTrue(Stage3.allUnique(list2));
		assertTrue(Stage3.allUnique(singleItemList));
		assertTrue(Stage3.allUnique(emptyList));
		list2 = new ArrayList<Integer>(Arrays.asList(-5, 0, 8, -7, 9, 15, 23, -1, -5));
		assertFalse(Stage3.allUnique(list2));
		list2 = new ArrayList<Integer>(Arrays.asList(0, 8, -7, 9, 15, 23, -1, -5, -5));
		assertFalse(Stage3.allUnique(list2));
	}

	@Test
	void testGetRectangles() {
		ArrayList<Integer> widths = new ArrayList<Integer>(Arrays.asList(10,70,20,90));
		ArrayList<Integer> heights = new ArrayList<Integer>(Arrays.asList(50,30,60,70));
		ArrayList<Rectangle> list = Stage3.getRectangles(widths, heights);
		assertNotNull(list);
		assertEquals(4, list.size());
		assertEquals("10 by 50", list.get(0).toString());
		assertEquals("70 by 30", list.get(1).toString());
		assertEquals("20 by 60", list.get(2).toString());
		assertEquals("90 by 70", list.get(3).toString());
	}

	@Test
	void testGeneratePatternedArray() {
		assertNull(Stage3.generatePatternedArray(-1, 2, 5));

		assertNotNull(Stage3.generatePatternedArray(0, 2, 5));
		assertEquals("[]", Stage3.generatePatternedArray(0, 2, 5).toString());

		assertNotNull(Stage3.generatePatternedArray(5, 2, 3));
		assertEquals("[2, 5, 8, 11, 14]", Stage3.generatePatternedArray(5, 2, 3).toString());

		assertNotNull(Stage3.generatePatternedArray(7, 0, -3));
		assertEquals("[0, -3, -6, -9, -12, -15, -18]", Stage3.generatePatternedArray(7, 0, -3).toString());
	}

	@Test
	void testCountUniqueItems() {
		assertEquals(0, Stage3.countUniqueItems(null));
		assertEquals(0, Stage3.countUniqueItems(emptyList));
		assertEquals(1, Stage3.countUniqueItems(singleItemList));
		assertEquals(4, Stage3.countUniqueItems(multiplesTen1));
		assertEquals(0, Stage3.countUniqueItems(allZeroes1));
		assertEquals(1, Stage3.countUniqueItems(new ArrayList<Integer>(Arrays.asList(10,20,30,40,40,30,20,10,50))));
	}

	@Test
	void testIdentical() {
		assertFalse(Stage3.identical(multiplesTen1, null));
		assertFalse(Stage3.identical(null, multiplesTen2));
		assertFalse(Stage3.identical(null, null));
		assertFalse(Stage3.identical(emptyList, singleItemList));
		assertTrue(Stage3.identical(multiplesTen1, multiplesTen2));
		assertTrue(Stage3.identical(multiplesTen2, multiplesTen1));
		assertFalse(Stage3.identical(multiplesTen1, new ArrayList<Integer>(Arrays.asList(10, 20, 70, 90))));
		assertFalse(Stage3.identical(multiplesTen2, new ArrayList<Integer>(Arrays.asList(10, 70, 20))));
		assertFalse(Stage3.identical(multiplesTen1, new ArrayList<Integer>(Arrays.asList(10, 70))));
		assertFalse(Stage3.identical(multiplesTen2, new ArrayList<Integer>(Arrays.asList(10))));
		assertTrue(Stage3.identical(allZeroes1, allZeroes2));
		assertTrue(Stage3.identical(allZeroes2, allZeroes1));
	}

	@Test
	void testContains() {
		assertFalse(Stage3.contains(multiplesTen1, null));
		assertFalse(Stage3.contains(null, multiplesTen2));
		assertFalse(Stage3.contains(null, null));
		assertFalse(Stage3.contains(emptyList, singleItemList));
		assertTrue(Stage3.contains(singleItemList, emptyList));
		assertTrue(Stage3.contains(multiplesTen1, multiplesTen2));
		assertTrue(Stage3.contains(multiplesTen2, multiplesTen1));
		assertTrue(Stage3.contains(multiplesTen1, reverseMultiplesTen));
		assertTrue(Stage3.contains(reverseMultiplesTen, multiplesTen1));
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, -70, 20, -90, 90, -20, 70, -10));
		assertTrue(Stage3.contains(list, multiplesTen1));
		assertTrue(Stage3.contains(list, multiplesTen2));
		assertTrue(Stage3.contains(list, reverseMultiplesTen));
		assertTrue(Stage3.contains(allZeroes1, allZeroes2));
		assertTrue(Stage3.contains(allZeroes2, allZeroes1));
	}

	@Test
	void testSame() {
		assertFalse(Stage3.same(multiplesTen1, null));
		assertFalse(Stage3.same(null, multiplesTen2));
		assertFalse(Stage3.same(null, null));
		assertFalse(Stage3.same(emptyList, singleItemList));
		assertFalse(Stage3.same(singleItemList, emptyList));
		assertTrue(Stage3.same(multiplesTen1, multiplesTen2));
		assertTrue(Stage3.same(multiplesTen2, multiplesTen1));
		assertTrue(Stage3.same(multiplesTen1, reverseMultiplesTen));
		assertTrue(Stage3.same(reverseMultiplesTen, multiplesTen1));
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, -70, 20, -90, 90, -20, 70, -10));
		assertFalse(Stage3.same(list, multiplesTen1));
		assertFalse(Stage3.same(list, multiplesTen2));
		assertFalse(Stage3.same(list, reverseMultiplesTen));
		assertTrue(Stage3.same(allZeroes1, allZeroes2));
		assertTrue(Stage3.same(allZeroes2, allZeroes1));
	}

	@Test
	void testMerge() {
		assertNull(Stage3.merge(reverseMultiplesTen, null));
		assertNull(Stage3.merge(null, mixedPosNeg));
		assertNull(Stage3.merge(null, null));
		assertNotNull(Stage3.merge(emptyList, emptyList));
		assertEquals(0, Stage3.merge(emptyList, emptyList).size());
		assertEquals("[777]", Stage3.merge(emptyList, singleItemList).toString());
		assertEquals("[777]", Stage3.merge(singleItemList, emptyList).toString());
		assertEquals("[10, 70, 20, 90, 10, 70, 20, 90]", Stage3.merge(multiplesTen1, multiplesTen2).toString());
		assertEquals("[10, 70, 20, 90, 90, 20, 70, 10]", Stage3.merge(multiplesTen2, reverseMultiplesTen).toString());
		assertEquals("[90, 20, 70, 10, 10, 70, 20, 90]", Stage3.merge(reverseMultiplesTen, multiplesTen1).toString());
		assertEquals("[-50, 30, -20, 0, 20, -30, 50, 0, 0, 0, 0, 0]", Stage3.merge(mixedPosNeg, allZeroes1).toString());
		assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Stage3.merge(allZeroes1, allZeroes1).toString());
		assertEquals("[0, 0, 0, 0, 0, -50, 30, -20, 0, 20, -30, 50]", Stage3.merge(allZeroes2, mixedPosNeg).toString());
		assertEquals("[-50, 30, -20, 0, 20, -30, 50, -50, 30, -20, 0, 20, -30, 50]", Stage3.merge(mixedPosNeg, mixedPosNeg).toString());
	}

	@Test
	void testGenerate() {
		assertNull(Stage3.generate(-1));
		assertNotNull(Stage3.generate(0));
		assertEquals(0, Stage3.generate(0).size());
		assertEquals(235, Stage3.generate(235).size());
		assertEquals("[1, 2]", Stage3.generate(2).toString());
		assertNotEquals("[0, 1, 2]", Stage3.generate(3).toString());
		assertNotEquals("[2, 3, 4, 5, 6]", Stage3.generate(5).toString());
	}

	@Test
	void testGetReverse() {
		assertNull(Stage3.getReverse(null));
		assertNotNull(Stage3.getReverse(emptyList));
		assertEquals(0, Stage3.getReverse(emptyList).size());
		assertEquals("[777]", Stage3.getReverse(singleItemList).toString());
		assertEquals(reverseMultiplesTen.toString(), Stage3.getReverse(multiplesTen1).toString());
		assertEquals(multiplesTen2.toString(), Stage3.getReverse(reverseMultiplesTen).toString());
		assertNotEquals(multiplesTen1.toString(), Stage3.getReverse(multiplesTen2).toString());
		assertNotEquals("[90, 70, 20, 10]", Stage3.getReverse(multiplesTen1).toString());
		assertNotEquals("[90, 20, 70]", Stage3.getReverse(multiplesTen2).toString());
		assertNotEquals("[90, 20]", Stage3.getReverse(multiplesTen1).toString());
		assertNotEquals("[90]", Stage3.getReverse(multiplesTen2).toString());
		assertEquals(allZeroes1.toString(), Stage3.getReverse(allZeroes2).toString());
		assertEquals(allZeroes2.toString(), Stage3.getReverse(allZeroes1).toString());
	}

	@Test
	void testGetMostFrequentItem() {
		assertEquals(2, Stage3.getMostFrequentItem(new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 5, 2, 2, 7))));
		assertEquals(3, Stage3.getMostFrequentItem(new ArrayList<Integer>(Arrays.asList(3, 5, 7, 9, 11, 13, 5, 3))));
		assertEquals(5, Stage3.getMostFrequentItem(new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5, 5, 5, 5, 5))));
	}

	@Test
	void testGetLeastFrequentItem() {
		assertEquals(5, Stage3.getLeastFrequentItem(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5))));
		assertEquals(3, Stage3.getLeastFrequentItem(new ArrayList<Integer>(Arrays.asList(3, 11, 11, 15, 15, 15, 19, 19, 19, 19, 23, 23, 23, 23, 23, 7))));
		assertEquals(2, Stage3.getLeastFrequentItem(new ArrayList<Integer>(Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2))));
	}

	@Test
	void testGetFrequencyTable() {
		assertNull(Stage3.getFrequencyTable(null));
		assertNotNull(Stage3.getFrequencyTable(emptyList));
		assertEquals(0, Stage3.getFrequencyTable(emptyList).size());
		assertNotNull(Stage3.getFrequencyTable(singleItemList));
		assertEquals("[[777, 1]]", Stage3.getFrequencyTable(singleItemList).toString());
		assertNotNull(Stage3.getFrequencyTable(mixedPosNeg));
		assertEquals("[[-50, 1], [30, 1], [-20, 1], [0, 1], [20, 1], [-30, 1], [50, 1]]", Stage3.getFrequencyTable(mixedPosNeg).toString());
		assertEquals("[[4, 2], [7, 3], [13, 5]]", Stage3.getFrequencyTable(new ArrayList<Integer>(Arrays.asList(4, 7, 13, 13, 7, 13, 13, 13, 7, 4))).toString());
	}

	@Test
	void testSubArrayFromIndex() {
		assertNull(Stage3.sublistFromIndex(null, 23));
		assertNull(Stage3.sublistFromIndex(emptyList, 35));
		assertNull(Stage3.sublistFromIndex(multiplesTen1, -1));
		assertNull(Stage3.sublistFromIndex(multiplesTen2, 4));
		assertNotNull(Stage3.sublistFromIndex(reverseMultiplesTen, 0));
		assertEquals("[90, 20, 70, 10]", Stage3.sublistFromIndex(reverseMultiplesTen, 0).toString());
		assertEquals("[50]", Stage3.sublistFromIndex(mixedPosNeg, 6).toString());
		assertEquals("[0, 0, 0, 0]", Stage3.sublistFromIndex(allZeroes1, 1).toString());
		assertEquals("[0, 0, 0]", Stage3.sublistFromIndex(allZeroes2, 2).toString());
	}

	@Test
	void testSubArrayUptoIndex() {
		assertNull(Stage3.sublistUptoIndex(null, 69));
		assertNull(Stage3.sublistUptoIndex(emptyList, 96));
		assertNull(Stage3.sublistUptoIndex(multiplesTen1, -1));
		assertNull(Stage3.sublistUptoIndex(multiplesTen2, 4));
		assertNotNull(Stage3.sublistUptoIndex(reverseMultiplesTen, 3));
		assertEquals("[90, 20, 70, 10]", Stage3.sublistUptoIndex(reverseMultiplesTen, 3).toString());
		assertEquals("[-50]", Stage3.sublistUptoIndex(mixedPosNeg, 0).toString());
		assertEquals("[0, 0]", Stage3.sublistUptoIndex(allZeroes1, 1).toString());
		assertEquals("[0, 0, 0]", Stage3.sublistUptoIndex(allZeroes2, 2).toString());
	}

	@Test
	void testSubarray() {
		assertNull(Stage3.sublist(null, 23, 35)); 
		assertNull(Stage3.sublist(emptyList, 69, 96));
		assertNull(Stage3.sublist(multiplesTen1, -1, 2));
		assertNull(Stage3.sublist(multiplesTen2, 3, 4));
		assertNull(Stage3.sublist(reverseMultiplesTen, 1, 0));
		assertNotNull(Stage3.sublist(mixedPosNeg, 2, 4));
		assertEquals("[-20, 0, 20]", Stage3.sublist(mixedPosNeg, 2, 4).toString());
		assertEquals(allZeroes1.toString(), Stage3.sublist(allZeroes2, 0, 4).toString());
	}

	@Test
	void testGetNegatives() {
		assertNull(Stage3.getNegatives(null)); 
		assertNotNull(Stage3.getNegatives(emptyList)); 
		assertEquals(0, Stage3.getNegatives(emptyList).size()); 
		assertEquals(0, Stage3.getNegatives(multiplesTen1).size());
		assertEquals(0, Stage3.getNegatives(multiplesTen2).size());
		assertEquals(0, Stage3.getNegatives(reverseMultiplesTen).size());
		assertNotEquals("[-50, -20, 0, -30]", Stage3.getNegatives(mixedPosNeg).toString());
		assertEquals("[-50, -20, -30]", Stage3.getNegatives(mixedPosNeg).toString());
		assertEquals(0, Stage3.getNegatives(allZeroes1).size());
		assertEquals(0, Stage3.getNegatives(allZeroes2).size());
	}

	@Test
	void testGetNonZeroes() {
		assertNull(Stage3.getNonZeroes(null));
		assertNotNull(Stage3.getNonZeroes(emptyList));
		assertEquals(0, Stage3.getNonZeroes(emptyList).size());
		assertEquals("[10, 70, 20, 90]", Stage3.getNonZeroes(multiplesTen1).toString());
		assertEquals("[10, 70, 20, 90]", Stage3.getNonZeroes(multiplesTen2).toString());
		assertEquals("[90, 20, 70, 10]", Stage3.getNonZeroes(reverseMultiplesTen).toString());
		assertEquals("[-50, 30, -20, 20, -30, 50]", Stage3.getNonZeroes(mixedPosNeg).toString());
		assertEquals(0, Stage3.getNonZeroes(allZeroes1).size());
		assertEquals(0, Stage3.getNonZeroes(allZeroes2).size());
	}

	@Test
	void testGetPrimes() {
		assertNull(Stage3.getPrimes(null)); 
		assertNotNull(Stage3.getPrimes(emptyList)); 
		assertEquals(0, Stage3.getPrimes(emptyList).size()); 
		assertEquals(0, Stage3.getPrimes(mixedPosNeg).size());
		assertEquals("[2, 3, 5]", Stage3.getPrimes(new ArrayList<Integer>(Arrays.asList(2, 3, 5))).toString());
		assertEquals("[7]", Stage3.getPrimes(new ArrayList<Integer>(Arrays.asList(0, 1, 4, 6, 7, 8, 9))).toString());
	}

	@Test
	void testGetWithoutNegatives() {
		assertNull(Stage3.getWithoutNegatives(null)); 
		assertNotNull(Stage3.getWithoutNegatives(emptyList)); 
		assertEquals(0, Stage3.getWithoutNegatives(emptyList).size()); 
		assertEquals(multiplesTen1.toString(), Stage3.getWithoutNegatives(multiplesTen2).toString());
		assertEquals(multiplesTen2.toString(), Stage3.getWithoutNegatives(multiplesTen1).toString());
		assertEquals(reverseMultiplesTen.toString(), Stage3.getWithoutNegatives(reverseMultiplesTen).toString());
		assertNotEquals("[30, 20, 50]", Stage3.getWithoutNegatives(mixedPosNeg).toString());
		assertEquals("[30, 0, 20, 50]", Stage3.getWithoutNegatives(mixedPosNeg).toString());
		assertEquals(allZeroes1.toString(), Stage3.getWithoutNegatives(allZeroes2).toString());
		assertEquals(allZeroes2.toString(), Stage3.getWithoutNegatives(allZeroes1).toString());
	}

	@Test
	void testGetWithoutPositives() {
		assertNull(Stage3.getWithoutPositives(null)); 
		assertNotNull(Stage3.getWithoutPositives(emptyList)); 
		assertEquals(0, Stage3.getWithoutPositives(emptyList).size()); 
		assertEquals(0, Stage3.getWithoutPositives(multiplesTen1).size());
		assertEquals(0, Stage3.getWithoutPositives(multiplesTen2).size());
		assertEquals(0, Stage3.getWithoutPositives(reverseMultiplesTen).size());
		assertNotEquals("[-50, -20, -30]", Stage3.getWithoutPositives(mixedPosNeg).toString());
		assertEquals("[-50, -20, 0, -30]", Stage3.getWithoutPositives(mixedPosNeg).toString());
		assertEquals(allZeroes1.toString(), Stage3.getWithoutPositives(allZeroes2).toString());
		assertEquals(allZeroes2.toString(), Stage3.getWithoutPositives(allZeroes1).toString());
	}

	@Test
	void testGetUniqueItems() {
		assertNull(Stage3.getUniqueItems(null));
		assertNotNull(Stage3.getUniqueItems(emptyList));
		assertEquals(0, Stage3.getUniqueItems(emptyList).size());
		assertEquals(multiplesTen1.toString(), Stage3.getUniqueItems(multiplesTen2).toString());
		assertEquals(multiplesTen2.toString(), Stage3.getUniqueItems(multiplesTen1).toString());
		assertEquals(reverseMultiplesTen.toString(), Stage3.getUniqueItems(reverseMultiplesTen).toString());
		assertEquals(mixedPosNeg.toString(), Stage3.getUniqueItems(mixedPosNeg).toString());
		assertEquals(0, Stage3.getUniqueItems(allZeroes1).size());
		assertEquals(0, Stage3.getUniqueItems(allZeroes2).size());
		assertEquals("[2, 3, 5]", Stage3.getUniqueItems(new ArrayList<Integer>(Arrays.asList(4, 2, 4, 3, 6, 5, 6))).toString());
	}

	@Test
	void testGetCopy() {
		assertNull(Stage3.getCopy(null));
		assertNotNull(Stage3.getCopy(new ArrayList<ArrayList<Integer>>()));
		assertEquals(0, Stage3.getCopy(new ArrayList<ArrayList<Integer>>()).size());
		ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>(Arrays.asList(multiplesTen1, reverseMultiplesTen, allZeroes1));
		assertNotSame(multiplesTen1, Stage3.getCopy(temp).get(0));
		assertNotSame(reverseMultiplesTen, Stage3.getCopy(temp).get(1));
		assertNotSame(allZeroes1, Stage3.getCopy(temp).get(2));
		assertNotNull(Stage3.getCopy(temp));
		assertNotNull(Stage3.getCopy(temp).get(0));
		assertEquals(multiplesTen2.toString(), Stage3.getCopy(temp).get(0).toString());
		assertEquals(reverseMultiplesTen.toString(), Stage3.getCopy(temp).get(1).toString());
		assertEquals(allZeroes2.toString(), Stage3.getCopy(temp).get(2).toString());
	}

	@Test
	void testIndexOf() {
		assertEquals(-1, Stage3.indexOf(emptyList, singleItemList));
		assertEquals(-1, Stage3.indexOf(multiplesTen1, new ArrayList<Integer>(Arrays.asList(0, 10, 70, 20, 90))));
		assertEquals(0, Stage3.indexOf(multiplesTen1, multiplesTen2));
		assertEquals(1, Stage3.indexOf(multiplesTen2, new ArrayList<Integer>(Arrays.asList(70, 20))));
		assertEquals(-1, Stage3.indexOf(mixedPosNeg, reverseMultiplesTen));
		assertEquals(3, Stage3.indexOf(mixedPosNeg, new ArrayList<Integer>(Arrays.asList(0))));
		assertEquals(2, Stage3.indexOf(new ArrayList<Integer>(Arrays.asList(23, 35, 90, 20, 70, 10, 69, 90, 20, 70, 10, 96, 90, 20, 70, 10, 13, 4, 7, 13)), reverseMultiplesTen));
		assertEquals(0, Stage3.indexOf(allZeroes2, allZeroes1));
		assertEquals(0, Stage3.indexOf(allZeroes1, allZeroes2));
	}

	@Test
	void testLastIndexOf() {
		assertEquals(-1, Stage3.lastIndexOf(emptyList, singleItemList));
		assertEquals(-1, Stage3.lastIndexOf(multiplesTen2, new ArrayList<Integer>(Arrays.asList(0, 10, 70, 20, 90))));
		assertEquals(0, Stage3.lastIndexOf(multiplesTen2, multiplesTen1));
		assertEquals(1, Stage3.lastIndexOf(multiplesTen1, new ArrayList<Integer>(Arrays.asList(70, 20))));
		assertEquals(-1, Stage3.lastIndexOf(mixedPosNeg, reverseMultiplesTen));
		assertEquals(3, Stage3.lastIndexOf(mixedPosNeg, new ArrayList<Integer>(Arrays.asList(0))));
		assertEquals(12, Stage3.lastIndexOf(new ArrayList<Integer>(Arrays.asList(23, 35, 90, 20, 70, 10, 69, 90, 20, 70, 10, 96, 90, 20, 70, 10, 13, 4, 7, 13)), reverseMultiplesTen));
		assertEquals(0, Stage3.lastIndexOf(allZeroes1, allZeroes2));
		assertEquals(0, Stage3.lastIndexOf(allZeroes2, allZeroes1));
	}

	@Test
	void testTotalNumberOfItems() {
		assertEquals(0, Stage3.totalNumberOfItems(null));

		ArrayList<ArrayList<Integer>> multi1 = new ArrayList<ArrayList<Integer>>();

		ArrayList<ArrayList<Integer>> multi2 = new ArrayList<ArrayList<Integer>>();
		multi2.add(new ArrayList<Integer>(Arrays.asList(777)));

		ArrayList<ArrayList<Integer>> multi3 = new ArrayList<ArrayList<Integer>>();
		multi3.add(new ArrayList<Integer>(Arrays.asList(0, 1)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(2, 3, 5)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(4, 6, 8, 7, 9)));

		ArrayList<ArrayList<Integer>> multi4 = new ArrayList<ArrayList<Integer>>();
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(4, 7, 13, 28)));
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(10, 70, 20, 90)));

		assertEquals(0, Stage3.totalNumberOfItems(multi1));
		assertEquals(1, Stage3.totalNumberOfItems(multi2));
		assertEquals(10, Stage3.totalNumberOfItems(multi3));

		assertEquals(8, Stage3.totalNumberOfItems(multi4));

		ArrayList<ArrayList<Integer>> multi5 = new ArrayList<ArrayList<Integer>>(Arrays.asList(null, null, null, null, null));	     
		assertEquals(0, Stage3.totalNumberOfItems(multi5));
	}

	@Test
	void testTotalNumberOfEvenItems() {
		assertEquals(0, Stage3.totalNumberOfEvenItems(null));

		ArrayList<ArrayList<Integer>> multi1 = new ArrayList<ArrayList<Integer>>();

		ArrayList<ArrayList<Integer>> multi2 = new ArrayList<ArrayList<Integer>>();
		multi2.add(new ArrayList<Integer>(Arrays.asList(777)));

		ArrayList<ArrayList<Integer>> multi3 = new ArrayList<ArrayList<Integer>>();
		multi3.add(new ArrayList<Integer>(Arrays.asList(0, 1)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(2, 3, 5)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(4, 6, 8, 7, 9)));

		ArrayList<ArrayList<Integer>> multi4 = new ArrayList<ArrayList<Integer>>();
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(4, 7, 13, 28)));
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(10, 70, 20, 90)));

		assertEquals(0, Stage3.totalNumberOfEvenItems(multi1));
		assertEquals(0, Stage3.totalNumberOfEvenItems(multi2));
		assertEquals(5, Stage3.totalNumberOfEvenItems(multi3));
		assertEquals(6, Stage3.totalNumberOfEvenItems(multi4));

		ArrayList<ArrayList<Integer>> multi5 = new ArrayList<ArrayList<Integer>>(Arrays.asList(null, null, null, null, null));	     
		assertEquals(0, Stage3.totalNumberOfEvenItems(multi5));
	}

	@Test
	void testTotalNumberOfOddItems() {
		assertEquals(0, Stage3.totalNumberOfOddItems(null));

		ArrayList<ArrayList<Integer>> multi1 = new ArrayList<ArrayList<Integer>>();

		ArrayList<ArrayList<Integer>> multi2 = new ArrayList<ArrayList<Integer>>();
		multi2.add(new ArrayList<Integer>(Arrays.asList(777)));

		ArrayList<ArrayList<Integer>> multi3 = new ArrayList<ArrayList<Integer>>();
		multi3.add(new ArrayList<Integer>(Arrays.asList(0, 1)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(2, 3, 5)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(4, 6, 8, 7, 9)));

		ArrayList<ArrayList<Integer>> multi4 = new ArrayList<ArrayList<Integer>>();
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(4, 7, 13, 28)));
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(10, 70, 20, 90)));

		assertEquals(0, Stage3.totalNumberOfOddItems(multi1));
		assertEquals(1, Stage3.totalNumberOfOddItems(multi2));
		assertEquals(5, Stage3.totalNumberOfOddItems(multi3));
		assertEquals(2, Stage3.totalNumberOfOddItems(multi4));

		ArrayList<ArrayList<Integer>> multi5 = new ArrayList<ArrayList<Integer>>(Arrays.asList(null, null, null, null, null));	     
		assertEquals(0, Stage3.totalNumberOfOddItems(multi5));
	}

	@Test
	void testTotalNumberOfPositiveItems() {
		assertEquals(0, Stage3.totalNumberOfPositiveItems(null));

		ArrayList<ArrayList<Integer>> multi1 = new ArrayList<ArrayList<Integer>>();

		ArrayList<ArrayList<Integer>> multi2 = new ArrayList<ArrayList<Integer>>();
		multi2.add(new ArrayList<Integer>(Arrays.asList(777)));

		ArrayList<ArrayList<Integer>> multi3 = new ArrayList<ArrayList<Integer>>();
		multi3.add(new ArrayList<Integer>(Arrays.asList(0, -1)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(-2, 3, -5)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(4, -6, 8, -7, 9)));

		ArrayList<ArrayList<Integer>> multi4 = new ArrayList<ArrayList<Integer>>();
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(4, 7, -13, -28)));
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(-10, 0, 20, 90)));


		assertEquals(0, Stage3.totalNumberOfPositiveItems(multi1));
		assertEquals(1, Stage3.totalNumberOfPositiveItems(multi2));
		assertEquals(4, Stage3.totalNumberOfPositiveItems(multi3));
		assertEquals(4, Stage3.totalNumberOfPositiveItems(multi4));

		ArrayList<ArrayList<Integer>> multi5 = new ArrayList<ArrayList<Integer>>(Arrays.asList(null, null, null, null, null));	     
		assertEquals(0, Stage3.totalNumberOfPositiveItems(multi5));
	}

	@Test
	void testTotalNumberOfNegativeItems() {
		assertEquals(0, Stage3.totalNumberOfNegativeItems(null));

		ArrayList<ArrayList<Integer>> multi1 = new ArrayList<ArrayList<Integer>>();

		ArrayList<ArrayList<Integer>> multi2 = new ArrayList<ArrayList<Integer>>();
		multi2.add(new ArrayList<Integer>(Arrays.asList(777)));

		ArrayList<ArrayList<Integer>> multi3 = new ArrayList<ArrayList<Integer>>();
		multi3.add(new ArrayList<Integer>(Arrays.asList(0, -1)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(-2, 3, -5)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(4, -6, -8, 7, 9)));

		ArrayList<ArrayList<Integer>> multi4 = new ArrayList<ArrayList<Integer>>();
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(4, 7, -13, -28)));
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(-10, 0, 20, 90)));


		assertEquals(0, Stage3.totalNumberOfNegativeItems(multi1));
		assertEquals(0, Stage3.totalNumberOfNegativeItems(multi2));
		assertEquals(5, Stage3.totalNumberOfNegativeItems(multi3));
		assertEquals(3, Stage3.totalNumberOfNegativeItems(multi4));

		ArrayList<ArrayList<Integer>> multi5 = new ArrayList<ArrayList<Integer>>(Arrays.asList(null, null, null, null, null));	     
		assertEquals(0, Stage3.totalNumberOfNegativeItems(multi5));
	}

	@Test
	void testTotalNumberOfUniqueItems() {
		assertEquals(0, Stage3.totalNumberOfUniqueItems(null));

		ArrayList<ArrayList<Integer>> multi1 = new ArrayList<ArrayList<Integer>>();

		ArrayList<ArrayList<Integer>> multi2 = new ArrayList<ArrayList<Integer>>();
		multi2.add(new ArrayList<Integer>(Arrays.asList(777)));

		ArrayList<ArrayList<Integer>> multi3 = new ArrayList<ArrayList<Integer>>();
		multi3.add(new ArrayList<Integer>(Arrays.asList(0, -1)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(-2, 3, -5)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(4, -6, 8, -7, 9)));

		ArrayList<ArrayList<Integer>> multi4 = new ArrayList<ArrayList<Integer>>();
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(2, 4, 2, -7, 3, 13, 3, -28)));
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(0, -10, 0, 70, 5, -20, 5, 90)));


		assertEquals(0, Stage3.totalNumberOfUniqueItems(multi1));
		assertEquals(1, Stage3.totalNumberOfUniqueItems(multi2));
		assertEquals(10, Stage3.totalNumberOfUniqueItems(multi3));
		assertEquals(8, Stage3.totalNumberOfUniqueItems(multi4));

		ArrayList<ArrayList<Integer>> multi5 = new ArrayList<ArrayList<Integer>>(Arrays.asList(null, null, null, null, null));	     
		assertEquals(0, Stage3.totalNumberOfUniqueItems(multi5));
	}

	@Test
	void testCountNullSublists() {
		assertEquals(0, Stage3.countNullSublists(null));

		ArrayList<ArrayList<Integer>> multi1 = new ArrayList<ArrayList<Integer>>();

		ArrayList<ArrayList<Integer>> multi2 = new ArrayList<ArrayList<Integer>>();
		multi2.add(new ArrayList<Integer>(Arrays.asList(777)));

		ArrayList<ArrayList<Integer>> multi3 = new ArrayList<ArrayList<Integer>>();
		multi3.add(new ArrayList<Integer>(Arrays.asList(0, -1)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(-2, 3, -5)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(4, -6, 8, -7, 9)));
		multi3.add(null);
		multi3.add(null);
		multi3.add(null);

		ArrayList<ArrayList<Integer>> multi4 = new ArrayList<ArrayList<Integer>>();
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(2, 4, 2, -7, 3, 13, 3, -28)));
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(0, -10, 0, 70, 5, -20, 5, 90)));

		assertEquals(0, Stage3.countNullSublists(multi1));
		assertEquals(0, Stage3.countNullSublists(multi2));
		assertEquals(3, Stage3.countNullSublists(multi3));
		assertEquals(2, Stage3.countNullSublists(multi4));

		ArrayList<ArrayList<Integer>> multi5 = new ArrayList<ArrayList<Integer>>(Arrays.asList(null, null, null, null, null));
		assertEquals(5, Stage3.countNullSublists(multi5));
	}

	@Test
	void testCountNonNullSublists() {
		assertEquals(0, Stage3.countNonNullSublists(null));

		ArrayList<ArrayList<Integer>> multi1 = new ArrayList<ArrayList<Integer>>();

		ArrayList<ArrayList<Integer>> multi2 = new ArrayList<ArrayList<Integer>>();
		multi2.add(new ArrayList<Integer>(Arrays.asList(777)));

		ArrayList<ArrayList<Integer>> multi3 = new ArrayList<ArrayList<Integer>>();
		multi3.add(new ArrayList<Integer>(Arrays.asList(0, -1)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(-2, 3, -5)));
		multi3.add(new ArrayList<Integer>(Arrays.asList(4, -6, 8, -7, 9)));
		multi3.add(null);
		multi3.add(null);
		multi3.add(null);
		multi3.add(null);
		multi3.add(null);

		ArrayList<ArrayList<Integer>> multi4 = new ArrayList<ArrayList<Integer>>();
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(2, 4, 2, -7, 3, 13, 3, -28)));
		multi4.add(null);
		multi4.add(new ArrayList<Integer>(Arrays.asList(0, -10, 0, 70, 5, -20, 5, 90)));

		assertEquals(0, Stage3.countNonNullSublists(multi1));
		assertEquals(1, Stage3.countNonNullSublists(multi2));
		assertEquals(3, Stage3.countNonNullSublists(multi3));
		assertEquals(2, Stage3.countNonNullSublists(multi4));

		ArrayList<ArrayList<Integer>> multi5 = new ArrayList<ArrayList<Integer>>(Arrays.asList(null, null, null, null, null));
		assertEquals(0, Stage3.countNonNullSublists(multi5));
	}
}
