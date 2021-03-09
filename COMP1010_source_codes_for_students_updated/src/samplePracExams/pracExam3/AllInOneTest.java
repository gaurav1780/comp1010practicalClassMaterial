package samplePracExams.pracExam3;

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
	@Test @Graded(description="testCountEvenArrayList(ArrayList<Integer>)", marks=10)
	public void testCountEvenArrayList() throws NoSuchMethodException, SecurityException {
		assertEquals(0, Question1.countEven(null));

		ArrayList<Integer> emptyList = new ArrayList<Integer>();
		assertEquals(0, Question1.countEven(emptyList));

		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(6, 0, 5, -7, -10));
		assertEquals(3, Question1.countEven(list1)); //3 values (6, 0 and -10) are even

		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(0, -2, 2, 4, -4));
		assertEquals(5, Question1.countEven(list2)); //all 5 values are even

		ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1, -1, 3, -3));
		assertEquals(0, Question1.countEven(list3)); //none of the values are even

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="containsDigitRecursive(int, int)", marks=10)
	public void testContainsDigitRecursive() throws NoSuchMethodException, SecurityException {
		assertTrue(Question2.containsDigitRecursive(1729, 1));
		assertTrue(Question2.containsDigitRecursive(1729, 7));
		assertTrue(Question2.containsDigitRecursive(1729, 2));
		assertTrue(Question2.containsDigitRecursive(1729, 9));
		assertFalse(Question2.containsDigitRecursive(1729, 0));
		assertFalse(Question2.containsDigitRecursive(1729, 3));
		assertFalse(Question2.containsDigitRecursive(1729, 4));
		assertFalse(Question2.containsDigitRecursive(1729, 5));
		assertFalse(Question2.containsDigitRecursive(1729, 6));
		assertFalse(Question2.containsDigitRecursive(1729, 8));
		assertTrue(Question2.containsDigitRecursive(8999999, 8));
		assertTrue(Question2.containsDigitRecursive(899999, 8));
		assertTrue(Question2.containsDigitRecursive(89999, 8));
		assertFalse(Question2.containsDigitRecursive(8999999, 7));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="sumNotOnBoundaries(ArrayList<Integer>)", marks=10)
	public void testsumNotOnBoundariesArrayList() throws NoSuchMethodException, SecurityException {
		assertEquals(0, Question3.sumNotOnBoundaries(null)); //null list check
		ArrayList<Integer> list = new ArrayList<Integer>();
		assertEquals(0, Question3.sumNotOnBoundaries(list)); //empty list check

		list.add(20);
		assertEquals(0, Question3.sumNotOnBoundaries(list));
		list.add(30);
		assertEquals(0, Question3.sumNotOnBoundaries(list));

		list.add(60);
		assertEquals(30, Question3.sumNotOnBoundaries(list));

		list.add(10);
		list.add(50);
		list.add(30);
		assertEquals(150, Question3.sumNotOnBoundaries(list));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="reverseRecursive(String)", marks=10)
	public void testReverseRecursiveString() throws NoSuchMethodException, SecurityException {
		assertEquals("aliov", Question4.reverseRecursive("voila"));
		assertEquals("c", Question4.reverseRecursive("c"));
		assertEquals("", Question4.reverseRecursive(""));
		assertEquals("!aliov", Question4.reverseRecursive("voila!"));
		assertEquals("the fantastic mr. fox", Question4.reverseRecursive("xof .rm citsatnaf eht"));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="removeNegatives(ArrayList<Integer>)", marks=10)
	public void testRemoveNegativesArrayList() throws NoSuchMethodException, SecurityException {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(-5);
		list.add(0);
		list.add(-7);
		list.add(3);
		list.add(-8);
		Question5.removeNegatives(list);
		assertEquals("[0, 3]", list.toString());


		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(-20);
		list2.add(-50);
		list2.add(7);
		list2.add(8);
		Question5.removeNegatives(list2);
		assertEquals("[5, 7, 8]", list2.toString());

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="MyArrayList:add(int,int)", marks=10)
	public void testMyArrayListAddIntInt() throws NoSuchMethodException, SecurityException {
		MyArrayList list = new MyArrayList(); //create list of default size (5)

		assertTrue(list.add(0, 20));
		assertFalse(list.isFull());
		assertTrue(list.get(0).compareTo(20)==0);
		assertNull(list.get(1)); //no item at index 1

		assertTrue(list.add(1, 70)); //insert 70 after 20
		assertFalse(list.isFull());
		assertTrue(list.get(0).compareTo(20)==0);
		assertTrue(list.get(1).compareTo(70)==0);
		assertNull(list.get(2)); //no item at index 2

		assertTrue(list.add(1, 90)); //insert 90 between 20 and 70
		assertFalse(list.isFull());
		assertTrue(list.get(0).compareTo(20)==0);
		assertTrue(list.get(1).compareTo(90)==0);
		assertTrue(list.get(2).compareTo(70)==0);
		assertNull(list.get(3)); //no item at index 3

		assertTrue(list.add(0, 30)); //insert 30 at the front
		assertFalse(list.isFull());
		assertTrue(list.get(0).compareTo(30)==0);
		assertTrue(list.get(1).compareTo(20)==0);
		assertTrue(list.get(2).compareTo(90)==0);
		assertTrue(list.get(3).compareTo(70)==0);
		assertNull(list.get(4)); //no item at index 4

		assertTrue(list.add(1, 60)); //insert 60 at index 1
		assertTrue(list.isFull()); //all 5 items are now occupied
		assertTrue(list.get(0).compareTo(30)==0);
		assertTrue(list.get(1).compareTo(60)==0);
		assertTrue(list.get(2).compareTo(20)==0);
		assertTrue(list.get(3).compareTo(90)==0);
		assertTrue(list.get(4).compareTo(70)==0);
		assertNull(list.get(5)); //no item at index 5

		//list is now full
		assertTrue(list.add(5, 80)); //insert 80 at index 5, causing list to "grow"
		assertFalse(list.isFull()); //should have grown
		assertTrue(list.get(0).compareTo(30)==0);
		assertTrue(list.get(1).compareTo(60)==0);
		assertTrue(list.get(2).compareTo(20)==0);
		assertTrue(list.get(3).compareTo(90)==0);
		assertTrue(list.get(4).compareTo(70)==0);
		assertTrue(list.get(5).compareTo(80)==0);
		assertNull(list.get(6)); //no item at index 6


		assertFalse(list.add(20, 7)); //invalid index
		assertFalse(list.add(20, -2)); //invalid index

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="MyLinkedList:countMoreThan(int)", marks=10)
	public void testMyLinkedListCountMoreThan() throws NoSuchMethodException, SecurityException {
		MyLinkedList list = new MyLinkedList();
		assertEquals(0, list.countMoreThan(10));

		list.add(50);
		list.add(60);
		list.add(-30);
		list.add(70);
		list.add(40); //[50, 60, -30, 70, 40]
		assertEquals(2, list.countMoreThan(55));//60 and 70
		assertEquals(5, list.countMoreThan(-100));//all the items
		assertEquals(0, list.countMoreThan(70));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="MyLinkedList:reverse()", marks=10)
	public void testMyLinkedListReverse() throws NoSuchMethodException, SecurityException {
		MyLinkedList list = new MyLinkedList();
		list.add(5);
		list.add(6);
		list.add(3);
		list.add(7); //[5, 6, 3, 7]
		list.reverse(); //should become [7, 3, 6, 5]
		assertEquals(4, list.size());
		assertEquals(7, (int)list.get(0));
		assertEquals(3, (int)list.get(1));
		assertEquals(6, (int)list.get(2));
		assertEquals(5, (int)list.get(3));
		list.add(9); //[7, 3, 6, 5, 9]
		list.reverse(); //should become [9, 5, 6, 3, 7]
		assertEquals(5, list.size());
		assertEquals(9, (int)list.get(0));
		assertEquals(5, (int)list.get(1));
		assertEquals(6, (int)list.get(2));
		assertEquals(3, (int)list.get(3));
		assertEquals(7, (int)list.get(4));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(marks=10, description="getLongestAscendingRun(List)")
	public void testGetLongestAscendingRunList() throws NoSuchMethodException, SecurityException {
		ArrayList<Integer> list = null;
		ArrayList<Integer> asc = Question8.getLongestAscendingRun(list);
		assertNull(asc);

		list = new ArrayList<Integer>();
		asc = Question8.getLongestAscendingRun(list);
		assertNull(asc);

		list.add(3);
		list.add(2);
		list.add(1);
		asc = Question8.getLongestAscendingRun(list);
		assertEquals("[3]", asc.toString());

		list.add(4);
		asc = Question8.getLongestAscendingRun(list);
		assertEquals("[1, 4]", asc.toString());

		list.add(2);
		list.add(0);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		asc = Question8.getLongestAscendingRun(list);
		assertEquals("[0, 5, 6, 7, 8]", asc.toString());

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();	
	}


	@Test @Graded(description="groupSum5Recursive(int, int[], int)", marks=10)
	public void testGroupSum5Recursive() throws NoSuchMethodException, SecurityException {
		int[] a = {2,5,10,4};
		assertTrue(Question9.groupSum5Recursive(0, a, 19));
		assertFalse(Question9.groupSum5Recursive(0, a, 12));

		int[] b = {3,5,1};
		assertTrue(Question9.groupSum5Recursive(0, b, 5));
		assertFalse(Question9.groupSum5Recursive(0, b, 9));

		int[] c = {5,1,25,4};
		assertTrue(Question9.groupSum5Recursive(0, c, 30));
		assertTrue(Question9.groupSum5Recursive(0, c, 34));
		assertFalse(Question9.groupSum5Recursive(0, c, 31));
		assertFalse(Question9.groupSum5Recursive(0, c, 29));

		int[] empty = {};
		assertTrue(Question9.groupSum5Recursive(0, empty, 0));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="indicesAddingUpto(ArrayList<Integer>, int, int)", marks=10)
	public void testIndicesAddingUpto() throws NoSuchMethodException, SecurityException {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(2,5,10,4));
		assertNotNull(Question10.indicesAddingUpto(a, 0, 11));
		assertEquals("[0, 1, 3]", Question10.indicesAddingUpto(a, 0, 11).toString());
		assertNull(Question10.indicesAddingUpto(a, 0, 8));

		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		assertNotNull(Question10.indicesAddingUpto(b, 0, 50));
		assertEquals("[0, 1, 2, 3, 5, 6, 7, 8, 9]", Question10.indicesAddingUpto(b, 0, 50).toString());
		assertNull(Question10.indicesAddingUpto(b, 0, 56));

		ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(1, 10, 2, 30, 3, 50, 4, 70, 5, 90, 6, 100));
		assertNotNull(Question10.indicesAddingUpto(c, 0, 21));
		assertEquals("[0, 1, 2, 4, 8]", Question10.indicesAddingUpto(c, 0, 21).toString());

		ArrayList<Integer> empty = new ArrayList<Integer>();
		assertNotNull(Question10.indicesAddingUpto(empty, 0, 0));
		assertEquals("[]", Question10.indicesAddingUpto(empty, 0, 0).toString());
		assertNull(Question10.indicesAddingUpto(empty, 0, 1));

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
