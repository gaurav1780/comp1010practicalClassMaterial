package lectureCodes.week12.sorting;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SortServiceTest {

	@Test
	public void testSelectionSort() {
		int[] nullArray = null;
		SortService.selectionSort(nullArray); //SHOULD NOT RAISE NullPointerException
		
		int[] a = {1,7,2,9};
		SortService.selectionSort(a);
		assertEquals("[1, 2, 7, 9]", Arrays.toString(a));

		int[] b = {10, 8, 6, 4, 2, 0};
		SortService.selectionSort(b);
		assertEquals("[0, 2, 4, 6, 8, 10]", Arrays.toString(b));
		
		int[] c = {1, 3, 5, 7, 9};
		SortService.selectionSort(c);
		assertEquals("[1, 3, 5, 7, 9]", Arrays.toString(c));
}

	@Test
	public void testInsertionSortIntArray() {
		int[] nullArray = null;
		SortService.insertionSort(nullArray); //SHOULD NOT RAISE NullPointerException
		
		int[] a = {1,7,2,9};
		SortService.insertionSort(a);
		assertEquals("[1, 2, 7, 9]", Arrays.toString(a));

		int[] b = {10, 8, 6, 4, 2, 0};
		SortService.insertionSort(b);
		assertEquals("[0, 2, 4, 6, 8, 10]", Arrays.toString(b));
		
		int[] c = {1, 3, 5, 7, 9};
		SortService.insertionSort(c);
		assertEquals("[1, 3, 5, 7, 9]", Arrays.toString(c));
	}

	@Test
	public void testInsertionSortRectangleArray() {
		Rectangle r1 = new Rectangle(5, 10); //area 50
		Rectangle r2 = new Rectangle(10, 2); //area 20
		Rectangle r3 = new Rectangle(6, 5); //area 30
		Rectangle r4 = new Rectangle(1, 7); //area 7
		Rectangle r5 = new Rectangle(5, 3); //area 15
		Rectangle[] arr = new Rectangle[5];
		arr[0] = r1;
		arr[1] = r2;
		arr[2] = r3;
		arr[3] = r4;
		arr[4] = r5;
		SortService.insertionSort(arr);
		//should be (in terms of area): 7, 15, 20, 30, 50
		//or r4, r5, r2, r3, r1
		assertEquals(r4, arr[0]);
		assertEquals(r5, arr[1]);
		assertEquals(r2, arr[2]);
		assertEquals(r3, arr[3]);
		assertEquals(r1, arr[4]);
		
		assertEquals(7, arr[0].area(), 0.01);
		assertEquals(15, arr[1].area(), 0.01);
		assertEquals(20, arr[2].area(), 0.01);
		assertEquals(30, arr[3].area(), 0.01);
		assertEquals(50, arr[4].area(), 0.01);
	}
	
	@Test
	public void testInsertionSortBasedOnNumberOfDivisors() {
		int[] a = {12, 25, 7, 15, 11};
		SortService.insertionSortBasedOnNumberOfDivisors(a);
		assertEquals(7, a[0]); //2 divisors
		assertEquals(11, a[1]); //2 divisors
		assertEquals(25, a[2]); //3 divisors
		assertEquals(15, a[3]); //4 divisors
		assertEquals(12, a[4]); //6 divisors
		
	}

}
