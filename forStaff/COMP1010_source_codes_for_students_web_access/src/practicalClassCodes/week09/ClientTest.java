package practicalClassCodes.week09;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ClientTest {

	@Test
	void testAllEven() {
		assertFalse(Client.allEven(null)); //null check
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		assertTrue(Client.allEven(list));
		
		list.add(10);
		list.add(70);
		list.add(-20);
		list.add(0);
		
		assertTrue(Client.allEven(list));
		
		list.add(9);
		
		assertFalse(Client.allEven(list));
		
		list.remove(list.size()-1); //remove the 9 that was added
		assertTrue(Client.allEven(list));
		
		list.add(0, -9);
		assertFalse(Client.allEven(list));
		
		list.remove(0); //remove the -9 that was added
		assertTrue(Client.allEven(list));
		
		list.add(3, 17);
		assertFalse(Client.allEven(list));
	}
	
	@Test
	void testCountInRange() {
		int nullVal = Client.countInRange(null, 10, 20);
		assertEquals(0, nullVal); //null check
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		assertEquals(0, Client.countInRange(list, 10, 20));
		
		list.add(10);
		list.add(70);
		list.add(20);
		list.add(90);
		
		assertEquals(4, Client.countInRange(list, 10, 90));
		assertEquals(2, Client.countInRange(list, 15, 75));
		assertEquals(0, Client.countInRange(list, -60, 0));
		
		list.add(30);
		list.add(80);
		list.add(120);
		list.add(-60);
		assertEquals(8, Client.countInRange(list, -60, 120));
		assertEquals(8, Client.countInRange(list, -600, 1200));
		assertEquals(1, Client.countInRange(list, 100, 140));
		assertEquals(0, Client.countInRange(list, 130, 140));
		assertEquals(5, Client.countInRange(list, -100, 70));
	}
	
	@Test
	void testSquared() {
		Client.squared(null); //should not raise NullPointerException
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,0,7,-2,9));
		Client.squared(list);
		assertEquals("[1, 0, 49, 4, 81]", list.toString());
	}
	
	@Test
	void testRemoveNegatives() {
		Client.removeNegatives(null); //should not raise NullPointerException
		
		ArrayList<Integer> list;
		list = new ArrayList<Integer>(Arrays.asList(-5, -7, 6, 0, -5, -1, -8, 3, 0, 0, 2, -7, -3));
		Client.removeNegatives(list);
		assertEquals("[6, 0, 3, 0, 0, 2]", list.toString());
	}
	
	@Test
	void testGetExclusiveItems() {
		Client.getExclusiveItems(null); //should not raise NullPointerException
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		list.add(new ArrayList<Integer>(Arrays.asList(8, 1, 4, 2, 4, 2, 1)));
		list.add(new ArrayList<Integer>(Arrays.asList(6, 4, 9, 8, 8, 8)));
		list.add(new ArrayList<Integer>());
		list.add(null);
		list.add(new ArrayList<Integer>(Arrays.asList(5, 3, 8, 8, 5, 6)));
		ArrayList<Integer> excl = Client.getExclusiveItems(list);
		assertEquals("[1, 2, 2, 1, 9, 5, 3, 5]", excl.toString());
	}
}
