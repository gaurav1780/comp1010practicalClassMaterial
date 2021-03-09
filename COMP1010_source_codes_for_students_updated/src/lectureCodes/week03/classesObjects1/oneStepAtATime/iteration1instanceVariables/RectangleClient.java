package lectureCodes.week03.classesObjects1.oneStepAtATime.iteration1instanceVariables;

public class RectangleClient {

	public static void main(String[] args) {
		/*
		 * the following is declaration and instantiation statement.
		 * it creates an instance of Rectangle class, called r, in
		 * the memory. r is a reference that refers to a block of 
		 * memory where the instance variables (width and height)
		 * for that instance are stored.
		 */
		Rectangle r; //declaration
		r = new Rectangle(); //instantiation
		
		//can be combined as:
		//Rectangle r = new Rectangle();
		
		r.width = 2.4; //think of dot (.) as 's (as in Steve's or Jenny's)
		r.height = 1.2;
		
		System.out.println("width  = "+r.width);
		System.out.println("height = "+r.height);
		
		//increase width by 50%
		r.width = r.width * 1.5;

		System.out.println("width  = "+r.width);
	}

}
