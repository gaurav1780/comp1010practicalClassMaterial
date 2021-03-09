package practicePackage.customBuiltLists.customLinkedList.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.customBuiltLists.customLinkedList.attempts.*;

class MyLinkedListTest {
	public MyLinkedList emptyList, singleItemList, list1, list2;

	@BeforeEach
	public void run() {
		emptyList = new MyLinkedList();

		singleItemList = new MyLinkedList();
		singleItemList.addAtFront(10); 

		list1 = new MyLinkedList();
		list1.addAtFront(7); 
		list1.addAtFront(-15); 
		list1.addAtFront(3); 
		list1.addAtFront(0); 
		list1.addAtFront(12); 
		//12 -> 0 -> 3 -> -15 -> 7

		list2 = new MyLinkedList();
		list2.addAtFront(12); 
		list2.addAtFront(5); 
		list2.addAtFront(18); 
		list2.addAtFront(6); 
		list2.addAtFront(0);
		list2.addAtFront(0);
		list2.addAtFront(0);
		list2.addAtFront(0);
		list2.addAtFront(-8);
		//-8 -> 0 -> 0 -> 0 -> 0 -> 6 -> 18 -> 5 -> 12
	}

	void ensureNoModify() {
		assertEquals("[]", emptyList.toString());
		assertEquals("[10]", singleItemList.toString());
		assertEquals("[12, 0, 3, -15, 7]", list1.toString());
		assertEquals("[-8, 0, 0, 0, 0, 6, 18, 5, 12]", list2.toString());
	}

	@Test
	void testIsEmpty() {
		assertTrue(emptyList.isEmpty());
		assertFalse(singleItemList.isEmpty());
		assertFalse(list1.isEmpty());
		assertFalse(list2.isEmpty());

		ensureNoModify();
	}

	//	@Test
	//	void testAddAtFront() {
	//		emptyList.addAtFront(50);
	//		assertEquals("[50]",emptyList.toString());
	//		emptyList.addAtFront(-5);
	//		assertEquals("[-5, 50]",emptyList.toString());
	//		list1.addAtFront(50);
	//		assertEquals("[50, 12, 0, 3, -15, 7]",list1.toString());
	//	}

	@Test
	void testToString() {
		ensureNoModify();
	}

	@Test
	void testItemExistsAt() {
		assertFalse(emptyList.itemExistsAt(0));
		assertFalse(list1.itemExistsAt(-2));
		assertFalse(list1.itemExistsAt(5));
		assertTrue(singleItemList.itemExistsAt(0));
		assertTrue(list1.itemExistsAt(4));
		assertTrue(list2.itemExistsAt(4));

		ensureNoModify();
	}

	@Test
	void testCanInsertItemAt() {
		assertFalse(emptyList.canInsertItemAt(1));
		assertFalse(singleItemList.canInsertItemAt(2));
		assertFalse(list1.canInsertItemAt(-2));
		assertFalse(list1.canInsertItemAt(6));
		assertTrue(emptyList.canInsertItemAt(0));
		assertTrue(list1.canInsertItemAt(5));
		assertTrue(list2.canInsertItemAt(4));

		ensureNoModify();
	}

	@Test
	void testSize() {
		assertEquals(0, emptyList.size());
		assertEquals(1, singleItemList.size());
		assertEquals(5, list1.size());
		assertEquals(9, list2.size());

		ensureNoModify();
	}

	@Test
	void testTotal() {
		assertEquals(0, emptyList.total());
		assertEquals(10, singleItemList.total());
		assertEquals(7, list1.total());
		assertEquals(33, list2.total());

		ensureNoModify();
	}

	@Test
	void testTotalPositives() {
		assertEquals(0, emptyList.totalPositives());
		assertEquals(10, singleItemList.totalPositives());
		assertEquals(22, list1.totalPositives());
		assertEquals(41, list2.totalPositives());

		ensureNoModify();
	}

	@Test
	void testCountPositives() {
		assertEquals(0, emptyList.countPositives());
		assertEquals(1, singleItemList.countPositives());
		assertEquals(3, list1.countPositives());
		assertEquals(4, list2.countPositives());

		ensureNoModify();
	}

	@Test
	void testCountOccurrences() {
		assertEquals(0, emptyList.countOccurrences(10));
		assertEquals(0, singleItemList.countOccurrences(5));
		assertEquals(1, singleItemList.countOccurrences(10));
		assertEquals(1, list2.countOccurrences(-8));
		assertEquals(1, list2.countOccurrences(12));
		assertEquals(4, list2.countOccurrences(0));

		ensureNoModify();
	}

