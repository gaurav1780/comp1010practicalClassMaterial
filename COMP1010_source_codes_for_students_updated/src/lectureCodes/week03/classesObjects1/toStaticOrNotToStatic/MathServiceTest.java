package lectureCodes.week03.classesObjects1.toStaticOrNotToStatic;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathServiceTest {

	@Test
	public void testHigher() {
		int a = MathService.higher(5, 8);
		assertEquals(8, a);
		
		a = MathService.higher(15, 8);
		assertEquals(15, a);
		
		a = MathService.higher(10, 10);
		assertEquals(10, a);
	}

	@Test
	public void testPower() {
		double a = MathService.power(1.2, 3);
		assertEquals(1.728, a, 0.001); 
		a = MathService.power(-1.2, 3);
		assertEquals(-1.728, a, 0.001); 
		a = MathService.power(1.2, 2);
		assertEquals(1.44, a, 0.001); 
		a = MathService.power(-1.2, 2);
		assertEquals(1.44, a, 0.001); 
		a = MathService.power(1.2, -5);
		assertEquals(.4018, a, 0.001); 
	}

}
