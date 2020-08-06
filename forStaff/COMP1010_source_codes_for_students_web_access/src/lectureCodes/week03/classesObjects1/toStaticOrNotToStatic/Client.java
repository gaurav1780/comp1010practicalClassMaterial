package lectureCodes.week03.classesObjects1.toStaticOrNotToStatic;

public class Client {

	public static void main(String[] args) {
		/*
		 * static method from another class is called directly on the class
		 * without having to create its instance
		 */
		double value = MathService.highest(5, 10, 8);
		System.out.println("highest of 5, 10 and 8 is "+value);
		
		/*
		 * to call instance (or non-static) methods, we must create an instance
		 * of a class and call the instance method on that instance.
		 */
		Circle c1 = new Circle(2);
		System.out.println("Area of circle with radius 2 is "+c1.area());
	}

}
