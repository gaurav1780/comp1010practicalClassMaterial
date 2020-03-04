package practicePackage.arrays.testsAttempts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.arrays.attempts.Stage2;

public class Stage2Test {
	private int[] empty;
	private int[] singleItemArray;
	private int[] tenMultiples;
	private int[] negPos;
	private int[] ascAllPos;
	private int[] descNegs;

	@BeforeEach
	void run() {
		empty = new int[]{};
		singleItemArray = new int[]{777};
		tenMultiples = new int[]{10,-70,-20,90};
		negPos = new int[]{-3, 15, -13, 16, -1, 10, -101};
		ascAllPos = new int[]{4, 7, 13, 28, 137, 224, 237, 254};
		descNegs = new int[]{-115, -125, -202, -225, -229, -255};
	}

	@Test
	void testSum() {
		assertEquals(0, Stage2.sum(null));
		assertEquals(0, Stage2.sum(empty));
		assertEquals(777, Stage2.sum(singleItemArray));
		assertEquals(10, Stage2.sum(tenMultiples));
		assertEquals((-77), Stage2.sum(negPos));
		assertEquals(904, Stage2.sum(ascAllPos));
		assertEquals((-1151), Stage2.sum(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, Stage2.sum(e));
	}

	@Test
	void testSumEven() {
		assertEquals(0, Stage2.sumEven(null));
		assertEquals(0, Stage2.sumEven(empty));
		assertEquals(0, Stage2.sumEven(singleItemArray));
		assertEquals(10, Stage2.sumEven(tenMultiples));
		assertEquals(26, Stage2.sumEven(negPos));
		assertEquals(510, Stage2.sumEven(ascAllPos));
		assertEquals((-202), Stage2.sumEven(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, Stage2.sumEven(e));
	}

	@Test
	void testSumOdd() {
		assertEquals(0, Stage2.sumOdd(null));
		assertEquals(0, Stage2.sumOdd(empty));
		assertEquals(777, Stage2.sumOdd(singleItemArray));
		assertEquals(0, Stage2.sumOdd(tenMultiples));
		assertEquals((-103), Stage2.sumOdd(negPos));
		assertEquals(394, Stage2.sumOdd(ascAllPos));
		assertEquals((-949), Stage2.sumOdd(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, Stage2.sumOdd(e));
	}

	@Test
	void testSumPositives() {
		assertEquals(0, Stage2.sumPositives(null));
		assertEquals(0, Stage2.sumPositives(empty));
		assertEquals(777, Stage2.sumPositives(singleItemArray));
		assertEquals(100, Stage2.sumPositives(tenMultiples));
		assertEquals(41, Stage2.sumPositives(negPos));
		assertEquals(904, Stage2.sumPositives(ascAllPos));
		assertEquals(0, Stage2.sumPositives(descNegs));
		int[] e = {0, 0, 0, 0, 10};
		assertEquals(10, Stage2.sumPositives(e));
	}

	@Test
	void testSumNegatives() {
		assertEquals(0, Stage2.sumNegatives(null));
		assertEquals(0, Stage2.sumNegatives(empty));
		assertEquals(0, Stage2.sumNegatives(singleItemArray));
		assertEquals((-90), Stage2.sumNegatives(tenMultiples));
		assertEquals((-118), Stage2.sumNegatives(negPos));
		assertEquals(0, Stage2.sumNegatives(ascAllPos));
		assertEquals((-1151), Stage2.sumNegatives(descNegs));
		int[] e = {0, 0, 0, 0, -10};
		assertEquals((-10), Stage2.sumNegatives(e));
	}

	@Test
	void testSumEvenIndexedItems() {
		assertEquals(0, Stage2.sumEvenIndexedItems(null));
		assertEquals(0, Stage2.sumEvenIndexedItems(empty));
		assertEquals(777, Stage2.sumEvenIndexedItems(singleItemArray));
		assertEquals(-10, Stage2.sumEvenIndexedItems(tenMultiples));
		assertEquals(-118, Stage2.sumEvenIndexedItems(negPos));
		assertEquals(391, Stage2.sumEvenIndexedItems(ascAllPos));
		assertEquals(-546, Stage2.sumEvenIndexedItems(descNegs));
	}

	@Test
	void testSumOddIndexedItems() {
		assertEquals(0, Stage2.sumOddIndexedItems(null));
		assertEquals(0, Stage2.sumOddIndexedItems(empty));
		assertEquals(0, Stage2.sumOddIndexedItems(singleItemArray));
		assertEquals(20, Stage2.sumOddIndexedItems(tenMultiples));
		assertEquals(41, Stage2.sumOddIndexedItems(negPos));
		assertEquals(513, Stage2.sumOddIndexedItems(ascAllPos));
		assertEquals(-605, Stage2.sumOddIndexedItems(descNegs));
	}

	@Test
	void testSumMultiples() {
		assertEquals(0, Stage2.sumMultiples(null, 69));
		assertEquals(0, Stage2.sumMultiples(empty, 96));
		assertEquals(777, Stage2.sumMultiples(singleItemArray, 777));
		assertEquals(10, Stage2.sumMultiples(tenMultiples, 10));
		assertEquals(0, Stage2.sumMultiples(negPos, 7));
		assertEquals(256, Stage2.sumMultiples(ascAllPos, 4));
		assertEquals(-720, Stage2.sumMultiples(descNegs, 5));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, Stage2.sumMultiples(e, 235));
	}

	@Test
	void testSumFactors() {
		assertEquals(0, Stage2.sumFactors(null, 69));
		assertEquals(0, Stage2.sumFactors(empty, 96));
		assertEquals(777, Stage2.sumFactors(singleItemArray, 777));
		assertEquals(10, Stage2.sumFactors(tenMultiples, 1260));
		assertEquals(9, Stage2.sumFactors(negPos, -100));
		assertEquals(263, Stage2.sumFactors(ascAllPos, 224));
		assertEquals(0, Stage2.sumFactors(descNegs, -235));
	}

	@Test
	void testSumInRange() {
		assertEquals(0, Stage2.sumInRange(null, 69, 96));
		assertEquals(0, Stage2.sumInRange(empty, 23, 35));
		assertEquals(777, Stage2.sumInRange(singleItemArray, 777, 777));
		assertEquals(10, Stage2.sumInRange(tenMultiples, -70, 90)); //all items satisfy
		assertEquals((-90), Stage2.sumInRange(tenMultiples, -80, -10));
		assertEquals(100, Stage2.sumInRange(tenMultiples, 0, 100));
		assertEquals(10, Stage2.sumInRange(negPos, 10, 14)); //only 1 item satisfies (= low)
		assertEquals(4, Stage2.sumInRange(ascAllPos, -115, 4)); //only 1 item satisfies (= high)
		assertEquals(0, Stage2.sumInRange(descNegs, 0, 125)); //no items satisfy
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, Stage2.sumInRange(e, 0, 0));
	}

	@Test
	void testSumNotInRange() {
		assertEquals(0, Stage2.sumNotInRange(null, 69, 96));
		assertEquals(0, Stage2.sumNotInRange(empty, 23, 35));
		assertEquals(0, Stage2.sumNotInRange(singleItemArray, 777, 777));
		assertEquals(10, Stage2.sumNotInRange(tenMultiples, 100, 169)); //all items satisfy
		assertEquals(100, Stage2.sumNotInRange(tenMultiples, -80, -10));
		assertEquals((-90), Stage2.sumNotInRange(tenMultiples, 0, 100));
		assertEquals((-87), Stage2.sumNotInRange(negPos, 10, 14)); //only 1 item dissatisfies (= low)
		assertEquals(900, Stage2.sumNotInRange(ascAllPos, -115, 4)); //only 1 item dissatisfies (= high)
		assertEquals(0, Stage2.sumNotInRange(descNegs, -269, 0)); //no items satisfy
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, Stage2.sumNotInRange(e, 0, 0));
	}

