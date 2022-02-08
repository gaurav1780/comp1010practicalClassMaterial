/**
 * Do not modify this class.
 */
public class Rectangle {
	public int width, height;

	public Rectangle(int w, int h) {
		width = Math.abs(w);
		height = Math.abs(h);
	}

	public Rectangle(int side) {
		width = Math.abs(side);
		height = width;
	}

	//assume r is not null
	public Rectangle(Rectangle r) {
		width = Math.abs(r.width);
		height = Math.abs(r.height);
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

	public boolean equals(Rectangle other) {
		return width==other.width && height==other.height;
	}

	public String toString() {
		return width + " by " + height;
	}

	public boolean isSquare() {
		return width == height;
	}
}
