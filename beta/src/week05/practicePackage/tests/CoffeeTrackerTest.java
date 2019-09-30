package week05.practicePackage.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import week05.practicePackage.attempts.classContainingArray.CoffeeTracker;

class CoffeeTrackerTest {
	CoffeeTracker tracker;
	int[] data;
	
	@BeforeEach
	void setup() {
		data = new int[] {3, 0, 1, 0, 0, 0, 2, 0, 2, 3};
		tracker = new CoffeeTracker(data);
	}
	
	@Test
	void testCoffeeTracker() {
		assertArrayEquals(data, tracker.coffeesPerDay);
		assertNotEquals(data, tracker.coffeesPerDay); //the two object should not refer to the same instance
	}

	@Test
	void testCoffeesConsumed() {
		assertEquals(11, tracker.coffeesConsumed());
	}

	@Test
	void testAverageCoffeesConsumed() {
		assertEquals(1.1, tracker.averageCoffeesConsumed(), 0.01);
	}

	@Test
	void testCoffeeFreeDays() {
		assertEquals(5, tracker.coffeeFreeDays());
	}

}
