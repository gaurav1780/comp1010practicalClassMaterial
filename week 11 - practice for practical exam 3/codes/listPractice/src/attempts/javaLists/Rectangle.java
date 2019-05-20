package attempts.javaLists;
/**
 * Do not modify this class.
 */
 public class Rectangle {
	private int width, height;

	public void setWidth(int w) {
		if(w < 0) //invalid
			width = -w;
		else //valid
			width = w;
	}

	public void setHeight(int h) {
		if(h < 0) //invalid
			height = 0;
		else //valid
			height = h;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Rectangle(int w, int h) {
		setWidth(w);
		setHeight(h);
	}

	public Rectangle(int side) {
		setWidth(side);
		setHeight(side);
	}

	public int area() {
		int result = width * height;
		return result;
	}

	//compare based on area
	public int compareTo(Rectangle other) {
		int a1 = this.area();
		int a2 = other.area();
		if(a1 > a2)
			return 1;
		if(a1 < a2)
			return -1;
		return 0;
	}

	public String toString() {
		return width + " by " + height;
	}

	public boolean isSquare() {
		return width == height;
	}
}
