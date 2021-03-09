package practicePackage.builtInLists.testsAttempts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ServiceClasses.Rectangle;
import practicePackage.builtInLists.attempts.*;

class Stage2Test {
	public ArrayList<Integer> nullList, emptyList, singleItemList, tenMultiples, negPos, ascAllPos, descNegs,list1, list2;
	public ArrayList<Rectangle> rList;

	@BeforeEach
	public void run() {
		nullList = null;
		emptyList = new ArrayList<Integer>();
		singleItemList = new ArrayList<Integer>(Arrays.asList(-7));
		tenMultiples = new ArrayList<Integer>(Arrays.asList(10,-70,-20,90));
		negPos = new ArrayList<Integer>(Arrays.asList(-3, 15, -13, 16, -1, 10, -101));
		ascAllPos = new ArrayList<Integer>(Arrays.asList(4, 7, 13, 28, 137, 224, 237, 254));
		descNegs = new ArrayList<Integer>(Arrays.asList(-115, -125, -202, -225, -229, -255));

		list1 = new ArrayList<Integer>(Arrays.asList(10,70,20,90));
		list2 = new ArrayList<Integer>(Arrays.asList(-5, 0, 8, -7, 9, 15, 23, -1, 5));
		rList = new ArrayList<Rectangle>();
		rList.add(new Rectangle(5));
		rList.add(new Rectangle(10));
		rList.add(new Rectangle(2, 6));
		rList.add(new Rectangle(20));
		rList.add(new Rectangle(1, 5));
		rList.add(new Rectangle(8));			
	}

	@Test
	void testCount() {
		assertEquals(0, Stage2.count(nullList,0));
		assertEquals(0, Stage2.count(emptyList,0));
		assertEquals(0, Stage2.count(singleItemList,0));
		assertEquals(1, Stage2.count(singleItemList,-7));
		assertEquals(1, Stage2.count(list1,10));
		assertEquals(1, Stage2.count(list2,5));
		list2.add(5);
		list2.add(5);
		list2.add(5);
		assertEquals(4, Stage2.count(list2,5));
	}

	@Test
	void testContainsInRange() {
		assertFalse(Stage2.containsInRange(nullList,0,5));
		assertFalse(Stage2.containsInRange(emptyList,0,5));
		assertFalse(Stage2.containsInRange(singleItemList,-6,0));
		assertTrue(Stage2.containsInRange(singleItemList,-7,0));
		assertFalse(Stage2.containsInRange(singleItemList,-10,-8));
		assertTrue(Stage2.containsInRange(singleItemList,-10,-7));
		assertTrue(Stage2.containsInRange(list1,0,10));
		assertTrue(Stage2.containsInRange(list1,20,100));
		assertFalse(Stage2.containsInRange(list1,0,9));
		assertFalse(Stage2.containsInRange(list2,4,4));

	}

	@Test
	void testAllInRange() {
		assertFalse(Stage2.allInRange(nullList,0,5));
		//assertFalse(Stage2.allInRange(emptyList,0,5));
		assertFalse(Stage2.allInRange(singleItemList,-6,0));
		assertTrue(Stage2.allInRange(singleItemList,-7,0));
		assertFalse(Stage2.allInRange(singleItemList,-10,-8));
		assertTrue(Stage2.allInRange(singleItemList,-10,-7));
		assertFalse(Stage2.allInRange(list1,0,10));
		assertFalse(Stage2.allInRange(list1,20,100));
		assertTrue(Stage2.allInRange(list1,10,90));
		assertFalse(Stage2.allInRange(list1,0,9));
		assertFalse(Stage2.allInRange(list2,-6,23));
		assertFalse(Stage2.allInRange(list2,-7,22));
		assertTrue(Stage2.allInRange(list2,-7,23));
	}

	@Test
	void testCountPrimes() {
		assertEquals(0, Stage2.countPrimes(nullList));
		assertEquals(0, Stage2.countPrimes(emptyList));
		assertEquals(0, Stage2.countPrimes(singleItemList));
		assertEquals(0, Stage2.countPrimes(list1));
		assertEquals(2, Stage2.countPrimes(list2));	//23 and 5
	}

	@Test
	void testContainsPrime() {
		assertFalse(Stage2.containsPrime(nullList));
		assertFalse(Stage2.containsPrime(emptyList));
		assertFalse(Stage2.containsPrime(singleItemList));

		singleItemList.add(0,13);
		assertTrue(Stage2.containsPrime(singleItemList));

		assertFalse(Stage2.containsPrime(list1));

		list1.add(7);
		assertTrue(Stage2.containsPrime(list1));

		assertTrue(Stage2.containsPrime(list2));
	}

	@Test
	void testAllPrimes() {
		assertFalse(Stage2.allPrimes(nullList));
		assertTrue(Stage2.allPrimes(emptyList));
		assertFalse(Stage2.allPrimes(singleItemList));		
		singleItemList = new ArrayList<Integer>(Arrays.asList(13));
		assertTrue(Stage2.allPrimes(singleItemList));		

		assertFalse(Stage2.allPrimes(list1));

		list1 = new ArrayList<Integer>(Arrays.asList(13,29,97,2,5,3));
		assertTrue(Stage2.allPrimes(list1));		

		assertFalse(Stage2.allPrimes(list2));	
	}

	@Test
	void testCountSquares() {
		assertEquals(4, Stage2.countSquares(rList));
		rList.remove(0);
		assertEquals(3, Stage2.countSquares(rList));
		rList.remove(0);
		assertEquals(2, Stage2.countSquares(rList));
		rList.remove(rList.size()-1);
		assertEquals(1, Stage2.countSquares(rList));
	}

