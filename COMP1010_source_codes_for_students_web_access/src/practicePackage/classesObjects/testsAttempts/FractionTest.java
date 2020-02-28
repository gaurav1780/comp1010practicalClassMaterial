package practicePackage.classesObjects.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.classesObjects.attempts.*;
import practicePackage.classesObjects.attempts.intermediate.Fraction;

class FractionTest {
	private Fraction fraction1, fraction2;

	@BeforeEach
	public void setup() {
		fraction1 = new Fraction();
		fraction2 = new Fraction();
	}

	@Test
	void testFractionIntInt() {
		fraction1 = new Fraction(5, 0);
		assertEquals(5, fraction1.num);
		assertEquals(1, fraction1.den);
		fraction1 = new Fraction(12, -7);
		assertEquals(12, fraction1.num);
		assertEquals(-7, fraction1.den);
	}

	@Test
	void testIsPositive() {
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
	void testMultiply() {
		fraction1 = new Fraction(12, -7);
		fraction2 = new Fraction(-3, 5);
		Fraction c = fraction1.multiply(fraction2);
		assertNotNull(c);
		assertEquals(-36, c.num);
		assertEquals(-35, c.den);
	}

	@Test
	void testGetSimplifiedForm() {
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
}
