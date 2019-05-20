package testsAttempts.javaLists;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import attempts.javaLists.*;

class Stage4Test {
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
	void testSortArrayListOfInteger() {
		Stage4.sort(nullList); //should not raise NullPointerException
		Stage4.sort(emptyList);
		assertEquals("[]", emptyList.toString());
		Stage4.sort(singleItemList);
		assertEquals("[-7]", singleItemList.toString());
		Stage4.sort(list1);
		assertEquals("[10, 20, 70, 90]", list1.toString());
		Stage4.sort(list2);
		//-5, 0, 8, -7, 9, 15, 23, -1, 5
		assertEquals("[-7, -5, -1, 0, 5, 8, 9, 15, 23]", list2.toString());
	}

	@Test
	void testSortArrayListOfIntegerBoolean() {
		Stage4.sort(nullList, true); //should not raise NullPointerException
		Stage4.sort(nullList, false); //should not raise NullPointerException
		Stage4.sort(emptyList, false);
		assertEquals("[]", emptyList.toString());
		Stage4.sort(emptyList, true);
		assertEquals("[]", emptyList.toString());
		Stage4.sort(singleItemList, true);
		assertEquals("[-7]", singleItemList.toString());
		Stage4.sort(singleItemList, false);
		assertEquals("[-7]", singleItemList.toString());
		Stage4.sort(list1, true);
		assertEquals("[10, 20, 70, 90]", list1.toString());
		Stage4.sort(list1, false);
		assertEquals("[90, 70, 20, 10]", list1.toString());
		Stage4.sort(list2, true);
		assertEquals("[-7, -5, -1, 0, 5, 8, 9, 15, 23]", list2.toString());
		Stage4.sort(list2, false);
		assertEquals("[23, 15, 9, 8, 5, 0, -1, -5, -7]", list2.toString());
	}

	@Test
	void testMerge() {
		ArrayList<Integer> 	merged = Stage4.merge(nullList, emptyList);
		assertNull(merged);
		merged = Stage4.merge(emptyList, nullList);
		assertNull(merged);
		merged = Stage4.merge(nullList, nullList);
		assertNull(merged);
		merged = Stage4.merge(emptyList, emptyList);
		assertNotNull(merged);
		assertEquals("[]", merged.toString());
		merged = Stage4.merge(emptyList, singleItemList);
		assertNotNull(merged);
		assertEquals("[-7]", merged.toString());
		merged = Stage4.merge(singleItemList, emptyList);
		assertNotNull(merged);
		assertEquals("[-7]", merged.toString());
		merged = Stage4.merge(list1, list2);
		assertNotNull(merged);
		assertEquals("[10, 70, 20, 90, -5, 0, 8, -7, 9, 15, 23, -1, 5]", merged.toString());
		merged = Stage4.merge(list2, list1);
		assertNotNull(merged);
		assertEquals("[-5, 0, 8, -7, 9, 15, 23, -1, 5, 10, 70, 20, 90]", merged.toString());
	}

	@Test
	void testGetLongestAscendingRun() {
		ArrayList<Integer> result = Stage4.getLongestAscendingRun(nullList); //should not raise NullPointerException
		assertNull(result);
		result = Stage4.getLongestAscendingRun(emptyList); 
		assertNotNull(result);
		assertEquals("[]", result.toString());
		result = Stage4.getLongestAscendingRun(list1); 
		assertNotNull(result);
		assertEquals("[10, 70]", result.toString());
		result = Stage4.getLongestAscendingRun(list2); 
		assertNotNull(result);
		assertEquals("[-7, 9, 15, 23]", result.toString());

		list2 = new ArrayList<Integer>(Arrays.asList(-5,-5,0,0,0,0,1,1,1,1,1,10,10,10));
		result = Stage4.getLongestAscendingRun(list2); 
		assertNotNull(result);
		assertEquals("[-5, -5, 0, 0, 0, 0, 1, 1, 1, 1, 1, 10, 10, 10]", result.toString());

	}

