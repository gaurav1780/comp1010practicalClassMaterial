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
public class Question6 { //begin class 
	/**
	* @param str
	* @return the number of consonants in the String passed.
	* the method isConsonant is already supplied.
	* IMPORTANT: must be solved recursively, that is by calling the method
	* itself in a way that it contributes to the final answer
	*/
	public static int countConsonantsRecursive(String str) {
	 return 0; //to be completed
	} //end of method (do not delete this closing bracket)

	//HELPER METHOD - DO NOT MODIFY
	public static boolean isConsonant(char ch) {
		if(!Character.isAlphabetic(ch))
			return false;
		String s = ch+"";
		return "AEIOU".indexOf(s.toUpperCase()) == -1;
	}
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="countConsonantsRecursive(String)", marks=10)
	public void testCountConsonantsRecursive() {
		assertEquals(3, Question6.countConsonantsRecursive("super"));
		assertEquals(5, Question6.countConsonantsRecursive("SHYly"));
		assertEquals(0, Question6.countConsonantsRecursive("AEIOU 123"));
		assertEquals(0, Question6.countConsonantsRecursive(""));
		assertEquals(0, Question6.countConsonantsRecursive("A"));
		assertEquals(1, Question6.countConsonantsRecursive("G"));

	}
} //end class (do not delete this closing bracket)