	@Test
	void testAllPositives() {
		assertTrue(emptyList.allPositives());
		assertTrue(singleItemList.allPositives());
		assertFalse(list1.allPositives());
		assertFalse(list2.allPositives());

		ensureNoModify();

		emptyList.addAtFront(-3); //emptyList is now [-3]
		assertFalse(emptyList.allPositives());
		singleItemList.addAtFront(12); //singleItemList is now [12, 10]
		assertTrue(singleItemList.allPositives());
	}

	@Test
	void testAllEven() {
		assertTrue(emptyList.allEven());
		assertTrue(singleItemList.allEven());
		assertFalse(list1.allEven());
		assertFalse(list2.allEven());

		ensureNoModify();

		emptyList.addAtFront(-3); //emptyList is now [-3]
		assertFalse(emptyList.allEven());
		singleItemList.addAtFront(12); //singleItemList is now [12, 10]
		assertTrue(singleItemList.allEven());
	}

	@Test
	void testAllInRange() {
		assertFalse(singleItemList.allInRange(8, 9));
		assertFalse(list1.allInRange(-14, 11));
		assertFalse(list2.allInRange(0, 18));
		assertFalse(list2.allInRange(-8, 17));
		assertTrue(emptyList.allInRange(0, 10));
		assertTrue(singleItemList.allInRange(10, 10));
		assertTrue(list1.allInRange(-15, 12));
		assertTrue(list1.allInRange(-30, 15));

		ensureNoModify();
	}

	@Test
	void testContainsInRange() {
		assertFalse(emptyList.containsInRange(0, 10));
		assertFalse(singleItemList.containsInRange(8, 9));
		assertFalse(list1.containsInRange(13, 20));
		assertFalse(list2.containsInRange(-18, -9));
		assertTrue(singleItemList.containsInRange(10, 10));
		assertTrue(list1.containsInRange(0, 5));
		assertTrue(list2.containsInRange(18, 50));
		assertTrue(list2.containsInRange(-8, -8));

		ensureNoModify();
	}

	@Test
	void testContainsPrime() {
		assertFalse(emptyList.containsPrime());
		assertFalse(singleItemList.containsPrime());

		assertTrue(list1.containsPrime());
		assertTrue(list2.containsPrime());

		ensureNoModify();

		emptyList.addAtFront(3); //emptyList is now [3]
		assertTrue(emptyList.containsPrime());
		singleItemList.addAtFront(8); //singleItemList is now [8, 10]
		assertFalse(singleItemList.containsPrime());
	}

	@Test
	void testHighest() {
		assertNull(emptyList.highest());
		assertEquals((Integer)10, singleItemList.highest());
		assertEquals((Integer)12, list1.highest());
		assertEquals((Integer)18, list2.highest());

		ensureNoModify();
	}

	@Test
	void testIsAscending() {
		assertTrue(emptyList.isAscending());
		assertTrue(singleItemList.isAscending());
		assertFalse(list1.isAscending());
		assertFalse(list2.isAscending());

		ensureNoModify();

		singleItemList.addAtFront(5); 
		singleItemList.addAtFront(2); //singleItemList is now [2, 5, 10]
		assertTrue(singleItemList.isAscending());
	}

	@Test
	void testGet() {
		assertNull(emptyList.get(0));
		assertNull(singleItemList.get(1));
		assertNull(list1.get(-1));
		assertEquals((Integer)10, singleItemList.get(0));
		assertEquals((Integer)7, list1.get(4));
		assertEquals((Integer)6, list2.get(5));
		assertEquals((Integer)0, list2.get(1));

		ensureNoModify();
	}

	@Test
	void testAdd() {
		assertFalse(emptyList.add(1, 5));
		assertFalse(singleItemList.add(-2, 50));
		assertFalse(list2.add(10, 0));

		assertTrue(emptyList.add(0, 5));
		assertEquals("[5]",emptyList.toString());
		assertTrue(singleItemList.add(1, 50));
		assertTrue(singleItemList.add(0, -7));
		assertEquals("[-7, 10, 50]",singleItemList.toString());
		assertTrue(list1.add(3, 20));
		assertEquals("[12, 0, 3, 20, -15, 7]",list1.toString());
		assertTrue(list2.add(9, 0));
		assertEquals("[-8, 0, 0, 0, 0, 6, 18, 5, 12, 0]", list2.toString());
	}

	@Test
	void testRemove() {
		assertNull(emptyList.remove(0));
		assertNull(singleItemList.remove(1));
		assertNull(list1.remove(-2));
		assertEquals((Integer)10, singleItemList.remove(0));
		assertEquals("[]", singleItemList.toString());
		assertEquals((Integer)7, list1.remove(4));
		assertEquals("[12, 0, 3, -15]",list1.toString());
		assertEquals((Integer)0, list2.remove(4));
		assertEquals((Integer)6, list2.remove(4));
		assertEquals("[-8, 0, 0, 0, 18, 5, 12]", list2.toString());	
	}

