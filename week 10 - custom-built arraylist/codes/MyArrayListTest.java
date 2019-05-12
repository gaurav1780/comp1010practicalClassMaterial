import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyArrayListTest {
	MyArrayList list;
	
	@BeforeEach
	public void run() {
		list = new MyArrayList();
		list.add(new Rectangle(10, 5));
		list.add(new Rectangle(70, 10));
		list.add(new Rectangle(20));
		list.add(new Rectangle(90, 50));
	}
	
	@Test
	void testCurrentSize() {
		assertEquals(4, list.currentSize());
		list.add(new Rectangle(10, 5));
		list.add(new Rectangle(70, 10));
		list.add(new Rectangle(20));
		assertEquals(7, list.currentSize());
	}

	@Test
	void testCurrentCapacity() {
		assertEquals(5, list.currentCapacity());
		list.add(new Rectangle(10, 5));
		assertEquals(5, list.currentCapacity());
		list.add(new Rectangle(70, 10));
		assertEquals(15, list.currentCapacity());
		list.add(new Rectangle(20));
		assertEquals(15, list.currentCapacity());
	}

	@Test
	void testIsEmpty() {
		assertFalse(list.isEmpty());
		list = new MyArrayList();
		assertTrue(list.isEmpty());
	}

	@Test
	void testIsFull() {
		assertFalse(list.isFull());
		list.add(new Rectangle(10, 5));
		assertTrue(list.isFull());
		
	}

	@Test
	void testGrow() {
		assertEquals(5, list.currentCapacity());
		list.grow();
		assertEquals(15, list.currentCapacity());
		list.grow();
		assertEquals(25, list.currentCapacity());	
	}

	@Test
	void testAddRectangle() {
		//adding 5th rectangle doesn't need to grow the list
		list.add(new Rectangle(10, 5));
		
		//adding 6th item should have "grown" the list
		list.add(new Rectangle(20));
	}

	@Test
	void testRemoveInt() {
		list.remove(1);
		assertEquals(3, list.currentSize());
		assertNotNull(list.get(0));
		assertEquals("10 by 5", list.get(0).toString());
		assertNotNull(list.get(1));
		assertEquals("20 by 20", list.get(1).toString());
		assertNotNull(list.get(2));
		assertEquals("90 by 50", list.get(2).toString());
	}

	@Test
	void testRemoveRectangle() {
		list.remove(new Rectangle(10, 5));
		assertEquals(3, list.currentSize());
		assertNotNull(list.get(0));
		assertEquals("70 by 10", list.get(0).toString());
		assertNotNull(list.get(1));
		assertEquals("20 by 20", list.get(1).toString());
		assertNotNull(list.get(2));
		assertEquals("90 by 50", list.get(2).toString());
	}

	@Test
	void testAddRectangleInt() {
		list.add(1, new Rectangle(30));
		assertEquals(5, list.currentSize());
		assertNotNull(list.get(0));
		assertEquals("10 by 5", list.get(0).toString());
		assertNotNull(list.get(1));
		assertEquals("30 by 30", list.get(1).toString());
		assertNotNull(list.get(2));
		assertEquals("70 by 10", list.get(2).toString());
		assertNotNull(list.get(3));
		assertEquals("20 by 20", list.get(3).toString());
		assertNotNull(list.get(4));
		assertEquals("90 by 50", list.get(4).toString());
	}

	@Test
	void testAddAll() {
		Rectangle[] arr = new Rectangle[3];
		arr[0] = new Rectangle(1);
		arr[1] = new Rectangle(2);
		arr[2] = new Rectangle(3, 4);
		
		list.addAll(arr);
		assertEquals(7, list.currentSize());
		assertNotNull(list.get(0));
		assertEquals("10 by 5", list.get(0).toString());
		assertNotNull(list.get(1));
		assertEquals("70 by 10", list.get(1).toString());
		assertNotNull(list.get(2));
		assertEquals("20 by 20", list.get(2).toString());
		assertNotNull(list.get(3));
		assertEquals("90 by 50", list.get(3).toString());
		assertNotNull(list.get(4));
		assertEquals("1 by 1", list.get(4).toString());
		assertNotNull(list.get(5));
		assertEquals("2 by 2", list.get(5).toString());	
		assertNotNull(list.get(6));
		assertEquals("3 by 4", list.get(6).toString());	
	}

	@Test
	void testResizeToFit() {
		list.resizeToFit();
		assertEquals(4, list.currentSize());
		assertEquals(4, list.currentCapacity());
	}

}
