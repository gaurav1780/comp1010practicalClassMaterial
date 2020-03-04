package lectureCodes.week03.classesObjects1.oneStepAtATime.iteration8toString;

public class RectangleClient {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2.4, 1.2);	
		/*
		 * now the following method displays the value returned by
		 * r.toString()
		 */
		System.out.println(r);
		
		Rectangle s = new Rectangle(2.5);	
		
		System.out.println(s);
		
		Circle c = new Circle(1.8);
		System.out.println(c);
	}

}
