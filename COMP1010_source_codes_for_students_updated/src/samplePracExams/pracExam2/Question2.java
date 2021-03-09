package samplePracExams.pracExam2;

//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;
import org.junit.rules.*;
import java.lang.reflect.*;

 
//20 marks
class Job {
	public double hourlyRate, numberOfHours;

	/**
	 * IMPORTANT: DO NOT MODIFY!!!
	 * Parameterized Constructor: assigns parameters to corresponding instance variables
	 * @param h: value intended for hourlyRate
	 * @param n: value intended for numberOfHours
	 *
	 * assign the higher of h and 20 into the instance variable hourlyRate.
	 * assign the higher of n and 1 into the instance variable numberOfHours.
	 */
	public Job(double h, double n) {
		hourlyRate = Math.max(h, 20);
		numberOfHours = Math.max(n, 1);
	}

	/**
	 *
	 * @return the total salary offered by this job.
	 * example,
	 * if hourlyRate = 24
	 * and numberOfHours = 5
	 * return 120
	 */
	public double getSalary() {
		return 0; //to be completed
	}

	/**
	 *
	 * @param other
	 * @return
	 * 1 if hourlyRate of calling object is more than the hourlyRate of the parameter object
	 * -1 if hourlyRate of calling object is less than the hourlyRate of the parameter object
	 * 0 if hourlyRate of calling object is same as the hourlyRate of the parameter object
	 */
	public int compareTo(Job other) {
		return 0; //to be completed
	}
} //end of class (do not delete this closing bracket)

//IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

public class Question2 { //begin TEST class 

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));


	@Test @Graded(description="Job::getSalary()", marks=10)
	public void testJobGetSalary() {
		Job j = new Job(20, 5);
		assertEquals(100, j.getSalary(), 0.01);

		j = new Job(24.5, 1);
		assertEquals(24.5, j.getSalary(), 0.01);

		j = new Job(24.5, 5);
		assertEquals(122.5, j.getSalary(), 0.01);

	}

	@Test @Graded(description="Job::compareTo(Job)", marks=10)
	public void testJobCompareToJob() {
		Job j1 = new Job(21, 5); //hourlyRate = 21
		Job j2 = new Job(20, 3); //hourlyRate = 20
		Job j3 = new Job(21, 2); //hourlyRate = 21

		//NOTE: comparison is based on hourlyRate
		assertEquals(1, j1.compareTo(j2));
		assertEquals(-1, j2.compareTo(j3));
		assertEquals(0, j3.compareTo(j1));

	}
} //end TEST class Question2 (do not delete this closing bracket)
