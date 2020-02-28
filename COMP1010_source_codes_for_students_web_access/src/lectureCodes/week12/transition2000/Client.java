package lectureCodes.week12.transition2000;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthdayBook bdays = new BirthdayBook();
		bdays.add(new Name("John Oliver"), new Date(13, 4, 1975));
		bdays.add(new Name("John Smith"), new Date(16, 3, 1975));
		bdays.add(new Name("Jason Bourne"), new Date(13, 4, 1956));
		bdays.add(new Name("Malcolm Ryan"), new Date(1, 4, 1980));
		System.out.println(bdays);
		System.out.println("Born on 13th April: "+bdays.getByDate(13, 4));
		System.out.println("Born in April: "+bdays.getByMonth(4));
		System.out.println("Born in 1975: "+bdays.getByYear(1975));

	}

}
