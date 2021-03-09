package samplePracExams.pracExam2;

/*****************************
*                           *

* DO NOT MODIFY THIS FILE   *
*						 	 *
*****************************/

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;
import org.junit.rules.*;
import java.lang.reflect.*;

public class AllInOneTest {
  public static String currentMethodName = null;
  public static int score = 0;
  public static String result = "";

  @Before
  public void beforeEachTest() {
    currentMethodName = null;
  }
  
  @SuppressWarnings("deprecation")
  @Rule
  public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="Printout(double, double)", marks=10)
	public void testPrintoutDoubleDouble() {
		Printout b = new Printout(1.2, 2.5);
		assertEquals(1.2, b.height, 0.01);
		assertEquals(2.5, b.width, 0.01);

		b = new Printout(-1.5, -2.1);
		assertEquals(1.5, b.height, 0.01);
		assertEquals(2.1, b.width, 0.01);

		b = new Printout(1.2, -2.4);
		assertEquals(1.2, b.height, 0.01);
		assertEquals(2.4, b.width, 0.01);

		b = new Printout(-1.1, 2.5);
		assertEquals(1.1, b.height, 0.01);
		assertEquals(2.5, b.width, 0.01);

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}



	@Test @Graded(description="Job::getSalary()", marks=10)
	public void testJobGetSalary() {
		Job j = new Job(20, 5);
		assertEquals(100, j.getSalary(), 0.01);

		j = new Job(24.5, 1);
		assertEquals(24.5, j.getSalary(), 0.01);

		j = new Job(24.5, 5);
		assertEquals(122.5, j.getSalary(), 0.01);

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
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

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="containsPositive(int[])", marks=10)
	public void testContainsPositive() {
		int[] a = {-4,-3,-2,-1};
		assertFalse(Question3.containsPositive(a));

		int[] b = {5,-6,-7,-8};
		assertTrue(Question3.containsPositive(b));

		int[] c = {-7,-9,6};
		assertTrue(Question3.containsPositive(c));

		int[] d = {-7,-9,0};
		assertFalse(Question3.containsPositive(d));

		int[] e = {0,-7,-9};
		assertFalse(Question3.containsPositive(e));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="indexOfHigherThan(int[], int)", marks=10)
	public void testIndexOfHigherThan() {
		assertEquals(-1, Question4.indexOfHigherThan(null, 0));

		int[] a = {1,7,2,9};
		assertEquals(3, Question4.indexOfHigherThan(a, 8));
		assertEquals(1, Question4.indexOfHigherThan(a, 1));
		assertEquals(0, Question4.indexOfHigherThan(a, -1));
		assertEquals(-1, Question4.indexOfHigherThan(a, 9));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="sumBetweenRecursive(int, int)", marks=10)
	public void testSumBetweenRecursive() {
		assertEquals(0, Question5.sumBetweenRecursive(6, 5)); //because 6 > 5
		assertEquals(-8, Question5.sumBetweenRecursive(-8, -8)); //only number -8
		assertEquals(26, Question5.sumBetweenRecursive(5, 8)); //5+6+7+8 = 26

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="countConsonantsRecursive(String)", marks=10)
	public void testCountConsonantsRecursive() {
		assertEquals(3, Question6.countConsonantsRecursive("super"));
		assertEquals(5, Question6.countConsonantsRecursive("SHYly"));
		assertEquals(0, Question6.countConsonantsRecursive("AEIOU 123"));
		assertEquals(0, Question6.countConsonantsRecursive(""));
		assertEquals(0, Question6.countConsonantsRecursive("A"));
		assertEquals(1, Question6.countConsonantsRecursive("G"));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="countBefore(Time[], Time)", marks=10)
	public void testCountBeforeTime() {
		Time target = new Time(10, 20);
		assertEquals(0, Question7.countBefore(null, target)); //should not raise NullPointerException

		Time[] a = new Time[5];
		a[0] = new Time(10, 20);
		a[1] = new Time(10, 50);
		a[2] = new Time(11, 20);
		a[3] = new Time(11, 50);
		a[4] = new Time(12, 20);

		target = new Time(12, 30);
		assertEquals(5, Question7.countBefore(a, target));

		target = new Time(10, 30);
		assertEquals(1, Question7.countBefore(a, target));

		target = new Time(9, 30);
		assertEquals(0, Question7.countBefore(a, target));

		target = new Time(10, 20); //BEFORE 10:20
		assertEquals(0, Question7.countBefore(a, target));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="longestChainAddingUpToEven(int[])", marks=10)
	public void testLongestChainAddingUpToEven() {
		int[] a = {1,2,1,3,4,8}; //longest chain is 2,1,3,4,8 (length 5)
		assertEquals(5, Question8.longestChainAddingUpToEven(a));

		int[] b = {1,2,1,2,1,2,1,2}; //longest chain is 1,2,1,2,1,2,1,2 (length 8)
		assertEquals(8, Question8.longestChainAddingUpToEven(b));

		int[] c = {12}; //longest chain is 12 (length 1)
		assertEquals(1, Question8.longestChainAddingUpToEven(c));

		int[] d = {17}; //no chain adding up to even
		assertEquals(0, Question8.longestChainAddingUpToEven(d));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="addUpToNoAdjacentRecursive(int[], int, int)", marks=10)
	public void testAddUpToNoAdjacentRecursive() {
		assertFalse(Question9.addUpToNoAdjacentRecursive(new int[]{2,3}, 5, 0));
		//cannot select both 2 and 3

		assertTrue(Question9.addUpToNoAdjacentRecursive(new int[]{2,3,8}, 10, 0));
		//2+8=10

		assertFalse(Question9.addUpToNoAdjacentRecursive(new int[]{2,3}, 5, 1));
		//no values starting at index 1 add up to 5

		assertTrue(Question9.addUpToNoAdjacentRecursive(new int[]{5,1,8,4}, 13, 0));
		//5+8 = 13

		assertTrue(Question9.addUpToNoAdjacentRecursive(new int[]{-2,1,6,-3,1,15}, 10, 0));
		//-2+-3+15 = 10

		assertTrue(Question9.addUpToNoAdjacentRecursive(new int[]{1,2,3,4,5,-5,-4,-3,-2,-1}, 0, 0));
		//1+-1=0

		assertFalse(Question9.addUpToNoAdjacentRecursive(new int[]{1,2,3,4,5,-5,-4,-3,-2,-1}, 15, 0));
		//cannot select 1,2,3,4,5 together

		assertFalse(Question9.addUpToNoAdjacentRecursive(new int[]{10,2,8,2}, 10, 1));
		//10 cannot be counted (at index 0), cannot select 2 and 8 or 8 and 2 together.

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}



	@After
	public void logSuccess() throws NoSuchMethodException, SecurityException {
		if(currentMethodName != null) {
			Method method = getClass().getMethod(currentMethodName);
			Graded graded = method.getAnnotation(Graded.class);
			score+=graded.marks();
			result+=graded.description()+" passed. Marks awarded: "+graded.marks()+"\n";
		}
	}

	@AfterClass
	public static void wrapUp() throws IOException {
	System.out.println("Score = "+score);
		System.out.println(result);
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
		File file = new File("report"+timeStamp+".txt");
		FileWriter writer = new FileWriter(file);
		writer.write("Score = "+score+"\n");
		writer.write(result+"\n");
		writer.flush();
		writer.close();
	}
}
