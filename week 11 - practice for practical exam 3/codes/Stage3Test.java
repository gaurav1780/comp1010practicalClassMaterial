import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import recursionPracticeProject.Stage3;

class Stage3Test {

	@Test
	void testReverse() {
		assertNull(Stage3.reverse(null));

		assertNotNull(Stage3.reverse(""));
		assertEquals("", Stage3.reverse(""));

		assertNotNull(Stage3.reverse("super"));
		assertEquals("repus", Stage3.reverse("repus"));
	}

	@Test
	void testIsPalindrome() {
		fail("Not yet implemented");
	}

	@Test
	void testReplaceAll() {
		fail("Not yet implemented");
	}

	@Test
	void testCountWeighted() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMorse() {
		fail("Not yet implemented");
	}

}
