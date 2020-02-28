package lectureCodes.week03.classesObjects1.toStaticOrNotToStatic;

public class Circle {
	public double radius;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		if(r < 0)
			radius = 1;
		else
			radius = r;
	}
	
	public Circle(double radius) {
		setRadius(radius);
	}
	
	public Circle() {
		setRadius(1);
	}

	/**
	 * area() operates on the instance variable radius.
	 * we need to create an instance of the class Circle and then
	 * call the method area() on that instance. When we do this,
	 * the area() method uses the value of the calling object's radius
	 * Therefore it's not static, it's an instance method
	 * 
	 * @return area of the circle computed as Math.PI * radius * radius
	 */
	public double area() {
		return Math.PI * radius * radius;
	}
}
