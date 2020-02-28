package lectureCodes.week03.classesObjects1.toStaticOrNotToStatic;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testSetRadius() {
		Circle c = new Circle();
		c.setRadius(2.4); //normal
		assertEquals(2.4, c.getRadius(), 0.001);
		c.setRadius(-2.4);
		assertEquals(1, c.getRadius(), 0.001);
		c.setRadius(0.02); //normal
		assertEquals(0.02, c.getRadius(), 0.001);
		c.setRadius(0); //normal
		assertEquals(0, c.getRadius(), 0.001);
	}

}
