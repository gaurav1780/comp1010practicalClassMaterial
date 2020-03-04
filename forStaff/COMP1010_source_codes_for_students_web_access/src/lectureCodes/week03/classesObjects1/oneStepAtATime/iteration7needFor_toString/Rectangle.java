package lectureCodes.week03.classesObjects1.oneStepAtATime.iteration7needFor_toString;

public class Rectangle {
	public double width, height;
	
	/**
	 * generic parameterized constructor, with a value
	 * for width and a value for height 
	 * @param w: value to be assigned to instance variable width
	 * @param h: value to be assigned to instance variable height
	 */
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	/**
	 * special parameterized constructor to create a square
	 * @param side: value to be assigned to both width and height
	 */
	public Rectangle(double side) {
		width = side;
		height = side;
	}
	
	/**
	 * width and height should both become 1
	 */
	public Rectangle() {
		width = 1;
		height = 1;
	}

	public double area() {
		double result = width * height;
		return result;
	}
	
	public boolean isSquare() {
		if(width == height)
			return true;
		else
			return false;
	}
}
