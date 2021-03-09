package practicePackage.builtInLists.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.builtInLists.attempts.*;
import practicePackage.builtInLists.attempts.Stage4;

class Stage4Test {
	public ArrayList<Integer> nullList, emptyList, singleItemList, list1, list2;

	private ArrayList<Integer> empty;
	private ArrayList<Integer> tenMultiples;
	private ArrayList<Integer> nonNegsShort;
	private ArrayList<Integer> nonNegsLong;
	private ArrayList<Integer> positives;
	private ArrayList<Integer> mixed;
	private ArrayList<Integer> allZeroes;

	@BeforeEach
	public void run() {
		nullList = null;
		emptyList = new ArrayList<Integer>();
		singleItemList = new ArrayList<Integer>(Arrays.asList(-7));
		list1 = new ArrayList<Integer>(Arrays.asList(10,70,20,90));
		list2 = new ArrayList<Integer>(Arrays.asList(-5, 0, 8, -7, 9, 15, 23, -1, 5));

		empty = new ArrayList<Integer>();
		tenMultiples = new ArrayList<Integer>(Arrays.asList(10, 70, 20, 90));
		nonNegsShort = new ArrayList<Integer>(Arrays.asList(0, 4, 2, 3, 5, 1, 6, 9, 7, 8));
		nonNegsLong = new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0, 1, 2, 0, 1, 2, 3, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 5));
		positives = new ArrayList<Integer>(Arrays.asList(10, 3, 5, 6, 2));
		mixed = new ArrayList<Integer>(Arrays.asList(0, 10, 3, -2, 5, 2, 1, 12, -1));
		allZeroes = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
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

		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(10, 20, 70, 90));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(-7, -5, -1, 0, 5, 8, 9, 15, 23));
		merged = Stage4.merge(a, b);

		assertNotNull(merged);
		assertEquals("[-7, -5, -1, 0, 5, 8, 9, 10, 15, 20, 23, 70, 90]", merged.toString());

		//to make sure you don't modify passed lists
		assertEquals("[10, 20, 70, 90]", a.toString());
		assertEquals("[-7, -5, -1, 0, 5, 8, 9, 15, 23]", b.toString());

		merged = Stage4.merge(b, a);
		assertNotNull(merged);
		assertEquals("[-7, -5, -1, 0, 5, 8, 9, 10, 15, 20, 23, 70, 90]", merged.toString());
		assertEquals("[10, 20, 70, 90]", a.toString());
		assertEquals("[-7, -5, -1, 0, 5, 8, 9, 15, 23]", b.toString());
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

		list2 = new ArrayList<Integer>(Arrays.asList(10,10,20,30,40,50,50,5,15,10));
		result = Stage4.getLongestAscendingRun(list2); 
		assertNotNull(result);
		assertEquals("[10, 10, 20, 30, 40, 50, 50]", result.toString());

		list2 = new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
		result = Stage4.getLongestAscendingRun(list2); 
		assertNotNull(result);
		assertEquals("[5]", result.toString());

		list2 = new ArrayList<Integer>(Arrays.asList(2,2,2,4,4,4,4,4,2,4,4,2,2,2,2,2,2,2,2));
		result = Stage4.getLongestAscendingRun(list2); 
		assertNotNull(result);
		assertEquals("[2, 2, 2, 4, 4, 4, 4, 4]", result.toString());
	}

	@Test
	void testNInARow() {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,10,20,20,10,10,10,20,10,20,20,20,20,20));
		assertTrue(Stage4.nInARow(list, 20, 5));
		assertFalse(Stage4.nInARow(list, 20, 6));
		assertTrue(Stage4.nInARow(list, 10, 3));
		assertFalse(Stage4.nInARow(list, 10, 4));
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

	@Test
	void testProductAllButOne() {
		assertNotNull(Stage4.productAllButOne(empty));
		assertEquals(0, Stage4.productAllButOne(empty).size());
		assertEquals("[1]", Stage4.productAllButOne(singleItemList).toString());
		assertEquals("[126000, 18000, 63000, 14000]", Stage4.productAllButOne(tenMultiples).toString());
		assertEquals("[362880, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Stage4.productAllButOne(nonNegsShort).toString());
		assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Stage4.productAllButOne(nonNegsLong).toString());
		assertEquals("[180, 600, 360, 300, 900]", Stage4.productAllButOne(positives).toString());
		assertEquals("[7200, 0, 0, 0, 0, 0, 0, 0, 0]", Stage4.productAllButOne(mixed).toString());
		assertEquals(allZeroes.toString(), Stage4.productAllButOne(allZeroes).toString());
	}

	@Test
	void testGetLongestAscendingSequence() {
		assertNotNull(Stage4.getLongestAscendingSequence(empty));
		assertEquals(0, Stage4.getLongestAscendingSequence(empty).size());
		assertEquals("[-7]", Stage4.getLongestAscendingSequence(singleItemList).toString());
		assertEquals("[10, 70]", Stage4.getLongestAscendingSequence(tenMultiples).toString());
		assertEquals("[2, 3, 5]", Stage4.getLongestAscendingSequence(nonNegsShort).toString());
		assertEquals("[0, 1, 2, 3, 4, 5]", Stage4.getLongestAscendingSequence(nonNegsLong).toString());
		assertEquals("[3, 5, 6]", Stage4.getLongestAscendingSequence(positives).toString());
		assertEquals("[0, 10]", Stage4.getLongestAscendingSequence(mixed).toString());
		assertEquals("[0, 0, 0, 0, 0]", Stage4.getLongestAscendingSequence(allZeroes).toString());
	}

	@Test
	void testGetLongestDescendingSequence() {
		assertNotNull(Stage4.getLongestDescendingSequence(empty));
		assertEquals(0, Stage4.getLongestDescendingSequence(empty).size());
		assertEquals("[-7]", Stage4.getLongestDescendingSequence(singleItemList).toString());
		assertEquals("[70, 20]", Stage4.getLongestDescendingSequence(tenMultiples).toString());
		assertEquals("[4, 2]", Stage4.getLongestDescendingSequence(nonNegsShort).toString());
		assertEquals("[0, 0]", Stage4.getLongestDescendingSequence(nonNegsLong).toString());
		assertEquals("[10, 3]", Stage4.getLongestDescendingSequence(positives).toString());
		assertEquals("[10, 3, -2]", Stage4.getLongestDescendingSequence(mixed).toString());
		assertEquals("[0, 0, 0, 0, 0]", Stage4.getLongestDescendingSequence(allZeroes).toString());
	}

	@Test
	void testGetLongestUnchangedSequence() {
		assertNotNull(Stage4.getLongestUnchangedSequence(empty));
		assertEquals(0, Stage4.getLongestUnchangedSequence(empty).size());
		assertEquals("[-7]", Stage4.getLongestUnchangedSequence(singleItemList).toString());
		assertEquals("[10]", Stage4.getLongestUnchangedSequence(tenMultiples).toString());
		assertEquals("[2, 2, 2]", Stage4.getLongestUnchangedSequence(new ArrayList<Integer>(Arrays.asList(2, 2, 2, 3))).toString());
		assertEquals("[3, 3, 3, 3, 3]", Stage4.getLongestUnchangedSequence(new ArrayList<Integer>(Arrays.asList(2, 2, 2, 3, 3, 3, 3, 3))).toString());
		assertEquals("[5, 5, 5, 5, 5, 5, 5, 5]", Stage4.getLongestUnchangedSequence(new ArrayList<Integer>(Arrays.asList(2, 2, 2, 3, 3, 3, 3, 3, 2, 3, 3, 5, 5, 5, 5, 5, 5, 5, 5))).toString());
		assertEquals("[0, 0, 0, 0, 0]", Stage4.getLongestUnchangedSequence(allZeroes).toString());
	}

	@Test
	void testGetCommonItemsSorted() {
		//First sort all the arrays
		Collections.sort(tenMultiples);
		Collections.sort(nonNegsShort);
		Collections.sort(nonNegsLong);
		Collections.sort(positives);
		Collections.sort(mixed);
		Collections.sort(allZeroes);

		assertNotNull(Stage4.getCommonItemsSorted(tenMultiples, nonNegsShort));
		assertEquals(0, Stage4.getCommonItemsSorted(tenMultiples, nonNegsShort).size()); //no items in common

		assertEquals("[0, 1, 2, 3, 4, 5]", Stage4.getCommonItemsSorted(nonNegsShort, nonNegsLong).toString()); //some items in common

		assertEquals("[2, 3, 5, 6, 10]", Stage4.getCommonItemsSorted(positives, positives).toString()); //all items in common

		assertEquals("[0]", Stage4.getCommonItemsSorted(mixed, allZeroes).toString()); //only 1 item in common

		assertEquals("[0, 0]", Stage4.getCommonItemsSorted(new ArrayList<Integer>(Arrays.asList(0, 0)), new ArrayList<Integer>(Arrays.asList(0, 0, 0))).toString());
	}

	@Test
	void testSortAsc() {
		Stage4.sortAsc(null); //NullPointerException check
		Stage4.sortAsc(empty);
		assertEquals("[]", empty.toString());
		Stage4.sortAsc(singleItemList);
		assertEquals("[-7]", singleItemList.toString());
		Stage4.sortAsc(tenMultiples);
		assertEquals("[10, 20, 70, 90]", tenMultiples.toString());
		Stage4.sortAsc(nonNegsShort);
		assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", nonNegsShort.toString());
		Stage4.sortAsc(nonNegsLong);
		assertEquals("[0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5]", nonNegsLong.toString());
		Stage4.sortAsc(positives);
		assertEquals("[2, 3, 5, 6, 10]", positives.toString());
		Stage4.sortAsc(mixed);
		assertEquals("[-2, -1, 0, 1, 2, 3, 5, 10, 12]", mixed.toString());
		Stage4.sortAsc(allZeroes);
		assertEquals("[0, 0, 0, 0, 0]", allZeroes.toString());
	}

	@Test
	void testSortDesc() {
		Stage4.sortDesc(null); //NullPointerException check
		Stage4.sortDesc(empty);
		assertEquals("[]", empty.toString());
		Stage4.sortDesc(singleItemList);
		assertEquals("[-7]", singleItemList.toString());
		Stage4.sortDesc(tenMultiples);
		assertEquals("[90, 70, 20, 10]", tenMultiples.toString());
		Stage4.sortDesc(nonNegsShort);
		assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]", nonNegsShort.toString());
		Stage4.sortDesc(nonNegsLong);
		assertEquals("[5, 4, 4, 3, 3, 3, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0]", nonNegsLong.toString());
		Stage4.sortDesc(positives);
		assertEquals("[10, 6, 5, 3, 2]", positives.toString());
		Stage4.sortDesc(mixed);
		assertEquals("[12, 10, 5, 3, 2, 1, 0, -1, -2]", mixed.toString());
		Stage4.sortDesc(allZeroes);
		assertEquals("[0, 0, 0, 0, 0]", allZeroes.toString());
	}

	@Test
	void testSort() {
		Stage4.sort(null, true); //NullPointerException check
		Stage4.sort(null, false); //NullPointerException check
		Stage4.sort(empty, true);
		assertEquals(0, empty.size());
		Stage4.sort(singleItemList, false);
		assertEquals("[-7]", singleItemList.toString());
		Stage4.sort(tenMultiples, true);
		assertEquals("[10, 20, 70, 90]", tenMultiples.toString());
		Stage4.sort(nonNegsShort, false);
		assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]", nonNegsShort.toString());
		Stage4.sort(nonNegsLong, true);
		assertEquals("[0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5]", nonNegsLong.toString());
		Stage4.sort(positives, false);
		assertEquals("[10, 6, 5, 3, 2]", positives.toString());
		Stage4.sort(mixed, true);
		assertEquals("[-2, -1, 0, 1, 2, 3, 5, 10, 12]", mixed.toString());
		Stage4.sort(allZeroes, false);
		assertEquals("[0, 0, 0, 0, 0]", allZeroes.toString());
	}

	@Test
	void testSortIfNeeded() {
		Stage4.sortIfNeeded(null, true); //NullPointerException check
		Stage4.sortIfNeeded(null, false); //NullPointerException check
		Stage4.sortIfNeeded(empty, true);
		assertEquals(0, empty.size());
		Stage4.sortIfNeeded(singleItemList, false);
		assertEquals("[-7]", singleItemList.toString());
		Stage4.sortIfNeeded(tenMultiples, true);
		assertEquals("[10, 20, 70, 90]", tenMultiples.toString());
		Stage4.sortIfNeeded(nonNegsShort, false);
		assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]", nonNegsShort.toString());
		Stage4.sortIfNeeded(nonNegsLong, true);
		assertEquals("[0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5]", nonNegsLong.toString());
		Stage4.sortIfNeeded(positives, false);
		assertEquals("[10, 6, 5, 3, 2]", positives.toString());
		Stage4.sortIfNeeded(mixed, true);
		assertEquals("[-2, -1, 0, 1, 2, 3, 5, 10, 12]", mixed.toString());
		Stage4.sortIfNeeded(allZeroes, false);
		assertEquals("[0, 0, 0, 0, 0]", allZeroes.toString());

		ArrayList<Integer> buggy1 = new ArrayList<Integer>(Arrays.asList(4, 7, 13, 28));
		Stage4.sortIfNeeded(buggy1, false);
		assertNotEquals("[28, 13, 7, 4]", buggy1.toString());
		assertEquals("[4, 7, 13, 28]", buggy1.toString());

		ArrayList<Integer> buggy2 = new ArrayList<Integer>(Arrays.asList(235, 96, 69, 35, 23));
		Stage4.sortIfNeeded(buggy2, true);
		assertNotEquals("[23, 35, 69, 96, 235]", buggy2.toString());
		assertEquals("[235, 96, 69, 35, 23]", buggy2.toString());
	}

	@Test
	void testReverseSort() {
		Stage4.reverseSort(null); //NullPointerException check
		Stage4.reverseSort(empty);
		assertEquals(0, empty.size());
		Stage4.reverseSort(singleItemList);
		assertEquals("[-7]", singleItemList.toString());
		Stage4.reverseSort(tenMultiples);
		assertNotEquals("[10, 20, 70, 90]", tenMultiples.toString());
		assertNotEquals("[90, 70, 20, 10]", tenMultiples.toString());
		assertEquals("[10, 70, 20, 90]", tenMultiples.toString());

		ArrayList<Integer> asc = new ArrayList<Integer>(Arrays.asList(23, 35, 69, 96, 235));
		Stage4.reverseSort(asc);
		assertEquals("[235, 96, 69, 35, 23]", asc.toString());

		ArrayList<Integer> desc = new ArrayList<Integer>(Arrays.asList(28, 13, 7, 4));
		Stage4.reverseSort(desc);
		assertEquals("[4, 7, 13, 28]", desc.toString());
	}

	@Test
	void testGetCommonItemsUnsorted() {
		assertNotNull(Stage4.getCommonItemsUnsorted(tenMultiples, nonNegsShort)); 
		assertEquals(0, Stage4.getCommonItemsUnsorted(tenMultiples, nonNegsShort).size()); //no items in common
		assertEquals("[0, 4, 2, 3, 5, 1]", Stage4.getCommonItemsUnsorted(nonNegsShort, nonNegsLong).toString()); //some items in common
		assertEquals("[10, 3, 5, 6, 2]", Stage4.getCommonItemsUnsorted(positives, positives).toString()); //all items in common
		assertEquals("[0]", Stage4.getCommonItemsUnsorted(mixed, allZeroes).toString()); //only 1 item in common
		assertEquals("[1, 1, 1, 0, 0]", Stage4.getCommonItemsUnsorted(new ArrayList<Integer> (Arrays.asList(2, 1, 0, 1, 0, 1, 1, 1, 3)), new ArrayList<Integer> (Arrays.asList(5, 0, 1, 1, 0, 0, 0, 0, 1, 6))).toString()); 
	}

	@Test
	void testNoCommonItems() {
		assertTrue(Stage4.noCommonItems(new ArrayList<ArrayList<Integer>>(Arrays.asList(empty, singleItemList))));
		assertTrue(Stage4.noCommonItems(new ArrayList<ArrayList<Integer>>(Arrays.asList(tenMultiples, nonNegsShort))));
		assertFalse(Stage4.noCommonItems(new ArrayList<ArrayList<Integer>>(Arrays.asList(nonNegsLong, positives))));
		assertFalse(Stage4.noCommonItems(new ArrayList<ArrayList<Integer>>(Arrays.asList(mixed, allZeroes))));
		assertFalse(Stage4.noCommonItems(new ArrayList<ArrayList<Integer>>(Arrays.asList(tenMultiples, nonNegsShort, nonNegsLong))));
		assertFalse(Stage4.noCommonItems(new ArrayList<ArrayList<Integer>>(Arrays.asList(positives, mixed, allZeroes))));

		ArrayList<Integer> w = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		ArrayList<Integer> x = new ArrayList<Integer>(Arrays.asList(5,6,7,8));
		ArrayList<Integer> y = new ArrayList<Integer>(Arrays.asList(9,10,11,12));
		ArrayList<Integer> z = new ArrayList<Integer>(Arrays.asList(13,14,15,16));
		assertTrue(Stage4.noCommonItems(new ArrayList<ArrayList<Integer>>(Arrays.asList(w, x, y, z))));

		x = null;
		assertTrue(Stage4.noCommonItems(new ArrayList<ArrayList<Integer>>(Arrays.asList(w, x, y, z)))); 

		z.set(3, 10);
		assertFalse(Stage4.noCommonItems(new ArrayList<ArrayList<Integer>>(Arrays.asList(w, x, y, z)))); //because y and z have 10 in common
	}

	@Test
	void testLongestMirroredSequence() {
		assertNotNull(Stage4.longestMirroredSequence(singleItemList));
		assertEquals("[-7]", Stage4.longestMirroredSequence(singleItemList).toString());
		assertEquals("[20, 30, 40]", Stage4.longestMirroredSequence(new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 20, 10, 40, 30, 20, 50, 40))).toString());
		assertEquals("[1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1]", Stage4.longestMirroredSequence(new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,1,2,1,2))).toString());
		assertEquals("[1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1]", Stage4.longestMirroredSequence(new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2,1,2,1,2,1))).toString());
		assertEquals("[5]", Stage4.longestMirroredSequence(new ArrayList<Integer>(Arrays.asList(5,6,7,8,9))).toString());
		assertEquals("[6, 7, 5, 7, 6]", Stage4.longestMirroredSequence(new ArrayList<Integer>(Arrays.asList(5,6,7,5,7,6,8,5,6,9))).toString());
		assertEquals("[10]", Stage4.longestMirroredSequence(tenMultiples).toString());
	}

	@Test
	void testGetSet() {
		assertNotNull(Stage4.getSet(singleItemList));
		assertEquals("[-7]", Stage4.getSet(singleItemList).toString());
		assertNotNull(Stage4.getSet(nonNegsLong));
		assertEquals("[0, 1, 2, 3, 4, 5]", Stage4.getSet(nonNegsLong).toString());
		assertNotNull(Stage4.getSet(nonNegsShort));
		assertEquals("[0, 4, 2, 3, 5, 1, 6, 9, 7, 8]", Stage4.getSet(nonNegsShort).toString());
	}
	
	@Test
	void testBestTotalSubLists() {
		ArrayList<Integer> data = new ArrayList<Integer>(Arrays.asList(6,4,6,1,1,1,1,1,1,1,3,1,2,5,6,5,1,1,3,2,1,1,4,4,4,4,4,4,4,4,4,1,1,1,1,1,1,1,1,1,10,4,2));
		ArrayList<ArrayList<Integer>> result = Stage4.bestTotalSubLists(data, 3);
		System.out.println(result);
		assertEquals(3, result.size());
		assertEquals("[[6, 4, 6], [5, 6, 5], [10, 4, 2]]" , result.toString());
		result = Stage4.bestTotalSubLists(data, 8);
		assertEquals(2, result.size());
		assertEquals("[[4, 4, 4, 4, 4, 4, 4, 4], [4, 4, 4, 4, 4, 4, 4, 4]]" , result.toString());
	}
}
