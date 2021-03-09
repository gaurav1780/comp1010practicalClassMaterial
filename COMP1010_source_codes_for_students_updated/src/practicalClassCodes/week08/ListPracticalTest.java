package practicalClassCodes.week08;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListPracticalTest {
	private ArrayList<Integer> list;
	private ArrayList<Integer> emptyList;
	private ArrayList<Integer> singleItemList;
	private ArrayList<Integer> nullList;

	@BeforeEach
	public void setup() {
		list = new ArrayList<Integer>();
		list.add(10);
		list.add(70);
		list.add(20);
		list.add(-90);
		list.add(0);
		list.add(-80);
		emptyList = new ArrayList<Integer>();
		singleItemList = new ArrayList<Integer>();
		singleItemList.add(50);
		nullList = null;
	}

	@Test
	void testFirstItemV1() {
		assertNotNull(ListPractical.firstItemV1(list));
		assertNotNull(ListPractical.firstItemV1(singleItemList));
		assertEquals((Integer)10, ListPractical.firstItemV1(list));
		assertEquals((Integer)50, ListPractical.firstItemV1(singleItemList));
	}

	@Test
	void testFirstItemV2() {
		assertNull(ListPractical.firstItemV2(emptyList));
		assertNotNull(ListPractical.firstItemV2(list));
		assertNotNull(ListPractical.firstItemV2(singleItemList));
		assertEquals((Integer)10, ListPractical.firstItemV2(list));
		assertEquals((Integer)50, ListPractical.firstItemV2(singleItemList));
	}

	@Test
	void testFirstItemV3() {
		assertNull(ListPractical.firstItemV3(nullList));
		assertNull(ListPractical.firstItemV3(emptyList));
		assertNotNull(ListPractical.firstItemV3(list));
		assertNotNull(ListPractical.firstItemV3(singleItemList));
		assertEquals((Integer)10, ListPractical.firstItemV3(list));
		assertEquals((Integer)50, ListPractical.firstItemV3(singleItemList));
	}

	@Test
	void testLastItem() {
		assertNull(ListPractical.lastItem(nullList));
		assertNull(ListPractical.lastItem(emptyList));

		assertNotNull(ListPractical.lastItem(list));
		assertEquals((Integer)(-80),ListPractical.lastItem(list));
	}

	@Test
	void testSumFirstLast() {
		assertNull(ListPractical.sumFirstLast(nullList));
		assertNull(ListPractical.sumFirstLast(emptyList));

		assertNotNull(ListPractical.sumFirstLast(singleItemList));
		assertEquals((Integer)50,ListPractical.sumFirstLast(singleItemList));

		assertNotNull(ListPractical.sumFirstLast(list));
		assertEquals((Integer)(-70),ListPractical.sumFirstLast(list));
	}

	@Test
	void testSum() {
		assertEquals(0, ListPractical.sum(nullList));
		assertEquals(0, ListPractical.sum(emptyList));
		assertEquals(50, ListPractical.sum(singleItemList));
		assertEquals(-70, ListPractical.sum(list));
		list.add(3, 200); //item 200 added at index 3
		assertEquals(130, ListPractical.sum(list));
	}

	@Test
	void testCountPositives() {
		assertNotNull(ListPractical.countPositives(nullList));
		assertEquals(0,ListPractical.countPositives(nullList));

		assertNotNull(ListPractical.countPositives(emptyList));
		assertEquals(0,ListPractical.countPositives(emptyList));

		assertNotNull(ListPractical.countPositives(singleItemList));
		assertEquals(1,ListPractical.countPositives(singleItemList));

		assertNotNull(ListPractical.countPositives(list));
		assertEquals(3,ListPractical.countPositives(list));
		list.add(90); //another 90 added to the end of the list

		assertNotNull(ListPractical.countPositives(list));
		assertEquals(4,ListPractical.countPositives(list));
	}

	@Test
	void testMedian() {
		assertNull(ListPractical.median(nullList));
		assertNull(ListPractical.median(emptyList));

		assertNotNull(ListPractical.median(singleItemList));
		assertEquals((Integer)50,ListPractical.median(singleItemList));

		assertNotNull(ListPractical.median(list));
		assertEquals((Integer)20,ListPractical.median(list));
	}

	@Test
	void testAllInRange() {
		assertFalse(ListPractical.allInRange(null, -100, 100));
		assertTrue(ListPractical.allInRange(emptyList, -100, 100));
		assertTrue(ListPractical.allInRange(list, -100, 100));
		assertTrue(ListPractical.allInRange(list, -90, 70));
		assertFalse(ListPractical.allInRange(list, -89, 70));
		assertFalse(ListPractical.allInRange(list, -90, 69));
	}
}