	@Test
	void testIdentical() {
		MyLinkedList emptyList2 = new MyLinkedList();
		MyLinkedList list3 = new MyLinkedList();
		MyLinkedList list4 = new MyLinkedList();

		list3.addAtFront(7); 
		list3.addAtFront(-15); 
		list3.addAtFront(3); 
		list3.addAtFront(0); 
		list3.addAtFront(12);
		//12 -> 0 -> 3 -> -15 -> 7

		list4.addAtFront(7); 
		list4.addAtFront(-15); 
		list4.addAtFront(3); 
		list4.addAtFront(12); 
		list4.addAtFront(0);
		//0 -> 12 -> 3 -> -15 -> 7

		assertTrue(emptyList.identical(emptyList2));
		assertFalse(emptyList.identical(singleItemList));
		assertFalse(list1.identical(list2));

		ensureNoModify();

		emptyList.addAtFront(10); //emptyList is now [10]
		assertTrue(emptyList.identical(singleItemList));

		emptyList.addAtFront(50); //emptyList is now [50, 10]
		singleItemList.add(1, 50); //singleItemList is now [10, 50]
		assertFalse(emptyList.identical(singleItemList));

		assertTrue(list1.identical(list3));
		assertFalse(list1.identical(list4));
	}

	@Test
	void testJoin() {
		MyLinkedList emptyList2 = new MyLinkedList();

		assertNotNull(emptyList.join(emptyList2));
		assertEquals("[]", emptyList.join(emptyList2).toString());
		assertNotNull(emptyList.join(singleItemList));
		assertEquals("[10]", emptyList.join(singleItemList).toString());
		assertNotNull(list1.join(list2));
		assertEquals("[12, 0, 3, -15, 7, -8, 0, 0, 0, 0, 6, 18, 5, 12]", list1.join(list2).toString());
		assertNotNull(list2.join(list1));
		assertEquals("[-8, 0, 0, 0, 0, 6, 18, 5, 12, 12, 0, 3, -15, 7]", list2.join(list1).toString());

		ensureNoModify();
	}

	@Test
	void testSubList() {
		assertNull(emptyList.subList(0, 0));
		assertNull(singleItemList.subList(0, 1));
		assertNull(list1.subList(-5, 3));
		assertNull(list2.subList(0, 9));
		assertNull(list2.subList(10, 12));
		assertNotNull(singleItemList.subList(0, 0));
		assertEquals("[10]", singleItemList.subList(0, 0).toString());
		assertNotNull(list1.subList(2, 4));
		assertEquals("[3, -15, 7]", list1.subList(2, 4).toString());
		assertNotNull(list2.subList(0, 6));
		assertEquals("[-8, 0, 0, 0, 0, 6, 18]", list2.subList(0, 6).toString());
		assertNotNull(list2.subList(3, 7));
		assertEquals("[0, 0, 6, 18, 5]", list2.subList(3, 7).toString());

		ensureNoModify();
	}

	@Test
	void testSame() {
		MyLinkedList emptyList2 = new MyLinkedList();
		MyLinkedList list3 = new MyLinkedList();
		MyLinkedList list4 = new MyLinkedList();

		list3.addAtFront(-15); 
		list3.addAtFront(7); 
		list3.addAtFront(12); 
		list3.addAtFront(0); 
		list3.addAtFront(3);
		//list3 = -15 -> 7 -> 12 -> 0 -> 3

		list4.addAtFront(3); 
		list4.addAtFront(12); 
		list4.addAtFront(7); 
		list4.addAtFront(-15); 
		list4.addAtFront(0);
		//0 -> -15 -> 7 -> 12 -> 3

		assertTrue(emptyList.same(emptyList2));
		assertFalse(emptyList.same(singleItemList));
		assertFalse(list1.same(list2));

		ensureNoModify();

		emptyList.addAtFront(10); //emptyList is now [10]
		assertTrue(emptyList.same(singleItemList));
		
		assertTrue(list1.same(list3));
		//list1 = 12 -> 0 -> 3 -> -15 -> 7
		//list3 = -15 -> 7 -> 12 -> 0 -> 3

		assertTrue(list1.same(list4));

		list4.addAtFront(2); //list4 is now [2, 0, -15, 7, 12, 3]
		assertFalse(list1.same(list4));

		list3.remove(0);
		list3.addAtFront(8); //list3 is now [8, 0, 3, -15, 7]
		assertFalse(list1.same(list3));
	}

	@Test
	void testSort() {
		emptyList.sort(true);
		assertEquals("[]",emptyList.toString());
		singleItemList.sort(false);
		assertEquals("[10]", singleItemList.toString());
		list1.sort(true);
		assertEquals("[-15, 0, 3, 7, 12]",list1.toString());
		list2.sort(false);
		assertEquals("[18, 12, 6, 5, 0, 0, 0, 0, -8]", list2.toString());
	}

}
