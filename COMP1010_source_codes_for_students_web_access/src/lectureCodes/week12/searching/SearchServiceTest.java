package lectureCodes.week12.searching;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchServiceTest {

	@Test
	public void testGetPositives() {
		double[] a = {-1, 0, -3, 0};
		double[] result_a = SearchService.getPositives(a);
		//expected contents of result_a = {}
		assertEquals(0, result_a.length);
		
		double[] b = {-1, 20, -3, 10};
		double[] result_b = SearchService.getPositives(b);
		//expected contents of result_b = {20, 10}
		assertEquals(2, result_b.length);
		assertEquals(20, result_b[0], 0.01);
		assertEquals(10, result_b[1], 0.01);
	}

	@Test
	public void testCountPositives() {
		double[] a = {0, 0, 0};
		int result_a = SearchService.countPositives(a); 
		//expected value for result_a ? 0
		assertEquals(0, result_a);
		
		double[] b = {10, 20, 30};
		int result_b = SearchService.countPositives(b); 
		//expected value for result_b ? 3
		assertEquals(3, result_b);
		
		double[] c = {-10, -20, 30};
		int result_c = SearchService.countPositives(c); 
		//expected value for result_c ? 1
		assertEquals(1, result_c);
	}

}
