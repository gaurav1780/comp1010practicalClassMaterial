package lectureCodes.week03.classesObjects1.oneStepAtATime.iteration8toString;

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
	
	/**
	 * this method over-rides the default definition java provides.
	 * returns a String containing all required details of the object,
	 * that can then be:
	 *  - displayed on the console (typical)
	 *  - concatenated into a larger String (report generation)
	 *  - sent to file (logging)
	 *  - sent to network (client-server communication)
	 */
	public String toString() {
		return width + " by " + height + ", area = " + area() + ", square? "+isSquare();
	}
}
