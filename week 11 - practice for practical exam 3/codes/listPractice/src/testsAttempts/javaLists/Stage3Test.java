package testsAttempts.javaLists;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import attempts.javaLists.*;

class Stage3Test {
	private ArrayList<Integer> nullList, emptyList, singleItemList, list1, list2;

	@BeforeEach
	public void run() {
		nullList = null;
		emptyList = new ArrayList<Integer>();
		singleItemList = new ArrayList<Integer>(Arrays.asList(-7));
		list1 = new ArrayList<Integer>(Arrays.asList(10,70,20,90));
		list2 = new ArrayList<Integer>(Arrays.asList(-5, 0, 8, -7, 9, 15, 23, -1, 5));
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
		assertNotNull(Stage3.getPositives(list2).toString());
		assertEquals("[8, 9, 15, 23, 5]", Stage3.getPositives(list2).toString());
		assertNotNull(Stage3.getPositives(singleItemList).toString());
		assertEquals("[]", Stage3.getPositives(singleItemList).toString());
		assertNotNull(Stage3.getPositives(emptyList).toString());
		assertEquals("[]", Stage3.getPositives(emptyList).toString());
		assertNull(Stage3.getPositives(nullList));
	}

	@Test
	void testRemoveNegatives() {
		Stage3.removeNegatives(list2);
		assertEquals("[0, 8, 9, 15, 23, 5]", list2.toString());
		Stage3.removeNegatives(singleItemList);
		assertEquals("[]", singleItemList.toString());
	}

	@Test
	void testTwoInARow() {
		assertFalse(Stage3.twoInARow(list1, 5));
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

}
