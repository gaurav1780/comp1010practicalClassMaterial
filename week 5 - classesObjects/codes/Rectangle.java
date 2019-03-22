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

  public boolean isSquare() {
		if(width == height)
			return true;
		else
			return false;
	}
	/**
	 *
	 * @param other
	 * @return
	 * 1 if calling object has greater area
	 * than that of parameter object
	 * -1 if calling object has smaller area
	 * than that of parameter object
	 * 0 if calling object has the same area
	 * as that of parameter object
	 */
	public int compareTo(Rectangle other) {
		if(this.area() > other.area())
			return 1;
		if(this.area() < other.area())
			return -1;
		return 0;
	}

	public String toString() {
		return width + " by " + height;
	}
}