	@Test
	void testResetNegatives() {
		Stage2.resetNegatives(null); //NullPointerException check

		Stage2.resetNegatives(empty);
		assertEquals(0, empty.length);

		Stage2.resetNegatives(singleItemArray);
		assertEquals(777, singleItemArray[0]);

		Stage2.resetNegatives(tenMultiples);
		assertEquals(4, tenMultiples.length);
		assertEquals(10, tenMultiples[0]);
		assertEquals(0, tenMultiples[1]);
		assertEquals(0, tenMultiples[2]);
		assertEquals(90, tenMultiples[3]);

		String before1 = Arrays.toString(ascAllPos);
		Stage2.resetNegatives(ascAllPos);
		String after1 = Arrays.toString(ascAllPos);
		assertEquals(before1, after1);

		Stage2.resetNegatives(descNegs);
		assertEquals("[0, 0, 0, 0, 0, 0]", Arrays.toString(descNegs));

		int[] e = {0, 0, 0, 0, 0};
		String before2 = Arrays.toString(e);
		Stage2.resetNegatives(e);
		String after2 = Arrays.toString(e);
		assertEquals(before2, after2);
	}

	@Test
	void testMakeAbsolute() {
		Stage2.makeAbsolute(null); //NullPointerException check

		Stage2.makeAbsolute(empty);
		assertEquals(0, empty.length);

		Stage2.makeAbsolute(singleItemArray);
		assertEquals(777, singleItemArray[0]);

		Stage2.makeAbsolute(negPos);
		assertEquals(3, negPos[0]);
		assertEquals(15, negPos[1]);
		assertEquals(10, negPos[5]);
		assertEquals(101, negPos[6]);

		String before1 = Arrays.toString(ascAllPos);
		Stage2.makeAbsolute(ascAllPos);
		String after1 = Arrays.toString(ascAllPos);
		assertEquals(before1, after1);

		int[] e = new int[descNegs.length];
		for (int i = 0; i < descNegs.length; i++) {
			e[i] = -descNegs[i];
		}
		Stage2.makeAbsolute(descNegs);
		assertEquals(Arrays.toString(descNegs), Arrays.toString(e));

		int[] f = {0, 0, 0, 0, 0};
		String before2 = Arrays.toString(f);
		Stage2.makeAbsolute(f);
		String after2 = Arrays.toString(f);
		assertEquals(before2, after2);
	}