	@Test
	void testGetIntersection() {
		ArrayList<Integer> inter = Stage4.getIntersection(nullList, emptyList);
		assertNull(inter);
		inter = Stage4.getIntersection(emptyList, nullList);
		assertNull(inter);
		inter = Stage4.getIntersection(nullList, nullList);
		assertNull(inter);
		inter = Stage4.getIntersection(emptyList, emptyList);
		assertNotNull(inter);
		assertEquals("[]", inter.toString());
		inter = Stage4.getIntersection(emptyList, singleItemList);
		assertNotNull(inter);
		assertEquals("[]", inter.toString());
		inter = Stage4.getIntersection(singleItemList, emptyList);
		assertNotNull(inter);
		assertEquals("[]", inter.toString());
		inter = Stage4.getIntersection(list1, list2);
		assertNotNull(inter);
		assertEquals("[]", inter.toString());
		inter = Stage4.getIntersection(list2, list1);
		assertNotNull(inter);
		assertEquals("[]", inter.toString());

		list1 = new ArrayList<Integer>(Arrays.asList(10,10,20,20,70,70,90,90));
		list2 = new ArrayList<Integer>(Arrays.asList(90,90,90,90,20,20,20,20));

		inter = Stage4.getIntersection(list1, list2);
		assertNotNull(inter);
		assertEquals("[20, 90]", inter.toString());

		inter = Stage4.getIntersection(list2, list1);
		assertNotNull(inter);
		assertEquals("[90, 20]", inter.toString());

		inter = Stage4.getIntersection(list1, list1);
		assertNotNull(inter);
		assertEquals("[10, 20, 70, 90]", inter.toString());
	}

	@Test
	void testGetIntersectionV2() {
		ArrayList<Integer> inter = Stage4.getIntersection(nullList, emptyList);
		assertNull(inter);
		inter = Stage4.getIntersectionV2(emptyList, nullList);
		assertNull(inter);
		inter = Stage4.getIntersectionV2(nullList, nullList);
		assertNull(inter);
		inter = Stage4.getIntersectionV2(emptyList, emptyList);
		assertNotNull(inter);
		assertEquals("[]", inter.toString());
		inter = Stage4.getIntersectionV2(emptyList, singleItemList);
		assertNotNull(inter);
		assertEquals("[]", inter.toString());
		inter = Stage4.getIntersectionV2(singleItemList, emptyList);
		assertNotNull(inter);
		assertEquals("[]", inter.toString());
		inter = Stage4.getIntersectionV2(list1, list2);
		assertNotNull(inter);
		assertEquals("[]", inter.toString());
		inter = Stage4.getIntersectionV2(list2, list1);
		assertNotNull(inter);
		assertEquals("[]", inter.toString());

		list1 = new ArrayList<Integer>(Arrays.asList(10,10,20,20,70,70,90,90));
		list2 = new ArrayList<Integer>(Arrays.asList(90,90,90,90,20,20,20,20));

		inter = Stage4.getIntersectionV2(list1, list2);
		assertNotNull(inter);
		assertEquals("[20, 20, 90, 90]", inter.toString());

		inter = Stage4.getIntersectionV2(list2, list1);
		assertNotNull(inter);
		assertEquals("[90, 90, 20, 20]", inter.toString());

		inter = Stage4.getIntersectionV2(list1, list1);
		assertNotNull(inter);
		assertEquals("[10, 10, 20, 20, 70, 70, 90, 90]", inter.toString());	
	}


	@Test
	void testItemsInAtleastN() {
		ArrayList<Integer> result = Stage4.itemsInAtleastN(null, 2);
		assertNull(result);

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		list.add(null);
		list.add(null);
		list.add(null);

		result = Stage4.itemsInAtleastN(list, 3);
		assertNotNull(result);
		assertEquals("[]", result.toString());

		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(4,5,6,7,8));
		ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(3,5,7,6));
		list = new ArrayList<ArrayList<Integer>>();
		list.add(a);
		list.add(b);
		list.add(c);
		result = Stage4.itemsInAtleastN(list, 2);
		assertNotNull(result);
		assertEquals("[3, 4, 5, 6, 7]", result.toString());

		result = Stage4.itemsInAtleastN(list, 3);
		assertNotNull(result);
		assertEquals("[5]", result.toString());

		ArrayList<Integer> d = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(4,6,7,8));
		ArrayList<Integer> f = new ArrayList<Integer>(Arrays.asList(3,5,7,6,4));

		list = new ArrayList<ArrayList<Integer>>();
		list.add(d);
		list.add(e);
		list.add(f);

		result = Stage4.itemsInAtleastN(list, 3);
		assertNotNull(result);
		assertEquals("[4, 6]", result.toString());
	}
}
