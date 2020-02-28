package lectureCodes.week04.classesObjects2.classesObjects2;

public class Client {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date(31,2,2017);

		Person p = new Person("John", d);

		System.out.println(p);

		Rectangle r1 = new Rectangle(4, 5);
		Rectangle r2 = new Rectangle(10, 2);
		Rectangle r3 = new Rectangle(4, 5);
		Rectangle r4 = new Rectangle(5, 4);
		Rectangle r5 = new Rectangle(6, 4);

		int a = r1.compareTo(r2); //-1, based on perimeter (areas are same)
		int b = r5.compareTo(r2); //1, based on area
		int c = r4.compareTo(r3); //0, since areas are same and perimeters are same

		System.out.println(a+" "+b+" "+c);

		boolean flag1 = r1.equals(p); //rectangle <-> person
		System.out.println(flag1);

		boolean flag2 = r1.equals(d); //rectangle <-> date
		System.out.println(flag2);

		boolean flag3 = r1.equals(r2);
		System.out.println(flag3);

		flag3 = r1.equals(r3);
		System.out.println(flag3);

		flag3 = r1.equals(r4);
		System.out.println(flag3);

		Rectangle s = new Rectangle(6,2);
		Rectangle t = new Rectangle(4, 3);
		System.out.println(s.compareTo(t));

		DiceRollSimulation roll = new DiceRollSimulation(20);
		System.out.println(roll);
		System.out.println(roll.average());

		Fraction f = new Fraction(720,5040);
		System.out.println(f);

		Fraction g = f.simplified(); //better
		System.out.println(g);
		System.out.println(f);
		f.simplify(); //not so good approach (as you lose state)
		System.out.println(f);

	}




}
