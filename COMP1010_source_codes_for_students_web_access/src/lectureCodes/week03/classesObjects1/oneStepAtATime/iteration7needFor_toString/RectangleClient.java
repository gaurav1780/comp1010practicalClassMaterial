package lectureCodes.week03.classesObjects1.oneStepAtATime.iteration7needFor_toString;

public class RectangleClient {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2.4, 1.2);	
		
		/*
		 * displaying details of an instance can be tedious.
		 */
		System.out.println("width of instance r = "+r.width);
		System.out.println("height of instance r = "+r.height);
		System.out.println("area of instance r = "+r.area());
		System.out.println("is r a square? "+r.isSquare());
		
		//can we display objects directly? yes, but it gets weird
		System.out.println(r);
		/*
		 * the above statement displays class name followed by 
		 * hash code (sort of a mapping to memory address). but the 
		 * good thing is - we can over-ride what is displayed when
		 * we display an object - using a method called toString
		 */
	}

}
