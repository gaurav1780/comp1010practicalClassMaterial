package practicalClassCodes.week05;
public class RectangleClient {

	/**
	 * 
	 * @param data
	 * @return number of rectangles that are square
	 * note: you should call isSquare() defined in Rectangle class
	 */
	public static int countSquares(Rectangle[] data) {
		if(data == null) {
			return 0;
		}
		int total = 0;
		for(int i=0; i < data.length; i++) {
			if(data[i] != null && data[i].isSquare()) {
				total++;
			}
		}
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(-5, 8);

		System.out.println(rect.area());

		Rectangle other = new Rectangle(3);
		System.out.println(other.area());

		Rectangle third = new Rectangle();
		System.out.println(third.area());

		System.out.println(rect);
		System.out.println(other);
		System.out.println(third);
	}

}
