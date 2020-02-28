package practicalClassCodes.week10;

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

		//currentSize test will pass after you correctly implement grow()
		list.add(new Rectangle(70, 10));
		list.add(new Rectangle(20));
		assertEquals(7, list.currentSize());
	}

	@Test
	void testCurrentCapacity() {
		assertEquals(5, list.currentCapacity());
		
		//currentCapacity test will pass after you correctly implement grow()
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
		assertEquals("10 by 5", list.get(0).toString());
		assertEquals("70 by 10", list.get(1).toString());
		list.grow();
		assertEquals(25, list.currentCapacity());	
	}
	
	@Test
	void testGet() {
		Rectangle r = list.get(0);
		assertNotNull(r);
		assertEquals("10 by 5", r.toString());
		r = null; //should not modify first item in list
		
		Rectangle s = list.get(0);
		assertNotNull(s);
		assertEquals("10 by 5", s.toString());
	
		r = list.get(3);
		assertNotNull(r);
		assertEquals("90 by 50", r.toString());
		
		r = list.get(-1);
		assertNull(r);
		
		r = list.get(4);
		assertNull(r);
}

	@Test
	void testAddRectangle() {
		//adding 5th rectangle doesn't need to grow the list
		Rectangle r = new Rectangle(30, 5);
		list.add(r);
		assertEquals(5, list.currentSize());
		assertEquals(5, list.currentCapacity());
		assertNotNull(list.get(0));
		assertEquals("10 by 5", list.get(0).toString());
		assertNotNull(list.get(1));
		assertEquals("70 by 10", list.get(1).toString());
		assertNotNull(list.get(2));
		assertEquals("20 by 20", list.get(2).toString());
		assertNotNull(list.get(3));
		assertEquals("90 by 50", list.get(3).toString());
		assertNotNull(list.get(4));
		assertEquals("30 by 5", list.get(4).toString());
		
		r.setWidth(1); 
		//we wanted to add a deep copy of the object
		assertEquals("30 by 5", list.get(4).toString());
		
		//adding 6th item should have "grown" the list
		r = new Rectangle(100);
		
		//add test will pass after you correctly implement grow()
		list.add(r);
		assertEquals(6, list.currentSize());
		assertEquals(15, list.currentCapacity());
		assertNotNull(list.get(0));
		assertEquals("10 by 5", list.get(0).toString());
		assertNotNull(list.get(1));
		assertEquals("70 by 10", list.get(1).toString());
		assertNotNull(list.get(2));
		assertEquals("20 by 20", list.get(2).toString());
		assertNotNull(list.get(3));
		assertEquals("90 by 50", list.get(3).toString());
		assertNotNull(list.get(4));
		assertEquals("30 by 5", list.get(4).toString());
		assertNotNull(list.get(5));
		assertEquals("100 by 100", list.get(5).toString());
		
		r.setWidth(888); 
		//we wanted to add a deep copy of the object
		assertEquals("100 by 100", list.get(5).toString());
		
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
		
		arr[0] = null;
		arr[1] = null;
		arr[2] = null;
		
		//deep copies should have been added
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
	
	@Test
	void getCombinedList() {
		MyArrayList other = new MyArrayList();
		other.add(new Rectangle(2));
		other.add(new Rectangle(5));
		MyArrayList combined = list.getCombinedList(other);
		assertNotNull(combined);
		assertEquals(6, combined.currentSize());
		assertEquals(15, combined.currentCapacity());
		assertNotNull(combined.get(0));
		assertEquals("10 by 5", combined.get(0).toString());
		assertNotNull(combined.get(1));
		assertEquals("70 by 10", combined.get(1).toString());
		assertNotNull(combined.get(2));
		assertEquals("20 by 20", combined.get(2).toString());
		assertNotNull(combined.get(3));
		assertEquals("90 by 50", combined.get(3).toString());
		assertNotNull(combined.get(4));
		assertEquals("2 by 2", combined.get(4).toString());
		assertNotNull(combined.get(5));
		assertEquals("5 by 5", combined.get(5).toString());
		
		combined.set(0, null);
		assertNull(combined.get(0));
		combined.set(4, null);
		assertNull(combined.get(4));

		assertEquals(4, list.currentSize());
		assertEquals(5, list.currentCapacity());
		assertNotNull(list.get(0)); //SHOULD NOT BE NULL
		assertEquals("10 by 5", list.get(0).toString());
		assertNotNull(list.get(1));
		assertEquals("70 by 10", list.get(1).toString());
		assertNotNull(list.get(2));
		assertEquals("20 by 20", list.get(2).toString());
		assertNotNull(list.get(3)); 
		assertEquals("90 by 50", list.get(3).toString());
		
		assertEquals(2, other.currentSize());
		assertEquals(5, other.currentCapacity());
		assertNotNull(other.get(0)); //SHOULD NOT BE NULL
		assertEquals("2 by 2", other.get(0).toString());
		assertNotNull(other.get(1));
		assertEquals("5 by 5", other.get(1).toString());
	}

}
