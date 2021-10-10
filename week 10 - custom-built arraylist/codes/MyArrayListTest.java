import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyArrayListTest {
	public MyArrayList list1, list2, list3;
	
	public static double score = 0;
	public static String result = "";
	public static String currentMethodName = null;
	public static ArrayList<String> methodsPassed = new ArrayList<String>();

	@BeforeEach
	public void run() {
		list1 = new MyArrayList();
		list1.add(new Rectangle(10, 5));
		list1.add(new Rectangle(70, 10));
		list1.add(new Rectangle(20));
		list1.add(new Rectangle(90, 50));

		list2 = new MyArrayList();
		for (int i = 0; i < 15; i++) {
			list2.add(new Rectangle((int) (Math.random() * 100), (int) (Math.random() * 100)));
		}

		list3 = new MyArrayList();
		list3.add(new Rectangle(5));
		list3.add(null);
		list3.add(new Rectangle(6, 2));
		list3.add(null);
		list3.add(null);
		list3.add(new Rectangle(15, 30));
		list3.add(null);
		
		currentMethodName = null;
	}

	@Test @Graded(description="testGrow", marks=11)
	public void testGrow() {
		assertEquals(5, list1.currentCapacity());
		list1.grow();
		assertEquals(15, list1.currentCapacity());
		assertEquals("10 by 5", list1.get(0).toString());
		assertEquals("70 by 10", list1.get(1).toString());
		list1.grow();
		assertEquals(25, list1.currentCapacity());
		assertEquals(4, list1.currentSize());

		assertEquals(15, list2.currentCapacity());
		Rectangle r0 = list2.get(0);
		Rectangle r14 = list2.get(14);
		list2.grow();
		assertEquals(25, list2.currentCapacity());
		assertEquals(r0.toString(), list2.get(0).toString());
		assertEquals(r14.toString(), list2.get(14).toString());
		list2.grow();
		assertEquals(35, list2.currentCapacity());
		assertEquals(15, list2.currentSize());

		assertEquals(15, list3.currentCapacity());
		r0 = list3.get(0);
		Rectangle r5 = list3.get(5);
		list3.grow();
		assertEquals(25, list3.currentCapacity());
		assertEquals(r0.toString(), list3.get(0).toString());
		assertEquals(r5.toString(), list3.get(5).toString());
		assertEquals(7, list3.currentSize());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test @Graded(description="testCurrentSize", marks=1)
	public void testCurrentSize() {
		assertEquals(4, list1.currentSize());
		assertEquals(15, list2.currentSize());
		assertEquals(7, list3.currentSize());

		// currentSize test will pass after you correctly implement grow()
		list1.add(new Rectangle(10, 5));
		list1.add(new Rectangle(70, 10));
		list1.add(new Rectangle(20));
		assertEquals(7, list1.currentSize());

		list2.add(new Rectangle(20));
		assertEquals(16, list2.currentSize());

		list3.add(null);
		assertEquals(8, list3.currentSize());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="testCurrentCapacity", marks=1)
	public void testCurrentCapacity() {
		assertEquals(5, list1.currentCapacity());
		assertEquals(15, list2.currentCapacity());
		assertEquals(15, list3.currentCapacity());

		// currentCapacity test will pass after you correctly implement grow()
		list1.add(new Rectangle(10, 5));
		assertEquals(5, list1.currentCapacity());
		list1.add(new Rectangle(70, 10));
		assertEquals(15, list1.currentCapacity());
		list1.add(new Rectangle(20));
		assertEquals(15, list1.currentCapacity());

		list2.add(new Rectangle(10, 5));
		assertEquals(25, list2.currentCapacity());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="testIsEmpty", marks=1)
	public void testIsEmpty() {
		assertFalse(list1.isEmpty());
		assertFalse(list2.isEmpty());
		assertFalse(list3.isEmpty());
		list1 = new MyArrayList();
		assertTrue(list1.isEmpty());
		list1.add(null);
		assertFalse(list1.isEmpty());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="testIsFull", marks=1)
	public void testIsFull() {
		assertFalse(list1.isFull());
		assertFalse(list3.isFull());
		list1.add(new Rectangle(10, 5));
		assertTrue(list1.isFull());
		assertTrue(list2.isFull());
		list2.add(new Rectangle(10, 5));
		assertFalse(list2.isFull());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test @Graded(description="testAddRectangle", marks=12)
	public void testAddRectangle() {
		// adding 5th rectangle doesn't need to grow the list
		Rectangle r = new Rectangle(30, 5);
		list1.add(r);
		assertEquals(5, list1.currentSize());
		assertEquals(5, list1.currentCapacity());
		assertNotNull(list1.get(0));
		assertEquals("10 by 5", list1.get(0).toString());
		assertNotNull(list1.get(1));
		assertEquals("70 by 10", list1.get(1).toString());
		assertNotNull(list1.get(2));
		assertEquals("20 by 20", list1.get(2).toString());
		assertNotNull(list1.get(3));
		assertEquals("90 by 50", list1.get(3).toString());
		assertNotNull(list1.get(4));
		assertEquals("30 by 5", list1.get(4).toString());

		r.width = (1);
		// we wanted to add an instance copy of the object
		assertEquals("30 by 5", list1.get(4).toString());

		// adding 6th item should have "grown" the list
		r = new Rectangle(100);

		// add test will pass after you correctly implement grow()
		list1.add(r);
		assertEquals(6, list1.currentSize());
		assertEquals(15, list1.currentCapacity());
		assertNotNull(list1.get(0));
		assertEquals("10 by 5", list1.get(0).toString());
		assertNotNull(list1.get(1));
		assertEquals("70 by 10", list1.get(1).toString());
		assertNotNull(list1.get(2));
		assertEquals("20 by 20", list1.get(2).toString());
		assertNotNull(list1.get(3));
		assertEquals("90 by 50", list1.get(3).toString());
		assertNotNull(list1.get(4));
		assertEquals("30 by 5", list1.get(4).toString());
		assertNotNull(list1.get(5));
		assertEquals("100 by 100", list1.get(5).toString());

		r.width = (888);
		// we wanted to add an instance copy of the object
		assertEquals("100 by 100", list1.get(5).toString());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();

	}

	@Test @Graded(description="testGet", marks=1)
	public void testGet() {
		Rectangle r = list1.get(0);
		assertNotNull(r);
		assertEquals("10 by 5", r.toString());
		r = null; // should not modify first item in list

		Rectangle s = list1.get(0);
		assertNotNull(s);
		assertEquals("10 by 5", s.toString());
		s.height = (20);
		assertEquals("10 by 5", list1.get(0).toString());

		r = list1.get(3);
		assertNotNull(r);
		assertEquals("90 by 50", r.toString());
		r.height = (20);
		assertEquals("90 by 50", list1.get(3).toString());

		r = list1.get(-1);
		assertNull(r);

		r = list1.get(4);
		assertNull(r);

		r = list3.get(-2);
		assertNull(r);

		r = list3.get(5);
		assertNotNull(r);
		assertEquals("15 by 30", r.toString());
		r.height = (20);
		assertEquals("15 by 30", list3.get(5).toString());

		for (int i = 6; i < 20; i++) {
			r = list3.get(i);
			assertNull(r);
		}
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="testRemoveInt", marks=12)
	public void testRemoveInt() {
		Rectangle removed = list1.remove(1);
		assertNotNull(removed);
		assertEquals("70 by 10", removed.toString());
		assertEquals(3, list1.currentSize());
		assertNotNull(list1.get(0));
		assertEquals("10 by 5", list1.get(0).toString());
		assertNotNull(list1.get(1));
		assertEquals("20 by 20", list1.get(1).toString());
		assertNotNull(list1.get(2));
		assertEquals("90 by 50", list1.get(2).toString());

		String[] copy = new String[list2.currentSize()];
		for (int i = 0; i < list2.currentSize(); i++) {
			copy[i] = list2.get(i).toString();
		}

		list2.remove(-1);
		assertEquals(15, list2.currentSize());
		for (int i = 0; i < 15; i++) {
			assertEquals(copy[i], list2.get(i).toString());
		}

		list2.remove(15);
		assertEquals(15, list2.currentSize());
		for (int i = 0; i < 15; i++) {
			assertEquals(copy[i], list2.get(i).toString());
		}

		removed = list2.remove(10);
		assertEquals(14, list2.currentSize());
		for (int i = 0; i < 10; i++) {
			assertEquals(copy[i], list2.get(i).toString());
		}
		assertEquals(copy[10], removed.toString());
		for (int i = 10; i < 14; i++) {
			assertEquals(copy[i + 1], list2.get(i).toString());
		}

		removed = list3.remove(3);
		assertNull(removed);
		assertEquals(6, list3.currentSize());
		assertEquals("5 by 5", list3.get(0).toString());
		assertNull(list3.get(1));
		assertEquals("6 by 2", list3.get(2).toString());
		assertNull(list3.get(3));
		assertEquals("15 by 30", list3.get(4).toString());
		assertNull(list3.get(5));
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();

	}

	@Test @Graded(description="testRemoveRectangle", marks=12)
	public void testRemoveRectangle() {
		boolean result = list1.remove(new Rectangle(10, 5));
		assertTrue(result);
		assertEquals(3, list1.currentSize());
		assertNotNull(list1.get(0));
		assertEquals("70 by 10", list1.get(0).toString());
		assertNotNull(list1.get(1));
		assertEquals("20 by 20", list1.get(1).toString());
		assertNotNull(list1.get(2));
		assertEquals("90 by 50", list1.get(2).toString());
		assertNull(list1.get(3));

		result = list1.remove(new Rectangle(4));
		assertFalse(result);
		assertEquals(3, list1.currentSize());
		assertNotNull(list1.get(0));
		assertEquals("70 by 10", list1.get(0).toString());
		assertNotNull(list1.get(1));
		assertEquals("20 by 20", list1.get(1).toString());
		assertNotNull(list1.get(2));
		assertEquals("90 by 50", list1.get(2).toString());
		assertNull(list1.get(3));

		result = list1.remove(null);
		assertFalse(result);

		// Only the first occurrence of the rectangle "70 by 10" should be removed
		list1.add(new Rectangle(70, 10));
		result = list1.remove(new Rectangle(70, 10));
		assertTrue(result);
		assertEquals(3, list1.currentSize());
		assertNotNull(list1.get(0));
		assertEquals("20 by 20", list1.get(0).toString());
		assertNotNull(list1.get(1));
		assertEquals("90 by 50", list1.get(1).toString());
		assertNotNull(list1.get(2));
		assertEquals("70 by 10", list1.get(2).toString());
		assertNull(list1.get(3));

		result = list3.remove(null);
		assertTrue(result);
		assertEquals(6, list3.currentSize());
		assertEquals("5 by 5", list3.get(0).toString());
		assertEquals("6 by 2", list3.get(1).toString());
		assertNull(list3.get(2));
		assertNull(list3.get(3));
		assertEquals("15 by 30", list3.get(4).toString());
		assertNull(list3.get(5));
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="testAddRectangleInt", marks=12)
	public void testAddRectangleInt() {
		list1.add(-1, new Rectangle(30));
		assertEquals(4, list1.currentSize());
		list1.add(5, new Rectangle(30));
		assertEquals(4, list1.currentSize());

		list1.add(2, new Rectangle(30));
		assertEquals(5, list1.currentSize());
		assertNotNull(list1.get(0));
		assertEquals("10 by 5", list1.get(0).toString());
		assertNotNull(list1.get(1));
		assertEquals("70 by 10", list1.get(1).toString());
		assertNotNull(list1.get(2));
		assertEquals("30 by 30", list1.get(2).toString());
		assertNotNull(list1.get(3));
		assertEquals("20 by 20", list1.get(3).toString());
		assertNotNull(list1.get(4));
		assertEquals("90 by 50", list1.get(4).toString());

		list1.add(0, new Rectangle(20));
		assertEquals(6, list1.currentSize());
		assertNotNull(list1.get(0));
		assertEquals("20 by 20", list1.get(0).toString());
		assertNotNull(list1.get(1));
		assertEquals("10 by 5", list1.get(1).toString());
		assertNotNull(list1.get(2));
		assertEquals("70 by 10", list1.get(2).toString());
		assertNotNull(list1.get(3));
		assertEquals("30 by 30", list1.get(3).toString());
		assertNotNull(list1.get(4));
		assertEquals("20 by 20", list1.get(4).toString());
		assertNotNull(list1.get(5));
		assertEquals("90 by 50", list1.get(5).toString());

		Rectangle r = new Rectangle(11);
		list1.add(6, r);
		assertEquals(7, list1.currentSize());
		assertNotNull(list1.get(0));
		assertEquals("20 by 20", list1.get(0).toString());
		assertNotNull(list1.get(1));
		assertEquals("10 by 5", list1.get(1).toString());
		assertNotNull(list1.get(2));
		assertEquals("70 by 10", list1.get(2).toString());
		assertNotNull(list1.get(3));
		assertEquals("30 by 30", list1.get(3).toString());
		assertNotNull(list1.get(4));
		assertEquals("20 by 20", list1.get(4).toString());
		assertNotNull(list1.get(5));
		assertEquals("90 by 50", list1.get(5).toString());
		assertNotNull(list1.get(6));
		assertEquals("11 by 11", list1.get(6).toString());

		//r.width = (100);
		//assertEquals("100 by 11", list1.get(6).toString()); // should be a reference copy

		String[] copy = new String[list2.currentSize()];
		for (int i = 0; i < list2.currentSize(); i++) {
			copy[i] = list2.get(i).toString();
		}

		int position = (int) (Math.random() * 15);
		r = new Rectangle(200, 900);
		list2.add(position, r);
		assertEquals(16, list2.currentSize());
		for (int i = 0; i < position; i++) {
			assertEquals(copy[i], list2.get(i).toString());
		}
		assertEquals("200 by 900", r.toString());
		for (int i = position + 1; i < 16; i++) {
			assertEquals(copy[i - 1], list2.get(i).toString());
		}

		list3.add(4, null);
		assertEquals(8, list3.currentSize());
		assertEquals("5 by 5", list3.get(0).toString());
		assertNull(list3.get(1));
		assertEquals("6 by 2", list3.get(2).toString());
		assertNull(list3.get(3));
		assertNull(list3.get(4));
		assertNull(list3.get(5));
		assertEquals("15 by 30", list3.get(6).toString());
		assertNull(list3.get(7));
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="testAddAll", marks=12)
	public void testAddAll() {
		Rectangle[] arr = new Rectangle[3];
		arr[0] = new Rectangle(1);
		arr[1] = new Rectangle(2);
		arr[2] = new Rectangle(3, 4);

		list1.addAll(arr);
		assertEquals(7, list1.currentSize());
		assertNotNull(list1.get(0));
		assertEquals("10 by 5", list1.get(0).toString());
		assertNotNull(list1.get(1));
		assertEquals("70 by 10", list1.get(1).toString());
		assertNotNull(list1.get(2));
		assertEquals("20 by 20", list1.get(2).toString());
		assertNotNull(list1.get(3));
		assertEquals("90 by 50", list1.get(3).toString());
		assertNotNull(list1.get(4));
		assertEquals("1 by 1", list1.get(4).toString());
		assertNotNull(list1.get(5));
		assertEquals("2 by 2", list1.get(5).toString());
		assertNotNull(list1.get(6));
		assertEquals("3 by 4", list1.get(6).toString());

		arr[0].height = (4);
		arr[1].width = (100);
		arr[2].height = (15);

		//instance copies should have been added
		assertNotNull(list1.get(4));
		assertEquals("1 by 1", list1.get(4).toString());
		assertNotNull(list1.get(5));
		assertEquals("2 by 2", list1.get(5).toString());
		assertNotNull(list1.get(6));
		assertEquals("3 by 4", list1.get(6).toString());

		arr = new Rectangle[5];
		arr[0] = new Rectangle(2);
		arr[1] = new Rectangle(10);
		arr[2] = new Rectangle(4, 3);
		arr[3] = null;
		arr[4] = new Rectangle(40, 20);

		list3.addAll(arr);
		assertEquals(12, list3.currentSize());
		assertEquals("5 by 5", list3.get(0).toString());
		assertNull(list3.get(1));
		assertEquals("6 by 2", list3.get(2).toString());
		assertNull(list3.get(3));
		assertNull(list3.get(4));
		assertEquals("15 by 30", list3.get(5).toString());
		assertNull(list3.get(6));
		assertEquals("2 by 2", list3.get(7).toString());
		assertEquals("10 by 10", list3.get(8).toString());
		assertEquals("4 by 3", list3.get(9).toString());
		assertNull(list3.get(10));
		assertEquals("40 by 20", list3.get(11).toString());

		arr[0].height = (4);
		arr[1].width = (100);
		arr[2].height = (15);
		arr[4].height = (15);
		//instance copies should have been added
		assertEquals("2 by 2", list3.get(7).toString());
		assertEquals("10 by 10", list3.get(8).toString());
		assertEquals("4 by 3", list3.get(9).toString());
		assertNull(list3.get(10));
		assertEquals("40 by 20", list3.get(11).toString());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="testResizeToFit", marks=12)
	public void testResizeToFit() {
		list1.resizeToFit();
		assertEquals(4, list1.currentSize());
		assertEquals(4, list1.currentCapacity());	
		assertNotNull(list1.get(0));
		assertEquals("10 by 5", list1.get(0).toString());
		assertNotNull(list1.get(1));
		assertEquals("70 by 10", list1.get(1).toString());
		assertNotNull(list1.get(2));
		assertEquals("20 by 20", list1.get(2).toString());
		assertNotNull(list1.get(3));
		assertEquals("90 by 50", list1.get(3).toString());
		
		list2.resizeToFit();
		assertEquals(15, list2.currentSize());
		assertEquals(15, list2.currentCapacity());
		
		String[] copy = new String[list2.currentSize()];
		for (int i = 0; i < list2.currentSize(); i++) {
			copy[i] = list2.get(i).toString();
		}
		list2.resizeToFit();
		assertEquals(15, list2.currentSize());
		assertEquals(15, list2.currentCapacity());
		for (int i = 0; i < list2.currentSize(); i++) {
			assertEquals(copy[i], list2.get(i).toString());
		}
		
		list3.resizeToFit();
		assertEquals(7, list3.currentSize());
		assertEquals(7, list3.currentCapacity());	
		assertEquals("5 by 5", list3.get(0).toString());
		assertNull(list3.get(1));
		assertEquals("6 by 2", list3.get(2).toString());
		assertNull(list3.get(3));
		assertNull(list3.get(4));
		assertEquals("15 by 30", list3.get(5).toString());
		assertNull(list3.get(6));
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="testGetCombinedList", marks=12)
	public void testGetCombinedList() {
		// First combination
		MyArrayList other = new MyArrayList();
		other.add(new Rectangle(2));
		other.add(new Rectangle(5));
		
		MyArrayList combined = list1.getCombinedList(other);
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

		assertEquals(4, list1.currentSize());
		assertEquals(5, list1.currentCapacity());
		assertNotNull(list1.get(0)); // SHOULD NOT BE NULL
		assertEquals("10 by 5", list1.get(0).toString());
		assertNotNull(list1.get(1));
		assertEquals("70 by 10", list1.get(1).toString());
		assertNotNull(list1.get(2));
		assertEquals("20 by 20", list1.get(2).toString());
		assertNotNull(list1.get(3));
		assertEquals("90 by 50", list1.get(3).toString());

		assertEquals(2, other.currentSize());
		assertEquals(5, other.currentCapacity());
		assertNotNull(other.get(0)); // SHOULD NOT BE NULL
		assertEquals("2 by 2", other.get(0).toString());
		assertNotNull(other.get(1));
		assertEquals("5 by 5", other.get(1).toString());
		
		// second combination
		String[] copy = new String[list2.currentSize()];
		for (int i = 0; i < list2.currentSize(); i++) {
			copy[i] = list2.get(i).toString();
		}
		combined = list3.getCombinedList(list2);
		
		assertEquals(22, combined.currentSize());
		assertEquals(25, combined.currentCapacity());	
		assertEquals("5 by 5", combined.get(0).toString());
		assertNull(list3.get(1));
		assertEquals("6 by 2", combined.get(2).toString());
		assertNull(list3.get(3));
		assertNull(list3.get(4));
		assertEquals("15 by 30", combined.get(5).toString());
		assertNull(list3.get(6));
		for (int i = 0; i < list2.currentSize(); i++) {
			assertEquals(copy[i], combined.get(i + list3.currentSize()).toString());
		}
		
		// Third combination
		other = new MyArrayList();
		other.add(new Rectangle(1));
		combined = list3.getCombinedList(other);
		assertEquals(7, list3.currentSize());
		assertEquals(8, combined.currentSize());
		list3.add(new Rectangle(5)); // Should add to list3, NOT combined
		
		assertEquals(8, combined.currentSize());
		assertEquals(15, combined.currentCapacity());	
		assertEquals("5 by 5", combined.get(0).toString());
		assertNull(combined.get(1));
		assertEquals("6 by 2", combined.get(2).toString());
		assertNull(combined.get(3));
		assertNull(combined.get(4));
		assertEquals("15 by 30", combined.get(5).toString());
		assertNull(combined.get(6));
		assertEquals("1 by 1", combined.get(7).toString());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@AfterEach
	public void logSuccess() throws NoSuchMethodException, SecurityException {
		if(currentMethodName != null && !methodsPassed.contains(currentMethodName)) {
			methodsPassed.add(currentMethodName);
			Method method = getClass().getMethod(currentMethodName);
			Graded graded = method.getAnnotation(Graded.class);
			score+=graded.marks();
			result+=graded.description()+" passed. Marks awarded: "+graded.marks()+"\n";
		}
	}

	@AfterAll
	public static void wrapUp() throws IOException {
		if(result.length() != 0) {
			result = result.substring(0, result.length()-1); //remove the last "\n"
		}
		System.out.println(result+"\nIndicative mark: "+score);
	}

}
