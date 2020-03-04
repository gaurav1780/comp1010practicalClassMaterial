package lectureCodes.week03.classesObjects1.oneStepAtATime.iteration2instanceMethods;

public class RectangleClient {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.width = 2.4;
		r.height = 1.2;
		System.out.println("width  = "+r.width);
		System.out.println("height = "+r.height);

		/*
		 * methods are called *on* an instance/object of the class.
		 *  here, we are calling the method area() on object
		 *  r. r is called the calling object.
		 *  the syntax is <object>.<method>(parameters);
		 */
		double myArea = r.area(); //r's area
		System.out.println("area = "+myArea);
		System.out.println("is it a square? "+r.isSquare());

		Rectangle a = new Rectangle();
		a.width = 1.7;
		a.height = 2.3;
		System.out.println(a.area());

		Rectangle b = new Rectangle();
		b.width = 3.7;
		b.height = 1.3;
		System.out.println(b.area());

		Rectangle c = new Rectangle();
		c.width = 0.7;
		c.height = 0.3;
		System.out.println(c.area());
	}

}
