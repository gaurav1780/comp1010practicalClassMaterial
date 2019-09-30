package week05.practicePackage.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import week05.practicePackage.attempts.basic.CarTrip;

class CarTripTest {
	CarTrip trip1, trip2, trip3, trip4;

	@BeforeEach
	void setup() {
		trip1 = new CarTrip(5, 4);
		trip2 = new CarTrip(6, 4.8);
		trip3 = new CarTrip(4.8, 2.1);
		trip4 = new CarTrip(5, 8.2);
	}

	@Test
	void testCarTrip() {
		assertEquals(5, trip1.distance, 0.01);
		assertEquals(4, trip1.time, 0.01);

		trip1 = new CarTrip(-2, 5.1);

		assertEquals(0, trip1.distance, 0.01);
		assertEquals(5.1, trip1.time, 0.01);

		trip1 = new CarTrip(1.4, -5.1);

		assertEquals(1.4, trip1.distance, 0.01);
		assertEquals(0, trip1.time, 0.01);
	}

	@Test
	void testAverageSpeed() {
		assertEquals(1.25, trip1.averageSpeed(), 0.01);
		assertEquals(1.25, trip2.averageSpeed(), 0.01);
		assertEquals(2.2857, trip3.averageSpeed(), 0.01);
	}

	@Test
	void testToString() {
		assertEquals("5.0 kms travelled in 4.0 hours", trip1.toString());
		assertEquals("6.0 kms travelled in 4.8 hours", trip2.toString());
		assertEquals("4.8 kms travelled in 2.1 hours", trip3.toString());
	}

	@Test
	void testCompareTo() {
		assertEquals(-1, trip1.compareTo(trip2));
		assertEquals(1, trip1.compareTo(trip3));
		assertEquals(0, trip1.compareTo(trip4));
	}

}