	@Test
	void testSquareUp() {
		Stage2.squareUp(null); //NullPointerException check

		Stage2.squareUp(empty);
		assertEquals(0, empty.length);

		Stage2.squareUp(singleItemArray);
		assertEquals(777 * 777, singleItemArray[0]);

		Stage2.squareUp(tenMultiples);
		assertEquals("[100, 4900, 400, 8100]", Arrays.toString(tenMultiples));

		Stage2.squareUp(negPos);
		for (int item: negPos) {
			assertTrue(ServiceClasses.MathService.isSquare(item));
		}

		int[] e = {0, 0, 0, 0, 0};
		String before = Arrays.toString(e);
		Stage2.squareUp(e);
		String after = Arrays.toString(e);
		assertEquals(before, after);
	}

	@Test
	void testCountEven() {
		assertEquals(0, Stage2.countEven(null));
		assertEquals(0, Stage2.countEven(empty));
		assertEquals(0, Stage2.countEven(singleItemArray));
		assertEquals(4, Stage2.countEven(tenMultiples));
		assertEquals(2, Stage2.countEven(negPos));
		assertEquals(4, Stage2.countEven(ascAllPos));
		assertEquals(1, Stage2.countEven(descNegs));
		int[] e = {0,0,0,0,0};
		assertEquals(5, Stage2.countEven(e));
	}

	@Test
	void testCountOdd() {
		assertEquals(0, Stage2.countOdd(null));
		assertEquals(0, Stage2.countOdd(empty));
		assertEquals(1, Stage2.countOdd(singleItemArray));
		assertEquals(0, Stage2.countOdd(tenMultiples));
		assertEquals(5, Stage2.countOdd(negPos));
		assertEquals(4, Stage2.countOdd(ascAllPos));
		assertEquals(5, Stage2.countOdd(descNegs));
		int[] e = {0,0,0,0,0};
		assertEquals(0, Stage2.countOdd(e));
	}

	@Test
	void testCountPositives() {
		assertEquals(0, Stage2.countPositives(null));
		assertEquals(0, Stage2.countPositives(empty));
		assertEquals(1, Stage2.countPositives(singleItemArray));
		assertEquals(2, Stage2.countPositives(tenMultiples));
		assertEquals(3, Stage2.countPositives(negPos));
		assertEquals(8, Stage2.countPositives(ascAllPos));
		assertEquals(0, Stage2.countPositives(descNegs));
		int[] e = {0,0,0,0,10};
		assertEquals(1, Stage2.countPositives(e));
	}

	@Test
	void testCountNegatives() {
		assertEquals(0, Stage2.countNegatives(null));
		assertEquals(0, Stage2.countNegatives(empty));
		assertEquals(0, Stage2.countNegatives(singleItemArray));
		assertEquals(2, Stage2.countNegatives(tenMultiples));
		assertEquals(4, Stage2.countNegatives(negPos));
		assertEquals(0, Stage2.countNegatives(ascAllPos));
		assertEquals(6, Stage2.countNegatives(descNegs));
		int[] e = {0,0,0,0,-10};
		assertEquals(1, Stage2.countNegatives(e));
	}

	@Test
	void testCountMultiples() {
		assertEquals(0, Stage2.countMultiples(null, 69));
		assertEquals(0, Stage2.countMultiples(empty, 96));
		assertEquals(1, Stage2.countMultiples(singleItemArray, 777));
		assertEquals(4, Stage2.countMultiples(tenMultiples, 10));
		assertEquals(0, Stage2.countMultiples(negPos, 7));
		assertEquals(3, Stage2.countMultiples(ascAllPos, 4));
		assertEquals(4, Stage2.countMultiples(descNegs, 5));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(5, Stage2.countMultiples(e, 235));
	}

	@Test
	void testCountFactors() {
		assertEquals(0, Stage2.countFactors(null, 69));
		assertEquals(0, Stage2.countFactors(empty, 96));
		assertEquals(1, Stage2.countFactors(singleItemArray, 777));
		assertEquals(4, Stage2.countFactors(tenMultiples, 1260));
		assertEquals(2, Stage2.countFactors(negPos, -100));
		assertEquals(4, Stage2.countFactors(ascAllPos, 224));
		assertEquals(0, Stage2.countFactors(descNegs, -235));
	}

