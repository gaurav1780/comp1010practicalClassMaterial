package lectureCodes.week03.classesObjects1.classesObjects;

public class Client {

	public static void main(String[] args) {
		System.out.println("Hello");
		Rectangle r; //declaration CANNOT USE IT JUST YET
		r = new Rectangle(4.5, -2.1);
		r.setLength(r.getLength() * 1.2);
		System.out.println(r);
		double a = r.area();
		System.out.println(a);
				
		Rectangle s = new Rectangle(3.1);
		double b = s.area();
		System.out.println(b);
		
		System.out.println(s); //3.1 by 3.1
	}

}
