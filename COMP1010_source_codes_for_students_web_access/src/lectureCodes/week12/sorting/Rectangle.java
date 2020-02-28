package lectureCodes.week12.sorting;

public class Rectangle {
	public double width, height;
	
	public void setWidth(double w) {
		if(w < 0) {
			w*=-1;
		}
		width = w;
	}
	
	public void setHeight(double h) {
		if(h < 0) {
			h*=-1;
		}
		height = h;
	}
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	public Rectangle() {
		width = 0;
		height = 0;
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

	public int compareTo(Rectangle other) {
		if(area() > other.area())
			return 1;
		if(area() < other.area())
			return -1;
		return 0;
		
		/*
		 * for proficient programmers,
		 * using conditional assignment:
		 * return area() > other.area() ? 1 : area() < other.area() ? -1 : 0;
		 */
	}
}
