package lectureCodes.week08_09.arrayList;
public class Rectangle {
	public double width, height;
	
	public void setWidth(double w) {
		if(w < 0) //invalid
			width = -w; 
		else //valid
			width = w;
	}
	
	public void setHeight(double h) {
		if(h < 0) //invalid
			height = 0;
		else //valid
			height = h;
	}
	
	public Rectangle(double w, double h) {
		setWidth(w);
		setHeight(h);
	}

	public Rectangle(double side) {
		setWidth(side);
		setHeight(side);
	}

	public double area() {
		double result = width * height;
		return result;
	}
	
	public String toString() {
		return width + " by " + height;
	}
}
