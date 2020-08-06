package lectureCodes.week03.classesObjects1.oneStepAtATime.iteration6constructors;

public class RectangleClient {

	public static void main(String[] args) {
		/*
		 * you can imagine that it's a pain to assign
		 * a value to EACH instance variable individually,
		 * especially if there are quite a few of them.
		 * 
		 * We can pass values for the instance variable
		 * at the time of instantiation. a corresponding method
		 * called constructor must be defined in the class
		 * whose object you are creating. the constructor has 
		 * following features:
		 * 
		 * 1. no return type (not even void)
		 * 2. same name as class (case sensitive)
		 * 
		 * you can define multiple constructors, each with a 
		 * different signature (parameter list)
		 * 
		 * side note: once you define a constructor with one
		 * or more parameters, the default constructor java 
		 * provides - Rectangle() in this case - is withdrawn
		 * so if you want it, you have to define it yourself.
		 */
		
		//calls Rectangle(double, double)
		Rectangle r = new Rectangle(2.4, 1.2);	
		System.out.println("width of instance r = "+r.width);
		System.out.println("height of instance r = "+r.height);
		System.out.println("area of instance r = "+r.area());
		System.out.println("is r a square? "+r.isSquare());
		
		//calls Rectangle(double)
		Rectangle s = new Rectangle(-1.8);	
		System.out.println("width of instance s = "+s.width);
		System.out.println("height of instance s = "+s.height);
		System.out.println("area of instance s = "+s.area());
		System.out.println("is s a square? "+s.isSquare());
			
	}

}
