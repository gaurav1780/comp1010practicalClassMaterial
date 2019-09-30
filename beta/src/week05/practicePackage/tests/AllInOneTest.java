package week05.practicePackage.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import week05.practicePackage.attempts.advanced.LargeInteger;
import week05.practicePackage.attempts.basic.CarTrip;
import week05.practicePackage.attempts.basic.Job;
import week05.practicePackage.attempts.classContainingArray.CoffeeTracker;
import week05.practicePackage.attempts.intermediate.Fraction;
import week05.practicePackage.attempts.intermediate.Time;

class AllInOneTest {
	CarTrip trip1, trip2, trip3, trip4;
	Job job1, job2;
	Time time1, time2;
	Fraction fraction1, fraction2;
	LargeInteger large1, large2;
	CoffeeTracker tracker;
	int[] data;

	@BeforeEach
	void setup() {
		trip1 = new CarTrip(5, 4);
		trip2 = new CarTrip(6, 4.8);
		trip3 = new CarTrip(4.8, 2.1);
		trip4 = new CarTrip(5, 8.2);

		job1 = new Job();
		job2 = new Job();

		time1 = new Time();
		time2 = new Time();

		fraction1 = new Fraction();
		fraction2 = new Fraction();

		large1 = new LargeInteger();
		large2 = new LargeInteger();

		data = new int[] {3, 0, 1, 0, 0, 0, 2, 0, 2, 3};
		tracker = new CoffeeTracker(data);
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
	void testToStringCarTrip() {
		assertEquals("5.0 kms travelled in 4.0 hours", trip1.toString());
		assertEquals("6.0 kms travelled in 4.8 hours", trip2.toString());
		assertEquals("4.8 kms travelled in 2.1 hours", trip3.toString());
	}

	@Test
	void testCompareToCarTrip() {
		assertEquals(-1, trip1.compareTo(trip2));
		assertEquals(1, trip1.compareTo(trip3));
		assertEquals(0, trip1.compareTo(trip4));
	}

	@Test
	void testJobDoubleDouble() {
		job1 = new Job(Job.MIN_HOURLY_RATE - 5, -2.5);
		assertEquals(Job.MIN_HOURLY_RATE, job1.hourlyRate);
		assertEquals(1, job1.numberOfHours);

		job1 = new Job(Job.MIN_HOURLY_RATE + 5, 4.5);
		assertEquals(Job.MIN_HOURLY_RATE + 5, job1.hourlyRate);
		assertEquals(4.5, job1.numberOfHours);

	}

	@Test
	void testGetSalary() {
		job1 = new Job(24.5, 7.5);
		assertEquals(183.75, job1.getSalary());
	}

	@Test
	void testCompareToJob() {
		job1 = new Job(24.5, 7.5); //salary is 183.75
		job2 = new Job(21.5, 9.5); //salary is 204.25
		assertEquals(-1, job1.compareTo(job2));
		assertEquals(1, job2.compareTo(job1));

		job2 = new Job(36.75, 5); //salary is 183.75
		assertEquals(0, job1.compareTo(job2));
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
	
		@Test
	void testTime() {
		time1 = new Time(-4, 60); //making sure you call the setter
		assertEquals(0, time1.hour);
		assertEquals(59, time1.minute);
	}

	@Test
	void testToStringTime() {
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

	@Test
	public void testSetValue() {
		large1.setValue("12345");
		assertEquals("12345", large1.value);

		large2.setValue("123a");
		assertEquals("0", large2.value);
	}

	@Test
	public void testNDigits() {
		large1.setValue("1729");
		assertEquals(4, large1.nDigits());

		large2.setValue("-37");
		assertEquals(2, large2.nDigits());
	}

	@Test
	public void testGetLastDigit() {
		large1.setValue("1729");
		assertEquals(9, large1.getLastDigit());

		large2.setValue("-37");
		assertEquals(7, large2.getLastDigit());
	}

	@Test
	public void testGetFirstDigit() {
		large1.setValue("1729");
		assertEquals(1, large1.getFirstDigit());

		large2.setValue("-37");
		assertEquals(3, large2.getFirstDigit());
	}

	@Test
	public void testAdd() {
		large1.setValue("1729");
		large2.setValue("37");
		assertNotNull(large1.add(large2));
		assertEquals("1766", large1.add(large2).value);

		large1.setValue("-4436933645896356356345030546035064079435397193472924925434");
		large2.setValue("945379723853759365972659347623753");
		assertEquals("-4436933645896356356345029600655340225676031220813577301681", large1.add(large2).value);
	}

	@Test
	void testCoffeeTracker() {
		assertArrayEquals(data, tracker.coffeesPerDay);
		assertNotEquals(data, tracker.coffeesPerDay); //the two object should not refer to the same instance
	}

	@Test
	void testCoffeesConsumed() {
		assertEquals(11, tracker.coffeesConsumed());
	}

	@Test
	void testAverageCoffeesConsumed() {
		assertEquals(1.1, tracker.averageCoffeesConsumed(), 0.01);
	}

	@Test
	void testCoffeeFreeDays() {
		assertEquals(5, tracker.coffeeFreeDays());
	}
}
