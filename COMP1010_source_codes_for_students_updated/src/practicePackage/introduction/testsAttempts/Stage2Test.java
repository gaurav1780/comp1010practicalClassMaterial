package practicePackage.introduction.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.introduction.attempts.Stage2;

public class Stage2Test {
	protected practicePackage.introduction.attempts.Stage2 testObject;

	@BeforeEach
	public void run() {
		testObject = new practicePackage.introduction.attempts.Stage2();
	}
	
	@Test
	public void testTwoOutOfThree() {
		assertTrue(testObject.twoOutOfThree(1,1,10));
		assertTrue(testObject.twoOutOfThree(1,10,10));
		assertTrue(testObject.twoOutOfThree(10,25,10));
		assertTrue(testObject.twoOutOfThree(0,0,-1));
		assertTrue(testObject.twoOutOfThree(-5,-5,5));
		assertTrue(testObject.twoOutOfThree(100,100,-100));
		assertFalse(testObject.twoOutOfThree(1,2,3));
		assertFalse(testObject.twoOutOfThree(0,0,0));
		assertFalse(testObject.twoOutOfThree(10000,-20,0));
		assertFalse(testObject.twoOutOfThree(-300,-300,-300));
		assertFalse(testObject.twoOutOfThree(-101,-20,-300));
		assertFalse(testObject.twoOutOfThree(-100,-100,-100));
		assertFalse(testObject.twoOutOfThree(250,250,250));
	}
	
	@Test
	public void testLastDigit() {
		assertEquals(0,testObject.lastDigit(0));
		assertEquals(8,testObject.lastDigit(8));
		assertEquals(5,testObject.lastDigit(15));
		assertEquals(5,testObject.lastDigit(-15));
		assertEquals(7,testObject.lastDigit(-1000007));
		assertEquals(4,testObject.lastDigit(1000004));
		assertEquals(5,testObject.lastDigit(5555));
	}
	
	@Test
	public void testAverage() {
		assertEquals(5,testObject.average(0,10));
		assertEquals(-20,testObject.average(-10,-30));
		assertEquals(0,testObject.average(0,0));
		assertEquals(12.5,testObject.average(10,15));
		assertEquals(0,testObject.average(-20,20));
		assertEquals(7.5,testObject.average(-5,20));
		assertEquals(-7.5,testObject.average(-20,5));
		assertEquals(4999.5,testObject.average(-1,10000));
		assertNotEquals(4,testObject.average(0,9));
		assertNotEquals(0,testObject.average(0,1));
	}
	
	@Test
	public void testAbsolute() {
		assertEquals(10, testObject.absolute(10));
		assertEquals(10, testObject.absolute(-10));
		assertEquals(0, testObject.absolute(0));
		assertEquals(1237, testObject.absolute(-1237));
	}
	
	@Test
	public void testConstrain() {
		assertEquals(10, testObject.constrain(0,10,20));
		assertEquals(20, testObject.constrain(30,10,20));
		assertEquals(15, testObject.constrain(15,10,20));
		assertEquals(-10, testObject.constrain(0,-20,-10));
		assertEquals(0, testObject.constrain(0,0,0));
		assertEquals(40, testObject.constrain(10,40,50));
		assertEquals(0, testObject.constrain(0,-10,10));
		assertEquals(-10, testObject.constrain(-10,-15,-5));
	}
	
	@Test
	public void testGetQuadrant() {
		assertEquals(1, testObject.getQuadrant(0, 0));
		assertEquals(1, testObject.getQuadrant(2,2));
		assertEquals(2, testObject.getQuadrant(-2,3));
		assertEquals(3, testObject.getQuadrant(-3,-4));
		assertEquals(4, testObject.getQuadrant(3,-3));
	}
	
	@Test
	public void testRoundOff() {
		assertEquals(2, testObject.roundOff(1.99));
		assertEquals(1, testObject.roundOff(1.49));
		assertEquals(1, testObject.roundOff(0.75));
		assertEquals(7, testObject.roundOff(7.0));
		assertEquals(6, testObject.roundOff(5.9999));
		assertEquals(401, testObject.roundOff(400.5));
		assertEquals(0, testObject.roundOff(0.001));
	}
	
	@Test
	public void testFloor() {
		assertEquals(1, testObject.floor(1.99));
		assertEquals(0, testObject.floor(0.75));
		assertEquals(7, testObject.floor(7.00));
		assertEquals(5, testObject.floor(5.9999));
		assertEquals(400, testObject.floor(400.001));
	}
	
	@Test
	public void testCeiling() {
		assertEquals(2, testObject.ceiling(1.99));
		assertEquals(1, testObject.ceiling(0.75));
		assertEquals(7, testObject.ceiling(7.00));
		assertEquals(6, testObject.ceiling(5.9999));
		assertEquals(401, testObject.ceiling(400.001));
	}
	
	@Test
	public void testGetLastChar() {
		assertEquals('r', testObject.getLastChar("Super"));
		assertEquals('!', testObject.getLastChar("This is fun!"));
		assertEquals('x', testObject.getLastChar("x"));
	}
	
	@Test
	public void testGetWithoutFirstChar() {
		assertEquals("uper", testObject.getWithoutFirstChar("Super"));
		assertEquals("his is fun!", testObject.getWithoutFirstChar("This is fun!"));
		assertEquals("", testObject.getWithoutFirstChar("x"));
	}

	@Test
	public void testGetWithoutLastChar() {
		assertEquals("Supe", testObject.getWithoutLastChar("Super"));
		assertEquals("This is fun", testObject.getWithoutLastChar("This is fun!"));
		assertEquals("", testObject.getWithoutLastChar("x"));
	}
}
