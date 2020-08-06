package lectureCodes.week04.classesObjects2.classesObjects2;

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

	//setters
	public void setLength(double len) {
		length = Math.abs(len);
	}
	
	/**
	 * 
	 * @param bre
	 */
	public void setBreadth(double bre) {
		breadth = Math.abs(bre);
	}
	
	//getters
	public double getLength() {
		return length;
	}
	
	public double getBreadth() {
		return breadth;
	}
	
	
	//instance methods
	public double area() {
		double result = length * breadth;
		return result;
	}
	
	public double perimeter() {
		return 2*(length + breadth);
	}
	
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
	
	/**
	 * 
	 * @param other
	 * @return 1 if the calling object is "more than" parameter object
	 * -1 if the calling object is "less than" parameter object
	 * 0 if calling object and parameter object are the "same"
	 * 
	 * first criterion: area
	 * second criterion: perimeter
	 */
	public int compareTo(Rectangle other) {
		if(this.area() > other.area()) 
			return 1;
		if(this.area() < other.area()) 
			return -1;
		
		//guaranteed: areas are the same, move to perimeter
		
		if(this.perimeter() > other.perimeter()) 
			return 1;
		if(this.perimeter() < other.perimeter()) 
			return -1;
		
		//guaranteed: perimeters are also the same
		return 0;
	}
	
	/**
	 * 
	 * @param other
	 * @return 1, -1, or 0 based on comparison of calling object
	 * with passed object on the basis of area, which is defined
	 * in both Rectangle and Circle classes
	 */
	public int compareTo(Circle other) {
		return 0; //to be completed
	}
	
	/**
	 * Advanced, not assessed in any assessment
	 */
	public boolean equals(Object o) {
		if(o instanceof Rectangle) {
			//guaranteed that o is a rectangle object
			Rectangle other = (Rectangle)o;
			if(this.length == other.length)
				if(this.breadth == other.breadth)
					return true;
			
			if(this.length == other.breadth)
				if(this.breadth == other.length)
					return true;
			
			return false;
		}
		else { //o is not even a Rectangle
			return false;
		}
	}
}
