package practicePackage.customBuiltLists.customArrayList.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.customBuiltLists.customArrayList.attempts.*;

class CustomArrayListTest {
	public CustomArrayList emptyList, list1, list2, list3;

	@BeforeEach
	public void run() {
		emptyList = new CustomArrayList();
		list1 = new CustomArrayList();
		list1.add(10);
		list1.add(70);
		list1.add(20);
		list1.add(90);
		//list1 = [10, 70, 20, 90]

		list2 = new CustomArrayList();
		list2.add(-5);
		list2.add(5);
		list2.add(2);
		list2.add(1);
		list2.add(-55);
		list2.add(-5);
		list2.add(0);
		list2.add(0);
		list2.add(8);
		list2.add(0);
		//list2 = [-5, 5, 2, 1, -55, -5, 0, 0, 8, 0]

		list3 = new CustomArrayList();
		list3.add(-6);
		//list3 = [-6]
	}

	@Test
	void testIsEmpty() {
		assertTrue(emptyList.isEmpty());
		assertFalse(list1.isEmpty());
		assertFalse(list2.isEmpty());
		assertFalse(list3.isEmpty());
	}

	@Test
	void testToString() {
		assertEquals("[]",emptyList.toString());
		assertEquals("[10, 70, 20, 90]",list1.toString());
		assertEquals("[-5, 5, 2, 1, -55, -5, 0, 0, 8, 0]",list2.toString());
		assertEquals("[-6]",list3.toString());

	}

	@Test
	void testGrow() {
		assertEquals(4, list1.currentSize());
		assertEquals(10, list1.currentCapacity());
		assertFalse(list1.isFull());

		list1.grow();
		assertEquals("[10, 70, 20, 90]", list1.toString()); //ensure values are correct after grow() executes
		assertEquals(4, list1.currentSize());
		assertEquals(15, list1.currentCapacity());
		assertFalse(list1.isFull());

		list1.grow();
		assertEquals("[10, 70, 20, 90]", list1.toString()); //ensure values are correct after grow() executes

		assertEquals(4, list1.currentSize());
		assertEquals(20, list1.currentCapacity());
		assertFalse(list1.isFull());
	}

	@Test
	void testGrowInt() {
		assertEquals(4, list1.currentSize());
		assertEquals(10, list1.currentCapacity());
		assertFalse(list1.isFull());

		list1.grow(3);
		assertEquals("[10, 70, 20, 90]", list1.toString()); //ensure values are correct after grow() executes

		assertEquals(4, list1.currentSize());
		assertEquals(13, list1.currentCapacity());
		assertFalse(list1.isFull());

		list1.grow(0);
		assertEquals("[10, 70, 20, 90]", list1.toString()); //ensure values are correct after grow() executes

		assertEquals(4, list1.currentSize());
		assertEquals(13, list1.currentCapacity());
		assertFalse(list1.isFull());

		list1.grow(20);
		assertEquals("[10, 70, 20, 90]", list1.toString()); //ensure values are correct after grow() executes

		assertEquals(4, list1.currentSize());
		assertEquals(33, list1.currentCapacity());
		assertFalse(list1.isFull());

		list1.grow(-5);

		assertEquals(4, list1.currentSize());
		assertEquals(33, list1.currentCapacity());
		assertFalse(list1.isFull());
	}

	@Test
	void testAddInt() {
		list1.add(3);
		assertEquals("[10, 70, 20, 90, 3]",list1.toString());
		list1.add(-10);
		assertEquals("[10, 70, 20, 90, 3, -10]",list1.toString());
		emptyList.add(1);
		assertEquals("[1]",emptyList.toString());
		emptyList.add(-6);
		assertEquals("[1, -6]",emptyList.toString());		
	}

	@Test
	void testGet() {
		assertNull(list1.get(60));
		assertNull(list2.get(-12));
		assertEquals((Integer)10,list1.get(0));
		assertEquals((Integer)0,list2.get(7));
		assertNull(emptyList.get(0));
		assertNull(emptyList.get(4));	
		assertEquals((Integer)(-6),list3.get(0));
	}

	@Test
	void testSet() {
		assertNull(list1.set(60,4));
		assertNull(list2.set(-12,-5));
		assertEquals((Integer)10,list1.set(0,-11));
		assertEquals((Integer)(-11),list1.get(0));
		list3.set(0,44);
		assertEquals((Integer)44,list3.get(0));
		list1.set(3, 1678);
		assertEquals((Integer)1678,list1.get(3));
		assertNull(list3.set(1, 12));
		assertEquals((Integer)(-55),list2.set(4, -1));
		assertEquals((Integer)(-1),list2.get(4));
	}

	@Test
	void testReplace() {
		assertEquals(-1,list1.replace(-67, 2));
		assertEquals(-1,list3.replace(2, -132));
		assertEquals(0,list1.replace(10,33));
		assertEquals((Integer)33,list1.get(0));
		assertEquals(4,list2.replace(-55, 169234));
		assertEquals(0,list2.replace(-5, 2222));
		assertEquals((Integer)(-5),list2.get(5));
		assertEquals((Integer)2222,list2.get(0));		
	}
	
