package javaLists;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Stage2Test {
	private ArrayList<Integer> nullList, emptyList, singleItemList, list1, list2;
	private ArrayList<Rectangle> rList;

	@BeforeEach
	public void run() {
		nullList = null;
		emptyList = new ArrayList<Integer>();
		singleItemList = new ArrayList<Integer>(Arrays.asList(-7));
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
	void testSum() {
		assertEquals(0, Stage2.sum(nullList));
		assertEquals(0, Stage2.sum(emptyList));
		assertEquals(-7, Stage2.sum(singleItemList));
		assertEquals(190, Stage2.sum(list1));
		assertEquals(47, Stage2.sum(list2));
	}

	@Test
	void testSumNegatives() {
		assertEquals(0, Stage2.sumNegatives(nullList));
		assertEquals(0, Stage2.sumNegatives(emptyList));
		assertEquals(-7, Stage2.sumNegatives(singleItemList));
		assertEquals(0, Stage2.sumNegatives(list1));
		assertEquals(-13, Stage2.sumNegatives(list2));
	}

	@Test
	void testCountEven() {
		assertEquals(0, Stage2.countEven(nullList));
		assertEquals(0, Stage2.countEven(emptyList));
		assertEquals(0, Stage2.countEven(singleItemList));
		assertEquals(4, Stage2.countEven(list1));
		assertEquals(2, Stage2.countEven(list2));
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
	void testCountInRange() {
		assertEquals(0, Stage2.countInRange(nullList,0,5));
		assertEquals(0, Stage2.countInRange(emptyList,0,5));
		assertEquals(0, Stage2.countInRange(singleItemList,-6,6));
		assertEquals(1, Stage2.countInRange(singleItemList,-7,6));
		assertEquals(0, Stage2.countInRange(singleItemList,-10,-8));
		assertEquals(1, Stage2.countInRange(singleItemList,-10,-7));
		assertEquals(4, Stage2.countInRange(list1,10,90));
		assertEquals(3, Stage2.countInRange(list1,20,90));
		assertEquals(3, Stage2.countInRange(list1,10,75));
		assertEquals(list2.size(), Stage2.countInRange(list2,-10000, 10000));
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
	void testSquareUp() {
		Stage2.squareUp(nullList); //should not raise NullPointerException
		Stage2.squareUp(emptyList);
		assertEquals("[]", emptyList.toString());
		Stage2.squareUp(singleItemList);
		assertEquals("[49]", singleItemList.toString());
		Stage2.squareUp(list1);
		assertEquals("[100, 4900, 400, 8100]", list1.toString());
	}

}
