package practicePackage.recursion.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practicePackage.recursion.attempts.Stage3;

class Stage3Test {

	@Test
	void testReverse() {
		assertNull(Stage3.reverse(null));

		assertNotNull(Stage3.reverse(""));
		assertEquals("", Stage3.reverse(""));

		assertNotNull(Stage3.reverse("super"));
		assertEquals("repus", Stage3.reverse("super"));
	}

	@Test
	void testIsPalindrome() {
		assertFalse(Stage3.isPalindrome(null));
		assertTrue(Stage3.isPalindrome(""));
		assertTrue(Stage3.isPalindrome("a"));
		assertTrue(Stage3.isPalindrome("aa"));
		assertTrue(Stage3.isPalindrome("!madam!"));

		assertFalse(Stage3.isPalindrome("ab"));
		assertFalse(Stage3.isPalindrome("!madam! !!madam!"));
	}

	@Test
	void testPowerV2() {
		assertEquals(4, Stage3.powerV2(2, 2));	
		assertEquals(4, Stage3.powerV2(-2, 2));	
		assertEquals(8, Stage3.powerV2(2, 3));	
		assertEquals(-8, Stage3.powerV2(-2, 3));	
		assertEquals(1, Stage3.powerV2(4, 0));	
		assertEquals(6561, Stage3.powerV2(3, 8));	
		assertEquals(0.125, Stage3.powerV2(2, -3));
		assertEquals(-0.125, Stage3.powerV2(-2, -3));	
	}	
	
	@Test
	void testConvertIntInt() {
		assertEquals("0", Stage3.convert(0, 2));
		assertEquals("4", Stage3.convert(4, 9));
		assertEquals("1101", Stage3.convert(13, 2));
		assertEquals("201", Stage3.convert(19, 3));
		assertEquals("3561", Stage3.convert(1905, 8));
	}

	@Test
	void testReplaceAll() {
		assertNull(Stage3.replaceAll(null, "hi", "bye"));
		assertNotNull(Stage3.replaceAll("", "hi", "bye"));
		assertEquals("", Stage3.replaceAll("", "hi", "bye"));
		assertNotNull(Stage3.replaceAll("", "hi", "bye"));
		assertEquals("bye there, tbyes is byes bike", Stage3.replaceAll("hi there, this is his bike", "hi", "bye"));
		
		assertNotNull(Stage3.replaceAll("abchi", "hi",""));
		assertEquals("abc",Stage3.replaceAll("abchi", "hi",""));
	}

	@Test
	void testCountWeighted() {
		assertEquals(5, Stage3.countWeighted(888, 8));
		assertEquals(3, Stage3.countWeighted(88, 8));
		assertEquals(2, Stage3.countWeighted(808, 8));
		assertEquals(1, Stage3.countWeighted(8, 8));

		assertEquals(5, Stage3.countWeighted(707070707, 7));
		assertEquals(4, Stage3.countWeighted(707070707, 0));
		assertEquals(17, Stage3.countWeighted(777777777, 7));
	}

	@Test
	void testContainsStringString() {
		assertTrue(Stage3.contains("man", "nma"));
		assertTrue(Stage3.contains("superman", "amen"));
		assertTrue(Stage3.contains("superman", ""));
		assertTrue(Stage3.contains("", ""));
		assertFalse(Stage3.contains("environmentally prudent scheme", "pool"));
		assertTrue(Stage3.contains("environmentally prudent scheme", "pedestrian"));
		assertFalse(Stage3.contains("environmentally prudent scheme", "xoxo"));
		assertFalse(Stage3.contains("environmentally prudent scheme", "scheme!"));
		assertFalse(Stage3.contains("environmentally prudent scheme", "Scheme")); //uppercase 'S'
	}

	@Test
	void testAreAnagrams() {
		assertTrue(Stage3.areAnagrams("man", "nam"));
		assertTrue(Stage3.areAnagrams("superman", "erspunma"));
		assertTrue(Stage3.areAnagrams("splendid", "didlepsn"));
		assertFalse(Stage3.areAnagrams("splendid", "indeed!!")); 
		assertFalse(Stage3.areAnagrams("splendid", "")); 
		assertFalse(Stage3.areAnagrams("", "splendid")); 
		assertFalse(Stage3.areAnagrams("splendid", "didlepdsn")); //extra character in s2
		assertFalse(Stage3.areAnagrams("spldendid", "didlepsn")); //extra character in s1
		assertFalse(Stage3.areAnagrams("splendid", "diplepsn")); //one set of different characters between s1 and s2
	}

	@Test
	void testGetMorse() {
		assertNull(Stage3.getMorse(null));

		assertNotNull(Stage3.getMorse(""));
		assertEquals("", Stage3.getMorse(""));

		assertNotNull(Stage3.getMorse("nice one"));
		assertEquals("-. .. -.-. . / --- -. . ", Stage3.getMorse("nice one"));

		assertNotNull(Stage3.getMorse("NICE ONE"));
		assertEquals("-. .. -.-. . / --- -. . ", Stage3.getMorse("NICE ONE"));
	}

	@Test
	void testEvaluatePolynomial() {
		assertEquals(273, Stage3.evaluatePolynomial(new int[]{3, 5, -7, 0, 0, 9}, 5, 2));
		assertEquals(12, Stage3.evaluatePolynomial(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 11, 1));
		assertEquals(4095, Stage3.evaluatePolynomial(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 11, 2));
		assertEquals(13, Stage3.evaluatePolynomial(new int[]{1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 3, 2));
		assertEquals(1093, Stage3.evaluatePolynomial(new int[]{1, 1, 1, 1, 1, 1, 1}, 6, 3));
	}
}
