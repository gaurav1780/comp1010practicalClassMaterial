package practicePackage.classesObjects.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.classesObjects.attempts.*;
import practicePackage.classesObjects.attempts.basic.Job;

class JobTest {
	private Job job1, job2;

	@BeforeEach
	void setup() {
		job1 = new Job();
		job2 = new Job();
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
	void testCompareTo() {
		job1 = new Job(24.5, 7.5); //salary is 183.75
		job2 = new Job(21.5, 9.5); //salary is 204.25
		assertEquals(-1, job1.compareTo(job2));
		assertEquals(1, job2.compareTo(job1));
		
		job2 = new Job(36.75, 5); //salary is 183.75
		assertEquals(0, job1.compareTo(job2));
	}

}
