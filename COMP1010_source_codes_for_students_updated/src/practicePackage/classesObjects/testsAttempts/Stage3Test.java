package practicePackage.classesObjects.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.classesObjects.attempts.Stage3.CoffeeTracker;

public class Stage3Test {
	public CoffeeTracker tracker;
	public int[] data;

	@BeforeEach
	public void setup() {
		data = new int[] {3, 0, 1, 0, 0, 0, 2, 0, 2, 3};
		tracker = new CoffeeTracker(data);
	}

	@Test
	public void testCoffeeTracker() {
		assertArrayEquals(data, tracker.coffeesPerDay);
		assertNotEquals(data, tracker.coffeesPerDay); //the two object should not refer to the same instance
	}

	@Test
	public void testCoffeesConsumed() {
		assertEquals(11, tracker.coffeesConsumed());
	}

	@Test
	public void testAverageCoffeesConsumed() {
		assertEquals(1.1, tracker.averageCoffeesConsumed(), 0.01);
	}

	@Test
	public void testCoffeeFreeDays() {
		assertEquals(5, tracker.coffeeFreeDays());
	}
}
