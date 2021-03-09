package samplePracExams.pracExam1;

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
	@Test @Graded(description="higher(int,int)", marks=10)
	public void testHigher() {
		assertEquals(2, Question1.higher(2, -4));
		assertEquals(-4, Question1.higher(-4, -4));
		assertEquals(-5, Question1.higher(-8, -5));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="silverLining(int,int,int)", marks=10)
	public void testSilverLining() {
		assertTrue(Question2.silverLining(2, -4, 0));
		assertTrue(Question2.silverLining(-2, 4, 0));
		assertTrue(Question2.silverLining(-2, -4, 10));
		assertTrue(Question2.silverLining(2, 4, 0));
		assertTrue(Question2.silverLining(-2, 4, 10));
		assertTrue(Question2.silverLining(2, 4, 10));
		assertFalse(Question2.silverLining(-2, -4, -6));
		assertFalse(Question2.silverLining(-2, -4, 0));
		assertFalse(Question2.silverLining(0, 0, 0));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="sum(int)", marks=20)
	public void testSumInt() {
		assertEquals(1, Question3.sum(1));
		assertEquals(15, Question3.sum(5));
		assertEquals(28, Question3.sum(7));
		assertEquals(55, Question3.sum(10));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="sumOdd(int[])", marks=20)
	public void testSumOdd() {
		int[] a = {4,3,2,8};
		assertEquals(3, Question4.sumOdd(a));

		int[] b = {-5,6,7,8};
		assertEquals(2, Question4.sumOdd(b));

		int[] c = {4,8,-2};
		assertEquals(0, Question4.sumOdd(c));

		int[] f = {1,1,1,1,1,1,1,1,1};
		assertEquals(9, Question4.sumOdd(f));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();	
	}


	@Test @Graded(description="allPositives(int[])", marks=20)
	public void testAllPositives() {
		int[] a = {4,3,2,1};
		assertTrue(Question5.allPositives(a));

		int[] b = {-5,6,7,8};
		assertFalse(Question5.allPositives(b));

		int[] c = {7,9,-6};
		assertFalse(Question5.allPositives(c));

		int[] d = {7,9,0};
		assertFalse(Question5.allPositives(d));

		int[] e = {0,7,9};
		assertFalse(Question5.allPositives(e));

		int[] f = {1,1,1,1,1,1,1,1,1};
		Random r = new Random();
		f[r.nextInt(f.length)] = 0;
		assertFalse(Question5.allPositives(f));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="oneOfAKind(int[])", marks=10)
	public void testOneOfAKind() {
		int[] empty = {};
		assertTrue(Question6.oneOfAKind(empty)); //each item in an empty array IS one of a kind
		int[] a = {1,7,2,9};
		assertTrue(Question6.oneOfAKind(a));
		int[] b = {1,7,2,1};
		assertFalse(Question6.oneOfAKind(b));
		int[] c = {1,2,3,4,5,6,7,8,4,9};
		assertFalse(Question6.oneOfAKind(c));
		int[] d = {1,2,3,4,5,6,7,8,9,9};
		assertFalse(Question6.oneOfAKind(d));
		int[] e = {8};
		assertTrue(Question6.oneOfAKind(e));
		int[] f = {8,8,8};
		assertFalse(Question6.oneOfAKind(f));
		
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="longestRecurringSequence(int[])", marks=10)
	public void testlongestRecurringSequence() {
		int[] a = {1,7,2,9,3,8,7,2,9,8,7,1,7,2,3,8,7,2,9,6,1,1,5,9};
		int[] b = {3,8,7,2,9};
		assertNotNull(Question7.longestRecurringSequence(a));
		assertArrayEquals(b, Question7.longestRecurringSequence(a));

		a = new int[]{1,2,1,2,1,2,1,2,1,2,1,2};
		b = new int[]{1,2,1,2,1,2,1,2,1,2}; //occurs starting at index 0 and then again at index 2
		assertNotNull(Question7.longestRecurringSequence(a));
		assertArrayEquals(b, Question7.longestRecurringSequence(a));

		a = new int[]{5,6,7,8};
		b = new int[]{};
		assertNotNull(Question7.longestRecurringSequence(a));
		assertArrayEquals(b, Question7.longestRecurringSequence(a));

		a = new int[]{5,6,7,5,7,6,8,5,9};
		b = new int[]{5};
		assertNotNull(Question7.longestRecurringSequence(a));
		assertArrayEquals(b, Question7.longestRecurringSequence(a));

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
