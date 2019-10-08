package ServiceClasses;
/**
 * Do not modify this class.
 */
 public class Rectangle {
	public int width, height;

	public Rectangle(int w, int h) {
		width = Math.abs(w);
		height = Math.max(0, h);
	}

	public Rectangle(int side) {
		width = Math.abs(side);
		height = Math.max(0, side);
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
	
	public int perimeter() {
		return 2*(width + height);
	}

	public int getShorterSide() {
		return Math.min(width, height);
	}

	public int getLongerSide() {
		return Math.max(width, height);
	}

	/**
	 * resize by the given factor. 
	 * if factor = 0.5, width and height should each be halved
	 * if factor = 3.0, width and height should each by tripled
	 * @param factor assumed to be between 0 and 10
	 */
	public void scale(int factor) {
		width*=factor;
		height*=factor;
	}

	public void scale(int factorX, int factorY) {
		width*=factorX;
		height*=factorY;
	}
}
