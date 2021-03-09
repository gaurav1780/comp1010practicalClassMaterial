package lectureCodes.week08_09.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(9);
		list.add(6);
		list.add(3);
		list.add(7);
		list.add(4);
				
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		iter = list.iterator();
		while(iter.hasNext()) {
			if(iter.next() % 2 == 0) {
				iter.remove();
			}
			System.out.println(list);
		}
	}
}