	@Test
	void testSum() {
		assertEquals(0, Stage2.sum(null));
		assertEquals(0, Stage2.sum(emptyList));
		assertEquals(-7, Stage2.sum(singleItemList));
		assertEquals(10, Stage2.sum(tenMultiples));
		assertEquals((-77), Stage2.sum(negPos));
		assertEquals(904, Stage2.sum(ascAllPos));
		assertEquals((-1151), Stage2.sum(descNegs));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(0, Stage2.sum(e));
	}

	@Test
	void testSumEven() {
		assertEquals(0, Stage2.sumEven(null));
		assertEquals(0, Stage2.sumEven(emptyList));
		assertEquals(0, Stage2.sumEven(singleItemList));
		assertEquals(10, Stage2.sumEven(tenMultiples));
		assertEquals(26, Stage2.sumEven(negPos));
		assertEquals(510, Stage2.sumEven(ascAllPos));
		assertEquals((-202), Stage2.sumEven(descNegs));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(0, Stage2.sumEven(e));
	}

	@Test
	void testSumOdd() {
		assertEquals(0, Stage2.sumOdd(null));
		assertEquals(0, Stage2.sumOdd(emptyList));
		assertEquals(-7, Stage2.sumOdd(singleItemList));
		assertEquals(0, Stage2.sumOdd(tenMultiples));
		assertEquals((-103), Stage2.sumOdd(negPos));
		assertEquals(394, Stage2.sumOdd(ascAllPos));
		assertEquals((-949), Stage2.sumOdd(descNegs));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(0, Stage2.sumOdd(e));
	}

