package lectureCodes.week03.classesObjects1.oneStepAtATime.iteration2instanceMethods;

public class Rectangle {
	public double width, height;
	
	/**
	 * You can add methods to a class. These methods
	 * are called on instances/objects of the class
	 * 
	 * @return area of the calling object as calculated
	 * by product of width and height
	 */
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