	@Test
	void testReplaceAll() {
		CustomArrayList result = list1.replaceAll(3,  12);
		assertNotNull(result);
		assertEquals("[]",result.toString()); //3 was not found
		
		result = list1.replaceAll(10, 70);
		assertNotNull(result);
		assertEquals("[0]",result.toString()); //10 was found at index 0
		//list1 should now be [70, 70, 20, 90]
		assertEquals("[70, 70, 20, 90]",list1.toString());
		
		result = list1.replaceAll(20, 70);
		assertNotNull(result);
		assertEquals("[2]",result.toString()); //20 was found at index 2
		//list1 should now be [70, 70, 70, 90]
		assertEquals("[70, 70, 70, 90]",list1.toString());
		
		result = list1.replaceAll(90, 70);
		assertNotNull(result);
		assertEquals("[3]",result.toString()); //90 was found at index 3
		//list1 should now be [70, 70, 70, 70]
		assertEquals("[70, 70, 70, 70]",list1.toString());
		
		result = list1.replaceAll(70, 0);
		assertNotNull(result);
		assertEquals("[0, 1, 2, 3]",result.toString()); //70 was found at indices 0, 1, 2, 3
		//list1 should now be [0, 0, 0, 0]
		assertEquals("[0, 0, 0, 0]",list1.toString());
		
		assertEquals("[0, 5]", list2.replaceAll(-5, -55).toString());
		assertEquals("[0, 4, 5]", list2.replaceAll(-55, 6789).toString());
		assertEquals("[]",list3.replaceAll(56, 3).toString());
		assertEquals("[0]",list3.replaceAll(-6, -1).toString());
	}
	
	@Test
	void testIsFull() {
		assertFalse(list1.isFull());
		assertTrue(list2.isFull());
		list2.grow(1);
		assertFalse(list2.isFull());
		assertFalse(emptyList.isFull());
		emptyList.add(4);
		assertFalse(emptyList.isFull());
		emptyList.grow();
		assertFalse(emptyList.isFull());
		list1.add(0);
		list1.add(0);
		list1.add(0);
		list1.add(0);
		list1.add(0);
		list1.add(0);
		assertTrue(list1.isFull());
	}

	@Test
	void testAddIntDouble() {
		assertFalse(list1.add(-1,6));
		assertFalse(list2.add(12,43));
		assertTrue(list1.add(0,3));
		assertEquals((Integer)3,list1.get(0));
		assertEquals("[3, 10, 70, 20, 90]",list1.toString());
		assertFalse(list3.add(67,4));
		assertTrue(list3.add(1,4));
		assertEquals("[-6, 4]",list3.toString());
		assertFalse(emptyList.add(1,-2));
		assertFalse(emptyList.add(-3,12));
		assertTrue(emptyList.add(0,9));
		assertEquals("[9]",emptyList.toString());
	}

	@Test
	void testRemove() {
		assertNull(list1.remove(8));
		assertNull(list2.remove(-4));
		assertNull(emptyList.remove(0));
		assertNull(list3.remove(1));
		assertEquals((Integer)10,list1.remove(0));
		assertEquals("[70, 20, 90]",list1.toString());
		assertEquals((Integer)(-6),list3.remove(0));
		assertEquals("[]",list3.toString());
		assertEquals((Integer)8,list2.remove(8));
		assertEquals("[-5, 5, 2, 1, -55, -5, 0, 0, 0]",list2.toString());
	}

	@Test
	void testIdentical() {
		CustomArrayList list4 = new CustomArrayList();
		list4.add(-6);
		assertFalse(emptyList.identical(list1));
		assertFalse(list1.identical(list2));
		assertTrue(list4.identical(list3));
		list4.add(3);
		assertFalse(list4.identical(list3));
		assertFalse(list3.identical(list2));
		CustomArrayList list5 = new CustomArrayList();
		assertTrue(list5.identical(emptyList));
	}

	@Test
	void testJoin() {
		CustomArrayList list4 = new CustomArrayList();
		assertNotNull(list4.join(emptyList));
		assertEquals("[]",list4.join(emptyList).toString());
		assertNotNull(list3.join(list1));
		assertEquals("[-6, 10, 70, 20, 90]", list3.join(list1).toString());
		assertNotNull(emptyList.join(list3));
		assertEquals("[-6]",emptyList.join(list3).toString());
		assertNotNull(list1.join(list2));
		assertEquals("[10, 70, 20, 90, -5, 5, 2, 1, -55, -5, 0, 0, 8, 0]",list1.join(list2).toString());
		assertNotNull(list2.join(list1));
		assertEquals("[-5, 5, 2, 1, -55, -5, 0, 0, 8, 0, 10, 70, 20, 90]",list2.join(list1).toString());
	}

	@Test
	void testSubList() {
		assertNull(list1.subList(0, 6));
		assertNull(list2.subList(-3, 2));
		assertNull(emptyList.subList(0, 2));
		assertNull(list3.subList(0, -1));
		assertNull(list2.subList(4, 1));
		assertNotNull(list1.subList(0, 2));
		assertEquals("[10, 70, 20]", list1.subList(0, 2).toString());
		assertNotNull(list1.subList(0, 0));
		assertEquals("[-6]",list3.subList(0, 0).toString());
		assertNotNull(list2.subList(4, 7));
		assertEquals("[-55, -5, 0, 0]", list2.subList(4, 7).toString());
		assertNotNull(list1.subList(3, 3));
		assertEquals("[90]",list1.subList(3, 3).toString());
	}

	@Test
	void testSame() {
		CustomArrayList list4 = new CustomArrayList();
		CustomArrayList list5 = new CustomArrayList();
		list5.add(70);
		list5.add(90);
		list5.add(10);
		list5.add(20);
		assertFalse(list1.same(list2));
		assertFalse(list2.same(list3));
		assertFalse(emptyList.same(list1));
		assertTrue(emptyList.same(list4));
		assertTrue(list1.same(list5));
		assertFalse(list3.same(list5));
	}

	@Test
	void testSort() {
		emptyList.sort();
		list1.sort();
		list2.sort();
		list3.sort();
		assertEquals("[]",emptyList.toString());
		assertEquals("[10, 20, 70, 90]", list1.toString());
		assertEquals("[-55, -5, -5, 0, 0, 0, 1, 2, 5, 8]", list2.toString());
		assertEquals("[-6]",list3.toString());
	}

}
