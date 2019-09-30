package week05.practicePackage.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import week05.practicePackage.attempts.*;
import week05.practicePackage.attempts.intermediate.Time;

class TimeTest {
	private Time time1, time2;
	
	@BeforeEach
	public void setup() {
		time1 = new Time();
		time2 = new Time();
	}

	@Test
	void testTime() {
		time1 = new Time(-4, 60); //making sure you call the setter
		assertEquals(0, time1.hour);
		assertEquals(59, time1.minute);
	}

	@Test
	void testToString() {
		time1 = new Time(4, 7); 
		assertEquals("04:07", time1.toString());
		time1 = new Time(17, 9); 
		assertEquals("17:09", time1.toString());
		time1 = new Time(1, 29); 
		assertEquals("01:29", time1.toString());
	}

	@Test
	void testCompareTo() {
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
	void testShift() {
		//fail("Not yet implemented");
		time1 = new Time(12, 27);
		time2 = new Time(17, 53);
		assertNotNull(time1.shift(time2));
		assertEquals(0, time1.shift(time2).compareTo(new Time(6, 20)));
	}

	@Test
	void testToStringAMPM() {
		time1 = new Time(8, 3);
		assertEquals("08:03 AM", time1.toStringAMPM());
		
		time1 = new Time(16, 9);
		assertEquals("04:09 PM", time1.toStringAMPM());
	}
	
}
