package practicePackage.builtInLists.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ServiceClasses.Rectangle;
import practicePackage.builtInLists.attempts.*;

class Stage1Test {
	public ArrayList<Integer> nullList, emptyList, singleItemList, list1, list2;

	@BeforeEach
	public void run() {
		nullList = null;
		emptyList = new ArrayList<Integer>();
		singleItemList = new ArrayList<Integer>(Arrays.asList(-7));
		list1 = new ArrayList<Integer>(Arrays.asList(10,70,20,90));
		list2 = new ArrayList<Integer>(Arrays.asList(-5, 0, 8, -7, 9, 15, 23, -1, 5));
	}

	@Test
	void testGetLastItem() {
		assertEquals(null, Stage1.getLastItem(nullList));
		assertEquals(null, Stage1.getLastItem(emptyList));
		assertEquals((Integer)(-7), Stage1.getLastItem(singleItemList));
		assertEquals((Integer)(90), Stage1.getLastItem(list1));
		assertEquals((Integer)(5), Stage1.getLastItem(list2));
	}

	@Test
	void testGetSumFirstLastItems() {
		assertEquals(null, Stage1.getSumFirstLastItems(nullList));
		assertEquals(null, Stage1.getSumFirstLastItems(emptyList));
		assertEquals((Integer)(-7), Stage1.getSumFirstLastItems(singleItemList));
		assertEquals((Integer)(100), Stage1.getSumFirstLastItems(list1));
		assertEquals((Integer)(0), Stage1.getSumFirstLastItems(list2));
	}

	@Test
	void testContainsEvenNumberOfItems() {
		assertFalse(Stage1.containsEvenNumberOfItems(nullList));
		assertTrue(Stage1.containsEvenNumberOfItems(emptyList));
		assertFalse(Stage1.containsEvenNumberOfItems(singleItemList));
		assertTrue(Stage1.containsEvenNumberOfItems(list1));
		assertFalse(Stage1.containsEvenNumberOfItems(list2));
	}

	@Test
	void testSameSize() {
		ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		assertTrue(Stage1.sameSize(list1, list3));
		list3.add(10); //list3 now contains 5 items
		assertFalse(Stage1.sameSize(list1, list3));
		list3.remove(0); //list3 now contains 4 items
		assertTrue(Stage1.sameSize(list1, list3));
		list3.remove(0); //list3 now contains 3 items
		assertFalse(Stage1.sameSize(list1, list3));
	}

	@Test
	void testMedian() {
		assertEquals(null, Stage1.median(nullList));
		assertEquals(null, Stage1.median(emptyList));
		assertEquals((Integer)(-7), Stage1.median(singleItemList));
		assertEquals((Integer)(70), Stage1.median(list1));
		assertEquals((Integer)(9), Stage1.median(list2));
	}

	@Test
	void testGetFirstItem() {
		ArrayList<Rectangle> list = null;
		assertNull(Stage1.getFirstItem(list));
		list = new ArrayList<Rectangle>();
		assertNull(Stage1.getFirstItem(list));
		list.add(new Rectangle(10));
		assertNotNull(Stage1.getFirstItem(list));
		assertEquals("10 by 10", Stage1.getFirstItem(list).toString());
		list.add(0, new Rectangle(20, 50));
		assertNotNull(Stage1.getFirstItem(list));
		assertEquals("20 by 50", Stage1.getFirstItem(list).toString());
	}

}
