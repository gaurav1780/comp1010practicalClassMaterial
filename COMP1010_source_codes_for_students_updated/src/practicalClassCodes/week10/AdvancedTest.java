package practicalClassCodes.week10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdvancedTest {		
	@Test
	void testGetUniqueValues() {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(10,70,20,90,20,70));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(90,20,30));
		ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(80,20));
		ArrayList<Integer> d = null;
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(60,60));
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(Arrays.asList(a,b,c,d,e));
		ArrayList<Integer> result = Advanced.getUniqueValues(list);
		assertNotNull(result);
		assertEquals("[10, 30, 80]", result.toString());

		list = new ArrayList<ArrayList<Integer>>(Arrays.asList(d,d,d)); //[null,null,null]
		result = Advanced.getUniqueValues(list);
		assertNotNull(result);
		assertEquals("[]", result.toString());

		list = null;
		result = Advanced.getUniqueValues(list);
		assertNull(result);

		a = new ArrayList<Integer>(Arrays.asList(10,10));
		b = new ArrayList<Integer>(Arrays.asList(20,20));
		c = new ArrayList<Integer>(Arrays.asList(30,30));
		list = new ArrayList<ArrayList<Integer>>(Arrays.asList(a,b,c));
		result = Advanced.getUniqueValues(list);
		assertNotNull(result);
		assertEquals("[]", result.toString());	

		a = new ArrayList<Integer>(Arrays.asList(10,20));
		b = new ArrayList<Integer>(Arrays.asList(20,30));
		c = new ArrayList<Integer>(Arrays.asList(30,10));
		list = new ArrayList<ArrayList<Integer>>(Arrays.asList(a,b,c));
		result = Advanced.getUniqueValues(list);
		assertNotNull(result);
		assertEquals("[]", result.toString());	
	}

	@Test
	void testGetItemsUniqueToSubLists() {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(10,70,20,90,20));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(90,30));
		ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(80,80,80));
		ArrayList<Integer> d = null;
		ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(30,60,60));
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(Arrays.asList(a,b,c,d,e));
		ArrayList<Integer> result = Advanced.getItemsUniqueToSubLists(list);
		assertNotNull(result);
		assertEquals("[10, 70, 20, 80, 60]", result.toString());

		list = new ArrayList<ArrayList<Integer>>(Arrays.asList(d,d,d)); //[null,null,null]
		result = Advanced.getItemsUniqueToSubLists(list);
		assertNotNull(result);
		assertEquals("[]", result.toString());

		list = null;
		result = Advanced.getItemsUniqueToSubLists(list);
		assertNull(result);

		a = new ArrayList<Integer>(Arrays.asList(10,10));
		b = new ArrayList<Integer>(Arrays.asList(20,20));
		c = new ArrayList<Integer>(Arrays.asList(30,30));
		list = new ArrayList<ArrayList<Integer>>(Arrays.asList(a,b,c));
		result = Advanced.getItemsUniqueToSubLists(list);
		assertNotNull(result);
		assertEquals("[10, 20, 30]", result.toString());	

		a = new ArrayList<Integer>(Arrays.asList(10,20));
		b = new ArrayList<Integer>(Arrays.asList(20,30));
		c = new ArrayList<Integer>(Arrays.asList(30,10));
		list = new ArrayList<ArrayList<Integer>>(Arrays.asList(a,b,c));
		result = Advanced.getItemsUniqueToSubLists(list);
		assertNotNull(result);
		assertEquals("[]", result.toString());	
	}

	@Test
	void testLongestRepeatingSequence() {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,70,20,90,20));
		assertNotNull(Advanced.longestRepeatingSequence(list));
		assertEquals("[20]", Advanced.longestRepeatingSequence(list).toString());

		list = null;
		assertNull(Advanced.longestRepeatingSequence(list));

		list = new ArrayList<Integer>(Arrays.asList(5,6,7,8));
		assertNotNull(Advanced.longestRepeatingSequence(list));
		assertEquals("[]", Advanced.longestRepeatingSequence(list).toString());

		list = new ArrayList<Integer>(Arrays.asList(10,70,20,90,60,10,70,20,90));
		assertNotNull(Advanced.longestRepeatingSequence(list));
		assertEquals("[10, 70, 20, 90]", Advanced.longestRepeatingSequence(list).toString());

		list = new ArrayList<Integer>(Arrays.asList(10,70,70,10));
		assertNotNull(Advanced.longestRepeatingSequence(list));
		assertEquals("[10]", Advanced.longestRepeatingSequence(list).toString());
		
		list = new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,1,2));
		assertNotNull(Advanced.longestRepeatingSequence(list));
		assertEquals("[1, 2, 1, 2, 1, 2]", Advanced.longestRepeatingSequence(list).toString());

	}

}