	@Test
	void testCountInRange() {
		assertEquals(0, Stage2.countInRange(null, 69, 96));
		assertEquals(0, Stage2.countInRange(empty, 23, 35));
		assertEquals(1, Stage2.countInRange(singleItemArray, 777, 777));
		assertEquals(4, Stage2.countInRange(tenMultiples, -70, 90)); //all items satisfy
		assertEquals(2, Stage2.countInRange(tenMultiples, -80, -10));
		assertEquals(2, Stage2.countInRange(tenMultiples, 0, 100));
		assertEquals(1, Stage2.countInRange(negPos, 10, 14)); //only 1 item satisfies (= low)
		assertEquals(1, Stage2.countInRange(ascAllPos, -115, 4)); //only 1 item satisfies (= high)
		assertEquals(0, Stage2.countInRange(descNegs, 0, 125)); //no items satisfy
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(5, Stage2.countInRange(e, 0, 0));
	}

	@Test
	void testCountNotInRange() {
		assertEquals(0, Stage2.countNotInRange(null, 69, 96));
		assertEquals(0, Stage2.countNotInRange(empty, 23, 35));
		assertEquals(0, Stage2.countNotInRange(singleItemArray, 777, 777));
		assertEquals(4, Stage2.countNotInRange(tenMultiples, 100, 169)); //all items satisfy
		assertEquals(2, Stage2.countNotInRange(tenMultiples, -80, -10));
		assertEquals(2, Stage2.countNotInRange(tenMultiples, 0, 100));
		assertEquals(6, Stage2.countNotInRange(negPos, 10, 14)); //only 1 item dissatisfies (= low)
		assertEquals(7, Stage2.countNotInRange(ascAllPos, -115, 4)); //only 1 item dissatisfies (= high)
		assertEquals(0, Stage2.countNotInRange(descNegs, -269, 0)); //no items satisfy
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, Stage2.countNotInRange(e, 0, 0));
	}

	@Test
	void testCountOccurrences() {
		assertEquals(0, Stage2.countOccurrences(null, 69));
		assertEquals(0, Stage2.countOccurrences(empty, 96));
		assertEquals(1, Stage2.countOccurrences(singleItemArray, 777));
		assertEquals(0, Stage2.countOccurrences(tenMultiples, 0));
		assertEquals(1, Stage2.countOccurrences(ascAllPos, 13));
		assertEquals(7, Stage2.countOccurrences(new int[]{7, 7, 7, 7, 7, 7, 7}, 7));
	}

	@Test
	void testCountUnique() {
		assertEquals(0, Stage2.countUnique(null));
		assertEquals(0, Stage2.countUnique(empty));
		assertEquals(1, Stage2.countUnique(singleItemArray));
		assertEquals(6, Stage2.countUnique(descNegs));
		assertEquals(3, Stage2.countUnique(new int[]{0, 2, 0, 3, 1, 5, 1}));
		assertEquals(0, Stage2.countUnique(new int[]{7, 7, 7, 7, 7, 7, 7}));
	}

	@Test
	void testContains() {
		assertFalse(Stage2.contains(null, 69));
		assertFalse(Stage2.contains(empty, 96));
		assertTrue(Stage2.contains(singleItemArray, 777));
		assertFalse(Stage2.contains(descNegs, 0));
		assertTrue(Stage2.contains(negPos, -13));
		assertTrue(Stage2.contains(new int[]{7, 7, 7, 7, 7, 7, 7}, 7));
	}

	@Test
	void testIndexOf() {
		assertEquals(-1, Stage2.indexOf(null, 69));
		assertEquals(-1, Stage2.indexOf(empty, 96));
		assertEquals(0, Stage2.indexOf(singleItemArray, 777));
		assertEquals(0, Stage2.indexOf(tenMultiples, 10));
		assertEquals(3, Stage2.indexOf(negPos, 16));
		assertEquals(7, Stage2.indexOf(ascAllPos, 254));
		assertEquals(-1, Stage2.indexOf(descNegs, 0));
		assertEquals(0, Stage2.indexOf(new int[]{7, 7, 7, 7, 7, 7, 7}, 7));
	}

	@Test
	void testLastIndexOf() {
		assertEquals(-1, Stage2.lastIndexOf(null, 69));
		assertEquals(-1, Stage2.lastIndexOf(empty, 96));
		assertEquals(0, Stage2.lastIndexOf(singleItemArray, 777));
		assertEquals(0, Stage2.lastIndexOf(tenMultiples, 10));
		assertEquals(3, Stage2.lastIndexOf(negPos, 16));
		assertEquals(7, Stage2.lastIndexOf(ascAllPos, 254));
		assertEquals(-1, Stage2.lastIndexOf(descNegs, 0));
		assertEquals(6, Stage2.lastIndexOf(new int[]{7, 7, 7, 7, 7, 7, 7}, 7));
	}

	@Test
	void testContainsFromIndex() {
		assertFalse(Stage2.containsFromIndex(null, 35, 23));
		assertFalse(Stage2.containsFromIndex(empty, 96, 69));
		assertTrue(Stage2.containsFromIndex(singleItemArray, 777, 0));
		assertFalse(Stage2.containsFromIndex(tenMultiples, 90, 4));
		assertFalse(Stage2.containsFromIndex(negPos, -13, -1));
		assertTrue(Stage2.containsFromIndex(ascAllPos, 254, 6));
		assertFalse(Stage2.containsFromIndex(descNegs, -115, 1));
		int[] e = {7, 7, 7, 7, 7, 7, 7};
		assertTrue(Stage2.containsFromIndex(e, 7, 0));
		assertTrue(Stage2.containsFromIndex(e, 7, 6));
	}

	@Test
	void testContainsUptoIndex() {
		assertFalse(Stage2.containsUptoIndex(null, 35, 23));
		assertFalse(Stage2.containsUptoIndex(empty, 96, 69));
		assertTrue(Stage2.containsUptoIndex(singleItemArray, 777, 0));
		assertFalse(Stage2.containsUptoIndex(tenMultiples, 90, 4));
		assertFalse(Stage2.containsUptoIndex(negPos, -13, -1));
		assertTrue(Stage2.containsUptoIndex(ascAllPos, 254, 7));
		assertTrue(Stage2.containsUptoIndex(descNegs, -115, 0));
		int[] e = {7, 7, 7, 7, 7, 7, 7};
		assertTrue(Stage2.containsUptoIndex(e, 7, 0));
		assertTrue(Stage2.containsUptoIndex(e, 7, 6));
	}

	@Test
	void testContainsBetweenIndices() {
		assertFalse(Stage2.containsBetweenIndices(null, 35, 1, 4));
		assertFalse(Stage2.containsBetweenIndices(empty, 96, 0, 0));
		assertTrue(Stage2.containsBetweenIndices(singleItemArray, 777, 0, 0));
		assertFalse(Stage2.containsBetweenIndices(tenMultiples, 90, 0, 2));
		assertTrue(Stage2.containsBetweenIndices(tenMultiples, 90, 0, 3));
		assertFalse(Stage2.containsBetweenIndices(negPos, -3, 1, negPos.length - 1));
		assertTrue(Stage2.containsBetweenIndices(negPos, -3, 0, negPos.length - 1));
		int[] e = {7, 7, 7, 7, 7, 7, 7};
		assertTrue(Stage2.containsBetweenIndices(e, 7, 0, 0));
		assertTrue(Stage2.containsBetweenIndices(e, 7, 6, 6));
	}

	@Test
	void testSumFromIndex() {
		assertEquals(0, Stage2.sumFromIndex(null, 23));
		assertEquals(0, Stage2.sumFromIndex(empty, 35));
		assertEquals(777, Stage2.sumFromIndex(singleItemArray, 0));
		assertEquals(0, Stage2.sumFromIndex(tenMultiples, 1));
		assertEquals((-101), Stage2.sumFromIndex(negPos, 6));
		assertEquals(0, Stage2.sumFromIndex(ascAllPos, -1));
		assertEquals(0, Stage2.sumFromIndex(descNegs, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, Stage2.sumFromIndex(e, 0));
		assertEquals(0, Stage2.sumFromIndex(e, 4));
	}

	@Test
	void testSumUptoIndex() {
		assertEquals(0, Stage2.sumUptoIndex(null, 23));
		assertEquals(0, Stage2.sumUptoIndex(empty, 35));
		assertEquals(777, Stage2.sumUptoIndex(singleItemArray, 0));
		assertEquals((-80), Stage2.sumUptoIndex(tenMultiples, 2));
		assertEquals((-3), Stage2.sumUptoIndex(negPos, 0));
		assertEquals(0, Stage2.sumUptoIndex(ascAllPos, -1));
		assertEquals(0, Stage2.sumUptoIndex(descNegs, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, Stage2.sumUptoIndex(e, 0));
		assertEquals(0, Stage2.sumUptoIndex(e, 4));
	}

	@Test
	void testSumBetweenIndices() {
		assertEquals(0, Stage2.sumBetweenIndices(null, 23, 35));
		assertEquals(0, Stage2.sumBetweenIndices(empty, 69, 96));
		assertEquals(777, Stage2.sumBetweenIndices(singleItemArray, 0, 0));
		assertEquals((-90), Stage2.sumBetweenIndices(tenMultiples, 1, 2));
		assertEquals(0, Stage2.sumBetweenIndices(negPos, -1, 7));
		assertEquals(0, Stage2.sumBetweenIndices(ascAllPos, -1, 7));
		assertEquals(0, Stage2.sumBetweenIndices(descNegs, 0, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, Stage2.sumBetweenIndices(e, 0, 4));
		assertEquals(0, Stage2.sumBetweenIndices(e, 1, 3));
	}

	@Test
	void testSumEvenFromIndex() {
		assertEquals(0, Stage2.sumEvenFromIndex(null, 23));
		assertEquals(0, Stage2.sumEvenFromIndex(empty, 35));
		assertEquals(0, Stage2.sumEvenFromIndex(singleItemArray, 0));
		assertEquals(70, Stage2.sumEvenFromIndex(tenMultiples, 2));
		assertEquals(10, Stage2.sumEvenFromIndex(negPos, 5));
		assertEquals(0, Stage2.sumEvenFromIndex(ascAllPos, -1));
		assertEquals(0, Stage2.sumEvenFromIndex(descNegs, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, Stage2.sumEvenFromIndex(e, 0));
		assertEquals(0, Stage2.sumEvenFromIndex(e, 4));
	}

	@Test
	void testSumOddUptoIndex() {
		assertEquals(0, Stage2.sumOddUptoIndex(null, 23));
		assertEquals(0, Stage2.sumOddUptoIndex(empty, 35));
		assertEquals(777, Stage2.sumOddUptoIndex(singleItemArray, 0));
		assertEquals(0, Stage2.sumOddUptoIndex(tenMultiples, 3));
		assertEquals(-2, Stage2.sumOddUptoIndex(negPos, 4));
		assertEquals(0, Stage2.sumOddUptoIndex(ascAllPos, -1));
		assertEquals(0, Stage2.sumOddUptoIndex(descNegs, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(0, Stage2.sumOddUptoIndex(e, 0));
		assertEquals(0, Stage2.sumOddUptoIndex(e, 4));
	}

	@Test
	void testProductPositivesUptoIndex() {
		assertEquals(1, Stage2.productPositivesUptoIndex(null, 23));
		assertEquals(1, Stage2.productPositivesUptoIndex(empty, 35));
		assertEquals(777, Stage2.productPositivesUptoIndex(singleItemArray, 0));
		assertEquals(900, Stage2.productPositivesUptoIndex(tenMultiples, 3));
		assertEquals(240, Stage2.productPositivesUptoIndex(negPos, 4));
		assertEquals(1, Stage2.productPositivesUptoIndex(ascAllPos, -1));
		assertEquals(1, Stage2.productPositivesUptoIndex(descNegs, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(1, Stage2.productPositivesUptoIndex(e, 0));
		assertEquals(1, Stage2.productPositivesUptoIndex(e, 4));
	}

	@Test
	void testProductNegativesFromIndex() {
		assertEquals(1, Stage2.productNegativesFromIndex(null, 23));
		assertEquals(1, Stage2.productNegativesFromIndex(empty, 35));
		assertEquals(1, Stage2.productNegativesFromIndex(singleItemArray, 0));
		assertEquals(-20, Stage2.productNegativesFromIndex(tenMultiples, 2));
		assertEquals(-101, Stage2.productNegativesFromIndex(negPos, 5));
		assertEquals(1, Stage2.productNegativesFromIndex(ascAllPos, -1));
		assertEquals(1, Stage2.productNegativesFromIndex(descNegs, 6));
		int[] e = {0, 0, 0, 0, 0};
		assertEquals(1, Stage2.productNegativesFromIndex(e, 0));
		assertEquals(1, Stage2.productNegativesFromIndex(e, 4));
	}

	@Test
	void testCountOccurrencesBetweenIndices() {
		assertEquals(0, Stage2.countOccurrencesBetweenIndices(null, 235, 23, 35));
		assertEquals(0, Stage2.countOccurrencesBetweenIndices(empty, 6996, 69, 96));
		assertEquals(1, Stage2.countOccurrencesBetweenIndices(singleItemArray, 777, 0, 0));
		assertEquals(0, Stage2.countOccurrencesBetweenIndices(tenMultiples, 10, 1, 2));
		assertEquals(0, Stage2.countOccurrencesBetweenIndices(negPos, 2, -1, 7));
		assertEquals(0, Stage2.countOccurrencesBetweenIndices(ascAllPos, 3, -1, 7));
		assertEquals(0, Stage2.countOccurrencesBetweenIndices(descNegs, 5, 0, 6));
		int[] e = {7, 7, 7, 7, 7, 7, 7};
		assertEquals(7, Stage2.countOccurrencesBetweenIndices(e, 7, 0, 6));
		assertEquals(5, Stage2.countOccurrencesBetweenIndices(e, 7, 1, 5));
		assertEquals(3, Stage2.countOccurrencesBetweenIndices(e, 7, 2, 4));
	}

	@Test
	void testCountUniqueBetweenIndices() {
		assertEquals(0, Stage2.countUniqueBetweenIndices(null, 23, 35));
		assertEquals(0, Stage2.countUniqueBetweenIndices(empty, 69, 96));
		assertEquals(1, Stage2.countUniqueBetweenIndices(singleItemArray, 0, 0));
		assertEquals(2, Stage2.countUniqueBetweenIndices(tenMultiples, 1, 2));
		assertEquals(0, Stage2.countUniqueBetweenIndices(negPos, -1, 7));
		assertEquals(0, Stage2.countUniqueBetweenIndices(ascAllPos, -1, 7));
		assertEquals(0, Stage2.countUniqueBetweenIndices(descNegs, 0, 6));
		int[] e = {7, 7, 7, 7, 7, 7, 7};
		assertEquals(0, Stage2.countUniqueBetweenIndices(e, 0, 6));
		assertEquals(0, Stage2.countUniqueBetweenIndices(e, 1, 5));
		assertEquals(0, Stage2.countUniqueBetweenIndices(e, 2, 4));
	}

	@Test
	void testAllPositives() {
		assertFalse(Stage2.allPositives(null));
		assertTrue(Stage2.allPositives(empty));
		assertTrue(Stage2.allPositives(singleItemArray));
		assertFalse(Stage2.allPositives(tenMultiples));
		assertFalse(Stage2.allPositives(negPos));
		assertTrue(Stage2.allPositives(ascAllPos));
		assertFalse(Stage2.allPositives(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(Stage2.allPositives(e));
	}

	@Test
	void testAllNegatives() {
		assertFalse(Stage2.allNegatives(null));
		assertTrue(Stage2.allNegatives(empty));
		assertFalse(Stage2.allNegatives(singleItemArray));
		assertFalse(Stage2.allNegatives(tenMultiples));
		assertFalse(Stage2.allNegatives(negPos));
		assertFalse(Stage2.allNegatives(ascAllPos));
		assertTrue(Stage2.allNegatives(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(Stage2.allNegatives(e));
	}

	@Test
	void testAllZeroes() {
		assertFalse(Stage2.allZeroes(null));
		assertTrue(Stage2.allZeroes(empty));
		assertFalse(Stage2.allZeroes(singleItemArray));
		assertFalse(Stage2.allZeroes(tenMultiples));
		assertFalse(Stage2.allZeroes(negPos));
		assertFalse(Stage2.allZeroes(ascAllPos));
		assertFalse(Stage2.allZeroes(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertTrue(Stage2.allZeroes(e));
	}

	@Test
	void testAllNonZeroes() {
		assertFalse(Stage2.allNonZeroes(null));
		assertTrue(Stage2.allNonZeroes(empty));
		assertTrue(Stage2.allNonZeroes(singleItemArray));
		assertTrue(Stage2.allNonZeroes(tenMultiples));
		assertTrue(Stage2.allNonZeroes(negPos));
		assertTrue(Stage2.allNonZeroes(ascAllPos));
		assertTrue(Stage2.allNonZeroes(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(Stage2.allNonZeroes(e));
	}

	@Test
	void testAllPrimes() {
		assertFalse(Stage2.allPrimes(null));
		assertTrue(Stage2.allPrimes(empty));
		assertFalse(Stage2.allPrimes(singleItemArray));
		assertFalse(Stage2.allPrimes(tenMultiples));
		assertFalse(Stage2.allPrimes(negPos));
		assertFalse(Stage2.allPrimes(ascAllPos));
		assertFalse(Stage2.allPrimes(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(Stage2.allPrimes(e));
		int[] f = {7, 7, 7, 7, 7, 7, 7};
		assertTrue(Stage2.allPrimes(f));
	}

	@Test
	void testContainsPositive() {
		assertFalse(Stage2.containsPositive(null));
		assertFalse(Stage2.containsPositive(empty));
		assertTrue(Stage2.containsPositive(singleItemArray));
		assertTrue(Stage2.containsPositive(tenMultiples));
		assertTrue(Stage2.containsPositive(negPos));
		assertTrue(Stage2.containsPositive(ascAllPos));
		assertFalse(Stage2.containsPositive(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(Stage2.containsPositive(e));
	}

	@Test
	void testContainsNegative() {
		assertFalse(Stage2.containsNegative(null));
		assertFalse(Stage2.containsNegative(empty));
		assertFalse(Stage2.containsNegative(singleItemArray));
		assertTrue(Stage2.containsNegative(tenMultiples));
		assertTrue(Stage2.containsNegative(negPos));
		assertFalse(Stage2.containsNegative(ascAllPos));
		assertTrue(Stage2.containsNegative(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(Stage2.containsNegative(e));
	}

	@Test
	void testContainsZero() {
		assertFalse(Stage2.containsZero(null));
		assertFalse(Stage2.containsZero(empty));
		assertFalse(Stage2.containsZero(singleItemArray));
		singleItemArray[0] = 0;
		assertTrue(Stage2.containsZero(singleItemArray));
		assertFalse(Stage2.containsZero(tenMultiples));
		assertFalse(Stage2.containsZero(negPos));
		assertFalse(Stage2.containsZero(ascAllPos));
		assertFalse(Stage2.containsZero(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertTrue(Stage2.containsZero(e));
	}

	@Test
	void testContainsNonZero() {
		assertFalse(Stage2.containsNonZero(null));
		assertFalse(Stage2.containsNonZero(empty));
		assertTrue(Stage2.containsNonZero(singleItemArray));
		singleItemArray[0] = 0;
		assertFalse(Stage2.containsNonZero(singleItemArray));
		assertTrue(Stage2.containsNonZero(tenMultiples));
		assertTrue(Stage2.containsNonZero(negPos));
		assertTrue(Stage2.containsNonZero(ascAllPos));
		assertTrue(Stage2.containsNonZero(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(Stage2.containsNonZero(e));
	}

	@Test
	void testContainsPrime() {
		assertFalse(Stage2.containsPrime(null));
		assertFalse(Stage2.containsPrime(empty));
		assertFalse(Stage2.containsPrime(singleItemArray));
		assertFalse(Stage2.containsPrime(negPos));
		assertTrue(Stage2.containsPrime(ascAllPos));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(Stage2.containsPrime(e));
	}

	@Test
	void testIsAscending() {
		assertFalse(Stage2.isAscending(null));
		assertTrue(Stage2.isAscending(empty));
		assertTrue(Stage2.isAscending(singleItemArray));
		assertFalse(Stage2.isAscending(tenMultiples));
		assertFalse(Stage2.isAscending(negPos));
		assertTrue(Stage2.isAscending(ascAllPos));
		assertFalse(Stage2.isAscending(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertTrue(Stage2.isAscending(e));
	}

	@Test
	void testIsDescending() {
		assertFalse(Stage2.isDescending(null));
		assertTrue(Stage2.isDescending(empty));
		assertTrue(Stage2.isDescending(singleItemArray));
		assertFalse(Stage2.isDescending(tenMultiples));
		assertFalse(Stage2.isDescending(negPos));
		assertFalse(Stage2.isDescending(ascAllPos));
		assertTrue(Stage2.isDescending(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertTrue(Stage2.isDescending(e));
	}

	@Test
	void testIsUnchanged() {
		assertFalse(Stage2.isUnchanged(null));
		assertTrue(Stage2.isUnchanged(empty));
		assertTrue(Stage2.isUnchanged(singleItemArray));
		assertFalse(Stage2.isUnchanged(tenMultiples));
		assertFalse(Stage2.isUnchanged(negPos));
		assertFalse(Stage2.isUnchanged(ascAllPos));
		assertFalse(Stage2.isUnchanged(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertTrue(Stage2.isUnchanged(e));
	}

	@Test
	void testgetSortedOrder() {
		assertEquals(0, Stage2.getSortedOrder(null));
		assertEquals(2, Stage2.getSortedOrder(empty));
		assertEquals(2, Stage2.getSortedOrder(singleItemArray));
		assertEquals(0, Stage2.getSortedOrder(tenMultiples));
		assertEquals(0, Stage2.getSortedOrder(negPos));
		assertEquals(1, Stage2.getSortedOrder(ascAllPos));
		assertEquals(-1, Stage2.getSortedOrder(descNegs));
		int[] e = {10, 10, 10, 10, 10};
		assertEquals(2, Stage2.getSortedOrder(e));
	}

	@Test
	void testIsBalanced() {
		assertFalse(Stage2.isBalanced(null));
		assertTrue(Stage2.isBalanced(empty));
		assertFalse(Stage2.isBalanced(singleItemArray));
		assertTrue(Stage2.isBalanced(tenMultiples));
		assertFalse(Stage2.isBalanced(negPos));
		assertFalse(Stage2.isBalanced(ascAllPos));
		assertFalse(Stage2.isBalanced(descNegs));
		int[] e = {0, 0, 0, 0, 0};
		assertTrue(Stage2.isBalanced(e));
	}

	@Test
	void testAllDigits() {
		assertFalse(Stage2.allDigits(null));
		assertTrue(Stage2.allDigits(new char[]{}));
		assertTrue(Stage2.allDigits(new char[]{'7'}));
		assertTrue(Stage2.allDigits(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}));
		assertFalse(Stage2.allDigits(new char[]{'C', 'O', 'M', 'P', '1', '2', '5'}));
		assertFalse(Stage2.allDigits(new char[]{'H', 'D'}));
	}

	@Test
	void testContainsDigit() {
		assertFalse(Stage2.containsDigit(null));
		assertFalse(Stage2.containsDigit(new char[]{}));
		assertTrue(Stage2.containsDigit(new char[]{'7'}));
		assertTrue(Stage2.containsDigit(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}));
		assertTrue(Stage2.containsDigit(new char[]{'C', 'O', 'M', 'P', '1', '2', '5'}));
		assertFalse(Stage2.containsDigit(new char[]{'H', 'D'}));
	}

	@Test
	void testToString() {
		assertNull(Stage2.toString(null));
		assertEquals("", Stage2.toString(new char[]{}));
		assertEquals("COMP125", Stage2.toString(new char[]{'C', 'O', 'M', 'P', '1', '2', '5'}));
		assertEquals("Hello world!", Stage2.toString(new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'}));
	}

	@Test
	void testGetCopy() {
		assertNull(Stage2.getCopy(null));
		assertNotEquals(empty, Stage2.getCopy(empty));
		assertNotEquals(singleItemArray, Stage2.getCopy(singleItemArray));
		assertEquals(0, Stage2.getCopy(empty).length);
		assertEquals("[777]", Arrays.toString(Stage2.getCopy(singleItemArray)));
	}
}
