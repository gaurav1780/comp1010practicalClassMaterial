package practicalClassCodes.week03;
import static org.junit.Assert.*;
import org.junit.*;

import java.io.*;
import java.text.*;
import java.util.*;

public class Question4b {
	/**
	 * return number of items in the array that belong
	 * to the range [min...max]
	 */
	public static int countInRange(int[] data, int min, int max) {
		int r = 0;
		for(int i=0; i < data.length; i++) {
			if(data[i] > min && data[i] < max) {
				r++;
			}
		}
		return r;
	}

	@Test
	public void testCountInRange() {
		int[] a = {10, 70, 20, 90, 30, 80};
		assertEquals(2, Question4b.countInRange(a, 25, 75));
		assertEquals(3, Question4b.countInRange(a, 15, 75));
		assertEquals(0, Question4b.countInRange(a, -100, -60));
		assertEquals(6, Question4b.countInRange(a, 0, 100));
		assertEquals(1, Question4b.countInRange(a, 85, 95));
	}
}
