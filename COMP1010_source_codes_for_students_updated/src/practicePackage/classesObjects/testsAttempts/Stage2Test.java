package practicePackage.classesObjects.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.classesObjects.attempts.Stage2.Fraction;
import practicePackage.classesObjects.attempts.Stage2.Time;

public class Stage2Test {
	public Time time1, time2;
	public Fraction fraction1, fraction2;
	
	@BeforeEach
	public void setup() {
		time1 = new Time();
		time2 = new Time();

		fraction1 = new Fraction();
		fraction2 = new Fraction();
	}

	@Test
	public void testFractionIntInt() {
		fraction1 = new Fraction(5, 0);
		assertEquals(5, fraction1.num);
		assertEquals(1, fraction1.den);
		fraction1 = new Fraction(12, -7);
		assertEquals(12, fraction1.num);
		assertEquals(-7, fraction1.den);
	}

	@Test
	public void testIsPositive() {
		//fail("Not yet implemented");
		fraction1 = new Fraction(12, 7);
		fraction2 = new Fraction(-3, -5);
		assertEquals(true, fraction1.isPositive());
		assertEquals(true, fraction2.isPositive());

		fraction1 = new Fraction(12, -7);
		fraction2 = new Fraction(-3, 5);
		assertEquals(false, fraction1.isPositive());
		assertEquals(false, fraction2.isPositive());
	}

	@Test
	public void testMultiply() {
		fraction1 = new Fraction(12, -7);
		fraction2 = new Fraction(-3, 5);
		Fraction c = fraction1.multiply(fraction2);
		assertNotNull(c);
		assertEquals(-36, c.num);
		assertEquals(-35, c.den);
	}

	@Test
	public void testGetSimplifiedForm() {
		fraction1 = new Fraction(-120, -64);
		fraction2 = fraction1.getSimplifiedForm();
		assertNotNull(fraction2);
		assertEquals(15, fraction2.num);
		assertEquals(8, fraction2.den);

		fraction1 = new Fraction(77, -140);
		fraction2 = fraction1.getSimplifiedForm();
		assertEquals(11, fraction2.num);
		assertEquals(-20, fraction2.den);
	}
	
		@Test
	public void testTime() {
		time1 = new Time(-4, 60); //making sure you call the setter
		assertEquals(0, time1.hour);
		assertEquals(59, time1.minute);
	}

	@Test
	public void testToStringTime() {
		time1 = new Time(4, 7); 
		assertEquals("04:07", time1.toString());
		time1 = new Time(17, 9); 
		assertEquals("17:09", time1.toString());
		time1 = new Time(1, 29); 
		assertEquals("01:29", time1.toString());
	}

	@Test
	public void testCompareTo() {
		time1 = new Time(4, 7); 
		time2 = new Time(4, 10); 
		assertEquals(1, time2.compareTo(time1));
		assertEquals(-1, time1.compareTo(time2));

		time2 = new Time(5, 6); 
		assertEquals(1, time2.compareTo(time1));
		assertEquals(-1, time1.compareTo(time2));

		time2 = new Time(15, 9); 
		assertEquals(1, time2.compareTo(time1));
		assertEquals(-1, time1.compareTo(time2));

		time2 = new Time(4, 7); 
		assertEquals(0, time2.compareTo(time1));
		assertEquals(0, time1.compareTo(time2));
	}

	@Test
	public void testShift() {
		//fail("Not yet implemented");
		time1 = new Time(12, 27);
		time2 = new Time(17, 53);
		assertNotNull(time1.shift(time2));
		assertEquals(0, time1.shift(time2).compareTo(new Time(6, 20)));
	}

	@Test
	public void testToStringAMPM() {
		time1 = new Time(8, 3);
		assertEquals("08:03 AM", time1.toStringAMPM());
		
		time1 = new Time(16, 9);
		assertEquals("04:09 PM", time1.toStringAMPM());
	}

}
