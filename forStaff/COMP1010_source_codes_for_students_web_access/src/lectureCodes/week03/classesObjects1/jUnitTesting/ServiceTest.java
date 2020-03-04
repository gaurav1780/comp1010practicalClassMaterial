package lectureCodes.week03.classesObjects1.jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceTest {
@Test
	public void testAllPositivesBuggy() {
		//create some sample arrays to test the method on
		double[] nullArray = null;
		assertFalse(Service.allPositivesBuggy(nullArray));
		double[] empty = {}; //expect true
		assertTrue(Service.allPositivesBuggy(empty));
		double[] a = {1.2, 0.2, 95.6}; //expect true
		double[] b = {-1.2, 0.2, 3.4, 95.6}; //expect false
		double[] c = {1.2, 0.2, 3.4, -95.6}; //expect false
		double[] d = {0, 0.2, 3.4, 95.6}; //expect false
		double[] e = {1.2, 0.2, 3.4, 0}; //expect false
		double[] f = {1.2, 0.2, 0, 3.4}; //expect false
		double[] g = {1.2, 0.2, -10, 3.4}; //expect false
		assertTrue(Service.allPositivesBuggy(a));
		assertFalse(Service.allPositivesBuggy(b)); //FIRST FAIL
		assertFalse(Service.allPositivesBuggy(c)); 
		assertFalse(Service.allPositivesBuggy(d)); 
		assertFalse(Service.allPositivesBuggy(e));
		assertFalse(Service.allPositivesBuggy(f));
		assertFalse(Service.allPositivesBuggy(g));
	}
	
	
	@Test
	public void testAllPositives() {
		//create some sample arrays to test the method on
		double[] nullArray = null;
		assertFalse(Service.allPositives(nullArray));
		double[] empty = {}; //expect true
		assertTrue(Service.allPositives(empty));
		double[] a = {1.2, 0.2, 3.4, 95.6}; //expect true
		double[] b = {-1.2, 0.2, 3.4, 95.6}; //expect false
		double[] c = {1.2, 0.2, 3.4, -95.6}; //expect false
		double[] d = {0, 0.2, 3.4, 95.6}; //expect false
		double[] e = {1.2, 0.2, 3.4, 0}; //expect false
		double[] f = {1.2, 0.2, 0, 3.4}; //expect false
		double[] g = {1.2, 0.2, -10, 3.4}; //expect false
		assertTrue(Service.allPositives(a));
		assertFalse(Service.allPositives(b));
		assertFalse(Service.allPositives(c));
		assertFalse(Service.allPositives(d));
		assertFalse(Service.allPositives(e));
		assertFalse(Service.allPositives(f));
		assertFalse(Service.allPositives(g));
	}

}
