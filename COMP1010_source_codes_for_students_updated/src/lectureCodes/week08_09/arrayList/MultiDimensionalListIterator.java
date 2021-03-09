package lectureCodes.week08_09.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class MultiDimensionalListIterator {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(-30, 20));
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = null;
		ArrayList<Integer> d = new ArrayList<Integer>(Arrays.asList(70));

		ArrayList< ArrayList<Integer> > mega = new ArrayList< ArrayList<Integer> >();
		mega.add(a); //add a reference copy of (a) to mega
		mega.add(b); //add a reference copy of (b) to mega
		mega.add(c); //add a reference copy of (c) (which is null) to mega
		mega.add(d); //add a reference copy of (d) to mega

		System.out.println(mega);

		a.set(0, -666); //you are altering the contents of (a)

		System.out.println(a);

		System.out.println(mega);

		a  = new ArrayList<Integer>(Arrays.asList(5,6,7,8)); 
		//you are altering (a) itself

		System.out.println(a);

		System.out.println(mega);

		c = new ArrayList<Integer>(Arrays.asList(1,7,2,9));

		System.out.println(c);

		System.out.println(mega);

		ListIterator<ArrayList<Integer>> iter = mega.listIterator();

		while(iter.hasNext()) {
			ArrayList<Integer> current = iter.next();

			if(current !=  null) {
				ListIterator<Integer> subIter = current.listIterator();
				while(subIter.hasNext()) {
					System.out.println(subIter.next());
				}
			}
			System.out.println("--------");
		}

	}

}
