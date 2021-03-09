package samplePracExams.pracExam3;

//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;
import org.junit.rules.*;
import java.lang.reflect.*;

 
//10 marks
public class Question4 { //begin class 
	/**
	 * 
	 * @param str: assume it's not null
	 * @return reverse of the string
	 * for example,
	 * if str = "hello", return "olleh"
	 * if str = "!", return "!"
	 * if str = "", return ""
	 * IMPLEMENTATION MUST BE RECURSIVE
	 * DO NOT CALL ANY OTHER METHOD (NO HELPERS ALLOWED)
 	 */
	public static String reverseRecursive(String str) {
		return ""; //to be completed
	}
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="reverseRecursive(String)", marks=10)
	public void testReverseRecursiveString() throws NoSuchMethodException, SecurityException {
		assertEquals("aliov", Question4.reverseRecursive("voila"));
		assertEquals("c", Question4.reverseRecursive("c"));
		assertEquals("", Question4.reverseRecursive(""));
		assertEquals("!aliov", Question4.reverseRecursive("voila!"));
		assertEquals("the fantastic mr. fox", Question4.reverseRecursive("xof .rm citsatnaf eht"));

	}
} //end class (do not delete this closing bracket)
