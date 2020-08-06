package lectureCodes.week03.classesObjects1.classesObjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testArea() {
		Rectangle r = new Rectangle();
		r.setLength(1.5);
		r.setBreadth(2.4);
		assertEquals(3.6, r.area(), 0.001);
		
		r = new Rectangle();
		r.setLength(2.5);
		r.setBreadth(4.2);
		
		assertEquals(10.5, r.area(), 0.001);
		
	}

	@Test
	public void testIsSquare() {
		Rectangle r = new Rectangle();
		r.setLength(1.5);
		r.setBreadth(2.4);
		assertFalse(r.isSquare());
		
		r = new Rectangle();
		r.setLength(1.5);
		r.setBreadth(1.5);
		assertTrue(r.isSquare());
	}
	
	@Test
	public void testRectangleDoubleDouble() {
		Rectangle r = new Rectangle(-1.2, -1.8);
		assertEquals(1.2, r.getLength(), 0.001);
		assertEquals(1.8, r.getBreadth(), 0.001);
	}
}
