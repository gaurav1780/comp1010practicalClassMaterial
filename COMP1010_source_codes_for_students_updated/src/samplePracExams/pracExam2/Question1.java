package samplePracExams.pracExam2;

//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;
import org.junit.rules.*;
import java.lang.reflect.*;

 
//10 marks
class Printout {
	public double height, width;

	/**
	 * DEFAULT CONSTRUCTOR - DO NOT MODIFY!!!
	 */
	public Printout() {
		height = 1;
		width = 1;
	}

	/**
	* @param h: value to be copied into instance variable height
	 * @param w: value to be copied into instance variable width
	 * copy the "absolute" values of the parameters into the corresponding instance variables.
	 * for example,
	 * if h = 2.5, height should become 2.5
	 * if h = -1.4, height should become 1.4
	 * if w = 2.5, width should become 2.5
	 * if w = -1.4, width should become 1.4
	 */
	public Printout(double h, double w) {
		//to be completed
	}
} //end of class (do not delete this closing bracket)

//IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

public class Question1 { //begin TEST class 

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

	}
} //end TEST class Question1 (do not delete this closing bracket)