	@Test
	void testSumPositives() {
		assertEquals(0, Stage2.sumPositives(null));
		assertEquals(0, Stage2.sumPositives(emptyList));
		assertEquals(0, Stage2.sumPositives(singleItemList));
		assertEquals(100, Stage2.sumPositives(tenMultiples));
		assertEquals(41, Stage2.sumPositives(negPos));
		assertEquals(904, Stage2.sumPositives(ascAllPos));
		assertEquals(0, Stage2.sumPositives(descNegs));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 10));
		assertEquals(10, Stage2.sumPositives(e));
	}

	@Test
	void testSumNegatives() {
		assertEquals(0, Stage2.sumNegatives(null));
		assertEquals(0, Stage2.sumNegatives(emptyList));
		assertEquals(-7, Stage2.sumNegatives(singleItemList));
		assertEquals((-90), Stage2.sumNegatives(tenMultiples));
		assertEquals((-118), Stage2.sumNegatives(negPos));
		assertEquals(0, Stage2.sumNegatives(ascAllPos));
		assertEquals((-1151), Stage2.sumNegatives(descNegs));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, -10));
		assertEquals((-10), Stage2.sumNegatives(e));
	}

	@Test
	void testSumEvenIndexedItems() {
		assertEquals(0, Stage2.sumEvenIndexedItems(null));
		assertEquals(0, Stage2.sumEvenIndexedItems(emptyList));
		assertEquals(-7, Stage2.sumEvenIndexedItems(singleItemList));
		assertEquals(-10, Stage2.sumEvenIndexedItems(tenMultiples));
		assertEquals(-118, Stage2.sumEvenIndexedItems(negPos));
		assertEquals(391, Stage2.sumEvenIndexedItems(ascAllPos));
		assertEquals(-546, Stage2.sumEvenIndexedItems(descNegs));
	}

	@Test
	void testSumOddIndexedItems() {
		assertEquals(0, Stage2.sumOddIndexedItems(null));
		assertEquals(0, Stage2.sumOddIndexedItems(emptyList));
		assertEquals(0, Stage2.sumOddIndexedItems(singleItemList));
		assertEquals(20, Stage2.sumOddIndexedItems(tenMultiples));
		assertEquals(41, Stage2.sumOddIndexedItems(negPos));
		assertEquals(513, Stage2.sumOddIndexedItems(ascAllPos));
		assertEquals(-605, Stage2.sumOddIndexedItems(descNegs));
	}

	@Test
	void testSumMultiples() {
		assertEquals(0, Stage2.sumMultiples(null, 69));
		assertEquals(0, Stage2.sumMultiples(emptyList, 96));
		assertEquals(-7, Stage2.sumMultiples(singleItemList, -7));
		assertEquals(10, Stage2.sumMultiples(tenMultiples, 10));
		assertEquals(0, Stage2.sumMultiples(negPos, 7));
		assertEquals(256, Stage2.sumMultiples(ascAllPos, 4));
		assertEquals(-720, Stage2.sumMultiples(descNegs, 5));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(0, Stage2.sumMultiples(e, 235));
	}

	@Test
	void testSumFactors() {
		assertEquals(0, Stage2.sumFactors(null, 69));
		assertEquals(0, Stage2.sumFactors(emptyList, 96));
		assertEquals(-7, Stage2.sumFactors(singleItemList, -7));
		assertEquals(-7, Stage2.sumFactors(singleItemList, 7));
		assertEquals(10, Stage2.sumFactors(tenMultiples, 1260));
		assertEquals(9, Stage2.sumFactors(negPos, -100));
		assertEquals(263, Stage2.sumFactors(ascAllPos, 224));
		assertEquals(0, Stage2.sumFactors(descNegs, -235));
	}

	@Test
	void testSumInRange() {
		assertEquals(0, Stage2.sumInRange(null, 69, 96));
		assertEquals(0, Stage2.sumInRange(emptyList, 23, 35));
		assertEquals(0, Stage2.sumInRange(singleItemList, 777, 777));
		assertEquals(-7, Stage2.sumInRange(singleItemList, -7, -7));
		assertEquals(10, Stage2.sumInRange(tenMultiples, -70, 90)); //all items satisfy
		assertEquals((-90), Stage2.sumInRange(tenMultiples, -80, -10));
		assertEquals(100, Stage2.sumInRange(tenMultiples, 0, 100));
		assertEquals(10, Stage2.sumInRange(negPos, 10, 14)); //only 1 item satisfies (= low)
		assertEquals(4, Stage2.sumInRange(ascAllPos, -115, 4)); //only 1 item satisfies (= high)
		assertEquals(0, Stage2.sumInRange(descNegs, 0, 125)); //no items satisfy
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(0, Stage2.sumInRange(e, 0, 0));
	}

	@Test
	void testSumNotInRange() {
		assertEquals(0, Stage2.sumNotInRange(null, 69, 96));
		assertEquals(0, Stage2.sumNotInRange(emptyList, 23, 35));
		assertEquals(-7, Stage2.sumNotInRange(singleItemList, 777, 777));
		assertEquals(10, Stage2.sumNotInRange(tenMultiples, 100, 169)); //all items satisfy
		assertEquals(100, Stage2.sumNotInRange(tenMultiples, -80, -10));
		assertEquals((-90), Stage2.sumNotInRange(tenMultiples, 0, 100));
		assertEquals((-87), Stage2.sumNotInRange(negPos, 10, 14)); //only 1 item dissatisfies (= low)
		assertEquals(900, Stage2.sumNotInRange(ascAllPos, -115, 4)); //only 1 item dissatisfies (= high)
		assertEquals(0, Stage2.sumNotInRange(descNegs, -269, 0)); //no items satisfy
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(0, Stage2.sumNotInRange(e, 0, 0));
	}

	@Test
	void testResetNegatives() {
		Stage2.resetNegatives(null); //NullPointerException check

		Stage2.resetNegatives(emptyList);
		assertEquals(0, emptyList.size());

		Stage2.resetNegatives(singleItemList);
		assertEquals((Integer)0, singleItemList.get(0));

		Stage2.resetNegatives(tenMultiples);
		assertEquals(4, tenMultiples.size());
		assertEquals((Integer)10, tenMultiples.get(0));
		assertEquals((Integer)0, tenMultiples.get(1));
		assertEquals((Integer)0, tenMultiples.get(2));
		assertEquals((Integer)90, tenMultiples.get(3));

		String before1 = ascAllPos.toString();
		Stage2.resetNegatives(ascAllPos);
		String after1 = ascAllPos.toString();
		assertEquals(before1, after1);

		Stage2.resetNegatives(descNegs);
		assertEquals("[0, 0, 0, 0, 0, 0]", descNegs.toString());

		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		String before2 = e.toString();
		Stage2.resetNegatives(e);
		String after2 = e.toString();
		assertEquals(before2, after2);
	}

	@Test
	void testMakeAbsolute() {
		Stage2.makeAbsolute(null); //NullPointerException check

		Stage2.makeAbsolute(emptyList);
		assertEquals(0, emptyList.size());

		Stage2.makeAbsolute(singleItemList);
		assertEquals((Integer)7, singleItemList.get(0));

		Stage2.makeAbsolute(negPos);
		assertEquals((Integer)3, negPos.get(0));
		assertEquals((Integer)15, negPos.get(1));
		assertEquals((Integer)10, negPos.get(5));
		assertEquals((Integer)101, negPos.get(6));

		String before1 = ascAllPos.toString();
		Stage2.makeAbsolute(ascAllPos);
		String after1 = ascAllPos.toString();
		assertEquals(before1, after1);

		ArrayList<Integer> e = new ArrayList<Integer>();
		for (int i = 0; i < descNegs.size(); i++) {
			e.add(-descNegs.get(i));
		}
		Stage2.makeAbsolute(descNegs);
		assertEquals(descNegs.toString(), e.toString());

		ArrayList<Integer> f = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		String before2 = f.toString();
		Stage2.makeAbsolute(f);
		String after2 = f.toString();
		assertEquals(before2, after2);
	}

	@Test
	void testSquareUp() {
		Stage2.squareUp(null); //NullPointerException check

		Stage2.squareUp(emptyList);
		assertEquals(0, emptyList.size());

		Stage2.squareUp(singleItemList);
		assertEquals((Integer)(7 * 7), singleItemList.get(0));

		Stage2.squareUp(tenMultiples);
		assertEquals("[100, 4900, 400, 8100]", tenMultiples.toString());

		Stage2.squareUp(negPos);
		for (int item: negPos) {
			assertTrue(ServiceClasses.MathService.isSquare(item));
		}

		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		String before = e.toString();
		Stage2.squareUp(e);
		String after = e.toString();
		assertEquals(before, after);
	}

	@Test
	void testCountEven() {
		assertEquals(0, Stage2.countEven(null));
		assertEquals(0, Stage2.countEven(emptyList));
		assertEquals(0, Stage2.countEven(singleItemList));
		assertEquals(4, Stage2.countEven(tenMultiples));
		assertEquals(2, Stage2.countEven(negPos));
		assertEquals(4, Stage2.countEven(ascAllPos));
		assertEquals(1, Stage2.countEven(descNegs));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0));
		assertEquals(5, Stage2.countEven(e));
	}

	@Test
	void testCountOdd() {
		assertEquals(0, Stage2.countOdd(null));
		assertEquals(0, Stage2.countOdd(emptyList));
		assertEquals(1, Stage2.countOdd(singleItemList));
		assertEquals(0, Stage2.countOdd(tenMultiples));
		assertEquals(5, Stage2.countOdd(negPos));
		assertEquals(4, Stage2.countOdd(ascAllPos));
		assertEquals(5, Stage2.countOdd(descNegs));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0));
		assertEquals(0, Stage2.countOdd(e));
	}

	@Test
	void testCountPositives() {
		assertEquals(0, Stage2.countPositives(null));
		assertEquals(0, Stage2.countPositives(emptyList));
		assertEquals(0, Stage2.countPositives(singleItemList));
		assertEquals(2, Stage2.countPositives(tenMultiples));
		assertEquals(3, Stage2.countPositives(negPos));
		assertEquals(8, Stage2.countPositives(ascAllPos));
		assertEquals(0, Stage2.countPositives(descNegs));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0,0,0,0,10));
		assertEquals(1, Stage2.countPositives(e));
	}

	@Test
	void testCountNegatives() {
		assertEquals(0, Stage2.countNegatives(null));
		assertEquals(0, Stage2.countNegatives(emptyList));
		assertEquals(1, Stage2.countNegatives(singleItemList));
		assertEquals(2, Stage2.countNegatives(tenMultiples));
		assertEquals(4, Stage2.countNegatives(negPos));
		assertEquals(0, Stage2.countNegatives(ascAllPos));
		assertEquals(6, Stage2.countNegatives(descNegs));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0,0,0,0,-10));
		assertEquals(1, Stage2.countNegatives(e));
	}

	@Test
	void testCountMultiples() {
		assertEquals(0, Stage2.countMultiples(null, 69));
		assertEquals(0, Stage2.countMultiples(emptyList, 96));
		assertEquals(1, Stage2.countMultiples(singleItemList, -7));
		assertEquals(4, Stage2.countMultiples(tenMultiples, 10));
		assertEquals(0, Stage2.countMultiples(negPos, 7));
		assertEquals(3, Stage2.countMultiples(ascAllPos, 4));
		assertEquals(4, Stage2.countMultiples(descNegs, 5));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(5, Stage2.countMultiples(e, 235));
	}

	@Test
	void testCountFactors() {
		assertEquals(0, Stage2.countFactors(null, 69));
		assertEquals(0, Stage2.countFactors(emptyList, 96));
		assertEquals(1, Stage2.countFactors(singleItemList, 777));
		assertEquals(4, Stage2.countFactors(tenMultiples, 1260));
		assertEquals(2, Stage2.countFactors(negPos, -100));
		assertEquals(4, Stage2.countFactors(ascAllPos, 224));
		assertEquals(0, Stage2.countFactors(descNegs, -235));
	}

	@Test
	void testCountInRange() {
		assertEquals(0, Stage2.countInRange(null, 69, 96));
		assertEquals(0, Stage2.countInRange(emptyList, 23, 35));
		assertEquals(1, Stage2.countInRange(singleItemList, -7, -7));
		assertEquals(4, Stage2.countInRange(tenMultiples, -70, 90)); //all items satisfy
		assertEquals(2, Stage2.countInRange(tenMultiples, -80, -10));
		assertEquals(2, Stage2.countInRange(tenMultiples, 0, 100));
		assertEquals(1, Stage2.countInRange(negPos, 10, 14)); //only 1 item satisfies (= low)
		assertEquals(1, Stage2.countInRange(ascAllPos, -115, 4)); //only 1 item satisfies (= high)
		assertEquals(0, Stage2.countInRange(descNegs, 0, 125)); //no items satisfy
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(5, Stage2.countInRange(e, 0, 0));
	}

	@Test
	void testCountNotInRange() {
		assertEquals(0, Stage2.countNotInRange(null, 69, 96));
		assertEquals(0, Stage2.countNotInRange(emptyList, 23, 35));
		assertEquals(1, Stage2.countNotInRange(singleItemList, 777, 777));
		assertEquals(4, Stage2.countNotInRange(tenMultiples, 100, 169)); //all items satisfy
		assertEquals(2, Stage2.countNotInRange(tenMultiples, -80, -10));
		assertEquals(2, Stage2.countNotInRange(tenMultiples, 0, 100));
		assertEquals(6, Stage2.countNotInRange(negPos, 10, 14)); //only 1 item dissatisfies (= low)
		assertEquals(7, Stage2.countNotInRange(ascAllPos, -115, 4)); //only 1 item dissatisfies (= high)
		assertEquals(0, Stage2.countNotInRange(descNegs, -269, 0)); //no items satisfy
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(0, Stage2.countNotInRange(e, 0, 0));
	}

	@Test
	void testCountOccurrences() {
		assertEquals(0, Stage2.countOccurrences(null, 69));
		assertEquals(0, Stage2.countOccurrences(emptyList, 96));
		assertEquals(1, Stage2.countOccurrences(singleItemList, -7));
		assertEquals(0, Stage2.countOccurrences(tenMultiples, 0));
		assertEquals(1, Stage2.countOccurrences(ascAllPos, 13));
		assertEquals(7, Stage2.countOccurrences(new ArrayList<Integer>(Arrays.asList(7, 7, 7, 7, 7, 7, 7)), 7));
	}

	@Test
	void testCountUnique() {
		assertEquals(0, Stage2.countUnique(null));
		assertEquals(0, Stage2.countUnique(emptyList));
		assertEquals(1, Stage2.countUnique(singleItemList));
		assertEquals(6, Stage2.countUnique(descNegs));
		assertEquals(3, Stage2.countUnique(new ArrayList<Integer>(Arrays.asList(0, 2, 0, 3, 1, 5, 1))));
		assertEquals(0, Stage2.countUnique(new ArrayList<Integer>(Arrays.asList(7, 7, 7, 7, 7, 7, 7))));
	}

	@Test
	void testContains() {
		assertFalse(Stage2.contains(null, 69));
		assertFalse(Stage2.contains(emptyList, 96));
		assertFalse(Stage2.contains(singleItemList, 777));
		assertTrue(Stage2.contains(singleItemList, -7));
		assertFalse(Stage2.contains(descNegs, 0));
		assertTrue(Stage2.contains(negPos, -13));
		assertTrue(Stage2.contains(new ArrayList<Integer>(Arrays.asList(7, 7, 7, 7, 7, 7, 7)), 7));
	}

	@Test
	void testIndexOf() {
		assertEquals(-1, Stage2.indexOf(null, 69));
		assertEquals(-1, Stage2.indexOf(emptyList, 96));
		assertEquals(0, Stage2.indexOf(singleItemList, -7));
		assertEquals(0, Stage2.indexOf(tenMultiples, 10));
		assertEquals(3, Stage2.indexOf(negPos, 16));
		assertEquals(7, Stage2.indexOf(ascAllPos, 254));
		assertEquals(-1, Stage2.indexOf(descNegs, 0));
		assertEquals(0, Stage2.indexOf(new ArrayList<Integer>(Arrays.asList(7, 7, 7, 7, 7, 7, 7)), 7));
	}

	@Test
	void testLastIndexOf() {
		assertEquals(-1, Stage2.lastIndexOf(null, 69));
		assertEquals(-1, Stage2.lastIndexOf(emptyList, 96));
		assertEquals(0, Stage2.lastIndexOf(singleItemList, -7));
		assertEquals(0, Stage2.lastIndexOf(tenMultiples, 10));
		assertEquals(3, Stage2.lastIndexOf(negPos, 16));
		assertEquals(7, Stage2.lastIndexOf(ascAllPos, 254));
		assertEquals(-1, Stage2.lastIndexOf(descNegs, 0));
		assertEquals(6, Stage2.lastIndexOf(new ArrayList<Integer>(Arrays.asList(7, 7, 7, 7, 7, 7, 7)), 7));
	}

	@Test
	void testContainsFromIndex() {
		assertFalse(Stage2.containsFromIndex(null, 35, 23));
		assertFalse(Stage2.containsFromIndex(emptyList, 96, 69));
		assertFalse(Stage2.containsFromIndex(singleItemList, 777, 0));
		assertFalse(Stage2.containsFromIndex(tenMultiples, 90, 4));
		assertFalse(Stage2.containsFromIndex(negPos, -13, -1));
		assertTrue(Stage2.containsFromIndex(ascAllPos, 254, 6));
		assertFalse(Stage2.containsFromIndex(descNegs, -115, 1));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(7, 7, 7, 7, 7, 7, 7));
		assertTrue(Stage2.containsFromIndex(e, 7, 0));
		assertTrue(Stage2.containsFromIndex(e, 7, 6));
	}

	@Test
	void testContainsUptoIndex() {
		assertFalse(Stage2.containsUptoIndex(null, 35, 23));
		assertFalse(Stage2.containsUptoIndex(emptyList, 96, 69));
		assertFalse(Stage2.containsUptoIndex(singleItemList, 777, 0));
		assertFalse(Stage2.containsUptoIndex(tenMultiples, 90, 4));
		assertFalse(Stage2.containsUptoIndex(negPos, -13, -1));
		assertTrue(Stage2.containsUptoIndex(ascAllPos, 254, 7));
		assertTrue(Stage2.containsUptoIndex(descNegs, -115, 0));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(7, 7, 7, 7, 7, 7, 7));
		assertTrue(Stage2.containsUptoIndex(e, 7, 0));
		assertTrue(Stage2.containsUptoIndex(e, 7, 6));
	}

	@Test
	void testContainsBetweenIndices() {
		assertFalse(Stage2.containsBetweenIndices(null, 35, 0, 0));
		assertFalse(Stage2.containsBetweenIndices(emptyList, 35, 0, 0));
		assertFalse(Stage2.containsBetweenIndices(singleItemList, 35, 0, 0));
		assertFalse(Stage2.containsBetweenIndices(singleItemList, -7, 1, 1));
		assertTrue(Stage2.containsBetweenIndices(singleItemList, -7, 0, 0));
		assertTrue(Stage2.containsBetweenIndices(tenMultiples, 90, 3, 3));
		assertTrue(Stage2.containsBetweenIndices(tenMultiples, 90, 1, 3));
		assertFalse(Stage2.containsBetweenIndices(tenMultiples, 10, 1, 3));
		assertTrue(Stage2.containsBetweenIndices(tenMultiples, 10, 0, 0));
		assertTrue(Stage2.containsBetweenIndices(tenMultiples, 10, 0, 1));
	}

	@Test
	void testSumFromIndex() {
		assertEquals(0, Stage2.sumFromIndex(null, 23));
		assertEquals(0, Stage2.sumFromIndex(emptyList, 35));
		assertEquals(-7, Stage2.sumFromIndex(singleItemList, 0));
		assertEquals(0, Stage2.sumFromIndex(tenMultiples, 1));
		assertEquals((-101), Stage2.sumFromIndex(negPos, 6));
		assertEquals(0, Stage2.sumFromIndex(ascAllPos, -1));
		assertEquals(0, Stage2.sumFromIndex(descNegs, 6));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(0, Stage2.sumFromIndex(e, 0));
		assertEquals(0, Stage2.sumFromIndex(e, 4));
	}

	@Test
	void testSumUptoIndex() {
		assertEquals(0, Stage2.sumUptoIndex(null, 23));
		assertEquals(0, Stage2.sumUptoIndex(emptyList, 35));
		assertEquals(-7, Stage2.sumUptoIndex(singleItemList, 0));
		assertEquals((-80), Stage2.sumUptoIndex(tenMultiples, 2));
		assertEquals((-3), Stage2.sumUptoIndex(negPos, 0));
		assertEquals(0, Stage2.sumUptoIndex(ascAllPos, -1));
		assertEquals(0, Stage2.sumUptoIndex(descNegs, 6));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(0, Stage2.sumUptoIndex(e, 0));
		assertEquals(0, Stage2.sumUptoIndex(e, 4));
	}

	@Test
	void testSumBetweenIndices() {
		assertEquals(0, Stage2.sumBetweenIndices(null, 23, 35));
		assertEquals(0, Stage2.sumBetweenIndices(emptyList, 69, 96));
		assertEquals(-7, Stage2.sumBetweenIndices(singleItemList, 0, 0));
		assertEquals((-90), Stage2.sumBetweenIndices(tenMultiples, 1, 2));
		assertEquals(0, Stage2.sumBetweenIndices(negPos, -1, 7));
		assertEquals(0, Stage2.sumBetweenIndices(ascAllPos, -1, 7));
		assertEquals(0, Stage2.sumBetweenIndices(descNegs, 0, 6));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(0, Stage2.sumBetweenIndices(e, 0, 4));
		assertEquals(0, Stage2.sumBetweenIndices(e, 1, 3));
	}

	@Test
	void testSumEvenFromIndex() {
		assertEquals(0, Stage2.sumEvenFromIndex(null, 23));
		assertEquals(0, Stage2.sumEvenFromIndex(emptyList, 35));
		assertEquals(0, Stage2.sumEvenFromIndex(singleItemList, 0));
		assertEquals(70, Stage2.sumEvenFromIndex(tenMultiples, 2));
		assertEquals(10, Stage2.sumEvenFromIndex(negPos, 5));
		assertEquals(0, Stage2.sumEvenFromIndex(ascAllPos, -1));
		assertEquals(0, Stage2.sumEvenFromIndex(descNegs, 6));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(0, Stage2.sumEvenFromIndex(e, 0));
		assertEquals(0, Stage2.sumEvenFromIndex(e, 4));
	}

	@Test
	void testSumOddUptoIndex() {
		assertEquals(0, Stage2.sumOddUptoIndex(null, 23));
		assertEquals(0, Stage2.sumOddUptoIndex(emptyList, 35));
		assertEquals(-7, Stage2.sumOddUptoIndex(singleItemList, 0));
		assertEquals(0, Stage2.sumOddUptoIndex(tenMultiples, 3));
		assertEquals(-2, Stage2.sumOddUptoIndex(negPos, 4));
		assertEquals(0, Stage2.sumOddUptoIndex(ascAllPos, -1));
		assertEquals(0, Stage2.sumOddUptoIndex(descNegs, 6));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(0, Stage2.sumOddUptoIndex(e, 0));
		assertEquals(0, Stage2.sumOddUptoIndex(e, 4));
	}

	@Test
	void testProductPositivesUptoIndex() {
		assertEquals(1, Stage2.productPositivesUptoIndex(null, 23));
		assertEquals(1, Stage2.productPositivesUptoIndex(emptyList, 35));
		assertEquals(1, Stage2.productPositivesUptoIndex(singleItemList, 0));
		assertEquals(900, Stage2.productPositivesUptoIndex(tenMultiples, 3));
		assertEquals(240, Stage2.productPositivesUptoIndex(negPos, 4));
		assertEquals(1, Stage2.productPositivesUptoIndex(ascAllPos, -1));
		assertEquals(1, Stage2.productPositivesUptoIndex(descNegs, 6));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(1, Stage2.productPositivesUptoIndex(e, 0));
		assertEquals(1, Stage2.productPositivesUptoIndex(e, 4));
	}

	@Test
	void testProductNegativesFromIndex() {
		assertEquals(1, Stage2.productNegativesFromIndex(null, 23));
		assertEquals(1, Stage2.productNegativesFromIndex(emptyList, 35));
		assertEquals(-7, Stage2.productNegativesFromIndex(singleItemList, 0));
		assertEquals(-20, Stage2.productNegativesFromIndex(tenMultiples, 2));
		assertEquals(-101, Stage2.productNegativesFromIndex(negPos, 5));
		assertEquals(1, Stage2.productNegativesFromIndex(ascAllPos, -1));
		assertEquals(1, Stage2.productNegativesFromIndex(descNegs, 6));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertEquals(1, Stage2.productNegativesFromIndex(e, 0));
		assertEquals(1, Stage2.productNegativesFromIndex(e, 4));
	}

	@Test
	void testCountOccurrencesBetweenIndices() {
		assertEquals(0, Stage2.countOccurrencesBetweenIndices(null, 235, 23, 35));
		assertEquals(0, Stage2.countOccurrencesBetweenIndices(emptyList, 6996, 69, 96));
		assertEquals(0, Stage2.countOccurrencesBetweenIndices(singleItemList, 777, 0, 0));
		assertEquals(1, Stage2.countOccurrencesBetweenIndices(singleItemList, -7, 0, 0));
		assertEquals(0, Stage2.countOccurrencesBetweenIndices(tenMultiples, 10, 1, 2));
		assertEquals(0, Stage2.countOccurrencesBetweenIndices(negPos, 2, -1, 7));
		assertEquals(0, Stage2.countOccurrencesBetweenIndices(ascAllPos, 3, -1, 7));
		assertEquals(0, Stage2.countOccurrencesBetweenIndices(descNegs, 5, 0, 6));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(7, 7, 7, 7, 7, 7, 7));
		assertEquals(7, Stage2.countOccurrencesBetweenIndices(e, 7, 0, 6));
		assertEquals(5, Stage2.countOccurrencesBetweenIndices(e, 7, 1, 5));
		assertEquals(3, Stage2.countOccurrencesBetweenIndices(e, 7, 2, 4));
	}

	@Test
	void testCountUniqueBetweenIndices() {
		assertEquals(0, Stage2.countUniqueBetweenIndices(null, 23, 35));
		assertEquals(0, Stage2.countUniqueBetweenIndices(emptyList, 69, 96));
		assertEquals(1, Stage2.countUniqueBetweenIndices(singleItemList, 0, 0));
		assertEquals(2, Stage2.countUniqueBetweenIndices(tenMultiples, 1, 2));
		assertEquals(0, Stage2.countUniqueBetweenIndices(negPos, -1, 7));
		assertEquals(0, Stage2.countUniqueBetweenIndices(ascAllPos, -1, 7));
		assertEquals(0, Stage2.countUniqueBetweenIndices(descNegs, 0, 6));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(7, 7, 7, 7, 7, 7, 7));
		assertEquals(0, Stage2.countUniqueBetweenIndices(e, 0, 6));
		assertEquals(0, Stage2.countUniqueBetweenIndices(e, 1, 5));
		assertEquals(0, Stage2.countUniqueBetweenIndices(e, 2, 4));
	}

	@Test
	void testAllPositives() {
		assertFalse(Stage2.allPositives(null));
		assertTrue(Stage2.allPositives(emptyList));
		assertFalse(Stage2.allPositives(singleItemList));
		assertFalse(Stage2.allPositives(tenMultiples));
		assertFalse(Stage2.allPositives(negPos));
		assertTrue(Stage2.allPositives(ascAllPos));
		assertFalse(Stage2.allPositives(descNegs));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertFalse(Stage2.allPositives(e));
	}

	@Test
	void testAllNegatives() {
		assertFalse(Stage2.allNegatives(null));
		assertTrue(Stage2.allNegatives(emptyList));
		assertTrue(Stage2.allNegatives(singleItemList));
		assertFalse(Stage2.allNegatives(tenMultiples));
		assertFalse(Stage2.allNegatives(negPos));
		assertFalse(Stage2.allNegatives(ascAllPos));
		assertTrue(Stage2.allNegatives(descNegs));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		assertFalse(Stage2.allNegatives(e));
	}

	@Test
	void testAllZeroes() {
		assertFalse(Stage2.allZeroes(null));
		assertTrue(Stage2.allZeroes(emptyList));
		assertFalse(Stage2.allZeroes(singleItemList));
		assertFalse(Stage2.allZeroes(tenMultiples));
		assertFalse(Stage2.allZeroes(negPos));
		assertFalse(Stage2.allZeroes(ascAllPos));
		assertFalse(Stage2.allZeroes(descNegs));
		assertTrue(Stage2.allZeroes(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0))));
	}

	@Test
	void testAllNonZeroes() {
		assertFalse(Stage2.allNonZeroes(null));
		assertTrue(Stage2.allNonZeroes(emptyList));
		assertTrue(Stage2.allNonZeroes(singleItemList));
		assertTrue(Stage2.allNonZeroes(tenMultiples));
		assertTrue(Stage2.allNonZeroes(negPos));
		assertTrue(Stage2.allNonZeroes(ascAllPos));
		assertTrue(Stage2.allNonZeroes(descNegs));
		assertFalse(Stage2.allNonZeroes(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0))));
	}

	@Test
	void testContainsPositive() {
		assertFalse(Stage2.containsPositive(null));
		assertFalse(Stage2.containsPositive(emptyList));
		assertFalse(Stage2.containsPositive(singleItemList));
		assertTrue(Stage2.containsPositive(tenMultiples));
		assertTrue(Stage2.containsPositive(negPos));
		assertTrue(Stage2.containsPositive(ascAllPos));
		assertFalse(Stage2.containsPositive(descNegs));
		assertFalse(Stage2.containsPositive(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0))));
	}

	@Test
	void testContainsNegative() {
		assertFalse(Stage2.containsNegative(null));
		assertFalse(Stage2.containsNegative(emptyList));
		assertTrue(Stage2.containsNegative(singleItemList));
		assertTrue(Stage2.containsNegative(tenMultiples));
		assertTrue(Stage2.containsNegative(negPos));
		assertFalse(Stage2.containsNegative(ascAllPos));
		assertTrue(Stage2.containsNegative(descNegs));
		assertFalse(Stage2.containsNegative(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0))));
	}

	@Test
	void testContainsZero() {
		assertFalse(Stage2.containsZero(null));
		assertFalse(Stage2.containsZero(emptyList));
		assertFalse(Stage2.containsZero(singleItemList));
		singleItemList.set(0, 0);
		assertTrue(Stage2.containsZero(singleItemList));
		assertFalse(Stage2.containsZero(tenMultiples));
		assertFalse(Stage2.containsZero(negPos));
		assertFalse(Stage2.containsZero(ascAllPos));
		assertFalse(Stage2.containsZero(descNegs));
		assertTrue(Stage2.containsZero(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0))));
	}

	@Test
	void testContainsNonZero() {
		assertFalse(Stage2.containsNonZero(null));
		assertFalse(Stage2.containsNonZero(emptyList));
		assertTrue(Stage2.containsNonZero(singleItemList));
		singleItemList.set(0, 0);
		assertFalse(Stage2.containsNonZero(singleItemList));
		assertTrue(Stage2.containsNonZero(tenMultiples));
		assertTrue(Stage2.containsNonZero(negPos));
		assertTrue(Stage2.containsNonZero(ascAllPos));
		assertTrue(Stage2.containsNonZero(descNegs));
		assertFalse(Stage2.containsNonZero(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0))));
	}

	@Test
	void testIsAscending() {
		assertFalse(Stage2.isAscending(null));
		assertTrue(Stage2.isAscending(emptyList));
		assertTrue(Stage2.isAscending(singleItemList));
		assertFalse(Stage2.isAscending(tenMultiples));
		assertFalse(Stage2.isAscending(negPos));
		assertTrue(Stage2.isAscending(ascAllPos));
		assertFalse(Stage2.isAscending(descNegs));
		assertTrue(Stage2.isAscending(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0))));
	}

	@Test
	void testIsDescending() {
		assertFalse(Stage2.isDescending(null));
		assertTrue(Stage2.isDescending(emptyList));
		assertTrue(Stage2.isDescending(singleItemList));
		assertFalse(Stage2.isDescending(tenMultiples));
		assertFalse(Stage2.isDescending(negPos));
		assertFalse(Stage2.isDescending(ascAllPos));
		assertTrue(Stage2.isDescending(descNegs));
		assertTrue(Stage2.isDescending(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0))));
	}

	@Test
	void testIsUnchanged() {
		assertFalse(Stage2.isUnchanged(null));
		assertTrue(Stage2.isUnchanged(emptyList));
		assertTrue(Stage2.isUnchanged(singleItemList));
		assertFalse(Stage2.isUnchanged(tenMultiples));
		assertFalse(Stage2.isUnchanged(negPos));
		assertFalse(Stage2.isUnchanged(ascAllPos));
		assertFalse(Stage2.isUnchanged(descNegs));
		assertTrue(Stage2.isUnchanged(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0))));
	}

	@Test
	void testgetSortedOrder() {
		assertEquals(0, Stage2.getSortedOrder(null));
		assertEquals(2, Stage2.getSortedOrder(emptyList));
		assertEquals(2, Stage2.getSortedOrder(singleItemList));
		assertEquals(0, Stage2.getSortedOrder(tenMultiples));
		assertEquals(0, Stage2.getSortedOrder(negPos));
		assertEquals(1, Stage2.getSortedOrder(ascAllPos));
		assertEquals(-1, Stage2.getSortedOrder(descNegs));
		assertEquals(2, Stage2.getSortedOrder(new ArrayList<Integer>(Arrays.asList(10, 10, 10, 10, 10))));
	}

	@Test
	void testIsBalanced() {
		assertFalse(Stage2.isBalanced(null));
		assertTrue(Stage2.isBalanced(emptyList));
		assertFalse(Stage2.isBalanced(singleItemList));
		assertTrue(Stage2.isBalanced(tenMultiples));
		assertFalse(Stage2.isBalanced(negPos));
		assertFalse(Stage2.isBalanced(ascAllPos));
		assertFalse(Stage2.isBalanced(descNegs));
		assertTrue(Stage2.isBalanced(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0))));
	}

	@Test
	void testAllDigits() {
		assertFalse(Stage2.allDigits(null));
		assertTrue(Stage2.allDigits(new ArrayList<Character>()));
		assertTrue(Stage2.allDigits(new ArrayList<Character>(Arrays.asList('7'))));
		assertTrue(Stage2.allDigits(new ArrayList<Character>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'))));
		assertFalse(Stage2.allDigits(new ArrayList<Character>(Arrays.asList('C', 'O', 'M', 'P', '1', '2', '5'))));
		assertFalse(Stage2.allDigits(new ArrayList<Character>(Arrays.asList('H', 'D'))));
	}

	@Test
	void testContainsDigit() {
		assertFalse(Stage2.containsDigit(null));
		assertFalse(Stage2.containsDigit(new ArrayList<Character>()));
		assertTrue(Stage2.containsDigit(new ArrayList<Character>(Arrays.asList('7'))));
		assertTrue(Stage2.containsDigit(new ArrayList<Character>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'))));
		assertTrue(Stage2.containsDigit(new ArrayList<Character>(Arrays.asList('C', 'O', 'M', 'P', '1', '2', '5'))));
		assertFalse(Stage2.containsDigit(new ArrayList<Character>(Arrays.asList('H', 'D'))));
	}

	@Test
	void testToString() {
		assertNull(Stage2.toString(null));
		assertEquals("", Stage2.toString(new ArrayList<Character>()));
		assertEquals("COMP125", Stage2.toString(new ArrayList<Character>(Arrays.asList('C', 'O', 'M', 'P', '1', '2', '5'))));
		assertEquals("Hello world!", Stage2.toString(new ArrayList<Character>(Arrays.asList('H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'))));
	}

	@Test
	void testGetCopy() {
		assertNull(Stage2.getCopy(null));
		assertNotNull(Stage2.getCopy(emptyList));
		assertEquals("[]", Stage2.getCopy(emptyList).toString());
		assertNotSame(emptyList, Stage2.getCopy(emptyList));
		assertNotNull(Stage2.getCopy(singleItemList));
		assertNotSame(singleItemList, Stage2.getCopy(singleItemList));
		assertEquals(0, Stage2.getCopy(emptyList).size());
		assertEquals("[-7]", Stage2.getCopy(singleItemList).toString());
		assertNotNull(Stage2.getCopy(negPos));
		assertNotSame(negPos, Stage2.getCopy(negPos));
		assertEquals("[-3, 15, -13, 16, -1, 10, -101]", Stage2.getCopy(negPos).toString());		
	}

}
