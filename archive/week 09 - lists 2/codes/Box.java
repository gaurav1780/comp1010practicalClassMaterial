public class Box {
	public Rectangle base;
	public int depth;
	
	public Box(int w, int h, int d) {
		base = new Rectangle(w, h);
		depth = Math.min(100, Math.max(0, d));
	}
	
	public String toString() {
		return base.toString() + " by " + depth;
	}
	
	public int volume() {
		return base.area() * depth;
	}
	
	public boolean isCubical() {
		return base.isSquare() && depth == base.width;
	}
}
