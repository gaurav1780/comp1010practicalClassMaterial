package practicePackage.arrays.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Stage2Test {
	protected practicePackage.arrays.attempts.Stage2 testObject;
	
	private int[] empty;
	private int[] singleItemArray;
	private int[] tenMultiples;
	private int[] negPos;
	private int[] ascAllPos;
	private int[] descNegs;

	@BeforeEach
	public void run() {
		testObject = new practicePackage.arrays.attempts.Stage2();
		empty = new int[]{};
		singleItemArray = new int[]{777};
		tenMultiples = new int[]{10,-70,-20,90};
		negPos = new int[]{-3, 15, -13, 16, -1, 10, -101};
		ascAllPos = new int[]{4, 7, 13, 28, 137, 224, 237, 254};
		descNegs = new int[]{-115, -125, -202, -225, -229, -255};
	}

	@Test
	public void testSum() {
		assertEquals(0, testObject.sum(null));
		assertEquals(0, testObject.sum(empty));
		assertEquals(777, testObject.sum(singleItemArray));
		assertEquals(10, testObject.sum(tenMultiples));
		assertEquals((-77), testObject.sum(negPos));
		assertEquals(904, testObject.sum(ascAllPos));
		assertEquals((-1151), testObject.sum(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, testObject.sum(e));
	}

	@Test
	public void testSumEven() {
		assertEquals(0, testObject.sumEven(null));
		assertEquals(0, testObject.sumEven(empty));
		assertEquals(0, testObject.sumEven(singleItemArray));
		assertEquals(10, testObject.sumEven(tenMultiples));
		assertEquals(26, testObject.sumEven(negPos));
		assertEquals(510, testObject.sumEven(ascAllPos));
		assertEquals((-202), testObject.sumEven(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, testObject.sumEven(e));
	}

	@Test
	public void testSumOdd() {
		assertEquals(0, testObject.sumOdd(null));
		assertEquals(0, testObject.sumOdd(empty));
		assertEquals(777, testObject.sumOdd(singleItemArray));
		assertEquals(0, testObject.sumOdd(tenMultiples));
		assertEquals((-103), testObject.sumOdd(negPos));
		assertEquals(394, testObject.sumOdd(ascAllPos));
		assertEquals((-949), testObject.sumOdd(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, testObject.sumOdd(e));
	}

	@Test
	public void testSumPositives() {
		assertEquals(0, testObject.sumPositives(null));
		assertEquals(0, testObject.sumPositives(empty));
		assertEquals(777, testObject.sumPositives(singleItemArray));
		assertEquals(100, testObject.sumPositives(tenMultiples));
		assertEquals(41, testObject.sumPositives(negPos));
		assertEquals(904, testObject.sumPositives(ascAllPos));
		assertEquals(0, testObject.sumPositives(descNegs));
		int[] e = {0, 0, 0, 0, 10};
		assertEquals(10, testObject.sumPositives(e));
	}

	@Test
	public void testSumNegatives() {
		assertEquals(0, testObject.sumNegatives(null));
		assertEquals(0, testObject.sumNegatives(empty));
		assertEquals(0, testObject.sumNegatives(singleItemArray));
		assertEquals((-90), testObject.sumNegatives(tenMultiples));
		assertEquals((-118), testObject.sumNegatives(negPos));
		assertEquals(0, testObject.sumNegatives(ascAllPos));
		assertEquals((-1151), testObject.sumNegatives(descNegs));
		int[] e = {0, 0, 0, 0, -10};
		assertEquals((-10), testObject.sumNegatives(e));
	}

	@Test
	public void testSumEvenIndexedItems() {
		assertEquals(0, testObject.sumEvenIndexedItems(null));
		assertEquals(0, testObject.sumEvenIndexedItems(empty));
		assertEquals(777, testObject.sumEvenIndexedItems(singleItemArray));
		assertEquals(-10, testObject.sumEvenIndexedItems(tenMultiples));
		assertEquals(-118, testObject.sumEvenIndexedItems(negPos));
		assertEquals(391, testObject.sumEvenIndexedItems(ascAllPos));
		assertEquals(-546, testObject.sumEvenIndexedItems(descNegs));
	}

	@Test
	public void testSumOddIndexedItems() {
		assertEquals(0, testObject.sumOddIndexedItems(null));
		assertEquals(0, testObject.sumOddIndexedItems(empty));
		assertEquals(0, testObject.sumOddIndexedItems(singleItemArray));
		assertEquals(20, testObject.sumOddIndexedItems(tenMultiples));
		assertEquals(41, testObject.sumOddIndexedItems(negPos));
		assertEquals(513, testObject.sumOddIndexedItems(ascAllPos));
		assertEquals(-605, testObject.sumOddIndexedItems(descNegs));
	}

	@Test
	public void testSumMultiples() {
		assertEquals(0, testObject.sumMultiples(null, 69));
		assertEquals(0, testObject.sumMultiples(empty, 96));
		assertEquals(777, testObject.sumMultiples(singleItemArray, 777));
		assertEquals(10, testObject.sumMultiples(tenMultiples, 10));
		assertEquals(0, testObject.sumMultiples(negPos, 7));
		assertEquals(256, testObject.sumMultiples(ascAllPos, 4));
		assertEquals(-720, testObject.sumMultiples(descNegs, 5));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, testObject.sumMultiples(e, 235));
	}

	@Test
	public void testSumFactors() {
		assertEquals(0, testObject.sumFactors(null, 69));
		assertEquals(0, testObject.sumFactors(empty, 96));
		assertEquals(777, testObject.sumFactors(singleItemArray, 777));
		assertEquals(10, testObject.sumFactors(tenMultiples, 1260));
		assertEquals(9, testObject.sumFactors(negPos, -100));
		assertEquals(263, testObject.sumFactors(ascAllPos, 224));
		assertEquals(0, testObject.sumFactors(descNegs, -235));
	}

	@Test
	public void testSumInRange() {
		assertEquals(0, testObject.sumInRange(null, 69, 96));
		assertEquals(0, testObject.sumInRange(empty, 23, 35));
		assertEquals(777, testObject.sumInRange(singleItemArray, 777, 777));
		assertEquals(10, testObject.sumInRange(tenMultiples, -70, 90)); //all items satisfy
		assertEquals((-90), testObject.sumInRange(tenMultiples, -80, -10));
		assertEquals(100, testObject.sumInRange(tenMultiples, 0, 100));
		assertEquals(10, testObject.sumInRange(negPos, 10, 14)); //only 1 item satisfies (= low)
		assertEquals(4, testObject.sumInRange(ascAllPos, -115, 4)); //only 1 item satisfies (= high)
		assertEquals(0, testObject.sumInRange(descNegs, 0, 125)); //no items satisfy
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, testObject.sumInRange(e, 0, 0));
	}

	@Test
	public void testSumNotInRange() {
		assertEquals(0, testObject.sumNotInRange(null, 69, 96));
		assertEquals(0, testObject.sumNotInRange(empty, 23, 35));
		assertEquals(0, testObject.sumNotInRange(singleItemArray, 777, 777));
		assertEquals(10, testObject.sumNotInRange(tenMultiples, 100, 169)); //all items satisfy
		assertEquals(100, testObject.sumNotInRange(tenMultiples, -80, -10));
		assertEquals((-90), testObject.sumNotInRange(tenMultiples, 0, 100));
		assertEquals((-87), testObject.sumNotInRange(negPos, 10, 14)); //only 1 item dissatisfies (= low)
		assertEquals(900, testObject.sumNotInRange(ascAllPos, -115, 4)); //only 1 item dissatisfies (= high)
		assertEquals(0, testObject.sumNotInRange(descNegs, -269, 0)); //no items satisfy
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, testObject.sumNotInRange(e, 0, 0));
	}

	@Test
	public void testResetNegatives() {
		testObject.resetNegatives(null); //NullPointerException check

		testObject.resetNegatives(empty);
		assertEquals(0, empty.length);

		testObject.resetNegatives(singleItemArray);
		assertEquals(777, singleItemArray[0]);

		testObject.resetNegatives(tenMultiples);
		assertEquals(4, tenMultiples.length);
		assertEquals(10, tenMultiples[0]);
		assertEquals(0, tenMultiples[1]);
		assertEquals(0, tenMultiples[2]);
		assertEquals(90, tenMultiples[3]);

		String before1 = Arrays.toString(ascAllPos);
		testObject.resetNegatives(ascAllPos);
		String after1 = Arrays.toString(ascAllPos);
		assertEquals(before1, after1);

		testObject.resetNegatives(descNegs);
		assertEquals("[0, 0, 0, 0, 0, 0]", Arrays.toString(descNegs));

		int[] e = {0, 0, 0, 0, 0};
		String before2 = Arrays.toString(e);
		testObject.resetNegatives(e);
		String after2 = Arrays.toString(e);
		assertEquals(before2, after2);
	}

	@Test
	public void testMakeAbsolute() {
		testObject.makeAbsolute(null); //NullPointerException check

		testObject.makeAbsolute(empty);
		assertEquals(0, empty.length);

		testObject.makeAbsolute(singleItemArray);
		assertEquals(777, singleItemArray[0]);

		testObject.makeAbsolute(negPos);
		assertEquals(3, negPos[0]);
		assertEquals(15, negPos[1]);
		assertEquals(10, negPos[5]);
		assertEquals(101, negPos[6]);

		String before1 = Arrays.toString(ascAllPos);
		testObject.makeAbsolute(ascAllPos);
		String after1 = Arrays.toString(ascAllPos);
		assertEquals(before1, after1);

		int[] e = new int[descNegs.length];
		for (int i = 0; i < descNegs.length; i++) {
			e[i] = -descNegs[i];
		}
		testObject.makeAbsolute(descNegs);
		assertEquals(Arrays.toString(descNegs), Arrays.toString(e));

		int[] f = {0, 0, 0, 0, 0};
		String before2 = Arrays.toString(f);
		testObject.makeAbsolute(f);
		String after2 = Arrays.toString(f);
		assertEquals(before2, after2);
	}

	@Test
	public void testSquareUp() {
		testObject.squareUp(null); //NullPointerException check

		testObject.squareUp(empty);
		assertEquals(0, empty.length);

		testObject.squareUp(singleItemArray);
		assertEquals(777 * 777, singleItemArray[0]);

		testObject.squareUp(tenMultiples);
		assertEquals("[100, 4900, 400, 8100]", Arrays.toString(tenMultiples));

		testObject.squareUp(negPos);
		for (int item: negPos) {
			assertTrue(ServiceClasses.MathService.isSquare(item));
		}

		int[] e = {0, 0, 0, 0, 0};
		String before = Arrays.toString(e);
		testObject.squareUp(e);
		String after = Arrays.toString(e);
		assertEquals(before, after);
	}

	@Test
	public void testCountEven() {
		assertEquals(0, testObject.countEven(null));
		assertEquals(0, testObject.countEven(empty));
		assertEquals(0, testObject.countEven(singleItemArray));
		assertEquals(4, testObject.countEven(tenMultiples));
		assertEquals(2, testObject.countEven(negPos));
		assertEquals(4, testObject.countEven(ascAllPos));
		assertEquals(1, testObject.countEven(descNegs));
		int[] e = {0,0,0,0,0};
		assertEquals(5, testObject.countEven(e));
	}

	@Test
	public void testCountOdd() {
		assertEquals(0, testObject.countOdd(null));
		assertEquals(0, testObject.countOdd(empty));
		assertEquals(1, testObject.countOdd(singleItemArray));
		assertEquals(0, testObject.countOdd(tenMultiples));
		assertEquals(5, testObject.countOdd(negPos));
		assertEquals(4, testObject.countOdd(ascAllPos));
		assertEquals(5, testObject.countOdd(descNegs));
		int[] e = {0,0,0,0,0};
		assertEquals(0, testObject.countOdd(e));
	}

	@Test
	public void testCountPositives() {
		assertEquals(0, testObject.countPositives(null));
		assertEquals(0, testObject.countPositives(empty));
		assertEquals(1, testObject.countPositives(singleItemArray));
		assertEquals(2, testObject.countPositives(tenMultiples));
		assertEquals(3, testObject.countPositives(negPos));
		assertEquals(8, testObject.countPositives(ascAllPos));
		assertEquals(0, testObject.countPositives(descNegs));
		int[] e = {0,0,0,0,10};
		assertEquals(1, testObject.countPositives(e));
	}

	@Test
	public void testCountNegatives() {
		assertEquals(0, testObject.countNegatives(null));
		assertEquals(0, testObject.countNegatives(empty));
		assertEquals(0, testObject.countNegatives(singleItemArray));
		assertEquals(2, testObject.countNegatives(tenMultiples));
		assertEquals(4, testObject.countNegatives(negPos));
		assertEquals(0, testObject.countNegatives(ascAllPos));
		assertEquals(6, testObject.countNegatives(descNegs));
		int[] e = {0,0,0,0,-10};
		assertEquals(1, testObject.countNegatives(e));
	}

	@Test
	public void testCountMultiples() {
		assertEquals(0, testObject.countMultiples(null, 69));
		assertEquals(0, testObject.countMultiples(empty, 96));
		assertEquals(1, testObject.countMultiples(singleItemArray, 777));
		assertEquals(4, testObject.countMultiples(tenMultiples, 10));
		assertEquals(0, testObject.countMultiples(negPos, 7));
		assertEquals(3, testObject.countMultiples(ascAllPos, 4));
		assertEquals(4, testObject.countMultiples(descNegs, 5));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(5, testObject.countMultiples(e, 235));
	}

	@Test
	public void testCountFactors() {
		assertEquals(0, testObject.countFactors(null, 69));
		assertEquals(0, testObject.countFactors(empty, 96));
		assertEquals(1, testObject.countFactors(singleItemArray, 777));
		assertEquals(4, testObject.countFactors(tenMultiples, 1260));
		assertEquals(2, testObject.countFactors(negPos, -100));
		assertEquals(4, testObject.countFactors(ascAllPos, 224));
		assertEquals(0, testObject.countFactors(descNegs, -235));
	}

	@Test
	public void testCountInRange() {
		assertEquals(0, testObject.countInRange(null, 69, 96));
		assertEquals(0, testObject.countInRange(empty, 23, 35));
		assertEquals(1, testObject.countInRange(singleItemArray, 777, 777));
		assertEquals(4, testObject.countInRange(tenMultiples, -70, 90)); //all items satisfy
		assertEquals(2, testObject.countInRange(tenMultiples, -80, -10));
		assertEquals(2, testObject.countInRange(tenMultiples, 0, 100));
		assertEquals(1, testObject.countInRange(negPos, 10, 14)); //only 1 item satisfies (= low)
		assertEquals(1, testObject.countInRange(ascAllPos, -115, 4)); //only 1 item satisfies (= high)
		assertEquals(0, testObject.countInRange(descNegs, 0, 125)); //no items satisfy
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(5, testObject.countInRange(e, 0, 0));
	}

	@Test
	public void testCountNotInRange() {
		assertEquals(0, testObject.countNotInRange(null, 69, 96));
		assertEquals(0, testObject.countNotInRange(empty, 23, 35));
		assertEquals(0, testObject.countNotInRange(singleItemArray, 777, 777));
		assertEquals(4, testObject.countNotInRange(tenMultiples, 100, 169)); //all items satisfy
		assertEquals(2, testObject.countNotInRange(tenMultiples, -80, -10));
		assertEquals(2, testObject.countNotInRange(tenMultiples, 0, 100));
		assertEquals(6, testObject.countNotInRange(negPos, 10, 14)); //only 1 item dissatisfies (= low)
		assertEquals(7, testObject.countNotInRange(ascAllPos, -115, 4)); //only 1 item dissatisfies (= high)
		assertEquals(0, testObject.countNotInRange(descNegs, -269, 0)); //no items satisfy
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, testObject.countNotInRange(e, 0, 0));
	}

	@Test
	public void testCountOccurrences() {
		assertEquals(0, testObject.countOccurrences(null, 69));
		assertEquals(0, testObject.countOccurrences(empty, 96));
		assertEquals(1, testObject.countOccurrences(singleItemArray, 777));
		assertEquals(0, testObject.countOccurrences(tenMultiples, 0));
		assertEquals(1, testObject.countOccurrences(ascAllPos, 13));
		assertEquals(7, testObject.countOccurrences(new int[]{7, 7, 7, 7, 7, 7, 7}, 7));
	}

	@Test
	public void testCountUnique() {
		assertEquals(0, testObject.countUnique(null));
		assertEquals(0, testObject.countUnique(empty));
		assertEquals(1, testObject.countUnique(singleItemArray));
		assertEquals(6, testObject.countUnique(descNegs));
		assertEquals(3, testObject.countUnique(new int[]{0, 2, 0, 3, 1, 5, 1}));
		assertEquals(0, testObject.countUnique(new int[]{7, 7, 7, 7, 7, 7, 7}));
	}

	@Test
	public void testContains() {
		assertFalse(testObject.contains(null, 69));
		assertFalse(testObject.contains(empty, 96));
		assertTrue(testObject.contains(singleItemArray, 777));
		assertFalse(testObject.contains(descNegs, 0));
		assertTrue(testObject.contains(negPos, -13));
		assertTrue(testObject.contains(new int[]{7, 7, 7, 7, 7, 7, 7}, 7));
	}

	@Test
	public void testIndexOf() {
		assertEquals(-1, testObject.indexOf(null, 69));
		assertEquals(-1, testObject.indexOf(empty, 96));
		assertEquals(0, testObject.indexOf(singleItemArray, 777));
		assertEquals(0, testObject.indexOf(tenMultiples, 10));
		assertEquals(3, testObject.indexOf(negPos, 16));
		assertEquals(7, testObject.indexOf(ascAllPos, 254));
		assertEquals(-1, testObject.indexOf(descNegs, 0));
		assertEquals(0, testObject.indexOf(new int[]{7, 7, 7, 7, 7, 7, 7}, 7));
	}

	@Test
	public void testLastIndexOf() {
		assertEquals(-1, testObject.lastIndexOf(null, 69));
		assertEquals(-1, testObject.lastIndexOf(empty, 96));
		assertEquals(0, testObject.lastIndexOf(singleItemArray, 777));
		assertEquals(0, testObject.lastIndexOf(tenMultiples, 10));
		assertEquals(3, testObject.lastIndexOf(negPos, 16));
		assertEquals(7, testObject.lastIndexOf(ascAllPos, 254));
		assertEquals(-1, testObject.lastIndexOf(descNegs, 0));
		assertEquals(6, testObject.lastIndexOf(new int[]{7, 7, 7, 7, 7, 7, 7}, 7));
	}

	@Test
	public void testContainsFromIndex() {
		assertFalse(testObject.containsFromIndex(null, 35, 23));
		assertFalse(testObject.containsFromIndex(empty, 96, 69));
		assertTrue(testObject.containsFromIndex(singleItemArray, 777, 0));
		assertFalse(testObject.containsFromIndex(tenMultiples, 90, 4));
		assertFalse(testObject.containsFromIndex(negPos, -13, -1));
		assertTrue(testObject.containsFromIndex(ascAllPos, 254, 6));
		assertFalse(testObject.containsFromIndex(descNegs, -115, 1));
		int[] e = {7, 7, 7, 7, 7, 7, 7};
		assertTrue(testObject.containsFromIndex(e, 7, 0));
		assertTrue(testObject.containsFromIndex(e, 7, 6));
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
	public void testContainsBetweenIndices() {
		assertFalse(testObject.containsBetweenIndices(null, 35, 1, 4));
		assertFalse(testObject.containsBetweenIndices(empty, 96, 0, 0));
		assertTrue(testObject.containsBetweenIndices(singleItemArray, 777, 0, 0));
		assertFalse(testObject.containsBetweenIndices(tenMultiples, 90, 0, 2));
		assertTrue(testObject.containsBetweenIndices(tenMultiples, 90, 0, 3));
		assertFalse(testObject.containsBetweenIndices(negPos, -3, 1, negPos.length - 1));
		assertTrue(testObject.containsBetweenIndices(negPos, -3, 0, negPos.length - 1));
		int[] e = {7, 7, 7, 7, 7, 7, 7};
		assertTrue(testObject.containsBetweenIndices(e, 7, 0, 0));
		assertTrue(testObject.containsBetweenIndices(e, 7, 6, 6));
	}

	@Test
	public void testSumFromIndex() {
		assertEquals(0, testObject.sumFromIndex(null, 23));
		assertEquals(0, testObject.sumFromIndex(empty, 35));
		assertEquals(777, testObject.sumFromIndex(singleItemArray, 0));
		assertEquals(0, testObject.sumFromIndex(tenMultiples, 1));
		assertEquals((-101), testObject.sumFromIndex(negPos, 6));
		assertEquals(0, testObject.sumFromIndex(ascAllPos, -1));
		assertEquals(0, testObject.sumFromIndex(descNegs, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, testObject.sumFromIndex(e, 0));
		assertEquals(0, testObject.sumFromIndex(e, 4));
	}

	@Test
	public void testSumUptoIndex() {
		assertEquals(0, testObject.sumUptoIndex(null, 23));
		assertEquals(0, testObject.sumUptoIndex(empty, 35));
		assertEquals(777, testObject.sumUptoIndex(singleItemArray, 0));
		assertEquals((-80), testObject.sumUptoIndex(tenMultiples, 2));
		assertEquals((-3), testObject.sumUptoIndex(negPos, 0));
		assertEquals(0, testObject.sumUptoIndex(ascAllPos, -1));
		assertEquals(0, testObject.sumUptoIndex(descNegs, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, testObject.sumUptoIndex(e, 0));
		assertEquals(0, testObject.sumUptoIndex(e, 4));
	}

	@Test
	public void testSumBetweenIndices() {
		assertEquals(0, testObject.sumBetweenIndices(null, 23, 35));
		assertEquals(0, testObject.sumBetweenIndices(empty, 69, 96));
		assertEquals(777, testObject.sumBetweenIndices(singleItemArray, 0, 0));
		assertEquals((-90), testObject.sumBetweenIndices(tenMultiples, 1, 2));
		assertEquals(0, testObject.sumBetweenIndices(negPos, -1, 7));
		assertEquals(0, testObject.sumBetweenIndices(ascAllPos, -1, 7));
		assertEquals(0, testObject.sumBetweenIndices(descNegs, 0, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, testObject.sumBetweenIndices(e, 0, 4));
		assertEquals(0, testObject.sumBetweenIndices(e, 1, 3));
	}

	@Test
	public void testSumEvenFromIndex() {
		assertEquals(0, testObject.sumEvenFromIndex(null, 23));
		assertEquals(0, testObject.sumEvenFromIndex(empty, 35));
		assertEquals(0, testObject.sumEvenFromIndex(singleItemArray, 0));
		assertEquals(70, testObject.sumEvenFromIndex(tenMultiples, 2));
		assertEquals(10, testObject.sumEvenFromIndex(negPos, 5));
		assertEquals(0, testObject.sumEvenFromIndex(ascAllPos, -1));
		assertEquals(0, testObject.sumEvenFromIndex(descNegs, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, testObject.sumEvenFromIndex(e, 0));
		assertEquals(0, testObject.sumEvenFromIndex(e, 4));
	}

	@Test
	public void testSumOddUptoIndex() {
		assertEquals(0, testObject.sumOddUptoIndex(null, 23));
		assertEquals(0, testObject.sumOddUptoIndex(empty, 35));
		assertEquals(777, testObject.sumOddUptoIndex(singleItemArray, 0));
		assertEquals(0, testObject.sumOddUptoIndex(tenMultiples, 3));
		assertEquals(-2, testObject.sumOddUptoIndex(negPos, 4));
		assertEquals(0, testObject.sumOddUptoIndex(ascAllPos, -1));
		assertEquals(0, testObject.sumOddUptoIndex(descNegs, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, testObject.sumOddUptoIndex(e, 0));
		assertEquals(0, testObject.sumOddUptoIndex(e, 4));
	}

	@Test
	public void testProductPositivesUptoIndex() {
		assertEquals(1, testObject.productPositivesUptoIndex(null, 23));
		assertEquals(1, testObject.productPositivesUptoIndex(empty, 35));
		assertEquals(777, testObject.productPositivesUptoIndex(singleItemArray, 0));
		assertEquals(900, testObject.productPositivesUptoIndex(tenMultiples, 3));
		assertEquals(240, testObject.productPositivesUptoIndex(negPos, 4));
		assertEquals(1, testObject.productPositivesUptoIndex(ascAllPos, -1));
		assertEquals(1, testObject.productPositivesUptoIndex(descNegs, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(1, testObject.productPositivesUptoIndex(e, 0));
		assertEquals(1, testObject.productPositivesUptoIndex(e, 4));
	}

	@Test
	public void testProductNegativesFromIndex() {
		assertEquals(1, testObject.productNegativesFromIndex(null, 23));
		assertEquals(1, testObject.productNegativesFromIndex(empty, 35));
		assertEquals(1, testObject.productNegativesFromIndex(singleItemArray, 0));
		assertEquals(-20, testObject.productNegativesFromIndex(tenMultiples, 2));
		assertEquals(-101, testObject.productNegativesFromIndex(negPos, 5));
		assertEquals(1, testObject.productNegativesFromIndex(ascAllPos, -1));
		assertEquals(1, testObject.productNegativesFromIndex(descNegs, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(1, testObject.productNegativesFromIndex(e, 0));
		assertEquals(1, testObject.productNegativesFromIndex(e, 4));
	}

	@Test
	public void testCountOccurrencesBetweenIndices() {
		assertEquals(0, testObject.countOccurrencesBetweenIndices(null, 235, 23, 35));
		assertEquals(0, testObject.countOccurrencesBetweenIndices(empty, 6996, 69, 96));
		assertEquals(1, testObject.countOccurrencesBetweenIndices(singleItemArray, 777, 0, 0));
		assertEquals(0, testObject.countOccurrencesBetweenIndices(tenMultiples, 10, 1, 2));
		assertEquals(0, testObject.countOccurrencesBetweenIndices(negPos, 2, -1, 7));
		assertEquals(0, testObject.countOccurrencesBetweenIndices(ascAllPos, 3, -1, 7));
		assertEquals(0, testObject.countOccurrencesBetweenIndices(descNegs, 5, 0, 6));
		int[] e = {7, 7, 7, 7, 7, 7, 7};
		assertEquals(7, testObject.countOccurrencesBetweenIndices(e, 7, 0, 6));
		assertEquals(5, testObject.countOccurrencesBetweenIndices(e, 7, 1, 5));
		assertEquals(3, testObject.countOccurrencesBetweenIndices(e, 7, 2, 4));
	}

	@Test
	public void testCountUniqueBetweenIndices() {
		assertEquals(0, testObject.countUniqueBetweenIndices(null, 23, 35));
		assertEquals(0, testObject.countUniqueBetweenIndices(empty, 69, 96));
		assertEquals(1, testObject.countUniqueBetweenIndices(singleItemArray, 0, 0));
		assertEquals(2, testObject.countUniqueBetweenIndices(tenMultiples, 1, 2));
		assertEquals(0, testObject.countUniqueBetweenIndices(negPos, -1, 7));
		assertEquals(0, testObject.countUniqueBetweenIndices(ascAllPos, -1, 7));
		assertEquals(0, testObject.countUniqueBetweenIndices(descNegs, 0, 6));
		int[] e = {7, 7, 7, 7, 7, 7, 7};
		assertEquals(0, testObject.countUniqueBetweenIndices(e, 0, 6));
		assertEquals(0, testObject.countUniqueBetweenIndices(e, 1, 5));
		assertEquals(0, testObject.countUniqueBetweenIndices(e, 2, 4));
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
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(testObject.allPositives(e));
	}

	@Test
	public void testAllNegatives() {
		assertFalse(testObject.allNegatives(null));
		assertTrue(testObject.allNegatives(empty));
		assertFalse(testObject.allNegatives(singleItemArray));
		assertFalse(testObject.allNegatives(tenMultiples));
		assertFalse(testObject.allNegatives(negPos));
		assertFalse(testObject.allNegatives(ascAllPos));
		assertTrue(testObject.allNegatives(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(testObject.allNegatives(e));
	}

	@Test
	public void testAllZeroes() {
		assertFalse(testObject.allZeroes(null));
		assertTrue(testObject.allZeroes(empty));
		assertFalse(testObject.allZeroes(singleItemArray));
		assertFalse(testObject.allZeroes(tenMultiples));
		assertFalse(testObject.allZeroes(negPos));
		assertFalse(testObject.allZeroes(ascAllPos));
		assertFalse(testObject.allZeroes(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertTrue(testObject.allZeroes(e));
	}

	@Test
	public void testAllNonZeroes() {
		assertFalse(testObject.allNonZeroes(null));
		assertTrue(testObject.allNonZeroes(empty));
		assertTrue(testObject.allNonZeroes(singleItemArray));
		assertTrue(testObject.allNonZeroes(tenMultiples));
		assertTrue(testObject.allNonZeroes(negPos));
		assertTrue(testObject.allNonZeroes(ascAllPos));
		assertTrue(testObject.allNonZeroes(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(testObject.allNonZeroes(e));
	}

	@Test
	public void testAllPrimes() {
		assertFalse(testObject.allPrimes(null));
		assertTrue(testObject.allPrimes(empty));
		assertFalse(testObject.allPrimes(singleItemArray));
		assertFalse(testObject.allPrimes(tenMultiples));
		assertFalse(testObject.allPrimes(negPos));
		assertFalse(testObject.allPrimes(ascAllPos));
		assertFalse(testObject.allPrimes(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(testObject.allPrimes(e));
		int[] f = {7, 7, 7, 7, 7, 7, 7};
		assertTrue(testObject.allPrimes(f));
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
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(testObject.containsPositive(e));
	}

	@Test
	public void testContainsNegative() {
		assertFalse(testObject.containsNegative(null));
		assertFalse(testObject.containsNegative(empty));
		assertFalse(testObject.containsNegative(singleItemArray));
		assertTrue(testObject.containsNegative(tenMultiples));
		assertTrue(testObject.containsNegative(negPos));
		assertFalse(testObject.containsNegative(ascAllPos));
		assertTrue(testObject.containsNegative(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(testObject.containsNegative(e));
	}

	@Test
	public void testContainsZero() {
		assertFalse(testObject.containsZero(null));
		assertFalse(testObject.containsZero(empty));
		assertFalse(testObject.containsZero(singleItemArray));
		singleItemArray[0] = 0;
		assertTrue(testObject.containsZero(singleItemArray));
		assertFalse(testObject.containsZero(tenMultiples));
		assertFalse(testObject.containsZero(negPos));
		assertFalse(testObject.containsZero(ascAllPos));
		assertFalse(testObject.containsZero(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertTrue(testObject.containsZero(e));
	}

	@Test
	public void testContainsNonZero() {
		assertFalse(testObject.containsNonZero(null));
		assertFalse(testObject.containsNonZero(empty));
		assertTrue(testObject.containsNonZero(singleItemArray));
		singleItemArray[0] = 0;
		assertFalse(testObject.containsNonZero(singleItemArray));
		assertTrue(testObject.containsNonZero(tenMultiples));
		assertTrue(testObject.containsNonZero(negPos));
		assertTrue(testObject.containsNonZero(ascAllPos));
		assertTrue(testObject.containsNonZero(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(testObject.containsNonZero(e));
	}

	@Test
	public void testContainsPrime() {
		assertFalse(testObject.containsPrime(null));
		assertFalse(testObject.containsPrime(empty));
		assertFalse(testObject.containsPrime(singleItemArray));
		assertFalse(testObject.containsPrime(negPos));
		assertTrue(testObject.containsPrime(ascAllPos));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(testObject.containsPrime(e));
	}

	@Test
	public void testIsAscending() {
		assertFalse(testObject.isAscending(null));
		assertTrue(testObject.isAscending(empty));
		assertTrue(testObject.isAscending(singleItemArray));
		assertFalse(testObject.isAscending(tenMultiples));
		assertFalse(testObject.isAscending(negPos));
		assertTrue(testObject.isAscending(ascAllPos));
		assertFalse(testObject.isAscending(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertTrue(testObject.isAscending(e));
	}

	@Test
	public void testIsDescending() {
		assertFalse(testObject.isDescending(null));
		assertTrue(testObject.isDescending(empty));
		assertTrue(testObject.isDescending(singleItemArray));
		assertFalse(testObject.isDescending(tenMultiples));
		assertFalse(testObject.isDescending(negPos));
		assertFalse(testObject.isDescending(ascAllPos));
		assertTrue(testObject.isDescending(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertTrue(testObject.isDescending(e));
	}

	@Test
	public void testIsUnchanged() {
		assertFalse(testObject.isUnchanged(null));
		assertTrue(testObject.isUnchanged(empty));
		assertTrue(testObject.isUnchanged(singleItemArray));
		assertFalse(testObject.isUnchanged(tenMultiples));
		assertFalse(testObject.isUnchanged(negPos));
		assertFalse(testObject.isUnchanged(ascAllPos));
		assertFalse(testObject.isUnchanged(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertTrue(testObject.isUnchanged(e));
	}

	@Test
	public void testgetSortedOrder() {
		assertEquals(0, testObject.getSortedOrder(null));
		assertEquals(2, testObject.getSortedOrder(empty));
		assertEquals(2, testObject.getSortedOrder(singleItemArray));
		assertEquals(0, testObject.getSortedOrder(tenMultiples));
		assertEquals(0, testObject.getSortedOrder(negPos));
		assertEquals(1, testObject.getSortedOrder(ascAllPos));
		assertEquals(-1, testObject.getSortedOrder(descNegs));
		int[] e = {10, 10, 10, 10, 10};
		assertEquals(2, testObject.getSortedOrder(e));
	}

	@Test
	public void testIsBalanced() {
		assertFalse(testObject.isBalanced(null));
		assertTrue(testObject.isBalanced(empty));
		assertFalse(testObject.isBalanced(singleItemArray));
		assertTrue(testObject.isBalanced(tenMultiples));
		assertFalse(testObject.isBalanced(negPos));
		assertFalse(testObject.isBalanced(ascAllPos));
		assertFalse(testObject.isBalanced(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertTrue(testObject.isBalanced(e));
	}

	@Test
	public void testAllDigits() {
		assertFalse(testObject.allDigits(null));
		assertTrue(testObject.allDigits(new char[]{}));
		assertTrue(testObject.allDigits(new char[]{'7'}));
		assertTrue(testObject.allDigits(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}));
		assertFalse(testObject.allDigits(new char[]{'C', 'O', 'M', 'P', '1', '2', '5'}));
		assertFalse(testObject.allDigits(new char[]{'H', 'D'}));
	}

	@Test
	public void testContainsDigit() {
		assertFalse(testObject.containsDigit(null));
		assertFalse(testObject.containsDigit(new char[]{}));
		assertTrue(testObject.containsDigit(new char[]{'7'}));
		assertTrue(testObject.containsDigit(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}));
		assertTrue(testObject.containsDigit(new char[]{'C', 'O', 'M', 'P', '1', '2', '5'}));
		assertFalse(testObject.containsDigit(new char[]{'H', 'D'}));
	}

	@Test
	public void testToString() {
		assertNull(testObject.toString(null));
		assertEquals("", testObject.toString(new char[]{}));
		assertEquals("COMP125", testObject.toString(new char[]{'C', 'O', 'M', 'P', '1', '2', '5'}));
		assertEquals("Hello world!", testObject.toString(new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'}));
	}

	@Test
	public void testGetCopy() {
		assertNull(testObject.getCopy(null));
		assertNotEquals(empty, testObject.getCopy(empty));
		assertNotEquals(singleItemArray, testObject.getCopy(singleItemArray));
		assertEquals(0, testObject.getCopy(empty).length);
		assertEquals("[777]", Arrays.toString(testObject.getCopy(singleItemArray)));
	}
}
