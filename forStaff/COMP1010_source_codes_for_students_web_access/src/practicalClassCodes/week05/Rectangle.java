package practicalClassCodes.week05;
public class Rectangle {
	public int width;
	public int height;
	
	//parameterized constructors
	public Rectangle(int w, int h) {
		width = Math.abs(w);
		height = Math.abs(h);
	}

	public Rectangle(int side) {
		// TODO Auto-generated constructor stub
		width = Math.abs(side);
		height = Math.abs(side);
	}
	
	//default constructor
	public Rectangle() {
		width = 0;
		height = 0;

	}
	
	public int area() {
		return width * height;
	}
	
	public int perimeter() {
		return 2*(width + height);
	}
	
	public int getLongerSide() {
		if(width > height)
			return width;
		else
			return height;
	}
	
	public int getShorterSide() {
		if(width < height)
			return width;
		else
			return height;
	}
	
	public boolean isSquare() {
		return width == height;
	}
	
	public double diagnol() {
		return Math.sqrt(width*width + height*height);
	}
	
	public String toString() {
		return width+" by "+height;
	}
	
	/**
	 * 
	 * @param other
	 * @return 1 if calling objects area is more than parameter objects area
	 * -1 if calling objects area is less than parameter objects area
	 * 0 if calling objects area is equal to parameter objects area
	 */
	public int compareTo(Rectangle other) {
		if(area() > other.area())
			return 1;
		if(area() < other.area())
			return -1;
		return 0;
	}
}
