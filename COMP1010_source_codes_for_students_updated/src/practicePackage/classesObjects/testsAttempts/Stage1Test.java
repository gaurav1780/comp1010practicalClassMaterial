package practicePackage.classesObjects.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.classesObjects.attempts.Stage1.*;

public class Stage1Test {
	public CarTrip trip1, trip2, trip3, trip4;
	public Job job1, job2;

	@BeforeEach
	public void setup() {
		trip1 = new CarTrip(5, 4);
		trip2 = new CarTrip(6, 4.8);
		trip3 = new CarTrip(4.8, 2.1);
		trip4 = new CarTrip(5, 8.2);
	}

	@Test
	public void testCarTrip() {
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
	public void testAverageSpeed() {
		assertEquals(1.25, trip1.averageSpeed(), 0.01);
		assertEquals(1.25, trip2.averageSpeed(), 0.01);
		assertEquals(2.2857, trip3.averageSpeed(), 0.01);
	}

	@Test
	public void testToStringCarTrip() {
		assertEquals("5.0 kms travelled in 4.0 hours", trip1.toString());
		assertEquals("6.0 kms travelled in 4.8 hours", trip2.toString());
		assertEquals("4.8 kms travelled in 2.1 hours", trip3.toString());
	}

	@Test
	public void testCompareToCarTrip() {
		assertEquals(-1, trip1.compareTo(trip2));
		assertEquals(1, trip1.compareTo(trip3));
		assertEquals(0, trip1.compareTo(trip4));
	}

	@Test
	public void testJobDoubleDouble() {
		job1 = new Job(Job.MIN_HOURLY_RATE - 5, -2.5);
		assertEquals(Job.MIN_HOURLY_RATE, job1.hourlyRate);
		assertEquals(1, job1.numberOfHours);

		job1 = new Job(Job.MIN_HOURLY_RATE + 5, 4.5);
		assertEquals(Job.MIN_HOURLY_RATE + 5, job1.hourlyRate);
		assertEquals(4.5, job1.numberOfHours);

	}

	@Test
	public void testGetSalary() {
		job1 = new Job(24.5, 7.5);
		assertEquals(183.75, job1.getSalary());
	}

	@Test
	public void testCompareToJob() {
		job1 = new Job(24.5, 7.5); //salary is 183.75
		job2 = new Job(21.5, 9.5); //salary is 204.25
		assertEquals(-1, job1.compareTo(job2));
		assertEquals(1, job2.compareTo(job1));

		job2 = new Job(36.75, 5); //salary is 183.75
		assertEquals(0, job1.compareTo(job2));
	}
}
