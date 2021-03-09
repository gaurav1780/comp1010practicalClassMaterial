package practicePackage.recursion.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.recursion.attempts.Stage3;

public class Stage3Test {
	protected Stage3 testObject;

	@BeforeEach
	public void run() {
		testObject = new Stage3();
	}
	
	@Test
	public void testReverse() {
		assertNull(testObject.reverse(null));

		assertNotNull(testObject.reverse(""));
		assertEquals("", testObject.reverse(""));

		assertNotNull(testObject.reverse("super"));
		assertEquals("repus", testObject.reverse("super"));
	}

	@Test
	public void testIsPalindrome() {
		assertFalse(testObject.isPalindrome(null));
		assertTrue(testObject.isPalindrome(""));
		assertTrue(testObject.isPalindrome("a"));
		assertTrue(testObject.isPalindrome("aa"));
		assertTrue(testObject.isPalindrome("!madam!"));

		assertFalse(testObject.isPalindrome("ab"));
		assertFalse(testObject.isPalindrome("!madam! !!madam!"));
	}

	@Test
	public void testPowerV2() {
		assertEquals(4, testObject.powerV2(2, 2));	
		assertEquals(4, testObject.powerV2(-2, 2));	
		assertEquals(8, testObject.powerV2(2, 3));	
		assertEquals(-8, testObject.powerV2(-2, 3));	
		assertEquals(1, testObject.powerV2(4, 0));	
		assertEquals(6561, testObject.powerV2(3, 8));	
		assertEquals(0.125, testObject.powerV2(2, -3));
		assertEquals(-0.125, testObject.powerV2(-2, -3));	
	}	
	
	@Test
	public void testConvertIntInt() {
		assertEquals("0", testObject.convert(0, 2));
		assertEquals("4", testObject.convert(4, 9));
		assertEquals("1101", testObject.convert(13, 2));
		assertEquals("201", testObject.convert(19, 3));
		assertEquals("3561", testObject.convert(1905, 8));
	}

	@Test
	public void testReplaceAll() {
		assertNull(testObject.replaceAll(null, "hi", "bye"));
		assertNotNull(testObject.replaceAll("", "hi", "bye"));
		assertEquals("", testObject.replaceAll("", "hi", "bye"));
		assertNotNull(testObject.replaceAll("", "hi", "bye"));
		assertEquals("bye there, tbyes is byes bike", testObject.replaceAll("hi there, this is his bike", "hi", "bye"));
		
		assertNotNull(testObject.replaceAll("abchi", "hi",""));
		assertEquals("abc",testObject.replaceAll("abchi", "hi",""));
	}

	@Test
	public void testCountWeighted() {
		assertEquals(5, testObject.countWeighted(888, 8));
		assertEquals(3, testObject.countWeighted(88, 8));
		assertEquals(2, testObject.countWeighted(808, 8));
		assertEquals(1, testObject.countWeighted(8, 8));

		assertEquals(5, testObject.countWeighted(707070707, 7));
		assertEquals(4, testObject.countWeighted(707070707, 0));
		assertEquals(17, testObject.countWeighted(777777777, 7));
	}

	@Test
	public void testContainsStringString() {
		assertTrue(testObject.contains("man", "nma"));
		assertTrue(testObject.contains("superman", "amen"));
		assertTrue(testObject.contains("superman", ""));
		assertTrue(testObject.contains("", ""));
		assertFalse(testObject.contains("environmentally prudent scheme", "pool"));
		assertTrue(testObject.contains("environmentally prudent scheme", "pedestrian"));
		assertFalse(testObject.contains("environmentally prudent scheme", "xoxo"));
		assertFalse(testObject.contains("environmentally prudent scheme", "scheme!"));
		assertFalse(testObject.contains("environmentally prudent scheme", "Scheme")); //uppercase 'S'
	}

	@Test
	public void testAreAnagrams() {
		assertTrue(testObject.areAnagrams("man", "nam"));
		assertTrue(testObject.areAnagrams("superman", "erspunma"));
		assertTrue(testObject.areAnagrams("splendid", "didlepsn"));
		assertFalse(testObject.areAnagrams("splendid", "indeed!!")); 
		assertFalse(testObject.areAnagrams("splendid", "")); 
		assertFalse(testObject.areAnagrams("", "splendid")); 
		assertFalse(testObject.areAnagrams("splendid", "didlepdsn")); //extra character in s2
		assertFalse(testObject.areAnagrams("spldendid", "didlepsn")); //extra character in s1
		assertFalse(testObject.areAnagrams("splendid", "diplepsn")); //one set of different characters between s1 and s2
	}

	@Test
	public void testGetMorse() {
		assertNull(testObject.getMorse(null));

		assertNotNull(testObject.getMorse(""));
		assertEquals("", testObject.getMorse(""));

		assertNotNull(testObject.getMorse("nice one"));
		assertEquals("-. .. -.-. . / --- -. . ", testObject.getMorse("nice one"));

		assertNotNull(testObject.getMorse("NICE ONE"));
		assertEquals("-. .. -.-. . / --- -. . ", testObject.getMorse("NICE ONE"));
	}

	@Test
	public void testEvaluatePolynomial() {
		assertEquals(273, testObject.evaluatePolynomial(new int[]{3, 5, -7, 0, 0, 9}, 5, 2));
		assertEquals(12, testObject.evaluatePolynomial(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 11, 1));
		assertEquals(4095, testObject.evaluatePolynomial(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 11, 2));
		assertEquals(13, testObject.evaluatePolynomial(new int[]{1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 3, 2));
		assertEquals(1093, testObject.evaluatePolynomial(new int[]{1, 1, 1, 1, 1, 1, 1}, 6, 3));
	}
}
