public class Rectangle {
	public int width, height;
	
	public Rectangle(int w, int h) {
		width = Math.min(100, Math.max(0, w));
		height = Math.min(100, Math.max(0, h));
	}
	
	public String toString() {
		return width + " by "+ height;
	}
	
	public int area() {
		return width * height;
	}
	
	/**
	 * 
	 * @return true if width and height are the same, false otherwise
	 */
	public boolean isSquare() {
		return width == height;
	}
}
