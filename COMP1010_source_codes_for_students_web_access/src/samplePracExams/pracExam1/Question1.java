package samplePracExams.pracExam1;

//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;
import org.junit.rules.*;
import java.lang.reflect.*;

 
//10 marks
public class Question1 { //begin class 
  /**
   * @param a
   * @param b
   * @return higher of the two values from a and b
   */
  public static int higher(int a, int b) {
  	return 0; // to be completed
  }
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="higher(int,int)", marks=10)
	public void testHigher() {
		assertEquals(2, Question1.higher(2, -4));
		assertEquals(-4, Question1.higher(-4, -4));
		assertEquals(-5, Question1.higher(-8, -5));

	}
} //end class (do not delete this closing bracket)
