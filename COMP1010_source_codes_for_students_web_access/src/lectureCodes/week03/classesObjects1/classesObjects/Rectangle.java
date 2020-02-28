package lectureCodes.week03.classesObjects1.classesObjects;

public class Rectangle {

	//instance variables
	public double length, breadth;
	
	//parameterized constructor
	public Rectangle(double len, double bre) {
		setLength(len);
		setBreadth(bre);
	}

	//a constructor with zero parameters is called a default constructor
	public Rectangle() {
		setLength(0);
		setBreadth(0);
	}

	public Rectangle(double side) {
		setLength(side);
		setBreadth(side);
	}

	/**
	 * assign the absolute value of the parameter to the instance variable length
	 * @param length
	 */
	public void setLength(double length) {
		this.length = Math.abs(length);
	}
	
	/**
	 * assign the absolute value of the parameter to the instance variable breadth
	 * @param breadth
	 */
	public void setBreadth(double breadth) {
		this.breadth = Math.abs(breadth);
	}
	
	//getters
	public double getLength() {
		return length;
	}
	
	public double getBreadth() {
		return breadth;
	}
	
	
	/**
	 * 
	 * @return the area of the object, calculated as product of length and breadth
	 */
	public double area() {
		double result = length * breadth;
		return result;
	}
	
	/**
	 * 
	 * @return true if calling object is a square, false otherwise
	 */
	public boolean isSquare() {
		if(length == breadth) {
			return true; 
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return length +" by " + breadth;
	}
}
